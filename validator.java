// Generated from validator.g4 by ANTLR 4.5.1
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\48\n\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\7\4A\n\4\f\4\16\4D\13"+
		"\4\5\4F\n\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\7\4P\n\4\f\4\16\4S\13"+
		"\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\5\4\\\n\4\3\4\3\4\6\4`\n\4\r\4\16\4"+
		"a\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0094"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\b\3\b\5\b\u00a2\n"+
		"\b\3\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0100\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0123\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u012f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0149\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016e\n\23\3\24"+
		"\6\24\u0171\n\24\r\24\16\24\u0172\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\t\3\2\21"+
		"\3\2/\60\4\2\"\"/\60\4\2ZZzz\4\2OOoo\3\2nn\3\2oo\3\2OO\5\2\61\61ZZzz\4"+
		"\2/\60aa\3\2\62;\4\2C\\c|\5\2\62;C\\c|\t\2##&&(/<=??aa\u0080\u0080\4\2"+
		"88::\3\2\f\f\u0189\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\60\3\2\2\2\7\67\3\2\2\2"+
		"\tm\3\2\2\2\13y\3\2\2\2\r\u0093\3\2\2\2\17\u00a1\3\2\2\2\21\u00aa\3\2"+
		"\2\2\23\u00ac\3\2\2\2\25\u00ae\3\2\2\2\27\u00b0\3\2\2\2\31\u00bb\3\2\2"+
		"\2\33\u00bd\3\2\2\2\35\u00d1\3\2\2\2\37\u00e5\3\2\2\2!\u0122\3\2\2\2#"+
		"\u012e\3\2\2\2%\u016d\3\2\2\2\'\u0170\3\2\2\2)*\7>\2\2*+\7\61\2\2+,\3"+
		"\2\2\2,-\5\17\b\2-.\7@\2\2./\b\2\2\2/\4\3\2\2\2\60\61\7>\2\2\61\62\5\17"+
		"\b\2\62\63\7@\2\2\63\64\b\3\3\2\64\6\3\2\2\2\658\5\23\n\2\668\7a\2\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\28E\3\2\2\29;\5\25\13\2:9\3\2\2\2;>\3\2\2\2<:"+
		"\3\2\2\2<=\3\2\2\2=F\3\2\2\2><\3\2\2\2?A\5\27\f\2@?\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2E<\3\2\2\2EB\3\2\2\2FG\3\2\2\2"+
		"G[\7B\2\2HJ\5\25\13\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\\\3\2\2"+
		"\2MK\3\2\2\2NP\5\25\13\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2"+
		"\2\2SQ\3\2\2\2TX\t\2\2\2UW\5\25\13\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[K\3\2\2\2[Q\3\2\2\2\\]\3\2\2\2]_\7\60\2\2"+
		"^`\5\23\n\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\4\4"+
		"\2d\b\3\2\2\2ef\7\62\2\2fn\4\63;\2gh\7\63\2\2hn\4\62;\2ij\7\64\2\2jn\4"+
		"\62;\2kl\7\65\2\2ln\4\62\63\2me\3\2\2\2mg\3\2\2\2mi\3\2\2\2mk\3\2\2\2"+
		"no\3\2\2\2op\7\61\2\2pq\4\62\63\2qr\4\63\64\2rs\3\2\2\2st\7\61\2\2tu\5"+
		"\31\r\2uv\b\5\5\2v\n\3\2\2\2wz\5\21\t\2xz\7*\2\2yw\3\2\2\2yx\3\2\2\2z"+
		"{\3\2\2\2{|\5\21\t\2|}\5\21\t\2}\u0080\5\21\t\2~\u0081\5\21\t\2\177\u0081"+
		"\7+\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\t\3\2\2\u0083\u0084\5\21\t\2\u0084\u0085\5\21\t\2\u0085\u0086\5\21\t"+
		"\2\u0086\u0087\t\3\2\2\u0087\u0088\5\21\t\2\u0088\u0089\5\21\t\2\u0089"+
		"\u008a\5\21\t\2\u008a\u008b\5\21\t\2\u008b\u008c\b\6\6\2\u008c\f\3\2\2"+
		"\2\u008d\u0094\5\33\16\2\u008e\u0094\5\35\17\2\u008f\u0094\5\37\20\2\u0090"+
		"\u0094\5!\21\2\u0091\u0094\5#\22\2\u0092\u0094\5%\23\2\u0093\u008d\3\2"+
		"\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\7"+
		"\7\2\u0096\16\3\2\2\2\u0097\u0098\t\4\2\2\u0098\u0099\t\5\2\2\u0099\u00a2"+
		"\n\6\2\2\u009a\u009d\t\4\2\2\u009b\u009e\n\7\2\2\u009c\u009e\n\b\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a2\n\t"+
		"\2\2\u00a0\u00a2\7a\2\2\u00a1\u0097\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a6\5\25"+
		"\13\2\u00a4\u00a6\t\n\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\20\3\2\2"+
		"\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\t\13\2\2\u00ab\22\3\2\2\2\u00ac\u00ad"+
		"\t\f\2\2\u00ad\24\3\2\2\2\u00ae\u00af\t\r\2\2\u00af\26\3\2\2\2\u00b0\u00b1"+
		"\t\16\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7\64\2\2\u00b3\u00b4\7\62\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\4\62;\2\u00b6\u00bc\4\62;\2\u00b7\u00b8\7\64"+
		"\2\2\u00b8\u00b9\7\63\2\2\u00b9\u00ba\7\62\2\2\u00ba\u00bc\7\62\2\2\u00bb"+
		"\u00b2\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7\66\2"+
		"\2\u00be\u00bf\5\21\t\2\u00bf\u00c0\5\21\t\2\u00c0\u00c1\5\21\t\2\u00c1"+
		"\u00c2\7/\2\2\u00c2\u00c3\5\21\t\2\u00c3\u00c4\5\21\t\2\u00c4\u00c5\5"+
		"\21\t\2\u00c5\u00c6\5\21\t\2\u00c6\u00c7\7/\2\2\u00c7\u00c8\5\21\t\2\u00c8"+
		"\u00c9\5\21\t\2\u00c9\u00ca\5\21\t\2\u00ca\u00cb\5\21\t\2\u00cb\u00cc"+
		"\7/\2\2\u00cc\u00cd\5\21\t\2\u00cd\u00ce\5\21\t\2\u00ce\u00cf\5\21\t\2"+
		"\u00cf\u00d0\5\21\t\2\u00d0\34\3\2\2\2\u00d1\u00d2\7\67\2\2\u00d2\u00d3"+
		"\4\63\67\2\u00d3\u00d4\5\21\t\2\u00d4\u00d5\5\21\t\2\u00d5\u00d6\7/\2"+
		"\2\u00d6\u00d7\5\21\t\2\u00d7\u00d8\5\21\t\2\u00d8\u00d9\5\21\t\2\u00d9"+
		"\u00da\5\21\t\2\u00da\u00db\7/\2\2\u00db\u00dc\5\21\t\2\u00dc\u00dd\5"+
		"\21\t\2\u00dd\u00de\5\21\t\2\u00de\u00df\5\21\t\2\u00df\u00e0\7/\2\2\u00e0"+
		"\u00e1\5\21\t\2\u00e1\u00e2\5\21\t\2\u00e2\u00e3\5\21\t\2\u00e3\u00e4"+
		"\5\21\t\2\u00e4\36\3\2\2\2\u00e5\u00e6\7\65\2\2\u00e6\u00e7\4\669\2\u00e7"+
		"\u00e8\5\21\t\2\u00e8\u00e9\5\21\t\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\5"+
		"\21\t\2\u00eb\u00ec\5\21\t\2\u00ec\u00ed\5\21\t\2\u00ed\u00ee\5\21\t\2"+
		"\u00ee\u00ef\5\21\t\2\u00ef\u00f0\5\21\t\2\u00f0\u00f1\7/\2\2\u00f1\u00f2"+
		"\5\21\t\2\u00f2\u00f3\5\21\t\2\u00f3\u00f4\5\21\t\2\u00f4\u00f5\5\21\t"+
		"\2\u00f5\u00f6\5\21\t\2\u00f6 \3\2\2\2\u00f7\u00ff\7\65\2\2\u00f8\u00f9"+
		"\7\62\2\2\u00f9\u00fa\4\62\67\2\u00fa\u0100\5\21\t\2\u00fb\u00fc\t\17"+
		"\2\2\u00fc\u00fd\5\21\t\2\u00fd\u00fe\5\21\t\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00f8\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7/"+
		"\2\2\u0102\u0103\5\21\t\2\u0103\u0104\5\21\t\2\u0104\u0105\5\21\t\2\u0105"+
		"\u0106\5\21\t\2\u0106\u0107\5\21\t\2\u0107\u0108\5\21\t\2\u0108\u0109"+
		"\7/\2\2\u0109\u010a\5\21\t\2\u010a\u010b\5\21\t\2\u010b\u010c\5\21\t\2"+
		"\u010c\u010d\5\21\t\2\u010d\u0123\3\2\2\2\u010e\u010f\7\67\2\2\u010f\u0110"+
		"\5\21\t\2\u0110\u0111\5\21\t\2\u0111\u0112\5\21\t\2\u0112\u0113\7/\2\2"+
		"\u0113\u0114\5\21\t\2\u0114\u0115\5\21\t\2\u0115\u0116\5\21\t\2\u0116"+
		"\u0117\5\21\t\2\u0117\u0118\7/\2\2\u0118\u0119\5\21\t\2\u0119\u011a\5"+
		"\21\t\2\u011a\u011b\5\21\t\2\u011b\u011c\5\21\t\2\u011c\u011d\7/\2\2\u011d"+
		"\u011e\5\21\t\2\u011e\u011f\5\21\t\2\u011f\u0120\5\21\t\2\u0120\u0121"+
		"\5\21\t\2\u0121\u0123\3\2\2\2\u0122\u00f7\3\2\2\2\u0122\u010e\3\2\2\2"+
		"\u0123\"\3\2\2\2\u0124\u0125\78\2\2\u0125\u0126\7\62\2\2\u0126\u0127\7"+
		"\63\2\2\u0127\u012f\7\63\2\2\u0128\u0129\78\2\2\u0129\u012a\7\67\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\5\21\t\2\u012c\u012d\5\21\t\2\u012d\u012f\3"+
		"\2\2\2\u012e\u0124\3\2\2\2\u012e\u0128\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\7/\2\2\u0131\u0132\5\21\t\2\u0132\u0133\5\21\t\2\u0133\u0134\5"+
		"\21\t\2\u0134\u0135\5\21\t\2\u0135\u0136\7/\2\2\u0136\u0137\5\21\t\2\u0137"+
		"\u0138\5\21\t\2\u0138\u0139\5\21\t\2\u0139\u013a\5\21\t\2\u013a\u013b"+
		"\7/\2\2\u013b\u013c\5\21\t\2\u013c\u013d\5\21\t\2\u013d\u013e\5\21\t\2"+
		"\u013e\u013f\5\21\t\2\u013f$\3\2\2\2\u0140\u0141\7\64\2\2\u0141\u0142"+
		"\7\63\2\2\u0142\u0143\7\65\2\2\u0143\u0149\7\63\2\2\u0144\u0145\7\63\2"+
		"\2\u0145\u0146\7:\2\2\u0146\u0147\7\62\2\2\u0147\u0149\7\62\2\2\u0148"+
		"\u0140\3\2\2\2\u0148\u0144\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7/"+
		"\2\2\u014b\u014c\5\21\t\2\u014c\u014d\5\21\t\2\u014d\u014e\5\21\t\2\u014e"+
		"\u014f\5\21\t\2\u014f\u0150\5\21\t\2\u0150\u0151\5\21\t\2\u0151\u0152"+
		"\7/\2\2\u0152\u0153\5\21\t\2\u0153\u0154\5\21\t\2\u0154\u0155\5\21\t\2"+
		"\u0155\u0156\5\21\t\2\u0156\u0157\5\21\t\2\u0157\u016e\3\2\2\2\u0158\u0159"+
		"\7\65\2\2\u0159\u015a\7\67\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5\21\t"+
		"\2\u015c\u015d\5\21\t\2\u015d\u015e\7/\2\2\u015e\u015f\5\21\t\2\u015f"+
		"\u0160\5\21\t\2\u0160\u0161\5\21\t\2\u0161\u0162\5\21\t\2\u0162\u0163"+
		"\7/\2\2\u0163\u0164\5\21\t\2\u0164\u0165\5\21\t\2\u0165\u0166\5\21\t\2"+
		"\u0166\u0167\5\21\t\2\u0167\u0168\7/\2\2\u0168\u0169\5\21\t\2\u0169\u016a"+
		"\5\21\t\2\u016a\u016b\5\21\t\2\u016b\u016c\5\21\t\2\u016c\u016e\3\2\2"+
		"\2\u016d\u0148\3\2\2\2\u016d\u0158\3\2\2\2\u016e&\3\2\2\2\u016f\u0171"+
		"\t\20\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b\24\b\2\u0175(\3"+
		"\2\2\2\33\2\67<BEKQX[amy\u0080\u0093\u009d\u00a1\u00a5\u00a7\u00bb\u00ff"+
		"\u0122\u012e\u0148\u016d\u0172\t\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3"+
		"\24\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}