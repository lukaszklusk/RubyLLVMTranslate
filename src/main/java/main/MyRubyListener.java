package main;

import antlr_output.RubyBaseListener;
import antlr_output.RubyParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyRubyListener extends RubyBaseListener {

    @Override
    public void enterAssignment(RubyParser.AssignmentContext ctx) {
        System.out.println("Przypisuje " + ctx.lvalue.getText() + " wartosc " + ctx.rvalue().getText());

    }

}
