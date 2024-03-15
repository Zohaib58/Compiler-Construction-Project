// Generated from PythonDictParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonDictParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BRACE_OPEN=1, BRACE_CLOSE=2, COMMA=3, COLON=4, STRING_LITERAL=5, NUMERIC_LITERAL=6, 
		BRACKET_OPEN=7, BRACKET_CLOSE=8, PAREN_OPEN=9, PAREN_CLOSE=10;
	public static final int
		RULE_dict = 0, RULE_pairList = 1, RULE_pair = 2, RULE_key = 3, RULE_list = 4, 
		RULE_tuple = 5, RULE_elementList = 6, RULE_value = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"dict", "pairList", "pair", "key", "list", "tuple", "elementList", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BRACE_OPEN", "BRACE_CLOSE", "COMMA", "COLON", "STRING_LITERAL", 
			"NUMERIC_LITERAL", "BRACKET_OPEN", "BRACKET_CLOSE", "PAREN_OPEN", "PAREN_CLOSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "PythonDictParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonDictParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictContext extends ParserRuleContext {
		public TerminalNode BRACE_OPEN() { return getToken(PythonDictParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PythonDictParser.BRACE_CLOSE, 0); }
		public PairListContext pairList() {
			return getRuleContext(PairListContext.class,0);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitDict(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(BRACE_OPEN);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==NUMERIC_LITERAL) {
				{
				setState(17);
				pairList();
				}
			}

			setState(20);
			match(BRACE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairListContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonDictParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonDictParser.COMMA, i);
		}
		public PairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterPairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitPairList(this);
		}
	}

	public final PairListContext pairList() throws RecognitionException {
		PairListContext _localctx = new PairListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			pair();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(23);
				match(COMMA);
				setState(24);
				pair();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonDictParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			key();
			setState(31);
			match(COLON);
			setState(32);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PythonDictParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(PythonDictParser.NUMERIC_LITERAL, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUMERIC_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(PythonDictParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(PythonDictParser.BRACKET_CLOSE, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(BRACKET_OPEN);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 738L) != 0)) {
				{
				setState(37);
				elementList();
				}
			}

			setState(40);
			match(BRACKET_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public TerminalNode PAREN_OPEN() { return getToken(PythonDictParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(PythonDictParser.PAREN_CLOSE, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PAREN_OPEN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 738L) != 0)) {
				{
				setState(43);
				elementList();
				}
			}

			setState(46);
			match(PAREN_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonDictParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonDictParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			value();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(49);
				match(COMMA);
				setState(50);
				value();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PythonDictParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(PythonDictParser.NUMERIC_LITERAL, 0); }
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(STRING_LITERAL);
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(NUMERIC_LITERAL);
				}
				break;
			case BRACE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				dict();
				}
				break;
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				list();
				}
				break;
			case PAREN_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				tuple();
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

	public static final String _serializedATN =
		"\u0004\u0001\n@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001"+
		"\u001d\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\'\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005-\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u00064\b\u0006"+
		"\n\u0006\f\u00067\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007>\b\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\u0005\u0006@\u0000\u0010"+
		"\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001e"+
		"\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b$\u0001\u0000"+
		"\u0000\u0000\n*\u0001\u0000\u0000\u0000\f0\u0001\u0000\u0000\u0000\u000e"+
		"=\u0001\u0000\u0000\u0000\u0010\u0012\u0005\u0001\u0000\u0000\u0011\u0013"+
		"\u0003\u0002\u0001\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0005\u0002\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u001b"+
		"\u0003\u0004\u0002\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u001a"+
		"\u0003\u0004\u0002\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001d"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0005"+
		"\u0004\u0000\u0000 !\u0003\u000e\u0007\u0000!\u0005\u0001\u0000\u0000"+
		"\u0000\"#\u0007\u0000\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$&\u0005"+
		"\u0007\u0000\u0000%\'\u0003\f\u0006\u0000&%\u0001\u0000\u0000\u0000&\'"+
		"\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005\b\u0000\u0000"+
		")\t\u0001\u0000\u0000\u0000*,\u0005\t\u0000\u0000+-\u0003\f\u0006\u0000"+
		",+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0005\n\u0000\u0000/\u000b\u0001\u0000\u0000\u000005\u0003\u000e"+
		"\u0007\u000012\u0005\u0003\u0000\u000024\u0003\u000e\u0007\u000031\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u00006\r\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u00008>\u0005\u0005\u0000\u00009>\u0005\u0006\u0000\u0000:>\u0003\u0000"+
		"\u0000\u0000;>\u0003\b\u0004\u0000<>\u0003\n\u0005\u0000=8\u0001\u0000"+
		"\u0000\u0000=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\u000f\u0001\u0000\u0000"+
		"\u0000\u0006\u0012\u001b&,5=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}