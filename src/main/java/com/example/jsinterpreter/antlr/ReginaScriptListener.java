// Generated from D:/java_projects/js-interpretor/src/main/resources\ReginaScript.g4 by ANTLR 4.5.1
package com.example.jsinterpreter.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReginaScriptParser}.
 */
public interface ReginaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ReginaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ReginaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ReginaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ReginaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ReginaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ReginaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(ReginaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(ReginaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ReginaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ReginaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ReginaScriptParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ReginaScriptParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ReginaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ReginaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(ReginaScriptParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(ReginaScriptParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ReginaScriptParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ReginaScriptParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(ReginaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(ReginaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalIdentifierExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNormalIdentifierExpression(ReginaScriptParser.NormalIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalIdentifierExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNormalIdentifierExpression(ReginaScriptParser.NormalIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(ReginaScriptParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(ReginaScriptParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnvironmentalIdentifierExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentalIdentifierExpression(ReginaScriptParser.EnvironmentalIdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnvironmentalIdentifierExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentalIdentifierExpression(ReginaScriptParser.EnvironmentalIdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(ReginaScriptParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(ReginaScriptParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ReginaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ReginaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ReginaScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReginaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ReginaScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReginaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ReginaScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReginaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ReginaScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReginaScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ReginaScriptParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReginaScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ReginaScriptParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReginaScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(ReginaScriptParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReginaScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(ReginaScriptParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReginaScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(ReginaScriptParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReginaScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(ReginaScriptParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReginaScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ReginaScriptParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReginaScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ReginaScriptParser.KeywordContext ctx);
}