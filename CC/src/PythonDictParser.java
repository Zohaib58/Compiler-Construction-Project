// Generated from grammar/PythonDictParser.g4 by ANTLR 4.13.1
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
		BRACE_OPEN=1, BRACE_CLOSE=2, BRACKET_OPEN=3, BRACKET_CLOSE=4, PAREN_OPEN=5, 
		PAREN_CLOSE=6, ASSIGN=7, IN=8, COLON=9, COMMA=10, DOT=11, SEMICOLON=12, 
		FOR=13, IF=14, ELSE=15, ELIF=16, ADD=17, SUBTRACT=18, DIVIDE=19, MULTIPLY=20, 
		EQUALS_TO=21, NOT_EQUALS_TO=22, LESS_THAN=23, LESS_THAN_EQUALS_TO=24, 
		GREATER_THAN=25, GREATER_THAN_EQUALS_TO=26, GET_METHOD=27, KEYS_METHOD=28, 
		VALUES_METHOD=29, ITEMS_METHOD=30, POP_METHOD=31, UPDATE_METHOD=32, PRINT=33, 
		IDENTIFIER=34, STRING_LITERAL=35, NUMERIC_LITERAL=36, BOOLEAN_LITERAL=37, 
		WS=38;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_separator = 2, RULE_variable = 3, 
		RULE_dictValueAssignToKey = 4, RULE_dict = 5, RULE_pairList = 6, RULE_pair = 7, 
		RULE_key = 8, RULE_value = 9, RULE_constructor = 10, RULE_argumentList = 11, 
		RULE_list = 12, RULE_tuple = 13, RULE_elementList = 14, RULE_forLoop = 15, 
		RULE_iterable = 16, RULE_methodCall = 17, RULE_methodName = 18, RULE_ifCondition = 19, 
		RULE_ifBlock = 20, RULE_elifBlock = 21, RULE_elseBlock = 22, RULE_condition = 23, 
		RULE_expression = 24, RULE_dictAccess = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "separator", "variable", "dictValueAssignToKey", 
			"dict", "pairList", "pair", "key", "value", "constructor", "argumentList", 
			"list", "tuple", "elementList", "forLoop", "iterable", "methodCall", 
			"methodName", "ifCondition", "ifBlock", "elifBlock", "elseBlock", "condition", 
			"expression", "dictAccess"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "'in'", "':'", 
			"','", "'.'", "';'", "'for'", "'if'", "'else'", "'elif'", "'+'", "'-'", 
			"'/'", "'*'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'get'", 
			"'keys'", "'values'", "'items'", "'pop'", "'update'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "PAREN_OPEN", 
			"PAREN_CLOSE", "ASSIGN", "IN", "COLON", "COMMA", "DOT", "SEMICOLON", 
			"FOR", "IF", "ELSE", "ELIF", "ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", 
			"EQUALS_TO", "NOT_EQUALS_TO", "LESS_THAN", "LESS_THAN_EQUALS_TO", "GREATER_THAN", 
			"GREATER_THAN_EQUALS_TO", "GET_METHOD", "KEYS_METHOD", "VALUES_METHOD", 
			"ITEMS_METHOD", "POP_METHOD", "UPDATE_METHOD", "PRINT", "IDENTIFIER", 
			"STRING_LITERAL", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "WS"
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
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				statement();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(53);
					separator();
					}
				}

				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698062378L) != 0) );
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
	public static class StatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DictValueAssignToKeyContext dictValueAssignToKey() {
			return getRuleContext(DictValueAssignToKeyContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public DictAccessContext dictAccess() {
			return getRuleContext(DictAccessContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				dictValueAssignToKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				dict();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				methodCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				ifCondition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				dictAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				expression(0);
				}
				break;
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
	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(PythonDictParser.SEMICOLON, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(SEMICOLON);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonDictParser.ASSIGN, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
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
		public DictAccessContext dictAccess() {
			return getRuleContext(DictAccessContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(ASSIGN);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(75);
				constructor();
				}
				break;
			case 2:
				{
				setState(76);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(77);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				{
				setState(78);
				dict();
				}
				break;
			case 5:
				{
				setState(79);
				list();
				}
				break;
			case 6:
				{
				setState(80);
				tuple();
				}
				break;
			case 7:
				{
				setState(81);
				dictAccess();
				}
				break;
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
	public static class DictValueAssignToKeyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(PythonDictParser.BRACKET_OPEN, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(PythonDictParser.BRACKET_CLOSE, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonDictParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DictValueAssignToKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictValueAssignToKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterDictValueAssignToKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitDictValueAssignToKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitDictValueAssignToKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictValueAssignToKeyContext dictValueAssignToKey() throws RecognitionException {
		DictValueAssignToKeyContext _localctx = new DictValueAssignToKeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dictValueAssignToKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENTIFIER);
			setState(85);
			match(BRACKET_OPEN);
			setState(86);
			key();
			setState(87);
			match(BRACKET_CLOSE);
			setState(88);
			match(ASSIGN);
			setState(89);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(BRACE_OPEN);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				setState(92);
				pairList();
				}
			}

			setState(95);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitPairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairListContext pairList() throws RecognitionException {
		PairListContext _localctx = new PairListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			pair();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				pair();
				}
				}
				setState(104);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			key();
			setState(106);
			match(COLON);
			setState(107);
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
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PythonDictParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(PythonDictParser.NUMERIC_LITERAL, 0); }
		public DictAccessContext dictAccess() {
			return getRuleContext(DictAccessContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_key);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				constructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				dictAccess();
				}
				break;
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
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
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
		public DictAccessContext dictAccess() {
			return getRuleContext(DictAccessContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				constructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				dict();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				tuple();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				dictAccess();
				}
				break;
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PythonDictParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(PythonDictParser.PAREN_CLOSE, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(PAREN_OPEN);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037802L) != 0)) {
				{
				setState(126);
				argumentList();
				}
			}

			setState(129);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonDictParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonDictParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			expression(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				expression(0);
				}
				}
				setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(BRACKET_OPEN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084330L) != 0)) {
				{
				setState(140);
				elementList();
				}
			}

			setState(143);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PAREN_OPEN);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084330L) != 0)) {
				{
				setState(146);
				elementList();
				}
			}

			setState(149);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			value();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				value();
				}
				}
				setState(158);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonDictParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PythonDictParser.IN, 0); }
		public IterableContext iterable() {
			return getRuleContext(IterableContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(PythonDictParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PythonDictParser.BRACE_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FOR);
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(IN);
			setState(162);
			iterable();
			setState(163);
			match(BRACE_OPEN);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				statement();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698062378L) != 0) );
			setState(169);
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
	public static class IterableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public IterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterIterable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitIterable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitIterable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterableContext iterable() throws RecognitionException {
		IterableContext _localctx = new IterableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iterable);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(IDENTIFIER);
				}
				break;
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				list();
				}
				break;
			case BRACE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				dict();
				}
				break;
			case PAREN_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(PythonDictParser.DOT, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(PythonDictParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(PythonDictParser.PAREN_CLOSE, 0); }
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IDENTIFIER);
			setState(178);
			match(DOT);
			setState(179);
			methodName();
			setState(180);
			match(PAREN_OPEN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037802L) != 0)) {
				{
				{
				setState(181);
				argumentList();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode GET_METHOD() { return getToken(PythonDictParser.GET_METHOD, 0); }
		public TerminalNode KEYS_METHOD() { return getToken(PythonDictParser.KEYS_METHOD, 0); }
		public TerminalNode VALUES_METHOD() { return getToken(PythonDictParser.VALUES_METHOD, 0); }
		public TerminalNode ITEMS_METHOD() { return getToken(PythonDictParser.ITEMS_METHOD, 0); }
		public TerminalNode POP_METHOD() { return getToken(PythonDictParser.POP_METHOD, 0); }
		public TerminalNode UPDATE_METHOD() { return getToken(PythonDictParser.UPDATE_METHOD, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
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
	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonDictParser.IF, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IF);
			setState(192);
			ifBlock();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(193);
				elifBlock();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(199);
				elseBlock();
				}
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
	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode PAREN_OPEN() { return getToken(PythonDictParser.PAREN_OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PythonDictParser.PAREN_CLOSE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(PythonDictParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PythonDictParser.BRACE_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(PAREN_OPEN);
			setState(203);
			condition();
			setState(204);
			match(PAREN_CLOSE);
			setState(205);
			match(BRACE_OPEN);
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				statement();
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698062378L) != 0) );
			setState(211);
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
	public static class ElifBlockContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(PythonDictParser.ELIF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(PythonDictParser.PAREN_OPEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PythonDictParser.PAREN_CLOSE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(PythonDictParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PythonDictParser.BRACE_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ELIF);
			setState(214);
			match(PAREN_OPEN);
			setState(215);
			condition();
			setState(216);
			match(PAREN_CLOSE);
			setState(217);
			match(BRACE_OPEN);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				statement();
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698062378L) != 0) );
			setState(223);
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
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PythonDictParser.ELSE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(PythonDictParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PythonDictParser.BRACE_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ELSE);
			setState(226);
			match(BRACE_OPEN);
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				statement();
				}
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698062378L) != 0) );
			setState(232);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS_TO() { return getToken(PythonDictParser.EQUALS_TO, 0); }
		public TerminalNode NOT_EQUALS_TO() { return getToken(PythonDictParser.NOT_EQUALS_TO, 0); }
		public TerminalNode LESS_THAN() { return getToken(PythonDictParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS_TO() { return getToken(PythonDictParser.LESS_THAN_EQUALS_TO, 0); }
		public TerminalNode GREATER_THAN() { return getToken(PythonDictParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS_TO() { return getToken(PythonDictParser.GREATER_THAN_EQUALS_TO, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			expression(0);
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			expression(0);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PythonDictParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(PythonDictParser.NUMERIC_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(PythonDictParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public DictAccessContext dictAccess() {
			return getRuleContext(DictAccessContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(PythonDictParser.PAREN_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(PythonDictParser.PAREN_CLOSE, 0); }
		public TerminalNode MULTIPLY() { return getToken(PythonDictParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(PythonDictParser.DIVIDE, 0); }
		public TerminalNode ADD() { return getToken(PythonDictParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(PythonDictParser.SUBTRACT, 0); }
		public TerminalNode EQUALS_TO() { return getToken(PythonDictParser.EQUALS_TO, 0); }
		public TerminalNode NOT_EQUALS_TO() { return getToken(PythonDictParser.NOT_EQUALS_TO, 0); }
		public TerminalNode LESS_THAN() { return getToken(PythonDictParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS_TO() { return getToken(PythonDictParser.LESS_THAN_EQUALS_TO, 0); }
		public TerminalNode GREATER_THAN() { return getToken(PythonDictParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS_TO() { return getToken(PythonDictParser.GREATER_THAN_EQUALS_TO, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(239);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				{
				setState(240);
				match(NUMERIC_LITERAL);
				}
				break;
			case 3:
				{
				setState(241);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 4:
				{
				setState(242);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(243);
				methodCall();
				}
				break;
			case 6:
				{
				setState(244);
				list();
				}
				break;
			case 7:
				{
				setState(245);
				tuple();
				}
				break;
			case 8:
				{
				setState(246);
				dict();
				}
				break;
			case 9:
				{
				setState(247);
				dictAccess();
				}
				break;
			case 10:
				{
				setState(248);
				match(PAREN_OPEN);
				setState(249);
				expression(0);
				setState(250);
				match(PAREN_CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(255);
						_la = _input.LA(1);
						if ( !(_la==DIVIDE || _la==MULTIPLY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(258);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(261);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonDictParser.IDENTIFIER, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(PythonDictParser.BRACKET_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(PythonDictParser.BRACKET_CLOSE, 0); }
		public DictAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).enterDictAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonDictParserListener ) ((PythonDictParserListener)listener).exitDictAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonDictParserVisitor ) return ((PythonDictParserVisitor<? extends T>)visitor).visitDictAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictAccessContext dictAccess() throws RecognitionException {
		DictAccessContext _localctx = new DictAccessContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dictAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDENTIFIER);
			setState(269);
			match(BRACKET_OPEN);
			setState(270);
			expression(0);
			setState(271);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u0112\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0003\u00007\b\u0000"+
		"\u0004\u00009\b\u0000\u000b\u0000\f\u0000:\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003S\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005^\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\br\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t{\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u0080\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0087\b\u000b\n\u000b"+
		"\f\u000b\u008a\t\u000b\u0001\f\u0001\f\u0003\f\u008e\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0003\r\u0094\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u009b\b\u000e\n\u000e\f\u000e\u009e\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u00a6\b\u000f\u000b\u000f\f\u000f\u00a7\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b0"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00b7\b\u0011\n\u0011\f\u0011\u00ba\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00c3\b\u0013\n\u0013\f\u0013\u00c6\t\u0013\u0001\u0013\u0003\u0013\u00c9"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u00d0\b\u0014\u000b\u0014\f\u0014\u00d1\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u00dc\b\u0015\u000b\u0015\f\u0015\u00dd\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u00e5\b\u0016\u000b"+
		"\u0016\f\u0016\u00e6\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00fd\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0108\b\u0018\n\u0018\f\u0018"+
		"\u010b\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0000\u00010\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0004\u0001"+
		"\u0000\u001b \u0001\u0000\u0015\u001a\u0001\u0000\u0013\u0014\u0001\u0000"+
		"\u0011\u0012\u012d\u00008\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000"+
		"\u0000\u0004G\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\b"+
		"T\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000"+
		"\u0000\u000ei\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012"+
		"z\u0001\u0000\u0000\u0000\u0014|\u0001\u0000\u0000\u0000\u0016\u0083\u0001"+
		"\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u0091\u0001"+
		"\u0000\u0000\u0000\u001c\u0097\u0001\u0000\u0000\u0000\u001e\u009f\u0001"+
		"\u0000\u0000\u0000 \u00af\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000"+
		"\u0000\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00bf\u0001\u0000\u0000\u0000"+
		"(\u00ca\u0001\u0000\u0000\u0000*\u00d5\u0001\u0000\u0000\u0000,\u00e1"+
		"\u0001\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u00000\u00fc\u0001\u0000"+
		"\u0000\u00002\u010c\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u0000"+
		"57\u0003\u0004\u0002\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0001"+
		"\u0001\u0000\u0000\u0000<F\u0003\u0006\u0003\u0000=F\u0003\b\u0004\u0000"+
		">F\u0003\n\u0005\u0000?F\u0003\u001e\u000f\u0000@F\u0003\u0018\f\u0000"+
		"AF\u0003\"\u0011\u0000BF\u0003&\u0013\u0000CF\u00032\u0019\u0000DF\u0003"+
		"0\u0018\u0000E<\u0001\u0000\u0000\u0000E=\u0001\u0000\u0000\u0000E>\u0001"+
		"\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000"+
		"EA\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000ED\u0001\u0000\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GH\u0005"+
		"\f\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0005\"\u0000\u0000JR"+
		"\u0005\u0007\u0000\u0000KS\u0003\u0014\n\u0000LS\u0005#\u0000\u0000MS"+
		"\u0005$\u0000\u0000NS\u0003\n\u0005\u0000OS\u0003\u0018\f\u0000PS\u0003"+
		"\u001a\r\u0000QS\u00032\u0019\u0000RK\u0001\u0000\u0000\u0000RL\u0001"+
		"\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000"+
		"RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0005\"\u0000\u0000UV\u0005\u0003"+
		"\u0000\u0000VW\u0003\u0010\b\u0000WX\u0005\u0004\u0000\u0000XY\u0005\u0007"+
		"\u0000\u0000YZ\u0003\u0012\t\u0000Z\t\u0001\u0000\u0000\u0000[]\u0005"+
		"\u0001\u0000\u0000\\^\u0003\f\u0006\u0000]\\\u0001\u0000\u0000\u0000]"+
		"^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u0002\u0000"+
		"\u0000`\u000b\u0001\u0000\u0000\u0000af\u0003\u000e\u0007\u0000bc\u0005"+
		"\n\u0000\u0000ce\u0003\u000e\u0007\u0000db\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\r\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0003\u0010\b"+
		"\u0000jk\u0005\t\u0000\u0000kl\u0003\u0012\t\u0000l\u000f\u0001\u0000"+
		"\u0000\u0000mr\u0003\u0014\n\u0000nr\u0005#\u0000\u0000or\u0005$\u0000"+
		"\u0000pr\u00032\u0019\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0011\u0001"+
		"\u0000\u0000\u0000s{\u0003\u0014\n\u0000t{\u0005#\u0000\u0000u{\u0005"+
		"$\u0000\u0000v{\u0003\n\u0005\u0000w{\u0003\u0018\f\u0000x{\u0003\u001a"+
		"\r\u0000y{\u00032\u0019\u0000zs\u0001\u0000\u0000\u0000zt\u0001\u0000"+
		"\u0000\u0000zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{\u0013\u0001\u0000\u0000\u0000|}\u0005\"\u0000\u0000}\u007f\u0005\u0005"+
		"\u0000\u0000~\u0080\u0003\u0016\u000b\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000"+
		"\u0083\u0088\u00030\u0018\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085"+
		"\u0087\u00030\u0018\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0017\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0005\u0003\u0000\u0000\u008c\u008e"+
		"\u0003\u001c\u000e\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0004\u0000\u0000\u0090\u0019\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0005\u0005\u0000\u0000\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0006\u0000\u0000\u0096\u001b"+
		"\u0001\u0000\u0000\u0000\u0097\u009c\u0003\u0012\t\u0000\u0098\u0099\u0005"+
		"\n\u0000\u0000\u0099\u009b\u0003\u0012\t\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u001d\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\r\u0000"+
		"\u0000\u00a0\u00a1\u0005\"\u0000\u0000\u00a1\u00a2\u0005\b\u0000\u0000"+
		"\u00a2\u00a3\u0003 \u0010\u0000\u00a3\u00a5\u0005\u0001\u0000\u0000\u00a4"+
		"\u00a6\u0003\u0002\u0001\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0002\u0000\u0000\u00aa\u001f\u0001\u0000\u0000\u0000\u00ab"+
		"\u00b0\u0005\"\u0000\u0000\u00ac\u00b0\u0003\u0018\f\u0000\u00ad\u00b0"+
		"\u0003\n\u0005\u0000\u00ae\u00b0\u0003\u001a\r\u0000\u00af\u00ab\u0001"+
		"\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0!\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\"\u0000\u0000\u00b2\u00b3\u0005\u000b\u0000"+
		"\u0000\u00b3\u00b4\u0003$\u0012\u0000\u00b4\u00b8\u0005\u0005\u0000\u0000"+
		"\u00b5\u00b7\u0003\u0016\u000b\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0006\u0000\u0000"+
		"\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\u0000\u0000\u0000\u00be"+
		"%\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0\u00c4"+
		"\u0003(\u0014\u0000\u00c1\u00c3\u0003*\u0015\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003,\u0016"+
		"\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\'\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000"+
		"\u00cb\u00cc\u0003.\u0017\u0000\u00cc\u00cd\u0005\u0006\u0000\u0000\u00cd"+
		"\u00cf\u0005\u0001\u0000\u0000\u00ce\u00d0\u0003\u0002\u0001\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0002\u0000\u0000\u00d4"+
		")\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0010\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0005\u0000\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8\u00d9\u0005"+
		"\u0006\u0000\u0000\u00d9\u00db\u0005\u0001\u0000\u0000\u00da\u00dc\u0003"+
		"\u0002\u0001\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u0002\u0000\u0000\u00e0+\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u000f"+
		"\u0000\u0000\u00e2\u00e4\u0005\u0001\u0000\u0000\u00e3\u00e5\u0003\u0002"+
		"\u0001\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0002"+
		"\u0000\u0000\u00e9-\u0001\u0000\u0000\u0000\u00ea\u00eb\u00030\u0018\u0000"+
		"\u00eb\u00ec\u0007\u0001\u0000\u0000\u00ec\u00ed\u00030\u0018\u0000\u00ed"+
		"/\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006\u0018\uffff\uffff\u0000\u00ef"+
		"\u00fd\u0005#\u0000\u0000\u00f0\u00fd\u0005$\u0000\u0000\u00f1\u00fd\u0005"+
		"%\u0000\u0000\u00f2\u00fd\u0005\"\u0000\u0000\u00f3\u00fd\u0003\"\u0011"+
		"\u0000\u00f4\u00fd\u0003\u0018\f\u0000\u00f5\u00fd\u0003\u001a\r\u0000"+
		"\u00f6\u00fd\u0003\n\u0005\u0000\u00f7\u00fd\u00032\u0019\u0000\u00f8"+
		"\u00f9\u0005\u0005\u0000\u0000\u00f9\u00fa\u00030\u0018\u0000\u00fa\u00fb"+
		"\u0005\u0006\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00ee"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f0\u0001\u0000\u0000\u0000\u00fc\u00f1"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f2\u0001\u0000\u0000\u0000\u00fc\u00f3"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc\u00f5"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fd\u0109"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\n\u0004\u0000\u0000\u00ff\u0100\u0007"+
		"\u0002\u0000\u0000\u0100\u0108\u00030\u0018\u0005\u0101\u0102\n\u0003"+
		"\u0000\u0000\u0102\u0103\u0007\u0003\u0000\u0000\u0103\u0108\u00030\u0018"+
		"\u0004\u0104\u0105\n\u0002\u0000\u0000\u0105\u0106\u0007\u0001\u0000\u0000"+
		"\u0106\u0108\u00030\u0018\u0003\u0107\u00fe\u0001\u0000\u0000\u0000\u0107"+
		"\u0101\u0001\u0000\u0000\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0108"+
		"\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a1\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0005\"\u0000\u0000\u010d\u010e\u0005"+
		"\u0003\u0000\u0000\u010e\u010f\u00030\u0018\u0000\u010f\u0110\u0005\u0004"+
		"\u0000\u0000\u01103\u0001\u0000\u0000\u0000\u00186:ER]fqz\u007f\u0088"+
		"\u008d\u0093\u009c\u00a7\u00af\u00b8\u00c4\u00c8\u00d1\u00dd\u00e6\u00fc"+
		"\u0107\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}