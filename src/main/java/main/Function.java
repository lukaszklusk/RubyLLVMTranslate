package main;

import java.util.ArrayList;

public class Function {
	StringBuffer code;
	Types returnType;
	String name;
	ArrayList<Variable> params = new ArrayList<>();
	String retname;
	
	public String getName() {
		return name;
	}

	public Types getType() {
		return returnType;
	}
	
	public String getllType() {
		return LLVM.ll_typeName(returnType);
	}

	public boolean setType(Types returnType) {
		if(this.returnType == null) {
			this.returnType = returnType;
			return true;
		}
		else if(this.returnType == returnType)
			return true;
		else
			return false;
	}

	public void putParam(Variable param){
		params.add(param);
	}

	public Function(String name) {
		code = new StringBuffer();
		returnType = Types.OBJECT;
		this.name=name;
		this.returnType = null;
	}

	void put(String s) {
			code.append("\t"+s+"\n");
	}
	
	public String getFullCode()
	{
		if(this.returnType == null) 
		{
			this.returnType = Types.VOID;
			code.append("ret void\n");
		}
		else
			code.append("ret "+getllType()+" %"+getRetname()+"\n");

		String head = "\ndefine "+getllType()+" @"+name+"(" ;
		boolean f = false;
		for (Variable p:params) {
			if(f) head += ", ";
			head += p.ll_typeName() + " %" + p.getName();
			f = true;
		}
		head += ") {\n";

		code.insert(0, head);
		
		code.append("}\n");
		return new String(code);
	}

	private String getDeflt() {
		switch(returnType) {
		case INT:
			return "0";
		case FLOAT:
			return "0.0";
		case BOOLEAN:
			return "0";
		default:
			return "Bad_Type";
		}
	}

	public void setRetname(String retname){
		this.retname = retname;
	}

	private String getRetname(){
		return retname;
	}
}
