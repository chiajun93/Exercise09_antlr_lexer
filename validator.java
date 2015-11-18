// Generated from validator.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class validator extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EndTag=1, StartTag=2, Email=3, Date=4, Phone=5, CreditCard=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EndTag", "StartTag", "Email", "Date", "Phone", "CreditCard", "VALIDELEMENT", 
		"DIGIT", "ALPHA", "DIGIT_ALPHA", "EMAIL_SPECIALCHAR", "YEARS", "VISA", 
		"MASTER", "AMERICAN_EXPRESS", "DINERS_CLUB", "DISCOVER", "JCB", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EndTag", "StartTag", "Email", "Date", "Phone", "CreditCard", "WS"
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


	  int count = 0;


	public validator(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "validator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			EndTag_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			StartTag_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			Email_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			Date_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			Phone_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			CreditCard_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EndTag_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    System.out.println("End Tag: " + getText());

			break;
		}
	}
	private void StartTag_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    System.out.println("Start Tag: " + getText());

			break;
		}
	}
	private void Email_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

						System.out.println("Email: " + getText());
					
			break;
		}
	}
	private void Date_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 
					System.out.println("Date: " + getText());

			break;
		}
	}
	private void Phone_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

					
					System.out.println("Phone: " + getText());

			break;
		}
	}
	private void CreditCard_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:


					System.out.println("Credit card: " + getText());
				

			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u0180\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\7\4E\n"+
		"\4\f\4\16\4H\13\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\7\4R\n\4\f\4\16"+
		"\4U\13\4\5\4W\n\4\3\4\3\4\6\4[\n\4\r\4\16\4\\\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6"+
		"u\n\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\5\6\177\n\6\3\6\3\6\5\6\u0083\n"+
		"\6\3\6\3\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0097\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a1"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\b\3\b\7\b\u00b0"+
		"\n\b\f\b\16\b\u00b3\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u010a\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012d"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0139\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0153\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0178\n\23\3\24\6\24\u017b\n\24\r"+
		"\24\16\24\u017c\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\t\3\2\17\3\2\60\60\3\2/\60"+
		"\4\2\"\"/\60\3\2nn\3\2oo\3\2zz\4\2/\60aa\3\2\62;\4\2C\\c|\5\2\62;C\\c"+
		"|\t\2##&&(/<=??aa\u0080\u0080\4\288::\3\2\f\f\u0197\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\'\3\2\2\2\3"+
		")\3\2\2\2\5\60\3\2\2\2\7\67\3\2\2\2\th\3\2\2\2\13t\3\2\2\2\r\u00a0\3\2"+
		"\2\2\17\u00ab\3\2\2\2\21\u00b4\3\2\2\2\23\u00b6\3\2\2\2\25\u00b8\3\2\2"+
		"\2\27\u00ba\3\2\2\2\31\u00c5\3\2\2\2\33\u00c7\3\2\2\2\35\u00db\3\2\2\2"+
		"\37\u00ef\3\2\2\2!\u012c\3\2\2\2#\u0138\3\2\2\2%\u0177\3\2\2\2\'\u017a"+
		"\3\2\2\2)*\7>\2\2*+\7\61\2\2+,\3\2\2\2,-\5\17\b\2-.\7@\2\2./\b\2\2\2/"+
		"\4\3\2\2\2\60\61\7>\2\2\61\62\5\17\b\2\62\63\7@\2\2\63\64\b\3\3\2\64\6"+
		"\3\2\2\2\658\5\25\13\2\668\5\27\f\2\67\65\3\2\2\2\67\66\3\2\2\28?\3\2"+
		"\2\29>\5\25\13\2:>\5\27\f\2;<\7\60\2\2<>\n\2\2\2=9\3\2\2\2=:\3\2\2\2="+
		";\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BV\7B\2\2C"+
		"E\5\25\13\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GW\3\2\2\2HF\3\2\2"+
		"\2IK\5\25\13\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2"+
		"\2\2OS\t\3\2\2PR\5\25\13\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3"+
		"\2\2\2US\3\2\2\2VF\3\2\2\2VL\3\2\2\2WX\3\2\2\2XZ\7\60\2\2Y[\5\23\n\2Z"+
		"Y\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\4\4\2_\b\3\2"+
		"\2\2`a\7\62\2\2ai\4\63;\2bc\7\63\2\2ci\4\62;\2de\7\64\2\2ei\4\62;\2fg"+
		"\7\65\2\2gi\4\62\63\2h`\3\2\2\2hb\3\2\2\2hd\3\2\2\2hf\3\2\2\2ij\3\2\2"+
		"\2jk\7\61\2\2kl\4\62\63\2lm\4\63\64\2mn\3\2\2\2no\7\61\2\2op\5\31\r\2"+
		"pq\b\5\5\2q\n\3\2\2\2ru\5\21\t\2su\7*\2\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2"+
		"\2vw\5\21\t\2wz\5\21\t\2x{\5\21\t\2y{\t\4\2\2zx\3\2\2\2zy\3\2\2\2{~\3"+
		"\2\2\2|\177\5\21\t\2}\177\7+\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080\u0083\5\21\t\2\u0081\u0083\t\4\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\5\21\t\2\u0085\u0088\5\21\t\2"+
		"\u0086\u0088\t\4\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008c\5\21\t\2\u008a\u008d\5\21\t\2\u008b\u008d\t\4\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008f"+
		"\5\21\t\2\u008f\u0090\5\21\t\2\u0090\u0091\5\21\t\2\u0091\u0092\5\21\t"+
		"\2\u0092\u0097\3\2\2\2\u0093\u0094\5\21\t\2\u0094\u0095\5\21\t\2\u0095"+
		"\u0097\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\b\6\6\2\u0099\f\3\2\2\2\u009a\u00a1\5\33\16\2\u009b\u00a1"+
		"\5\35\17\2\u009c\u00a1\5\37\20\2\u009d\u00a1\5!\21\2\u009e\u00a1\5#\22"+
		"\2\u009f\u00a1\5%\23\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c"+
		"\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\b\7\7\2\u00a3\16\3\2\2\2\u00a4\u00a5\7z\2\2"+
		"\u00a5\u00a6\7o\2\2\u00a6\u00ac\n\5\2\2\u00a7\u00a8\7z\2\2\u00a8\u00ac"+
		"\n\6\2\2\u00a9\u00ac\n\7\2\2\u00aa\u00ac\7a\2\2\u00ab\u00a4\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00b1\3\2"+
		"\2\2\u00ad\u00b0\5\25\13\2\u00ae\u00b0\t\b\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\20\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\t\t\2\2\u00b5\22"+
		"\3\2\2\2\u00b6\u00b7\t\n\2\2\u00b7\24\3\2\2\2\u00b8\u00b9\t\13\2\2\u00b9"+
		"\26\3\2\2\2\u00ba\u00bb\t\f\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7\64\2\2"+
		"\u00bd\u00be\7\62\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\4\62;\2\u00c0\u00c6"+
		"\4\62;\2\u00c1\u00c2\7\64\2\2\u00c2\u00c3\7\63\2\2\u00c3\u00c4\7\62\2"+
		"\2\u00c4\u00c6\7\62\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6"+
		"\32\3\2\2\2\u00c7\u00c8\7\66\2\2\u00c8\u00c9\5\21\t\2\u00c9\u00ca\5\21"+
		"\t\2\u00ca\u00cb\5\21\t\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\5\21\t\2\u00cd"+
		"\u00ce\5\21\t\2\u00ce\u00cf\5\21\t\2\u00cf\u00d0\5\21\t\2\u00d0\u00d1"+
		"\7/\2\2\u00d1\u00d2\5\21\t\2\u00d2\u00d3\5\21\t\2\u00d3\u00d4\5\21\t\2"+
		"\u00d4\u00d5\5\21\t\2\u00d5\u00d6\7/\2\2\u00d6\u00d7\5\21\t\2\u00d7\u00d8"+
		"\5\21\t\2\u00d8\u00d9\5\21\t\2\u00d9\u00da\5\21\t\2\u00da\34\3\2\2\2\u00db"+
		"\u00dc\7\67\2\2\u00dc\u00dd\4\63\67\2\u00dd\u00de\5\21\t\2\u00de\u00df"+
		"\5\21\t\2\u00df\u00e0\7/\2\2\u00e0\u00e1\5\21\t\2\u00e1\u00e2\5\21\t\2"+
		"\u00e2\u00e3\5\21\t\2\u00e3\u00e4\5\21\t\2\u00e4\u00e5\7/\2\2\u00e5\u00e6"+
		"\5\21\t\2\u00e6\u00e7\5\21\t\2\u00e7\u00e8\5\21\t\2\u00e8\u00e9\5\21\t"+
		"\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\5\21\t\2\u00eb\u00ec\5\21\t\2\u00ec"+
		"\u00ed\5\21\t\2\u00ed\u00ee\5\21\t\2\u00ee\36\3\2\2\2\u00ef\u00f0\7\65"+
		"\2\2\u00f0\u00f1\4\669\2\u00f1\u00f2\5\21\t\2\u00f2\u00f3\5\21\t\2\u00f3"+
		"\u00f4\7/\2\2\u00f4\u00f5\5\21\t\2\u00f5\u00f6\5\21\t\2\u00f6\u00f7\5"+
		"\21\t\2\u00f7\u00f8\5\21\t\2\u00f8\u00f9\5\21\t\2\u00f9\u00fa\5\21\t\2"+
		"\u00fa\u00fb\7/\2\2\u00fb\u00fc\5\21\t\2\u00fc\u00fd\5\21\t\2\u00fd\u00fe"+
		"\5\21\t\2\u00fe\u00ff\5\21\t\2\u00ff\u0100\5\21\t\2\u0100 \3\2\2\2\u0101"+
		"\u0109\7\65\2\2\u0102\u0103\7\62\2\2\u0103\u0104\4\62\67\2\u0104\u010a"+
		"\5\21\t\2\u0105\u0106\t\r\2\2\u0106\u0107\5\21\t\2\u0107\u0108\5\21\t"+
		"\2\u0108\u010a\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0105\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\7/\2\2\u010c\u010d\5\21\t\2\u010d\u010e\5\21\t\2"+
		"\u010e\u010f\5\21\t\2\u010f\u0110\5\21\t\2\u0110\u0111\5\21\t\2\u0111"+
		"\u0112\5\21\t\2\u0112\u0113\7/\2\2\u0113\u0114\5\21\t\2\u0114\u0115\5"+
		"\21\t\2\u0115\u0116\5\21\t\2\u0116\u0117\5\21\t\2\u0117\u012d\3\2\2\2"+
		"\u0118\u0119\7\67\2\2\u0119\u011a\5\21\t\2\u011a\u011b\5\21\t\2\u011b"+
		"\u011c\5\21\t\2\u011c\u011d\7/\2\2\u011d\u011e\5\21\t\2\u011e\u011f\5"+
		"\21\t\2\u011f\u0120\5\21\t\2\u0120\u0121\5\21\t\2\u0121\u0122\7/\2\2\u0122"+
		"\u0123\5\21\t\2\u0123\u0124\5\21\t\2\u0124\u0125\5\21\t\2\u0125\u0126"+
		"\5\21\t\2\u0126\u0127\7/\2\2\u0127\u0128\5\21\t\2\u0128\u0129\5\21\t\2"+
		"\u0129\u012a\5\21\t\2\u012a\u012b\5\21\t\2\u012b\u012d\3\2\2\2\u012c\u0101"+
		"\3\2\2\2\u012c\u0118\3\2\2\2\u012d\"\3\2\2\2\u012e\u012f\78\2\2\u012f"+
		"\u0130\7\62\2\2\u0130\u0131\7\63\2\2\u0131\u0139\7\63\2\2\u0132\u0133"+
		"\78\2\2\u0133\u0134\7\67\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5\21\t\2"+
		"\u0136\u0137\5\21\t\2\u0137\u0139\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u0132"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013c\5\21\t\2\u013c"+
		"\u013d\5\21\t\2\u013d\u013e\5\21\t\2\u013e\u013f\5\21\t\2\u013f\u0140"+
		"\7/\2\2\u0140\u0141\5\21\t\2\u0141\u0142\5\21\t\2\u0142\u0143\5\21\t\2"+
		"\u0143\u0144\5\21\t\2\u0144\u0145\7/\2\2\u0145\u0146\5\21\t\2\u0146\u0147"+
		"\5\21\t\2\u0147\u0148\5\21\t\2\u0148\u0149\5\21\t\2\u0149$\3\2\2\2\u014a"+
		"\u014b\7\64\2\2\u014b\u014c\7\63\2\2\u014c\u014d\7\65\2\2\u014d\u0153"+
		"\7\63\2\2\u014e\u014f\7\63\2\2\u014f\u0150\7:\2\2\u0150\u0151\7\62\2\2"+
		"\u0151\u0153\7\62\2\2\u0152\u014a\3\2\2\2\u0152\u014e\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0155\7/\2\2\u0155\u0156\5\21\t\2\u0156\u0157\5\21\t\2"+
		"\u0157\u0158\5\21\t\2\u0158\u0159\5\21\t\2\u0159\u015a\5\21\t\2\u015a"+
		"\u015b\5\21\t\2\u015b\u015c\7/\2\2\u015c\u015d\5\21\t\2\u015d\u015e\5"+
		"\21\t\2\u015e\u015f\5\21\t\2\u015f\u0160\5\21\t\2\u0160\u0161\5\21\t\2"+
		"\u0161\u0178\3\2\2\2\u0162\u0163\7\65\2\2\u0163\u0164\7\67\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0166\5\21\t\2\u0166\u0167\5\21\t\2\u0167\u0168\7/\2\2"+
		"\u0168\u0169\5\21\t\2\u0169\u016a\5\21\t\2\u016a\u016b\5\21\t\2\u016b"+
		"\u016c\5\21\t\2\u016c\u016d\7/\2\2\u016d\u016e\5\21\t\2\u016e\u016f\5"+
		"\21\t\2\u016f\u0170\5\21\t\2\u0170\u0171\5\21\t\2\u0171\u0172\7/\2\2\u0172"+
		"\u0173\5\21\t\2\u0173\u0174\5\21\t\2\u0174\u0175\5\21\t\2\u0175\u0176"+
		"\5\21\t\2\u0176\u0178\3\2\2\2\u0177\u0152\3\2\2\2\u0177\u0162\3\2\2\2"+
		"\u0178&\3\2\2\2\u0179\u017b\t\16\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3"+
		"\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\b\24\b\2\u017f(\3\2\2\2\36\2\67=?FLSV\\htz~\u0082\u0087\u008c\u0096"+
		"\u00a0\u00ab\u00af\u00b1\u00c5\u0109\u012c\u0138\u0152\u0177\u017c\t\3"+
		"\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\24\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}