package com.example.jsinterpreter;

import com.example.jsinterpreter.antlr.ReginaScriptLexer;
import com.example.jsinterpreter.antlr.ReginaScriptParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.*;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Yuzhou on 2016/2/12.
 */
public class AntlrTest {
    @Test
    public void testAntlr() {
        String sentence = "1+2";


        ReginaScriptLexer lexer = new ReginaScriptLexer(new ANTLRInputStream(sentence));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ReginaScriptParser parser = new ReginaScriptParser(tokens);
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        ParseTree tree;
        try {
            tree = parser.singleExpression();
        }
        catch (Exception ex) {
            tokens.reset();
            parser.reset();
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            tree = parser.singleExpression();
        }

        AntlrVisitor visitor = new AntlrVisitor(new HashMap<>());
        System.out.println(visitor.visit(tree));
    }
}

