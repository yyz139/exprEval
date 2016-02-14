package com.example.jsinterpreter;

import com.example.jsinterpreter.antlr.ReginaScriptLexer;
import com.example.jsinterpreter.antlr.ReginaScriptParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuzhou on 2016/2/12.
 */
public class AntlrTest {
    @Test
    public void testAntlr() {
        String sentence = "data.dd-1==0";

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

        Map<String, Object> env = new HashMap<>();
        env.put("dd", 2.0);
        AntlrVisitor visitor = new AntlrVisitor(env);
        System.out.println(visitor.visit(tree));
    }
}

