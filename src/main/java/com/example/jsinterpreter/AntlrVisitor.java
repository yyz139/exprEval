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
        this.env = env;
    }
    //------------------------------additive operations------------------
    public Value visitAdditiveExpression(ReginaScriptParser.AdditiveExpressionContext ctx) {
        Value left = visit(ctx.singleExpression(0));
        Value right = visit(ctx.singleExpression(1));
        switch (ctx.op.getType()) {
            case ReginaScriptParser.Plus:
                return left.add(right);
            case ReginaScriptParser.Minus:
                return left.minus(right);
            default:
                throw new InterpreterException("invalid additive operation");
        }
    }
    public Value visitMultiplicativeExpression(ReginaScriptParser.MultiplicativeExpressionContext ctx) {
        Value left = visit(ctx.singleExpression(0));
        Value right = visit(ctx.singleExpression(1));

        switch (ctx.op.getType()) {
            case ReginaScriptParser.Multiply:
                return left.multiply(right);
            case ReginaScriptParser.Divide:
                return left.divide(right);
            case ReginaScriptParser.Modulus:
                return left.modulus(right);
            default:
                throw new InterpreterException("invalid multiplicative operation");
        }
    }
    //---------------------------------parenthesize---------------------
    public Value visitParenthesizedExpression(ReginaScriptParser.ParenthesizedExpressionContext ctx) {
        return visit(ctx.singleExpression());
    }
    //----------------------------------relational---------------------------
    public Value visitRelationalExpression(ReginaScriptParser.RelationalExpressionContext ctx) {
        Value left = visit(ctx.singleExpression(0));
        Value right = visit(ctx.singleExpression(1));

        switch (ctx.op.getType()) {
            case ReginaScriptParser.LessThan:
                return left.lessThan(right);
            case ReginaScriptParser.GreaterThan:
                return left.moreThan(right);
            case ReginaScriptParser.LessThanEquals:
                Value lessThan = left.lessThan(right);
                return lessThan.isTrue() ? lessThan : left.equals(right);
            case ReginaScriptParser.GreaterThanEquals:
                Value moreThan = left.moreThan(right);
                return moreThan.isTrue() ? moreThan : left.equals(right);
            default:
                throw new InterpreterException("invalid relational operation");
        }
    }
    public Value visitEqualityExpression(ReginaScriptParser.EqualityExpressionContext ctx) {
        Value left = visit(ctx.singleExpression(0));
        Value right = visit(ctx.singleExpression(1));

        switch (ctx.op.getType()) {
            case ReginaScriptParser.Equals:
                Value value = left.equals(right);
                return value;
            case ReginaScriptParser.NotEquals:
                return left.equals(right).inverse();
            default:
                throw new InterpreterException("invalid equality operation");
        }
    }
    //-------------------------------logical--------------------------------
    public Value visitNotExpression(ReginaScriptParser.NotExpressionContext ctx) {
        return visit(ctx.singleExpression()).inverse();
    }
    public Value visitLogicalOrExpression(ReginaScriptParser.LogicalOrExpressionContext ctx) {
        Value left = visit(ctx.singleExpression(0));
        Value right = visit(ctx.singleExpression(1));

        return left.logicalOr(right);
    }
    public Value visitLogicalAndExpression(ReginaScriptParser.LogicalAndExpressionContext ctx) {
        Value left = visit(ctx.singleExpression(0));
        Value right = visit(ctx.singleExpression(1));

        return left.logicalAnd(right);
    }
    //----------------------------------ternary----------------------------------------
    public Value visitTernaryExpression(ReginaScriptParser.TernaryExpressionContext ctx) {
        Value condition = visit(ctx.singleExpression(0));

        if (condition.asBoolean() == true) {
            return visit(ctx.singleExpression(1));
        } else {
            return visit(ctx.singleExpression(2));
        }
    }
    //-----------------------------------literals-----------------------
    public Value visitNumericLiteral(ReginaScriptParser.NumericLiteralContext ctx) {
        if (ctx.DecimalLiteral() != null) {
            return new Value(Double.parseDouble(ctx.getText()));
        } else if (ctx.HexIntegerLiteral() != null) {
            return new Value((double)Long.decode(ctx.getText()));
        } else if (ctx.OctalIntegerLiteral() != null) {
            return new Value((double)Long.decode(ctx.getText()));
        } else {
            throw new InterpreterException("numeric literal bug");
        }
    }
    public Value visitLiteralExpression(ReginaScriptParser.LiteralExpressionContext ctx) {
        return visitLiteral(ctx.literal());
    }
    public Value visitLiteral(ReginaScriptParser.LiteralContext ctx) {

        if (ctx.BooleanLiteral() != null) {
            Value value = new Value(Boolean.parseBoolean(ctx.BooleanLiteral().getText()));
            return value;
        } else if (ctx.StringLiteral() != null) {
            //TODO:determine need copy or not
            return new Value(ctx.StringLiteral());
        } else if (ctx.numericLiteral() != null) {
            return visitNumericLiteral(ctx.numericLiteral());
        } else {
            throw new InterpreterException("literal bug");
        }
    }
    //--------------------------------identifier---------------------------
    public Value visitNormalIdentifierExpression(ReginaScriptParser.NormalIdentifierExpressionContext ctx) {
        return visitChildren(ctx);

    }
    //---------------------------------unary operations---------------------
    public Value visitUnaryMinusExpression(ReginaScriptParser.UnaryMinusExpressionContext ctx) {
        Value value = visit(ctx.singleExpression());
        return value.unaryMinus();
    }
    public Value visitUnaryPlusExpression(ReginaScriptParser.UnaryPlusExpressionContext ctx) {
        Value value = visit(ctx.singleExpression());
        return value.unaryPlus();
    }
    //---------------------------------member--------------------------------
    public Value visitMemberDotExpression(ReginaScriptParser.MemberDotExpressionContext ctx) {
        Value left = visit(ctx.singleExpression());
        Value right = visit(ctx.identifierName());

        return left.memberDot(right);
    }

    public Value visitEnvironmentalIdentifierExpression(ReginaScriptParser.EnvironmentalIdentifierExpressionContext ctx) {
        return new Value(env);
    }

//
//    public T visitMemberIndexExpression(ReginaScriptParser.MemberIndexExpressionContext ctx) { return visitChildren(ctx); }

//    public T visitBooleanLiteralExpression(ReginaScriptParser.BooleanLiteralExpressionContext ctx) { return visitChildren(ctx); }
//
    public Value visitIdentifierName(ReginaScriptParser.IdentifierNameContext ctx) {
        return new Value(ctx.NormalIdentifier().getText());
    }
//
    public Value visitReservedWord(ReginaScriptParser.ReservedWordContext ctx) {
        return visitChildren(ctx);
    }
//
//    public T visitKeyword(ReginaScriptParser.KeywordContext ctx) { return visitChildren(ctx); }
//
//    public T visitFutureReservedWord(ReginaScriptParser.FutureReservedWordContext ctx) { return visitChildren(ctx); }
}
