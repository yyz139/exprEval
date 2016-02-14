// Generated from D:/java_projects/js-interpretor/src/main/resources\ReginaScript.g4 by ANTLR 4.5.1
package com.example.jsinterpreter.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReginaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReginaScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(ReginaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ReginaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ReginaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(ReginaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ReginaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(ReginaScriptParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ReginaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(ReginaScriptParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ReginaScriptParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(ReginaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalIdentifierExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalIdentifierExpression(ReginaScriptParser.NormalIdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(ReginaScriptParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnvironmentalIdentifierExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentalIdentifierExpression(ReginaScriptParser.EnvironmentalIdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(ReginaScriptParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ReginaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ReginaScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReginaScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ReginaScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReginaScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(ReginaScriptParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReginaScriptParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(ReginaScriptParser.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReginaScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(ReginaScriptParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReginaScriptParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ReginaScriptParser.KeywordContext ctx);
}