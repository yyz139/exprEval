// Generated from D:/java_projects/js-interpretor/src/main/resources\ReginaScript.g4 by ANTLR 4.5.1
package com.example.jsinterpreter.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReginaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Identifier=2, BooleanLiteral=3, DecimalLiteral=4, HexIntegerLiteral=5, 
		OctalIntegerLiteral=6, StringLiteral=7, Data=8, UUID=9, Online=10, OpenBracket=11, 
		CloseBracket=12, OpenParen=13, CloseParen=14, OpenBrace=15, CloseBrace=16, 
		SemiColon=17, Comma=18, Assign=19, QuestionMark=20, Colon=21, Dot=22, 
		PlusPlus=23, MinusMinus=24, Plus=25, Minus=26, BitNot=27, Not=28, Multiply=29, 
		Divide=30, Modulus=31, RightShiftArithmetic=32, LeftShiftArithmetic=33, 
		RightShiftLogical=34, LessThan=35, MoreThan=36, LessThanEquals=37, GreaterThanEquals=38, 
		Equals=39, NotEquals=40, IdentityEquals=41, IdentityNotEquals=42, BitAnd=43, 
		BitXOr=44, BitOr=45, And=46, Or=47, MultiplyAssign=48, DivideAssign=49, 
		ModulusAssign=50, PlusAssign=51, MinusAssign=52, LeftShiftArithmeticAssign=53, 
		RightShiftArithmeticAssign=54, RightShiftLogicalAssign=55, BitAndAssign=56, 
		BitXorAssign=57, BitOrAssign=58, WS=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Identifier", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "StringLiteral", "Data", "UUID", "Online", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", 
		"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", 
		"Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
		"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
		"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"DoubleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", 
		"SingleEscapeCharacter", "IdentifierStart", "IdentifierPart", "ExponentPart", 
		"DecimalDigit", "HexDigit", "OctalDigit", "DecimalIntegerLiteral", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "''", null, null, null, null, null, null, "'data'", "'uuid'", "'online'", 
		"'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'?'", 
		"':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", 
		"'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", 
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", 
		"'|='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Identifier", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "StringLiteral", "Data", "UUID", "Online", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", 
		"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", 
		"Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
		"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
		"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ReginaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u018a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\3\3"+
		"\3\7\3\u0093\n\3\f\3\16\3\u0096\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00a1\n\4\3\5\3\5\3\5\7\5\u00a6\n\5\f\5\16\5\u00a9\13\5\3\5\5\5"+
		"\u00ac\n\5\3\5\3\5\5\5\u00b0\n\5\5\5\u00b2\n\5\3\6\3\6\3\6\6\6\u00b7\n"+
		"\6\r\6\16\6\u00b8\3\7\3\7\6\7\u00bd\n\7\r\7\16\7\u00be\3\b\3\b\7\b\u00c3"+
		"\n\b\f\b\16\b\u00c6\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3"+
		"<\3<\3<\5<\u015d\n<\3=\3=\5=\u0161\n=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\5"+
		"B\u016d\nB\3B\6B\u0170\nB\rB\16B\u0171\3C\3C\3D\3D\3E\3E\3F\3F\3F\7F\u017d"+
		"\nF\fF\16F\u0180\13F\5F\u0182\nF\3G\6G\u0185\nG\rG\16G\u0186\3G\3G\2\2"+
		"H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d=\3\2\16\4\2ZZzz\6\2\f\f\17\17$$^^\13\2$$))^^ddhhppttvvxx\4\2"+
		"C\\c|\5\2\62;C\\c|\4\2GGgg\4\2--//\3\2\62;\5\2\62;CHch\3\2\629\3\2\63"+
		";\5\2\13\f\17\17\"\"\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0090\3\2\2\2\7\u00a0\3\2\2\2\t\u00b1"+
		"\3\2\2\2\13\u00b3\3\2\2\2\r\u00ba\3\2\2\2\17\u00c0\3\2\2\2\21\u00c9\3"+
		"\2\2\2\23\u00ce\3\2\2\2\25\u00d3\3\2\2\2\27\u00da\3\2\2\2\31\u00dc\3\2"+
		"\2\2\33\u00de\3\2\2\2\35\u00e0\3\2\2\2\37\u00e2\3\2\2\2!\u00e4\3\2\2\2"+
		"#\u00e6\3\2\2\2%\u00e8\3\2\2\2\'\u00ea\3\2\2\2)\u00ec\3\2\2\2+\u00ee\3"+
		"\2\2\2-\u00f0\3\2\2\2/\u00f2\3\2\2\2\61\u00f5\3\2\2\2\63\u00f8\3\2\2\2"+
		"\65\u00fa\3\2\2\2\67\u00fc\3\2\2\29\u00fe\3\2\2\2;\u0100\3\2\2\2=\u0102"+
		"\3\2\2\2?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0109\3\2\2\2E\u010c\3\2\2\2G"+
		"\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2\2\2M\u0117\3\2\2\2O\u011a\3\2"+
		"\2\2Q\u011d\3\2\2\2S\u0120\3\2\2\2U\u0124\3\2\2\2W\u0128\3\2\2\2Y\u012a"+
		"\3\2\2\2[\u012c\3\2\2\2]\u012e\3\2\2\2_\u0131\3\2\2\2a\u0134\3\2\2\2c"+
		"\u0137\3\2\2\2e\u013a\3\2\2\2g\u013d\3\2\2\2i\u0140\3\2\2\2k\u0143\3\2"+
		"\2\2m\u0147\3\2\2\2o\u014b\3\2\2\2q\u0150\3\2\2\2s\u0153\3\2\2\2u\u0156"+
		"\3\2\2\2w\u015c\3\2\2\2y\u0160\3\2\2\2{\u0162\3\2\2\2}\u0164\3\2\2\2\177"+
		"\u0166\3\2\2\2\u0081\u0168\3\2\2\2\u0083\u016a\3\2\2\2\u0085\u0173\3\2"+
		"\2\2\u0087\u0175\3\2\2\2\u0089\u0177\3\2\2\2\u008b\u0181\3\2\2\2\u008d"+
		"\u0184\3\2\2\2\u0090\u0094\5\177@\2\u0091\u0093\5\u0081A\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\6\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u00a1\7g\2\2\u009b\u009c\7h\2\2\u009c\u009d\7c\2\2"+
		"\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a1\7g\2\2\u00a0\u0097"+
		"\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1\b\3\2\2\2\u00a2\u00a3\5\u008bF\2\u00a3"+
		"\u00a7\7\60\2\2\u00a4\u00a6\5\u0085C\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ac\5\u0083B\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00b2\3\2\2\2\u00ad\u00af\5\u008bF\2\u00ae\u00b0\5\u0083"+
		"B\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00a2\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\n\3\2\2\2\u00b3\u00b4\7\62\2"+
		"\2\u00b4\u00b6\t\2\2\2\u00b5\u00b7\5\u0087D\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\f\3\2\2\2"+
		"\u00ba\u00bc\7\62\2\2\u00bb\u00bd\5\u0089E\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\16\3\2\2"+
		"\2\u00c0\u00c4\7$\2\2\u00c1\u00c3\5w<\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8\20\3\2\2\2\u00c9\u00ca\7f\2\2"+
		"\u00ca\u00cb\7c\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd\22\3\2"+
		"\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6"+
		"\7n\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\26\3\2\2\2\u00da\u00db\7]\2\2\u00db\30\3\2\2\2\u00dc\u00dd\7_\2\2\u00dd"+
		"\32\3\2\2\2\u00de\u00df\7*\2\2\u00df\34\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1"+
		"\36\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3 \3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5"+
		"\"\3\2\2\2\u00e6\u00e7\7=\2\2\u00e7$\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9"+
		"&\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb(\3\2\2\2\u00ec\u00ed\7A\2\2\u00ed*"+
		"\3\2\2\2\u00ee\u00ef\7<\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1"+
		".\3\2\2\2\u00f2\u00f3\7-\2\2\u00f3\u00f4\7-\2\2\u00f4\60\3\2\2\2\u00f5"+
		"\u00f6\7/\2\2\u00f6\u00f7\7/\2\2\u00f7\62\3\2\2\2\u00f8\u00f9\7-\2\2\u00f9"+
		"\64\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb\66\3\2\2\2\u00fc\u00fd\7\u0080\2"+
		"\2\u00fd8\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff:\3\2\2\2\u0100\u0101\7,\2\2"+
		"\u0101<\3\2\2\2\u0102\u0103\7\61\2\2\u0103>\3\2\2\2\u0104\u0105\7\'\2"+
		"\2\u0105@\3\2\2\2\u0106\u0107\7@\2\2\u0107\u0108\7@\2\2\u0108B\3\2\2\2"+
		"\u0109\u010a\7>\2\2\u010a\u010b\7>\2\2\u010bD\3\2\2\2\u010c\u010d\7@\2"+
		"\2\u010d\u010e\7@\2\2\u010e\u010f\7@\2\2\u010fF\3\2\2\2\u0110\u0111\7"+
		">\2\2\u0111H\3\2\2\2\u0112\u0113\7@\2\2\u0113J\3\2\2\2\u0114\u0115\7>"+
		"\2\2\u0115\u0116\7?\2\2\u0116L\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0119"+
		"\7?\2\2\u0119N\3\2\2\2\u011a\u011b\7?\2\2\u011b\u011c\7?\2\2\u011cP\3"+
		"\2\2\2\u011d\u011e\7#\2\2\u011e\u011f\7?\2\2\u011fR\3\2\2\2\u0120\u0121"+
		"\7?\2\2\u0121\u0122\7?\2\2\u0122\u0123\7?\2\2\u0123T\3\2\2\2\u0124\u0125"+
		"\7#\2\2\u0125\u0126\7?\2\2\u0126\u0127\7?\2\2\u0127V\3\2\2\2\u0128\u0129"+
		"\7(\2\2\u0129X\3\2\2\2\u012a\u012b\7`\2\2\u012bZ\3\2\2\2\u012c\u012d\7"+
		"~\2\2\u012d\\\3\2\2\2\u012e\u012f\7(\2\2\u012f\u0130\7(\2\2\u0130^\3\2"+
		"\2\2\u0131\u0132\7~\2\2\u0132\u0133\7~\2\2\u0133`\3\2\2\2\u0134\u0135"+
		"\7,\2\2\u0135\u0136\7?\2\2\u0136b\3\2\2\2\u0137\u0138\7\61\2\2\u0138\u0139"+
		"\7?\2\2\u0139d\3\2\2\2\u013a\u013b\7\'\2\2\u013b\u013c\7?\2\2\u013cf\3"+
		"\2\2\2\u013d\u013e\7-\2\2\u013e\u013f\7?\2\2\u013fh\3\2\2\2\u0140\u0141"+
		"\7/\2\2\u0141\u0142\7?\2\2\u0142j\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0145"+
		"\7>\2\2\u0145\u0146\7?\2\2\u0146l\3\2\2\2\u0147\u0148\7@\2\2\u0148\u0149"+
		"\7@\2\2\u0149\u014a\7?\2\2\u014an\3\2\2\2\u014b\u014c\7@\2\2\u014c\u014d"+
		"\7@\2\2\u014d\u014e\7@\2\2\u014e\u014f\7?\2\2\u014fp\3\2\2\2\u0150\u0151"+
		"\7(\2\2\u0151\u0152\7?\2\2\u0152r\3\2\2\2\u0153\u0154\7`\2\2\u0154\u0155"+
		"\7?\2\2\u0155t\3\2\2\2\u0156\u0157\7~\2\2\u0157\u0158\7?\2\2\u0158v\3"+
		"\2\2\2\u0159\u015d\n\3\2\2\u015a\u015b\7^\2\2\u015b\u015d\5y=\2\u015c"+
		"\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015dx\3\2\2\2\u015e\u0161\5{>\2\u015f"+
		"\u0161\7\62\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161z\3\2\2\2"+
		"\u0162\u0163\5}?\2\u0163|\3\2\2\2\u0164\u0165\t\4\2\2\u0165~\3\2\2\2\u0166"+
		"\u0167\t\5\2\2\u0167\u0080\3\2\2\2\u0168\u0169\t\6\2\2\u0169\u0082\3\2"+
		"\2\2\u016a\u016c\t\7\2\2\u016b\u016d\t\b\2\2\u016c\u016b\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\5\u0085C\2\u016f\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0084\3\2\2\2\u0173\u0174\t\t\2\2\u0174\u0086\3\2\2\2\u0175\u0176\t\n"+
		"\2\2\u0176\u0088\3\2\2\2\u0177\u0178\t\13\2\2\u0178\u008a\3\2\2\2\u0179"+
		"\u0182\7\62\2\2\u017a\u017e\t\f\2\2\u017b\u017d\5\u0085C\2\u017c\u017b"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017a\3\2"+
		"\2\2\u0182\u008c\3\2\2\2\u0183\u0185\t\r\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u0189\bG\2\2\u0189\u008e\3\2\2\2\23\2\u0094\u00a0\u00a7\u00ab"+
		"\u00af\u00b1\u00b8\u00be\u00c4\u015c\u0160\u016c\u0171\u017e\u0181\u0186"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}