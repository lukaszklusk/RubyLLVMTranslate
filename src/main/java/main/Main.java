package main;

import antlr_output.RubyLexer;
import antlr_output.RubyParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args){

        String fileName = "./src/main/resources/Test1.rb";
        try {
            CharStream cs = fromFileName(fileName);
            RubyLexer lexer = new RubyLexer(cs);
            CommonTokenStream cts = new CommonTokenStream(lexer);
            RubyParser parser = new RubyParser(cts);
            ParseTree tree = parser.prog();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyRubyListener listener = new MyRubyListener();
            walker.walk(listener,tree);
            LLVM output = listener.output;
            output.finalize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
