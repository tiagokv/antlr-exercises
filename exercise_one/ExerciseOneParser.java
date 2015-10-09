// Generated from ExerciseOne.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExerciseOneParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FRENTE=1, ESQUERDA=2, DIREITA=3, TRAS=4, ENTAO=5, APOS=6, LPAR=7, RPAR=8, 
		INT=9, NEWLINE=10, WS=11;
	public static final int
		RULE_init = 0, RULE_comando = 1, RULE_basico = 2;
	public static final String[] ruleNames = {
		"init", "comando", "basico"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FRENTE'", "'ESQUERDA'", "'DIREITA'", "'TRAS'", "'ENTAO'", "'APOS'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FRENTE", "ESQUERDA", "DIREITA", "TRAS", "ENTAO", "APOS", "LPAR", 
		"RPAR", "INT", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "ExerciseOne.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExerciseOneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExerciseOneVisitor ) return ((ExerciseOneVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			comando(0);
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewlineContext extends ComandoContext {
		public TerminalNode NEWLINE() { return getToken(ExerciseOneParser.NEWLINE, 0); }
		public NewlineContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExerciseOneVisitor ) return ((ExerciseOneVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasContext extends ComandoContext {
		public BasicoContext basico() {
			return getRuleContext(BasicoContext.class,0);
		}
		public BasContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExerciseOneVisitor ) return ((ExerciseOneVisitor<? extends T>)visitor).visitBas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParsContext extends ComandoContext {
		public TerminalNode LPAR() { return getToken(ExerciseOneParser.LPAR, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ExerciseOneParser.RPAR, 0); }
		public ParsContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExerciseOneVisitor ) return ((ExerciseOneVisitor<? extends T>)visitor).visitPars(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DepContext extends ComandoContext {
		public Token op;
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode ENTAO() { return getToken(ExerciseOneParser.ENTAO, 0); }
		public TerminalNode APOS() { return getToken(ExerciseOneParser.APOS, 0); }
		public TerminalNode NEWLINE() { return getToken(ExerciseOneParser.NEWLINE, 0); }
		public DepContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExerciseOneVisitor ) return ((ExerciseOneVisitor<? extends T>)visitor).visitDep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		return comando(0);
	}

	private ComandoContext comando(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComandoContext _localctx = new ComandoContext(_ctx, _parentState);
		ComandoContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_comando, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ParsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(9);
				match(LPAR);
				setState(10);
				comando(0);
				setState(11);
				match(RPAR);
				}
				break;
			case FRENTE:
			case ESQUERDA:
			case DIREITA:
			case TRAS:
				{
				_localctx = new BasContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				basico();
				}
				break;
			case NEWLINE:
				{
				_localctx = new NewlineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DepContext(new ComandoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_comando);
					setState(17);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(18);
					((DepContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTAO) | (1L << APOS) | (1L << NEWLINE))) != 0)) ) {
						((DepContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(19);
					comando(5);
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class BasicoContext extends ParserRuleContext {
		public TerminalNode FRENTE() { return getToken(ExerciseOneParser.FRENTE, 0); }
		public TerminalNode INT() { return getToken(ExerciseOneParser.INT, 0); }
		public TerminalNode ESQUERDA() { return getToken(ExerciseOneParser.ESQUERDA, 0); }
		public TerminalNode DIREITA() { return getToken(ExerciseOneParser.DIREITA, 0); }
		public TerminalNode TRAS() { return getToken(ExerciseOneParser.TRAS, 0); }
		public BasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExerciseOneVisitor ) return ((ExerciseOneVisitor<? extends T>)visitor).visitBasico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicoContext basico() throws RecognitionException {
		BasicoContext _localctx = new BasicoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basico);
		try {
			setState(33);
			switch (_input.LA(1)) {
			case FRENTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(FRENTE);
				setState(26);
				match(INT);
				}
				break;
			case ESQUERDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(ESQUERDA);
				setState(28);
				match(INT);
				}
				break;
			case DIREITA:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				match(DIREITA);
				setState(30);
				match(INT);
				}
				break;
			case TRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(TRAS);
				setState(32);
				match(INT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return comando_sempred((ComandoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comando_sempred(ComandoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\22\n\3\3\3\3\3\3\3"+
		"\7\3\27\n\3\f\3\16\3\32\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4"+
		"\3\4\2\3\4\5\2\4\6\2\3\4\2\7\b\f\f(\2\b\3\2\2\2\4\21\3\2\2\2\6#\3\2\2"+
		"\2\b\t\5\4\3\2\t\3\3\2\2\2\n\13\b\3\1\2\13\f\7\t\2\2\f\r\5\4\3\2\r\16"+
		"\7\n\2\2\16\22\3\2\2\2\17\22\5\6\4\2\20\22\7\f\2\2\21\n\3\2\2\2\21\17"+
		"\3\2\2\2\21\20\3\2\2\2\22\30\3\2\2\2\23\24\f\6\2\2\24\25\t\2\2\2\25\27"+
		"\5\4\3\7\26\23\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5"+
		"\3\2\2\2\32\30\3\2\2\2\33\34\7\3\2\2\34$\7\13\2\2\35\36\7\4\2\2\36$\7"+
		"\13\2\2\37 \7\5\2\2 $\7\13\2\2!\"\7\6\2\2\"$\7\13\2\2#\33\3\2\2\2#\35"+
		"\3\2\2\2#\37\3\2\2\2#!\3\2\2\2$\7\3\2\2\2\5\21\30#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}