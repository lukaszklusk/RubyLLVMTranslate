package main;

import antlr_output.RubyBaseListener;
import antlr_output.RubyParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyRubyListener extends RubyBaseListener {

    public LLVM output = new LLVM();


    @Override
    public void enterProg(RubyParser.ProgContext ctx) {
        super.enterProg(ctx);
    }

    @Override
    public void exitProg(RubyParser.ProgContext ctx) {
        super.exitProg(ctx);
    }

    @Override
    public void enterIf_elsif_statement(RubyParser.If_elsif_statementContext ctx) {
        //String com = resolveEquation(ctx.getChild(1));
        //output.if_in(com);
    }

    @Override
    public void exitIf_elsif_statement(RubyParser.If_elsif_statementContext ctx) {
        //output.if_end();
    }

    @Override
    public void enterIf_statement(RubyParser.If_statementContext ctx) {
        int j = 0;
        for(ParseTree i: ctx.children){
            //System.out.println(i.getText() + " " + j);
            j++;
        }

        String com = resolveEquation(ctx.getChild(1));
        output.if_in(com);
    }

    @Override
    public void exitIf_statement(RubyParser.If_statementContext ctx) {
        output.if_end();
    }

    @Override
    public void enterUnless_statement(RubyParser.Unless_statementContext ctx) {
        super.enterUnless_statement(ctx);
    }

    @Override
    public void exitUnless_statement(RubyParser.Unless_statementContext ctx) {
        super.exitUnless_statement(ctx);
    }

    @Override
    public void enterWhile_statement(RubyParser.While_statementContext ctx) {
        int j = 0;
        for(ParseTree i: ctx.children){
            //System.out.println(i.getText() + " " + j);
            j++;
        }

        String cond = resolveEquation(ctx.getChild(1));
        output.while_in(cond);
    }

    @Override
    public void exitWhile_statement(RubyParser.While_statementContext ctx) {
        output.while_out();
    }

    @Override
    public void enterWhile_expression_list(RubyParser.While_expression_listContext ctx) {
        super.enterWhile_expression_list(ctx);
    }

    @Override
    public void exitWhile_expression_list(RubyParser.While_expression_listContext ctx) {
        super.exitWhile_expression_list(ctx);
    }

    @Override
    public void enterFor_statement(RubyParser.For_statementContext ctx) {
        super.enterFor_statement(ctx);
    }

    @Override
    public void exitFor_statement(RubyParser.For_statementContext ctx) {
        super.exitFor_statement(ctx);
    }

    @Override
    public void enterFor_expression_list(RubyParser.For_expression_listContext ctx) {
        super.enterFor_expression_list(ctx);
    }

    @Override
    public void exitFor_expression_list(RubyParser.For_expression_listContext ctx) {
        super.exitFor_expression_list(ctx);
    }

    public String resolveEquation(ParseTree a){
        String t = "";
        if(a.getChildCount() > 1){
            if(!a.getChild(0).getText().equals("(")){
                if(a.getChild(1).getText().equals("&&") || a.getChild(1).getText().equals("||")){
                    t = output.logical(resolveEquation(a.getChild(0)),resolveEquation(a.getChild(2)),a.getChild(1).getText());
                }else {
                    t = output.operation(resolveEquation(a.getChild(0)), resolveEquation(a.getChild(2)), a.getChild(1).getText());
                }
            }else{
                t = resolveEquation(a.getChild(1));
            }
            return t;
        }else{
            if(a.getChild(0).getChildCount() > 1){
                t = resolveEquation(a.getChild(0));
                return t;
            }else {
                return a.getText();
            }
        }
    }


    @Override
    public void enterAssignment(RubyParser.AssignmentContext ctx) {
        output.store(ctx.lvalue().getText(),resolveEquation(ctx.rvalue()));
    }

    @Override
    public void exitAssignment(RubyParser.AssignmentContext ctx) {
        super.exitAssignment(ctx);
    }

    @Override
    public void enterArray_assignment(RubyParser.Array_assignmentContext ctx) {
        super.enterArray_assignment(ctx);
    }

    @Override
    public void exitArray_assignment(RubyParser.Array_assignmentContext ctx) {
        super.exitArray_assignment(ctx);
    }

    @Override
    public void enterArray_definition(RubyParser.Array_definitionContext ctx) {
        super.enterArray_definition(ctx);
    }

    @Override
    public void exitArray_definition(RubyParser.Array_definitionContext ctx) {
        super.exitArray_definition(ctx);
    }

    @Override
    public void enterArray_definition_elements(RubyParser.Array_definition_elementsContext ctx) {
        super.enterArray_definition_elements(ctx);
    }

    @Override
    public void exitArray_definition_elements(RubyParser.Array_definition_elementsContext ctx) {
        super.exitArray_definition_elements(ctx);
    }

    @Override
    public void enterArray_selector(RubyParser.Array_selectorContext ctx) {
        super.enterArray_selector(ctx);
    }

    @Override
    public void exitArray_selector(RubyParser.Array_selectorContext ctx) {
        super.exitArray_selector(ctx);
    }

    public String resolveEqOrStr(ParseTree a){
        if(a.getChild(0).getClass().toString().equals("class antlr_output.RubyParser$String_resultContext")){
            return output.label_str(a.getText());
        }else{
            return resolveEquation(a);
        }
    }

    @Override
    public void enterPrinter(RubyParser.PrinterContext ctx) {
        int j = 0;
        //System.out.println("---------");
        //System.out.println(ctx.getText() + " --ctx");
        for(ParseTree i: ctx.children){
            System.out.println(i.getText() + " -- " + j);
            if(j > 0){
                System.out.println(i.getChild(0).getClass().toString() + " ###" );
            }
            j++;
        }
        String t = resolveEqOrStr(ctx.getChild(1));
        System.out.println(t);
        output.print(t);
    }

    @Override
    public void exitPrinter(RubyParser.PrinterContext ctx) {
        super.exitPrinter(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        int j = 0;
        //System.out.println("---------");
        //System.out.println(ctx.getText() + " --ctx");
        for(ParseTree i: ctx.children){
            //System.out.println(i.getText() + " --" + j);
            j++;
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if(node.getText().equals("else")){
            //System.out.println("JESTEM W ELSE");
            output.if_else();
        }
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
