// Generated from c:\Proyectos\Compiladores\Trabajos\Taller\src\main\antlr4\Practico\Ejercicio_3\Simple.g4 by ANTLR 4.9.2

	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, BREAK=4, INT=5, FLOAT=6, STR=7, BOOL=8, TRUE=9, 
		FALSE=10, PRINT=11, INPUT=12, ENTER=13, ASSIGN=14, MEN=15, MAY=16, MENIG=17, 
		MAYIG=18, IGUAL=19, DIST=20, SUM=21, REST=22, MULT=23, DIV=24, PARENTESIS_A=25, 
		PARENTESIS_C=26, DOSP=27, PUNCOM=28, COMA=29, SIGPESOS=30, PUNTO=31, COMENTARIO=32, 
		MENSAJE=33, COMILLA=34, COMMENT=35, ID=36, NUMERO=37, LETRA=38, DIGITO=39, 
		FIN=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "BREAK", "INT", "FLOAT", "STR", "BOOL", "TRUE", 
			"FALSE", "PRINT", "INPUT", "ENTER", "ASSIGN", "MEN", "MAY", "MENIG", 
			"MAYIG", "IGUAL", "DIST", "SUM", "REST", "MULT", "DIV", "PARENTESIS_A", 
			"PARENTESIS_C", "DOSP", "PUNCOM", "COMA", "SIGPESOS", "PUNTO", "COMENTARIO", 
			"MENSAJE", "COMILLA", "COMMENT", "ID", "NUMERO", "LETRA", "DIGITO", "FIN", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'break'", "'int'", "'float'", "'str'", 
			"'bool'", "'True'", "'False'", "'print'", "'input'", "'\n'", "'='", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'", "':'", "';'", "','", "'$'", "'.'", null, null, "'\"'", "'#'", 
			null, null, null, null, "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "BREAK", "INT", "FLOAT", "STR", "BOOL", 
			"TRUE", "FALSE", "PRINT", "INPUT", "ENTER", "ASSIGN", "MEN", "MAY", "MENIG", 
			"MAYIG", "IGUAL", "DIST", "SUM", "REST", "MULT", "DIV", "PARENTESIS_A", 
			"PARENTESIS_C", "DOSP", "PUNCOM", "COMA", "SIGPESOS", "PUNTO", "COMENTARIO", 
			"MENSAJE", "COMILLA", "COMMENT", "ID", "NUMERO", "LETRA", "DIGITO", "FIN", 
			"WS"
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


		
		JTextArea areaOutput;
		public SimpleLexer(CharStream input, JTextArea areaOutput) {
			super(input);
			this.areaOutput = areaOutput;
			areaOutput.setText(null);
			_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		}

		


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u00d6\n!\f!\16!\u00d9\13!\3!\3!"+
		"\5!\u00dd\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u00e9\n\"\f\"\16"+
		"\"\u00ec\13\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\7%\u00f7\n%\f%\16%\u00fa\13"+
		"%\3&\5&\u00fd\n&\3&\3&\6&\u0101\n&\r&\16&\u0102\5&\u0105\n&\3&\3&\6&\u0109"+
		"\n&\r&\16&\u010a\5&\u010d\n&\3\'\3\'\3(\3(\3)\3)\3*\6*\u0116\n*\r*\16"+
		"*\u0117\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\5\4\2C\\c|\3\2\62;"+
		"\5\2\13\13\17\17\"\"\2\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7]\3\2\2\2\tc\3\2\2\2"+
		"\13i\3\2\2\2\rm\3\2\2\2\17s\3\2\2\2\21w\3\2\2\2\23|\3\2\2\2\25\u0081\3"+
		"\2\2\2\27\u0087\3\2\2\2\31\u008d\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2"+
		"\2\2\37\u0097\3\2\2\2!\u0099\3\2\2\2#\u009b\3\2\2\2%\u009e\3\2\2\2\'\u00a1"+
		"\3\2\2\2)\u00a4\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61"+
		"\u00ad\3\2\2\2\63\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b5"+
		"\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00bd\3\2\2\2C"+
		"\u00e0\3\2\2\2E\u00ef\3\2\2\2G\u00f1\3\2\2\2I\u00f3\3\2\2\2K\u00fc\3\2"+
		"\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0112\3\2\2\2S\u0115\3\2\2\2UV\7k"+
		"\2\2VW\7h\2\2W\4\3\2\2\2XY\7g\2\2YZ\7n\2\2Z[\7u\2\2[\\\7g\2\2\\\6\3\2"+
		"\2\2]^\7y\2\2^_\7j\2\2_`\7k\2\2`a\7n\2\2ab\7g\2\2b\b\3\2\2\2cd\7d\2\2"+
		"de\7t\2\2ef\7g\2\2fg\7c\2\2gh\7m\2\2h\n\3\2\2\2ij\7k\2\2jk\7p\2\2kl\7"+
		"v\2\2l\f\3\2\2\2mn\7h\2\2no\7n\2\2op\7q\2\2pq\7c\2\2qr\7v\2\2r\16\3\2"+
		"\2\2st\7u\2\2tu\7v\2\2uv\7t\2\2v\20\3\2\2\2wx\7d\2\2xy\7q\2\2yz\7q\2\2"+
		"z{\7n\2\2{\22\3\2\2\2|}\7V\2\2}~\7t\2\2~\177\7w\2\2\177\u0080\7g\2\2\u0080"+
		"\24\3\2\2\2\u0081\u0082\7H\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086\26\3\2\2\2\u0087\u0088\7r\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2"+
		"\u008c\30\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7"+
		"r\2\2\u0090\u0091\7w\2\2\u0091\u0092\7v\2\2\u0092\32\3\2\2\2\u0093\u0094"+
		"\7\f\2\2\u0094\34\3\2\2\2\u0095\u0096\7?\2\2\u0096\36\3\2\2\2\u0097\u0098"+
		"\7>\2\2\u0098 \3\2\2\2\u0099\u009a\7@\2\2\u009a\"\3\2\2\2\u009b\u009c"+
		"\7>\2\2\u009c\u009d\7?\2\2\u009d$\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\u00a3\7?\2\2\u00a3(\3"+
		"\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7?\2\2\u00a6*\3\2\2\2\u00a7\u00a8"+
		"\7-\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7"+
		",\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\62\3\2\2\2\u00af\u00b0"+
		"\7*\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7+\2\2\u00b2\66\3\2\2\2\u00b3\u00b4"+
		"\7<\2\2\u00b48\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7"+
		".\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7&\2\2\u00ba>\3\2\2\2\u00bb\u00bc\7\60"+
		"\2\2\u00bc@\3\2\2\2\u00bd\u00d7\5G$\2\u00be\u00d6\5I%\2\u00bf\u00d6\5"+
		"K&\2\u00c0\u00d6\5=\37\2\u00c1\u00d6\5? \2\u00c2\u00d6\5\67\34\2\u00c3"+
		"\u00d6\5\35\17\2\u00c4\u00d6\5G$\2\u00c5\u00d6\5\63\32\2\u00c6\u00d6\5"+
		"\65\33\2\u00c7\u00d6\5\37\20\2\u00c8\u00d6\5!\21\2\u00c9\u00d6\5#\22\2"+
		"\u00ca\u00d6\5%\23\2\u00cb\u00d6\5\'\24\2\u00cc\u00d6\5)\25\2\u00cd\u00d6"+
		"\5+\26\2\u00ce\u00d6\5-\27\2\u00cf\u00d6\5/\30\2\u00d0\u00d6\5\61\31\2"+
		"\u00d1\u00d6\59\35\2\u00d2\u00d6\5;\36\2\u00d3\u00d6\5E#\2\u00d4\u00d6"+
		"\7\"\2\2\u00d5\u00be\3\2\2\2\u00d5\u00bf\3\2\2\2\u00d5\u00c0\3\2\2\2\u00d5"+
		"\u00c1\3\2\2\2\u00d5\u00c2\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00c4\3\2"+
		"\2\2\u00d5\u00c5\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00c7\3\2\2\2\u00d5"+
		"\u00c8\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cb\3\2"+
		"\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5"+
		"\u00cf\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00dc\5G$\2\u00db\u00dd\5\33\16\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b!\2\2\u00dfB\3\2\2\2\u00e0"+
		"\u00ea\5E#\2\u00e1\u00e9\5I%\2\u00e2\u00e9\5K&\2\u00e3\u00e9\5=\37\2\u00e4"+
		"\u00e9\5? \2\u00e5\u00e9\5\67\34\2\u00e6\u00e9\5\35\17\2\u00e7\u00e9\7"+
		"\"\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5E#\2\u00eeD\3\2\2\2\u00ef"+
		"\u00f0\7$\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7%\2\2\u00f2H\3\2\2\2\u00f3\u00f8"+
		"\5M\'\2\u00f4\u00f7\5M\'\2\u00f5\u00f7\5O(\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9J\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7/\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0104\3\2\2\2\u00fe\u0105\7\62\2\2"+
		"\u00ff\u0101\5O(\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00fe\3\2\2\2\u0104"+
		"\u0100\3\2\2\2\u0105\u010c\3\2\2\2\u0106\u0108\13\2\2\2\u0107\u0109\5"+
		"O(\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010dL\3\2\2\2\u010e\u010f\t\2\2\2\u010fN\3\2\2\2\u0110\u0111\t\3"+
		"\2\2\u0111P\3\2\2\2\u0112\u0113\7(\2\2\u0113R\3\2\2\2\u0114\u0116\t\4"+
		"\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b*\2\2\u011aT\3\2\2\2\20"+
		"\2\u00d5\u00d7\u00dc\u00e8\u00ea\u00f6\u00f8\u00fc\u0102\u0104\u010a\u010c"+
		"\u0117\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}