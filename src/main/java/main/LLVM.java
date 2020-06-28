package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import java.io.FileReader;


public class LLVM {
    File destination;
    FileWriter destinationW;
    final static String destinationName = "output.ll";
    Map<String, Variable> varMap;
    Map<String, Variable> globalVarMap;

    int nStack;
    int brStack;
    int loopStack;
    String stackName;
    String brNameT;
    String brNameF;
    String brNameE;
    String loopCondition;
    String loopInstructions;
    String loopContinuation;
    ArrayList<Integer> ifstack = new ArrayList<>();
    ArrayList<Integer> loop_stack = new ArrayList<>();

    StringBuffer funcCalling;

    StringBuffer headerCode;
    StringBuffer mainCode;
    Function actualFunc;

    public LLVM() {
        try {
            destination = new File(destinationName);
            destinationW = new FileWriter(destination);
        } catch (IOException e) {
            e.printStackTrace();
        }

        mainCode = new StringBuffer();
        headerCode = new StringBuffer();

        funcCalling = null;

        globalVarMap = new HashMap<String, Variable>();
        varMap = globalVarMap;

        nStack = 0;
        brStack = 0;
        loopStack = 0;
        putOutCode("declare i32 @printi(i32)");
        putOutCode("declare i32 @printd(double)");
        putOutCode("declare i32 @prints(i8*)");

        mainCode.append("\ndefine i32 @main() {\n");
    }

