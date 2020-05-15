import org.antlr.v4.runtime.tree.TerminalNode;

public class MyRubyListener extends RubyBaseListener {

    @Override
    public void enterInt(RubyParser.IntContext ctx) {

        System.out.println(ctx.getText());

    }
}
