// Generated from D:/java_projects/js-interpretor/src/main/resources\ReginaScript.g4 by ANTLR 4.5.1
package com.example.jsinterpreter.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReginaScriptLexer extends Lexer {
	public static final int
		NullLiteral=1, BooleanLiteral=2, EnvironmentalIdentifier=3, NormalIdentifier=4,
		DecimalLiteral=5, HexIntegerLiteral=6, OctalIntegerLiteral=7, StringLiteral=8,
		Data=9, UUID=10, Online=11, OpenBracket=12, CloseBracket=13, OpenParen=14,
		CloseParen=15, OpenBrace=16, CloseBrace=17, SemiColon=18, Comma=19, Assign=20,
		QuestionMark=21, Colon=22, Dot=23, PlusPlus=24, MinusMinus=25, Plus=26,
		Minus=27, BitNot=28, Not=29, Multiply=30, Divide=31, Modulus=32, RightShiftArithmetic=33,
		LeftShiftArithmetic=34, RightShiftLogical=35, LessThan=36, GreaterThan=37,
		LessThanEquals=38, GreaterThanEquals=39, Equals=40, NotEquals=41, IdentityEquals=42,
		IdentityNotEquals=43, BitAnd=44, BitXOr=45, BitOr=46, And=47, Or=48, MultiplyAssign=49,
		DivideAssign=50, ModulusAssign=51, PlusAssign=52, MinusAssign=53, LeftShiftArithmeticAssign=54,
		RightShiftArithmeticAssign=55, RightShiftLogicalAssign=56, BitAndAssign=57,
		BitXorAssign=58, BitOrAssign=59, WS=60;
	public static final String[] ruleNames = {
		"NullLiteral", "BooleanLiteral", "EnvironmentalIdentifier", "NormalIdentifier",
		"DecimalLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", "StringLiteral",
		"Data", "UUID", "Online", "OpenBracket", "CloseBracket", "OpenParen",
		"CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", "Assign",
		"QuestionMark", "Colon", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus",
		"BitNot", "Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic",
		"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "GreaterThan",
		"LessThanEquals", "GreaterThanEquals", "Equals", "NotEquals", "IdentityEquals",
		"IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign",
		"DivideAssign", "ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign",
		"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign",
		"BitXorAssign", "BitOrAssign", "DoubleStringCharacter", "EscapeSequence",
		"CharacterEscapeSequence", "SingleEscapeCharacter", "IdentifierStart",
		"IdentifierPart", "ExponentPart", "DecimalDigit", "HexDigit", "OctalDigit",
		"DecimalIntegerLiteral", "WS"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u0195\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a0\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u00a9\n\5\f\5\16\5\u00ac\13\5\3\6\3\6\3\6"+
		"\7\6\u00b1\n\6\f\6\16\6\u00b4\13\6\3\6\5\6\u00b7\n\6\3\6\3\6\5\6\u00bb"+
		"\n\6\5\6\u00bd\n\6\3\7\3\7\3\7\6\7\u00c2\n\7\r\7\16\7\u00c3\3\b\3\b\6"+
		"\b\u00c8\n\b\r\b\16\b\u00c9\3\t\3\t\7\t\u00ce\n\t\f\t\16\t\u00d1\13\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"9\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\5=\u0168\n=\3>\3>\5"+
		">\u016c\n>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\5C\u0178\nC\3C\6C\u017b\nC\r"+
		"C\16C\u017c\3D\3D\3E\3E\3F\3F\3G\3G\3G\7G\u0188\nG\fG\16G\u018b\13G\5"+
		"G\u018d\nG\3H\6H\u0190\nH\rH\16H\u0191\3H\3H\2\2I\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f>\3\2"+
		"\16\4\2ZZzz\6\2\f\f\17\17$$^^\13\2$$))^^ddhhppttvvxx\4\2C\\c|\5\2\62;"+
		"C\\c|\4\2GGgg\4\2--//\3\2\62;\5\2\62;CHch\3\2\629\3\2\63;\5\2\13\f\17"+
		"\17\"\"\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u009f\3\2\2\2\7\u00a1\3\2\2\2\t\u00a6"+
		"\3\2\2\2\13\u00bc\3\2\2\2\r\u00be\3\2\2\2\17\u00c5\3\2\2\2\21\u00cb\3"+
		"\2\2\2\23\u00d4\3\2\2\2\25\u00d9\3\2\2\2\27\u00de\3\2\2\2\31\u00e5\3\2"+
		"\2\2\33\u00e7\3\2\2\2\35\u00e9\3\2\2\2\37\u00eb\3\2\2\2!\u00ed\3\2\2\2"+
		"#\u00ef\3\2\2\2%\u00f1\3\2\2\2\'\u00f3\3\2\2\2)\u00f5\3\2\2\2+\u00f7\3"+
		"\2\2\2-\u00f9\3\2\2\2/\u00fb\3\2\2\2\61\u00fd\3\2\2\2\63\u0100\3\2\2\2"+
		"\65\u0103\3\2\2\2\67\u0105\3\2\2\29\u0107\3\2\2\2;\u0109\3\2\2\2=\u010b"+
		"\3\2\2\2?\u010d\3\2\2\2A\u010f\3\2\2\2C\u0111\3\2\2\2E\u0114\3\2\2\2G"+
		"\u0117\3\2\2\2I\u011b\3\2\2\2K\u011d\3\2\2\2M\u011f\3\2\2\2O\u0122\3\2"+
		"\2\2Q\u0125\3\2\2\2S\u0128\3\2\2\2U\u012b\3\2\2\2W\u012f\3\2\2\2Y\u0133"+
		"\3\2\2\2[\u0135\3\2\2\2]\u0137\3\2\2\2_\u0139\3\2\2\2a\u013c\3\2\2\2c"+
		"\u013f\3\2\2\2e\u0142\3\2\2\2g\u0145\3\2\2\2i\u0148\3\2\2\2k\u014b\3\2"+
		"\2\2m\u014e\3\2\2\2o\u0152\3\2\2\2q\u0156\3\2\2\2s\u015b\3\2\2\2u\u015e"+
		"\3\2\2\2w\u0161\3\2\2\2y\u0167\3\2\2\2{\u016b\3\2\2\2}\u016d\3\2\2\2\177"+
		"\u016f\3\2\2\2\u0081\u0171\3\2\2\2\u0083\u0173\3\2\2\2\u0085\u0175\3\2"+
		"\2\2\u0087\u017e\3\2\2\2\u0089\u0180\3\2\2\2\u008b\u0182\3\2\2\2\u008d"+
		"\u018c\3\2\2\2\u008f\u018f\3\2\2\2\u0091\u0092\7p\2\2\u0092\u0093\7w\2"+
		"\2\u0093\u0094\7n\2\2\u0094\u0095\7n\2\2\u0095\4\3\2\2\2\u0096\u0097\7"+
		"v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7w\2\2\u0099\u00a0\7g\2\2\u009a\u009b"+
		"\7h\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e"+
		"\u00a0\7g\2\2\u009f\u0096\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\6\3\2\2\2"+
		"\u00a1\u00a2\7f\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\b\3\2\2\2\u00a6\u00aa\5\u0081A\2\u00a7\u00a9\5\u0083B\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\n\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\u008dG\2\u00ae"+
		"\u00b2\7\60\2\2\u00af\u00b1\5\u0087D\2\u00b0\u00af\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b7\5\u0085C\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00ba\5\u008dG\2\u00b9\u00bb\5\u0085"+
		"C\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ad\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\f\3\2\2\2\u00be\u00bf\7\62\2"+
		"\2\u00bf\u00c1\t\2\2\2\u00c0\u00c2\5\u0089E\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\16\3\2\2"+
		"\2\u00c5\u00c7\7\62\2\2\u00c6\u00c8\5\u008bF\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\20\3\2\2"+
		"\2\u00cb\u00cf\7$\2\2\u00cc\u00ce\5y=\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3\22\3\2\2\2\u00d4\u00d5\7f\2\2"+
		"\u00d5\u00d6\7c\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7c\2\2\u00d8\24\3\2"+
		"\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7f\2\2\u00dd\26\3\2\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1"+
		"\7n\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\30\3\2\2\2\u00e5\u00e6\7]\2\2\u00e6\32\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8"+
		"\34\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\36\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec"+
		" \3\2\2\2\u00ed\u00ee\7}\2\2\u00ee\"\3\2\2\2\u00ef\u00f0\7\177\2\2\u00f0"+
		"$\3\2\2\2\u00f1\u00f2\7=\2\2\u00f2&\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4("+
		"\3\2\2\2\u00f5\u00f6\7?\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7A\2\2\u00f8,\3"+
		"\2\2\2\u00f9\u00fa\7<\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fc\60"+
		"\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe\u00ff\7-\2\2\u00ff\62\3\2\2\2\u0100"+
		"\u0101\7/\2\2\u0101\u0102\7/\2\2\u0102\64\3\2\2\2\u0103\u0104\7-\2\2\u0104"+
		"\66\3\2\2\2\u0105\u0106\7/\2\2\u01068\3\2\2\2\u0107\u0108\7\u0080\2\2"+
		"\u0108:\3\2\2\2\u0109\u010a\7#\2\2\u010a<\3\2\2\2\u010b\u010c\7,\2\2\u010c"+
		">\3\2\2\2\u010d\u010e\7\61\2\2\u010e@\3\2\2\2\u010f\u0110\7\'\2\2\u0110"+
		"B\3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\7@\2\2\u0113D\3\2\2\2\u0114\u0115"+
		"\7>\2\2\u0115\u0116\7>\2\2\u0116F\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0119"+
		"\7@\2\2\u0119\u011a\7@\2\2\u011aH\3\2\2\2\u011b\u011c\7>\2\2\u011cJ\3"+
		"\2\2\2\u011d\u011e\7@\2\2\u011eL\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121"+
		"\7?\2\2\u0121N\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124\7?\2\2\u0124P\3"+
		"\2\2\2\u0125\u0126\7?\2\2\u0126\u0127\7?\2\2\u0127R\3\2\2\2\u0128\u0129"+
		"\7#\2\2\u0129\u012a\7?\2\2\u012aT\3\2\2\2\u012b\u012c\7?\2\2\u012c\u012d"+
		"\7?\2\2\u012d\u012e\7?\2\2\u012eV\3\2\2\2\u012f\u0130\7#\2\2\u0130\u0131"+
		"\7?\2\2\u0131\u0132\7?\2\2\u0132X\3\2\2\2\u0133\u0134\7(\2\2\u0134Z\3"+
		"\2\2\2\u0135\u0136\7`\2\2\u0136\\\3\2\2\2\u0137\u0138\7~\2\2\u0138^\3"+
		"\2\2\2\u0139\u013a\7(\2\2\u013a\u013b\7(\2\2\u013b`\3\2\2\2\u013c\u013d"+
		"\7~\2\2\u013d\u013e\7~\2\2\u013eb\3\2\2\2\u013f\u0140\7,\2\2\u0140\u0141"+
		"\7?\2\2\u0141d\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7?\2\2\u0144f"+
		"\3\2\2\2\u0145\u0146\7\'\2\2\u0146\u0147\7?\2\2\u0147h\3\2\2\2\u0148\u0149"+
		"\7-\2\2\u0149\u014a\7?\2\2\u014aj\3\2\2\2\u014b\u014c\7/\2\2\u014c\u014d"+
		"\7?\2\2\u014dl\3\2\2\2\u014e\u014f\7>\2\2\u014f\u0150\7>\2\2\u0150\u0151"+
		"\7?\2\2\u0151n\3\2\2\2\u0152\u0153\7@\2\2\u0153\u0154\7@\2\2\u0154\u0155"+
		"\7?\2\2\u0155p\3\2\2\2\u0156\u0157\7@\2\2\u0157\u0158\7@\2\2\u0158\u0159"+
		"\7@\2\2\u0159\u015a\7?\2\2\u015ar\3\2\2\2\u015b\u015c\7(\2\2\u015c\u015d"+
		"\7?\2\2\u015dt\3\2\2\2\u015e\u015f\7`\2\2\u015f\u0160\7?\2\2\u0160v\3"+
		"\2\2\2\u0161\u0162\7~\2\2\u0162\u0163\7?\2\2\u0163x\3\2\2\2\u0164\u0168"+
		"\n\3\2\2\u0165\u0166\7^\2\2\u0166\u0168\5{>\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168z\3\2\2\2\u0169\u016c\5}?\2\u016a\u016c\7\62\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c|\3\2\2\2\u016d\u016e\5\177@\2"+
		"\u016e~\3\2\2\2\u016f\u0170\t\4\2\2\u0170\u0080\3\2\2\2\u0171\u0172\t"+
		"\5\2\2\u0172\u0082\3\2\2\2\u0173\u0174\t\6\2\2\u0174\u0084\3\2\2\2\u0175"+
		"\u0177\t\7\2\2\u0176\u0178\t\b\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u017b\5\u0087D\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0086\3\2"+
		"\2\2\u017e\u017f\t\t\2\2\u017f\u0088\3\2\2\2\u0180\u0181\t\n\2\2\u0181"+
		"\u008a\3\2\2\2\u0182\u0183\t\13\2\2\u0183\u008c\3\2\2\2\u0184\u018d\7"+
		"\62\2\2\u0185\u0189\t\f\2\2\u0186\u0188\5\u0087D\2\u0187\u0186\3\2\2\2"+
		"\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018d"+
		"\u008e\3\2\2\2\u018e\u0190\t\r\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\bH\2\2\u0194\u0090\3\2\2\2\23\2\u009f\u00aa\u00b2\u00b6\u00ba\u00bc"+
		"\u00c3\u00c9\u00cf\u0167\u016b\u0177\u017c\u0189\u018c\u0191\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
		null, "'null'", null, null, null, null, null, null, null, null, "'uuid'",
		"'online'", "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='",
		"'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'",
		"'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='",
		"'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='",
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='",
		"'|='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NullLiteral", "BooleanLiteral", "EnvironmentalIdentifier", "NormalIdentifier",
		"DecimalLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", "StringLiteral",
		"Data", "UUID", "Online", "OpenBracket", "CloseBracket", "OpenParen",
		"CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", "Assign",
		"QuestionMark", "Colon", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus",
		"BitNot", "Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic",
		"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "GreaterThan",
		"LessThanEquals", "GreaterThanEquals", "Equals", "NotEquals", "IdentityEquals",
		"IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign",
		"DivideAssign", "ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign",
		"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign",
		"BitXorAssign", "BitOrAssign", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public ReginaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReginaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }
}