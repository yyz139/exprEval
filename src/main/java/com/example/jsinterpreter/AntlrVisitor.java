package com.example.jsinterpreter;

import com.example.jsinterpreter.antlr.ReginaScriptBaseVisitor;
import com.example.jsinterpreter.antlr.ReginaScriptParser;

import java.util.Map;

/**
 * Created by Yuzhou on 2016/2/12.
 */
public class AntlrVisitor extends ReginaScriptBaseVisitor<Value> {
    private Map<String, Object> env;

    public AntlrVisitor(Map<String, Object> env) {
        this.env = env;=
    }

    public Value visitAdditiveExpression(ReginaScriptParser.AdditiveExpressionContext ctx) {
        Value left = visit(ctx.singleExpression(0));
        Value right = visit(ctx.singleExpression(1));
        switch (ctx.op.getType()) {
            case ReginaScriptParser.Plus:
                return left.add(right);
//            case ReginaScriptParser.Minus:
//                return left - right;
            default:
                return new Value(0);
        }
//        System.out.println(ctx.singleExpression(0));
//        if (ctx.() != null) {
//            System.out.println(ctx.Minus());
//            return left + right;
//        } else {
//            return left - right;
//        }
//        return 0;

    }

    public Value visitNumericLiteral(ReginaScriptParser.NumericLiteralContext ctx) {
        if (ctx.DecimalLiteral() != null) {
            //TODO
            return new Value(Integer.valueOf(ctx.getText()));
        } else if (ctx.HexIntegerLiteral() != null) {
            //TODO
            return new Value(0);
        } else if (ctx.OctalIntegerLiteral() != null) {
            //TODO
            return new Value(0);
        } else {
            throw new InterpreterException("numeric literal bug");
        }
    }

//    public Object visitParenthesizedExpression(ReginaScriptParser.ParenthesizedExpressionContext ctx) {
//        return visitChildren(ctx);
//    }
//
//
//    public Boolean visitRelationalExpression(ReginaScriptParser.RelationalExpressionContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    public T visitTernaryExpression(ReginaScriptParser.TernaryExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitLogicalAndExpression(ReginaScriptParser.LogicalAndExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitStringLiteralExpression(ReginaScriptParser.StringLiteralExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitLiteralExpression(ReginaScriptParser.LiteralExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitLogicalOrExpression(ReginaScriptParser.LogicalOrExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitMemberDotExpression(ReginaScriptParser.MemberDotExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitNotExpression(ReginaScriptParser.NotExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitMemberIndexExpression(ReginaScriptParser.MemberIndexExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitIdentifierExpression(ReginaScriptParser.IdentifierExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitUnaryMinusExpression(ReginaScriptParser.UnaryMinusExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitUnaryPlusExpression(ReginaScriptParser.UnaryPlusExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitBooleanLiteralExpression(ReginaScriptParser.BooleanLiteralExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitEqualityExpression(ReginaScriptParser.EqualityExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitMultiplicativeExpression(ReginaScriptParser.MultiplicativeExpressionContext ctx) { return visitChildren(ctx); }
//
//    public T visitIdentifierName(ReginaScriptParser.IdentifierNameContext ctx) { return visitChildren(ctx); }
//
//    public T visitReservedWord(ReginaScriptParser.ReservedWordContext ctx) { return visitChildren(ctx); }
//
//    public T visitKeyword(ReginaScriptParser.KeywordContext ctx) { return visitChildren(ctx); }
//
//    public T visitFutureReservedWord(ReginaScriptParser.FutureReservedWordContext ctx) { return visitChildren(ctx); }
}