    public void finalize() {
        //for(String s:varMap.keySet())
        //	System.out.println(s +" : "+ varMap.get(s).type);
        mainCode.append("ret i32 0\n");
        mainCode.append("}\n");
        String finalCode = new String(headerCode.append(mainCode));
        try {
            destinationW.write(finalCode);
            destinationW.flush();
            destinationW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void putCode(String s) {
        String tab = "\t";
        if (actualFunc == null)
            mainCode.append(tab + s + "\n");
        else
            actualFunc.put(s);
    }

    void putOutCode(String s) {
        headerCode.append(s + "\n");
    }

    public void begin_function(String name) {
        if (actualFunc != null) {
            error("Definicja w definicji");
            return;
        }
        actualFunc = new Function(name);
        varMap = new HashMap<String, Variable>();

    }

    public void func_param(String param) {
        if (actualFunc == null) {
            error("Nie ma definicji funkcji");
            return;
        }
        Variable newVar = new Variable(Types.INT);
        newVar.setName(param);
        varMap.put(param,newVar);
        actualFunc.putParam(newVar);

    }

    public void end_function(Types rtype, String name) {
        actualFunc.setType(rtype);
        actualFunc.setRetname(name);
        Variable newFunc = new Variable(actualFunc.getType());
        globalVarMap.put(actualFunc.getName(), newFunc);
        headerCode.append(actualFunc.getFullCode());
        actualFunc = null;
        varMap = globalVarMap;
    }

    public String func_call(String name) {
        if (globalVarMap.containsKey(name)) {
            Variable newVar = globalVarMap.get(name);
            funcCalling = new StringBuffer();
            addStack();
            funcCalling.append(stackName + " = call " + newVar.ll_typeName() + " @" + name + "(");
            varMap.put(stackName.substring(1), newVar);
            return stackName;
        } else {
            error("Funkcja nie zdefiniowana");
            return "err";
        }
    }

    public void func_call_param(String name) {
        if(funcCalling != null)
        	funcCalling.append(" "+ll_typeName(getType(name))+ " " + name + ",");
    }

    public void func_call_param_end() {
        if (funcCalling != null) {
            if (funcCalling.charAt(funcCalling.length() - 1) != '(')
                funcCalling.deleteCharAt(funcCalling.length() - 1);
            funcCalling.append(")");
            putCode(new String(funcCalling));
            funcCalling = null;
        }
    }

    public String load(String name) {
        addStack();
        Variable newVar = varMap.get(name);
        if (varMap.containsKey(name)) {
            putCode(stackName + " = load " + newVar.ll_typeName() + "* %" + name + "");
            varMap.put(stackName.substring(1), newVar);
        } else
            error("unknown variable " + name);
        return stackName;
    }

    public String label_str(String val){
        Variable newVar = new Variable(getType(val));
        if (newVar.type == Types.STRING) {
            int size = val.length() - 1;
            String chain = val.substring(1, size);
            addStack();
            String internal = "@" + stackName.substring(1);
            putOutCode(internal + " = internal constant [" + size + " x i8] c\"" + chain + "\\00\"");
            addStack();
            putCode(stackName + " = getelementptr [" + size + " x i8]* " + internal + ", i32 0,i32 0");
            val = stackName;
            varMap.put(stackName.substring(1),newVar);
        }else{
            error("Wartosc nie jest stringiem (" + val + ")");
        }
        return stackName.substring(1);
    }

    public void store(String name, String val) {
        Variable oldVar = varMap.get(name);
        Variable newVar = new Variable(getType(val));
        if (newVar.type == Types.STRING) {
            int size = val.length() - 1;
            String chain = val.substring(1, size);
            addStack();
            String internal = "@" + stackName.substring(1);
            putOutCode(internal + " = internal constant [" + size + " x i8] c\"" + chain + "\\00\"");
            addStack();
            putCode(stackName + " = getelementptr [" + size + " x i8]* " + internal + ", i32 0,i32 0");
            val = stackName;
        }

        if (oldVar == null) {
            if (name.matches("[A-Z].*"))
                newVar.constant = true;
            putCode("%" + name + " = alloca " + newVar.ll_typeName());
            putCode("store " + newVar.ll_typeName() + " " + val + ", " + newVar.ll_typeName() + "* %" + name);
            varMap.put(name, newVar);
        } else {
            if (oldVar.constant)
                error("Proba zmiany stalej (" + name + ")");
            else if (newVar.type != oldVar.type)
                error("Proba zmiany typu zmiennej (" + name + ":" + newVar.type + "/" + oldVar.type + ")");
            else {
                putCode("store " + newVar.ll_typeName() + " " + val + ", " + newVar.ll_typeName() + "* %" + name);
                varMap.put(name, newVar);
            }
        }

    }

    public static String ll_typeName(Types type) {
        switch (type) {
            case INT:
                return "i32";
            case FLOAT:
                return "double";
            case BOOLEAN:
                return "i1";
            case STRING:
                return "i8*";
            case VOID:
                return "void";
            default:
                return "Bad_Type";
        }
    }

    Types getType(String code) {
        final String INT = "[0-9]+";
        final String FLOAT = "[0-9]+\\.[0-9]*";
        final String ID = "[\\$@]?[a-zA-Z_]+[a-zA-Z0-9_]*";
        final String BOOL = "true|false";
        final String STRING = "\".*\"";

        if (code.matches("%" + ID)) {
            return varMap.get(code.substring(1)).type;
        } else if (code.matches(INT)) {
            return Types.INT;
        } else if (code.matches(FLOAT)) {
            return Types.FLOAT;
        } else if (code.matches(BOOL)) {
            return Types.BOOLEAN;
        } else if (code.matches(ID)) {
            if (varMap.containsKey(code))
                return varMap.get(code).type;
            else
                error("Niezdefiniowana zmienna");
        } else if (code.matches(STRING)) {
            return Types.STRING;
        }

        return Types.OBJECT;
    }

    public String operation(String a, String b, String op) {
        addStack();
        Variable newVar = new Variable();
        String operation;
        String operationType = "";
        if (op.equals("+"))
            operation = "add";
        else if (op.equals("-"))
            operation = "sub";
        else if (op.equals("*"))
            operation = "mul";
        else if (op.equals("/"))
            operation = "div";
        else {
            operation = "cmp";
            if (op.equals("=="))
                operationType = "eq";
            else if (op.equals("!="))
                operationType = "ne";
            else if (op.equals("<="))
                operationType = "sle";
            else if (op.equals(">="))
                operationType = "sge";
            else if (op.equals(">"))
                operationType = "sgt";
            else if (op.equals("<"))
                operationType = "slt";
            else
                error("Operator ??");
        }

        String newA = a;
        String newB = b;
        if (getType(a) == Types.INT && getType(b) == Types.INT) {
            if (operation.equals("cmp"))
                operation = "i" + operation;
            newVar.type = Types.INT;
        } else if (getType(a) == Types.BOOLEAN && getType(b) == Types.BOOLEAN) {
            if (operation.equals("cmp"))
                operation = "i" + operation;
            newVar.type = Types.BOOLEAN;
        } else if (getType(a) == Types.FLOAT && getType(b) == Types.FLOAT) {
            newVar.type = Types.FLOAT;
            operation = "f" + operation;
        } else if (getType(a) == Types.INT && getType(b) == Types.FLOAT) {
            newVar.type = Types.FLOAT;
            putCode(stackName + " = uitofp i32 " + a + " to double  ");
            newA = stackName;
            addStack();
            operation = "f" + operation;
        } else if (getType(a) == Types.FLOAT && getType(b) == Types.INT) {
            newVar.type = Types.FLOAT;
            putCode(stackName + " = uitofp i32 " + b + " to double  ");
            newB = stackName;
            addStack();
            operation = "f" + operation;
        } else
            error("Nie mozna wykonac operacji ( " + getType(a) + op + getType(b) + " )");

        putCode(stackName + " = " + operation + " " + operationType + " " + newVar.ll_typeName() + " " + newA + ", " + newB);
        if (operation.substring(1).equals("cmp"))
            newVar.type = Types.BOOLEAN;
        varMap.put(stackName.substring(1), newVar);
        return stackName;
    }

    public String logical(String aName, String bName, String log) {
        addStack();
        Variable newVar = new Variable(Types.BOOLEAN);
        String compItem = null;
        if (getType(aName) != Types.BOOLEAN || getType(bName) != Types.BOOLEAN) {
            error("Nie mozna porownac (" + aName + log + bName + ")");
            error("m:" + getType(aName) + getType(bName));
            return "err";
        }
        if (log.equals("&&"))
            compItem = new String("and");
        else if (log.equals("||"))
            compItem = new String("or");
        else
            error("zly operator");
        putCode(stackName + " = " + compItem + " i1 " + aName + ", " + bName);
        varMap.put(stackName.substring(1), newVar);
        return stackName;
    }

    public void for_in(String varName, String from, String to) {
        addLoop();
        if (getType(from) != Types.INT || getType(to) != Types.INT) {
            error("Typ nie jest integerem");
            return;
        }
        store(varName, from);
        putCode("br label %" + loopCondition);
        putCode(loopCondition + ":");
        String increm = load(varName);
        String cond = operation(increm, to, "<=");
        putCode("br i1 " + cond + ", label %" + loopInstructions + ", label %" + loopContinuation);
        putCode(loopInstructions + ":");
    }

    public void for_out(String varName) {
        String increm = load(varName);
        String newVal = operation(increm, "1", "+");
        store(varName, newVal);
        putCode("br label %" + loopCondition);
        putCode(loopContinuation + ":");
    }


    public void while_in(String cName) {
        addLoop();
        putCode(loopCondition + ":");
        putCode("br i1 " + cName + ", label %" + loopInstructions + ", label %" + loopContinuation);
        putCode(loopInstructions + ":");
    }

    public void while_out() {
        putCode("br label %" + loopCondition);
        putCode(loopContinuation + ":");
        popLoop();
    }

    public void returnExpr(String cName) {
        if (actualFunc != null) {
            if (!actualFunc.setType(getType(cName))) {
                error("typ zwrotu musi byc unikalny");
                return;
            }
            putCode("ret " + actualFunc.getllType() + " " + cName);
        } else
            putCode("ret i32 " + cName);
    }

    public void if_in(String cName) {
        addBr();
        putCode("br i1 " + cName + ", label %" + brNameT + ", label %" + brNameF);
        putCode(brNameT + ":");

    }

    public void if_else() {
        putCode("br label %" + brNameE);
        putCode(brNameF + ":");

    }

    public void if_else_end() {
        putCode("br label %" + brNameE);
        putCode(brNameE + ":");

    }

    public void if_end() {
        putCode("br label %" + brNameE);
        putCode(brNameE + ":");
        popBr();

    }

    public void storeFrom(String to, String from) {

        if (from.charAt(0) != '%' || varMap.containsKey(from)) {
            if (!varMap.containsKey(to)) {
                putCode("%" + to + " = alloca i32");
            }
            putCode("store i32 " + from + ",i32* %" + to);
            varMap.put(to, varMap.get(from));
        }
    }

    public void print(String name) {

        Types type = getType(name);
        switch (type) {
            case INT:
                putCode("call i32 @printi( i32 " + name + " )");
                break;
            case FLOAT:
                putCode("call i32 @printd( double " + name + " )");
                break;
            case STRING:
                putCode("call i32 @prints( i8* " + name + " )");
                break;
            default:
                error("Niewypisywalna zmienna");
        }
        //System.out.println("out:"+name+ " : "+type);
    }

    void addStack() {
        stackName = "%t" + nStack;
        nStack++;
    }

    void addBr() {
        brNameT = "ifT" + brStack;
        brNameF = "ifF" + brStack;
        brNameE = "ifE" + brStack;
        ifstack.add(brStack);
        brStack++;
    }

    void popBr(){
        ifstack.remove(ifstack.size()-1);
        if(ifstack.size()>0) {
            brNameT = "ifT" + ifstack.get(ifstack.size() - 1);
            brNameF = "ifF" + ifstack.get(ifstack.size() - 1);
            brNameE = "ifE" + ifstack.get(ifstack.size() - 1);
        }
    }

    void addLoop() {
        loopCondition = "loopCond" + loopStack;
        loopInstructions = "loopInstructs" + loopStack;
        loopContinuation = "LoopContinue" + loopStack;
        loop_stack.add(loopStack);
        loopStack++;
    }

    void popLoop(){
        loop_stack.remove(loop_stack.size()-1);
        if(loop_stack.size()>0){
            loopCondition = "loopCond" + loop_stack.get(loop_stack.size()-1);
            loopInstructions = "loopInstructs" + loop_stack.get(loop_stack.size()-1);;
            loopContinuation = "LoopContinue" + loop_stack.get(loop_stack.size()-1);;
        }
    }

    void error(String err) {
        System.out.println("Error :\n\t" + err + "\n");
        //System.exit(0);
    }

}
