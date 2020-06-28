// Generated from C:/Users/Kluch/IdeaProjects/RubyLLVMTranslate/src/main/antlr4\Ruby.g4 by ANTLR 4.8
package antlr_output;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		IF=9, THEN=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, RETRY=15, BREAK=16, 
		FOR=17, IN=18, TRUE=19, FALSE=20, PLUS=21, MINUS=22, MUL=23, DIV=24, MOD=25, 
		EXP=26, EQUAL=27, NOT_EQUAL=28, GREATER=29, LESS=30, LESS_EQUAL=31, GREATER_EQUAL=32, 
		ASSIGN=33, PLUS_ASSIGN=34, MINUS_ASSIGN=35, MUL_ASSIGN=36, DIV_ASSIGN=37, 
		MOD_ASSIGN=38, EXP_ASSIGN=39, BIT_AND=40, BIT_OR=41, BIT_XOR=42, BIT_NOT=43, 
		BIT_SHL=44, BIT_SHR=45, AND=46, OR=47, NOT=48, LEFT_RBRACKET=49, RIGHT_RBRACKET=50, 
		LEFT_SBRACKET=51, RIGHT_SBRACKET=52, DOTS=53, NIL=54, PRINT=55, SL_COMMENT=56, 
		ML_COMMENT=57, WS=58, RSYM=59, INT=60, FLOAT=61, ID=62, ID_GLOBAL=63, 
		ID_FUNCTION=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", 
			"END", "DEF", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", 
			"RETRY", "BREAK", "FOR", "IN", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "DOTS", "NIL", "PRINT", 
			"SL_COMMENT", "ML_COMMENT", "WS", "RSYM", "INT", "FLOAT", "ID", "ID_GLOBAL", 
			"ID_FUNCTION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'", "'\n'", "'require'", "'end'", "'def'", "'return'", 
			"'if'", "'then'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", 
			"'break'", "'for'", "'in'", "'true'", "'false'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", 
			"'~'", "'<<'", "'>>'", null, null, null, "'('", "')'", "'['", "']'", 
			"'..'", "'nil'", "'print'", null, null, null, "'\r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
			"RETURN", "IF", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", 
			"BREAK", "FOR", "IN", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "DOTS", "NIL", "PRINT", 
			"SL_COMMENT", "ML_COMMENT", "WS", "RSYM", "INT", "FLOAT", "ID", "ID_GLOBAL", 
			"ID_FUNCTION"
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


	  public int SemanticErrorsNum = 0;
	  public int NumStr = 1;
	  java.util.LinkedList<String> definitions = new java.util.LinkedList<String>();
	  public static boolean is_defined(java.util.LinkedList<String> definitions, String variable) {
	       int index = definitions.indexOf(variable);
	       if (index == -1) {
	         return false;
	       }
	       return true;
	  }


	public RubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ruby.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u008c\n\3\f"+
		"\3\16\3\u008f\13\3\3\3\3\3\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3"+
		"\3\5\3\u009b\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u013d\n\60\3\61\3\61\3\61\3\61\5\61\u0143\n\61\3\62\3\62\3\62\3"+
		"\62\5\62\u0149\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\38\39\39\39\39\39\39\3:\3:\7:\u0162\n:\f:\16:\u0165\13"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\7;\u0173\n;\f;\16;\u0176\13;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3<\6<\u0181\n<\r<\16<\u0182\3<\3<\3=\3=\3=\3=\3"+
		">\6>\u018c\n>\r>\16>\u018d\3?\7?\u0191\n?\f?\16?\u0194\13?\3?\3?\6?\u0198"+
		"\n?\r?\16?\u0199\3@\3@\7@\u019e\n@\f@\16@\u01a1\13@\3A\3A\3A\3B\3B\3B"+
		"\5\u008d\u0096\u0174\2C\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63"+
		"\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61"+
		"c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\3\2\b\4\2"+
		"\f\f\17\17\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2##AA\2\u01b5"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2"+
		"\5\u009a\3\2\2\2\7\u009c\3\2\2\2\t\u009e\3\2\2\2\13\u00a0\3\2\2\2\r\u00a2"+
		"\3\2\2\2\17\u00aa\3\2\2\2\21\u00ae\3\2\2\2\23\u00b2\3\2\2\2\25\u00b9\3"+
		"\2\2\2\27\u00bc\3\2\2\2\31\u00c1\3\2\2\2\33\u00c6\3\2\2\2\35\u00cc\3\2"+
		"\2\2\37\u00d3\3\2\2\2!\u00d9\3\2\2\2#\u00df\3\2\2\2%\u00e5\3\2\2\2\'\u00e9"+
		"\3\2\2\2)\u00ec\3\2\2\2+\u00f1\3\2\2\2-\u00f7\3\2\2\2/\u00f9\3\2\2\2\61"+
		"\u00fb\3\2\2\2\63\u00fd\3\2\2\2\65\u00ff\3\2\2\2\67\u0101\3\2\2\29\u0104"+
		"\3\2\2\2;\u0107\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u010e\3\2\2\2C"+
		"\u0111\3\2\2\2E\u0114\3\2\2\2G\u0116\3\2\2\2I\u0119\3\2\2\2K\u011c\3\2"+
		"\2\2M\u011f\3\2\2\2O\u0122\3\2\2\2Q\u0125\3\2\2\2S\u0129\3\2\2\2U\u012b"+
		"\3\2\2\2W\u012d\3\2\2\2Y\u012f\3\2\2\2[\u0131\3\2\2\2]\u0134\3\2\2\2_"+
		"\u013c\3\2\2\2a\u0142\3\2\2\2c\u0148\3\2\2\2e\u014a\3\2\2\2g\u014c\3\2"+
		"\2\2i\u014e\3\2\2\2k\u0150\3\2\2\2m\u0152\3\2\2\2o\u0155\3\2\2\2q\u0159"+
		"\3\2\2\2s\u015f\3\2\2\2u\u016a\3\2\2\2w\u0180\3\2\2\2y\u0186\3\2\2\2{"+
		"\u018b\3\2\2\2}\u0192\3\2\2\2\177\u019b\3\2\2\2\u0081\u01a2\3\2\2\2\u0083"+
		"\u01a5\3\2\2\2\u0085\u0086\7^\2\2\u0086\u0087\7$\2\2\u0087\4\3\2\2\2\u0088"+
		"\u008d\7$\2\2\u0089\u008c\5\3\2\2\u008a\u008c\n\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u009b\7$"+
		"\2\2\u0091\u0096\7)\2\2\u0092\u0095\5\3\2\2\u0093\u0095\n\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\7)\2\2\u009a\u0088\3\2\2\2\u009a\u0091\3\2\2\2\u009b\6\3\2\2\2"+
		"\u009c\u009d\7.\2\2\u009d\b\3\2\2\2\u009e\u009f\7=\2\2\u009f\n\3\2\2\2"+
		"\u00a0\u00a1\7\f\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7"+
		"g\2\2\u00a4\u00a5\7s\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7f\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7h\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		"\26\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7h\2\2"+
		"\u00cb\34\3\2\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7"+
		"n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7u\2\2\u00d2\36"+
		"\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8 \3\2\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7{\2\2"+
		"\u00de\"\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g"+
		"\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7m\2\2\u00e4$\3\2\2\2\u00e5\u00e6"+
		"\7h\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8&\3\2\2\2\u00e9\u00ea"+
		"\7k\2\2\u00ea\u00eb\7p\2\2\u00eb(\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7g\2\2\u00f0*\3\2\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7u\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8.\3\2\2\2\u00f9\u00fa"+
		"\7/\2\2\u00fa\60\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\62\3\2\2\2\u00fd\u00fe"+
		"\7\61\2\2\u00fe\64\3\2\2\2\u00ff\u0100\7\'\2\2\u0100\66\3\2\2\2\u0101"+
		"\u0102\7,\2\2\u0102\u0103\7,\2\2\u01038\3\2\2\2\u0104\u0105\7?\2\2\u0105"+
		"\u0106\7?\2\2\u0106:\3\2\2\2\u0107\u0108\7#\2\2\u0108\u0109\7?\2\2\u0109"+
		"<\3\2\2\2\u010a\u010b\7@\2\2\u010b>\3\2\2\2\u010c\u010d\7>\2\2\u010d@"+
		"\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110\7?\2\2\u0110B\3\2\2\2\u0111\u0112"+
		"\7@\2\2\u0112\u0113\7?\2\2\u0113D\3\2\2\2\u0114\u0115\7?\2\2\u0115F\3"+
		"\2\2\2\u0116\u0117\7-\2\2\u0117\u0118\7?\2\2\u0118H\3\2\2\2\u0119\u011a"+
		"\7/\2\2\u011a\u011b\7?\2\2\u011bJ\3\2\2\2\u011c\u011d\7,\2\2\u011d\u011e"+
		"\7?\2\2\u011eL\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0121\7?\2\2\u0121N"+
		"\3\2\2\2\u0122\u0123\7\'\2\2\u0123\u0124\7?\2\2\u0124P\3\2\2\2\u0125\u0126"+
		"\7,\2\2\u0126\u0127\7,\2\2\u0127\u0128\7?\2\2\u0128R\3\2\2\2\u0129\u012a"+
		"\7(\2\2\u012aT\3\2\2\2\u012b\u012c\7~\2\2\u012cV\3\2\2\2\u012d\u012e\7"+
		"`\2\2\u012eX\3\2\2\2\u012f\u0130\7\u0080\2\2\u0130Z\3\2\2\2\u0131\u0132"+
		"\7>\2\2\u0132\u0133\7>\2\2\u0133\\\3\2\2\2\u0134\u0135\7@\2\2\u0135\u0136"+
		"\7@\2\2\u0136^\3\2\2\2\u0137\u0138\7c\2\2\u0138\u0139\7p\2\2\u0139\u013d"+
		"\7f\2\2\u013a\u013b\7(\2\2\u013b\u013d\7(\2\2\u013c\u0137\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d`\3\2\2\2\u013e\u013f\7q\2\2\u013f\u0143\7t\2\2\u0140"+
		"\u0141\7~\2\2\u0141\u0143\7~\2\2\u0142\u013e\3\2\2\2\u0142\u0140\3\2\2"+
		"\2\u0143b\3\2\2\2\u0144\u0145\7p\2\2\u0145\u0146\7q\2\2\u0146\u0149\7"+
		"v\2\2\u0147\u0149\7#\2\2\u0148\u0144\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"d\3\2\2\2\u014a\u014b\7*\2\2\u014bf\3\2\2\2\u014c\u014d\7+\2\2\u014dh"+
		"\3\2\2\2\u014e\u014f\7]\2\2\u014fj\3\2\2\2\u0150\u0151\7_\2\2\u0151l\3"+
		"\2\2\2\u0152\u0153\7\60\2\2\u0153\u0154\7\60\2\2\u0154n\3\2\2\2\u0155"+
		"\u0156\7p\2\2\u0156\u0157\7k\2\2\u0157\u0158\7n\2\2\u0158p\3\2\2\2\u0159"+
		"\u015a\7r\2\2\u015a\u015b\7t\2\2\u015b\u015c\7k\2\2\u015c\u015d\7p\2\2"+
		"\u015d\u015e\7v\2\2\u015er\3\2\2\2\u015f\u0163\7%\2\2\u0160\u0162\n\2"+
		"\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\f"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b:\2\2\u0169t\3\2\2\2\u016a\u016b"+
		"\7?\2\2\u016b\u016c\7d\2\2\u016c\u016d\7g\2\2\u016d\u016e\7i\2\2\u016e"+
		"\u016f\7k\2\2\u016f\u0170\7p\2\2\u0170\u0174\3\2\2\2\u0171\u0173\13\2"+
		"\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7?"+
		"\2\2\u0178\u0179\7g\2\2\u0179\u017a\7p\2\2\u017a\u017b\7f\2\2\u017b\u017c"+
		"\7\f\2\2\u017c\u017d\3\2\2\2\u017d\u017e\b;\2\2\u017ev\3\2\2\2\u017f\u0181"+
		"\t\3\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b<\2\2\u0185x\3\2\2\2\u0186"+
		"\u0187\7\17\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b=\2\2\u0189z\3\2\2\2"+
		"\u018a\u018c\t\4\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e|\3\2\2\2\u018f\u0191\t\4\2\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\7\60\2\2\u0196"+
		"\u0198\t\4\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a~\3\2\2\2\u019b\u019f\t\5\2\2\u019c\u019e"+
		"\t\6\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u0080\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7&"+
		"\2\2\u01a3\u01a4\5\177@\2\u01a4\u0082\3\2\2\2\u01a5\u01a6\5\177@\2\u01a6"+
		"\u01a7\t\7\2\2\u01a7\u0084\3\2\2\2\22\2\u008b\u008d\u0094\u0096\u009a"+
		"\u013c\u0142\u0148\u0163\u0174\u0182\u018d\u0192\u0199\u019f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}