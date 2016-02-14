// Generated from D:/java_projects/js-interpretor/src/main/resources\ReginaScript.g4 by ANTLR 4.5.1
package com.example.jsinterpreter.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReginaScriptParser extends Parser {
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
	public static final int
		RULE_singleExpression = 0, RULE_literal = 1, RULE_numericLiteral = 2,
		RULE_identifierName = 3, RULE_reservedWord = 4, RULE_keyword = 5;
	public static final String[] ruleNames = {
		"singleExpression", "literal", "numericLiteral", "identifierName", "reservedWord",
		"keyword"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>T\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\7\2?\n\2\f\2\16\2B\13\2\3\3\3\3\5\3F\n\3\3\4\3\4\3"+
		"\5\3\5\5\5L\n\5\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\2\3\2\b\2\4\6\b\n\f\2\n\3"+
		"\2 \"\3\2\34\35\3\2&)\3\2*+\4\2\3\4\n\n\3\2\7\t\3\2\3\5\3\2\f\r_\2\34"+
		"\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\nO\3\2\2\2\fQ\3\2\2\2\16\17"+
		"\b\2\1\2\17\20\7\34\2\2\20\35\5\2\2\20\21\22\7\35\2\2\22\35\5\2\2\17\23"+
		"\24\7\37\2\2\24\35\5\2\2\16\25\35\5\4\3\2\26\35\7\5\2\2\27\35\7\6\2\2"+
		"\30\31\7\20\2\2\31\32\5\2\2\2\32\33\7\21\2\2\33\35\3\2\2\2\34\16\3\2\2"+
		"\2\34\21\3\2\2\2\34\23\3\2\2\2\34\25\3\2\2\2\34\26\3\2\2\2\34\27\3\2\2"+
		"\2\34\30\3\2\2\2\35@\3\2\2\2\36\37\f\r\2\2\37 \t\2\2\2 ?\5\2\2\16!\"\f"+
		"\f\2\2\"#\t\3\2\2#?\5\2\2\r$%\f\13\2\2%&\t\4\2\2&?\5\2\2\f\'(\f\n\2\2"+
		"()\t\5\2\2)?\5\2\2\13*+\f\t\2\2+,\7\61\2\2,?\5\2\2\n-.\f\b\2\2./\7\62"+
		"\2\2/?\5\2\2\t\60\61\f\7\2\2\61\62\7\27\2\2\62\63\5\2\2\2\63\64\7\30\2"+
		"\2\64\65\5\2\2\b\65?\3\2\2\2\66\67\f\22\2\2\678\7\16\2\289\5\2\2\29:\7"+
		"\17\2\2:?\3\2\2\2;<\f\21\2\2<=\7\31\2\2=?\5\b\5\2>\36\3\2\2\2>!\3\2\2"+
		"\2>$\3\2\2\2>\'\3\2\2\2>*\3\2\2\2>-\3\2\2\2>\60\3\2\2\2>\66\3\2\2\2>;"+
		"\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2B@\3\2\2\2CF\t\6\2\2"+
		"DF\5\6\4\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\t\7\2\2H\7\3\2\2\2IL\7\6\2"+
		"\2JL\5\n\6\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MP\5\f\7\2NP\t\b\2\2OM\3\2"+
		"\2\2ON\3\2\2\2P\13\3\2\2\2QR\t\t\2\2R\r\3\2\2\2\b\34>@EKO";
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

	public ReginaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
	public ATN getATN() { return _ATN; }

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			switch (_input.LA(1)) {
			case Plus:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(13);
				match(Plus);
				setState(14);
				singleExpression(14);
				}
				break;
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(Minus);
				setState(16);
				singleExpression(13);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(Not);
				setState(18);
				singleExpression(12);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				literal();
				}
				break;
			case EnvironmentalIdentifier:
				{
				_localctx = new EnvironmentalIdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(EnvironmentalIdentifier);
				}
				break;
			case NormalIdentifier:
				{
				_localctx = new NormalIdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(NormalIdentifier);
				}
				break;
			case OpenParen:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(OpenParen);
				setState(23);
				singleExpression(0);
				setState(24);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(28);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(29);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(30);
						singleExpression(12);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(31);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(32);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(33);
						singleExpression(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(34);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(35);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << GreaterThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(36);
						singleExpression(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(37);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(38);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==NotEquals) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(39);
						singleExpression(9);
						}
						break;
					case 5:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(40);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(41);
						match(And);
						setState(42);
						singleExpression(8);
						}
						break;
					case 6:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44);
						match(Or);
						setState(45);
						singleExpression(7);
						}
						break;
					case 7:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(46);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(47);
						match(QuestionMark);
						setState(48);
						singleExpression(0);
						setState(49);
						match(Colon);
						setState(50);
						singleExpression(6);
						}
						break;
					case 8:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(52);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(53);
						match(OpenBracket);
						setState(54);
						singleExpression(0);
						setState(55);
						match(CloseBracket);
						}
						break;
					case 9:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(57);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(58);
						match(Dot);
						setState(59);
						identifierName();
						}
						break;
					}
					}
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			setState(67);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NullLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifierName);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case NormalIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(NormalIdentifier);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case EnvironmentalIdentifier:
			case UUID:
			case Online:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				reservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reservedWord);
		int _la;
		try {
			setState(77);
			switch (_input.LA(1)) {
			case UUID:
			case Online:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				keyword();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case EnvironmentalIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NullLiteral) | (1L << BooleanLiteral) | (1L << EnvironmentalIdentifier))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==UUID || _la==Online) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}

	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public SingleExpressionContext() { }

		@Override public int getRuleIndex() { return RULE_singleExpression; }

		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public Token op;
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RelationalExpressionContext extends SingleExpressionContext {
		public Token op;
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TernaryExpressionContext extends SingleExpressionContext {
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}

		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NotExpressionContext extends SingleExpressionContext {
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NormalIdentifierExpressionContext extends SingleExpressionContext {
		public NormalIdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public TerminalNode NormalIdentifier() { return getToken(ReginaScriptParser.NormalIdentifier, 0); }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterNormalIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitNormalIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitNormalIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class EnvironmentalIdentifierExpressionContext extends SingleExpressionContext {
		public EnvironmentalIdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public TerminalNode EnvironmentalIdentifier() { return getToken(ReginaScriptParser.EnvironmentalIdentifier, 0); }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterEnvironmentalIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitEnvironmentalIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitEnvironmentalIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitUnaryPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitUnaryPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class EqualityExpressionContext extends SingleExpressionContext {
		public Token op;
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public Token op;
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }

		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}

		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NullLiteral() { return getToken(ReginaScriptParser.NullLiteral, 0); }

		public TerminalNode BooleanLiteral() { return getToken(ReginaScriptParser.BooleanLiteral, 0); }

		public TerminalNode StringLiteral() { return getToken(ReginaScriptParser.StringLiteral, 0); }

		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode DecimalLiteral() { return getToken(ReginaScriptParser.DecimalLiteral, 0); }

		public TerminalNode HexIntegerLiteral() { return getToken(ReginaScriptParser.HexIntegerLiteral, 0); }

		public TerminalNode OctalIntegerLiteral() { return getToken(ReginaScriptParser.OctalIntegerLiteral, 0); }

		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NormalIdentifier() { return getToken(ReginaScriptParser.NormalIdentifier, 0); }

		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitIdentifierName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitIdentifierName(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}

		public TerminalNode BooleanLiteral() { return getToken(ReginaScriptParser.BooleanLiteral, 0); }

		public TerminalNode NullLiteral() { return getToken(ReginaScriptParser.NullLiteral, 0); }

		public TerminalNode EnvironmentalIdentifier() { return getToken(ReginaScriptParser.EnvironmentalIdentifier, 0); }

		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode UUID() { return getToken(ReginaScriptParser.UUID, 0); }

		public TerminalNode Online() { return getToken(ReginaScriptParser.Online, 0); }

		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReginaScriptListener ) ((ReginaScriptListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReginaScriptVisitor ) return ((ReginaScriptVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
}