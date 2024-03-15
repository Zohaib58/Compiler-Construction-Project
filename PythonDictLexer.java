// Generated from PythonDictLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonDictLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BRACE_OPEN=1, BRACE_CLOSE=2, KEY_START=3, KEY_END=4, ASSIGN=5, COLON=6, 
		COMMA=7, FOR=8, IF=9, ELSE=10, ELIF=11, IDENTIFIER=12, STRING_LITERAL=13, 
		NUMERIC_LITERAL=14, GET_METHOD=15, KEYS_METHOD=16, VALUES_METHOD=17, ITEMS_METHOD=18, 
		POP_METHOD=19, UPDATE_METHOD=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BRACE_OPEN", "BRACE_CLOSE", "KEY_START", "KEY_END", "ASSIGN", "COLON", 
			"COMMA", "FOR", "IF", "ELSE", "ELIF", "IDENTIFIER", "STRING_LITERAL", 
			"NUMERIC_LITERAL", "GET_METHOD", "KEYS_METHOD", "VALUES_METHOD", "ITEMS_METHOD", 
			"POP_METHOD", "UPDATE_METHOD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'='", "':'", "','", "'for'", "'if'", 
			"'else'", "'elif'", null, null, null, "'get'", "'keys'", "'values'", 
			"'items'", "'pop'", "'update'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BRACE_OPEN", "BRACE_CLOSE", "KEY_START", "KEY_END", "ASSIGN", 
			"COLON", "COMMA", "FOR", "IF", "ELSE", "ELIF", "IDENTIFIER", "STRING_LITERAL", 
			"NUMERIC_LITERAL", "GET_METHOD", "KEYS_METHOD", "VALUES_METHOD", "ITEMS_METHOD", 
			"POP_METHOD", "UPDATE_METHOD", "WS"
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


	public PythonDictLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonDictLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"M\b\u000b\n\u000b\f\u000bP\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\fV\b\f\n\f\f\fY\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f`"+
		"\b\f\n\f\f\fc\t\f\u0001\f\u0003\ff\b\f\u0001\r\u0004\ri\b\r\u000b\r\f"+
		"\rj\u0001\r\u0001\r\u0004\ro\b\r\u000b\r\f\rp\u0003\rs\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u0097\b\u0014\u000b\u0014"+
		"\f\u0014\u0098\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0006\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u00a5\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003"+
		"-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001"+
		"\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000"+
		"\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000\u0011"+
		"=\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015E\u0001"+
		"\u0000\u0000\u0000\u0017J\u0001\u0000\u0000\u0000\u0019e\u0001\u0000\u0000"+
		"\u0000\u001bh\u0001\u0000\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001f"+
		"x\u0001\u0000\u0000\u0000!}\u0001\u0000\u0000\u0000#\u0084\u0001\u0000"+
		"\u0000\u0000%\u008a\u0001\u0000\u0000\u0000\'\u008e\u0001\u0000\u0000"+
		"\u0000)\u0096\u0001\u0000\u0000\u0000+,\u0005{\u0000\u0000,\u0002\u0001"+
		"\u0000\u0000\u0000-.\u0005}\u0000\u0000.\u0004\u0001\u0000\u0000\u0000"+
		"/0\u0005[\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005]\u0000\u0000"+
		"2\b\u0001\u0000\u0000\u000034\u0005=\u0000\u00004\n\u0001\u0000\u0000"+
		"\u000056\u0005:\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005,\u0000"+
		"\u00008\u000e\u0001\u0000\u0000\u00009:\u0005f\u0000\u0000:;\u0005o\u0000"+
		"\u0000;<\u0005r\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005i\u0000"+
		"\u0000>?\u0005f\u0000\u0000?\u0012\u0001\u0000\u0000\u0000@A\u0005e\u0000"+
		"\u0000AB\u0005l\u0000\u0000BC\u0005s\u0000\u0000CD\u0005e\u0000\u0000"+
		"D\u0014\u0001\u0000\u0000\u0000EF\u0005e\u0000\u0000FG\u0005l\u0000\u0000"+
		"GH\u0005i\u0000\u0000HI\u0005f\u0000\u0000I\u0016\u0001\u0000\u0000\u0000"+
		"JN\u0007\u0000\u0000\u0000KM\u0007\u0001\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000O\u0018\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QW\u0005\"\u0000\u0000RV\b\u0002\u0000\u0000ST\u0005\\\u0000\u0000TV\t"+
		"\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Zf\u0005\"\u0000"+
		"\u0000[a\u0005\'\u0000\u0000\\`\b\u0003\u0000\u0000]^\u0005\\\u0000\u0000"+
		"^`\t\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0005"+
		"\'\u0000\u0000eQ\u0001\u0000\u0000\u0000e[\u0001\u0000\u0000\u0000f\u001a"+
		"\u0001\u0000\u0000\u0000gi\u0007\u0004\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kr\u0001\u0000\u0000\u0000ln\u0005.\u0000\u0000mo\u0007\u0004"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rl\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u001c\u0001\u0000"+
		"\u0000\u0000tu\u0005g\u0000\u0000uv\u0005e\u0000\u0000vw\u0005t\u0000"+
		"\u0000w\u001e\u0001\u0000\u0000\u0000xy\u0005k\u0000\u0000yz\u0005e\u0000"+
		"\u0000z{\u0005y\u0000\u0000{|\u0005s\u0000\u0000| \u0001\u0000\u0000\u0000"+
		"}~\u0005v\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f\u0080\u0005l\u0000"+
		"\u0000\u0080\u0081\u0005u\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082"+
		"\u0083\u0005s\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005i\u0000\u0000\u0085\u0086\u0005t\u0000\u0000\u0086\u0087\u0005e"+
		"\u0000\u0000\u0087\u0088\u0005m\u0000\u0000\u0088\u0089\u0005s\u0000\u0000"+
		"\u0089$\u0001\u0000\u0000\u0000\u008a\u008b\u0005p\u0000\u0000\u008b\u008c"+
		"\u0005o\u0000\u0000\u008c\u008d\u0005p\u0000\u0000\u008d&\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005u\u0000\u0000\u008f\u0090\u0005p\u0000\u0000"+
		"\u0090\u0091\u0005d\u0000\u0000\u0091\u0092\u0005a\u0000\u0000\u0092\u0093"+
		"\u0005t\u0000\u0000\u0093\u0094\u0005e\u0000\u0000\u0094(\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0007\u0005\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0006\u0014\u0000\u0000\u009b*\u0001\u0000\u0000"+
		"\u0000\u000b\u0000NUW_aejpr\u0098\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}