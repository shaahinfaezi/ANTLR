// Generated from C:/Users/YEKTA-PC/IdeaProjects/untitled/src\AntlrProject.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AntlrProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MULTI_LINE_COMMENT=2, SINGLE_LINE_COMMENT=3, PUBLIC=4, PRIVATE=5, 
		IMPORT=6, REQUIRE=7, FROM=8, FOR=9, CONST=10, WHILE=11, DO=12, IF=13, 
		ELSE=14, RETURN=15, SWITCH=16, CASE=17, BREAK=18, CLASS=19, CONSTRUCTOR=20, 
		FUNCTION=21, TRY=22, EXCEPT=23, FI=24, INT=25, FLOAT=26, BOOL=27, STRING=28, 
		TRUE=29, FALSE=30, NEW=31, THEN=32, DONE=33, ASLONGAS=34, SEMI=35, WHEN=36, 
		END=37, INHERITED=38, END_CLASS=39, VECTOR=40, ATSIGN=41, DOLLAR=42, QUESTIONMARK=43, 
		ARROW=44, HASHTAG=45, LPAREN=46, RPAREN=47, DOUBLE_LPAREN=48, DOUBLE_RPAREN=49, 
		CARET=50, DOUBLE_PLUS=51, DOUBLE_MINUS=52, LEFT_SHIFT=53, RIGHT_SHIFT=54, 
		PLUS=55, MINUS=56, SLASH=57, DOUBLE_SLASH=58, PERCENT=59, DOUBLE_STAR=60, 
		STAR=61, AMPERSAND=62, AND=63, PIPE=64, OR=65, EX_MARK=66, SMALLER=67, 
		GREATER=68, SMALLEREQ=69, GREATEREQ=70, NOT_EQUAL=71, DOUBLE_EQUAL=72, 
		EQPLUS=73, EQMINUS=74, STAR_EQUAL=75, SLASH_EQUAL=76, EQUALS=77, COMMA=78, 
		DOT=79, COLON=80, DOUBLE_COLON=81, UNDERSCORE=82, DOUBLEQ=83, QUOTE=84, 
		APOSTROPHE=85, LBRACK=86, RBRACK=87, LCURLY=88, RCURLY=89, TILDE=90, SPACE=91, 
		STRINGVALUE=92, CAPITAL_STRING=93, INTVALUE=94, FLOATVALUE=95, WORD=96, 
		ARRAY=97, ARRAY_VALUE=98, VECTOR_VALUE=99, VECTOR_REF=100;
	public static final int
		RULE_s = 0, RULE_statement = 1, RULE_class_statement = 2, RULE_immport = 3, 
		RULE_experssion = 4, RULE_variable = 5, RULE_array = 6, RULE_if = 7, RULE_while = 8, 
		RULE_dowhile = 9, RULE_for = 10, RULE_switchcase = 11, RULE_function = 12, 
		RULE_call = 13, RULE_class = 14, RULE_arrow = 15, RULE_exception = 16, 
		RULE_vector = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "statement", "class_statement", "immport", "experssion", "variable", 
			"array", "if", "while", "dowhile", "for", "switchcase", "function", "call", 
			"class", "arrow", "exception", "vector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'public'", "'private'", "'import'", "'require'", 
			"'from'", "'for'", "'const'", "'while'", "'do'", "'If'", "'else'", "'return'", 
			"'switch'", "'case'", "'break'", "'class'", "'constructor'", "'function'", 
			"'try'", "'except'", "'Fi'", "'int'", "'float'", "'bool'", "'string'", 
			"'true'", "'false'", "'new'", "'Then'", "'done'", "'as_long_as'", "';'", 
			"'when'", "'end'", "'Inherited'", "'end_class'", "'vector'", "'@'", "'$'", 
			"'?'", "'<-'", "'#'", "'('", "')'", "'(('", "'))'", "'^'", "'++'", "'--'", 
			"'<<'", "'>>'", "'+'", "'-'", "'/'", "'//'", "'%'", "'**'", "'*'", "'&'", 
			"'&&'", "'|'", "'||'", "'!'", "'<'", "'>'", "'<='", "'>='", null, "'=='", 
			"'+='", "'-='", "'*='", "'/='", "'='", "','", "'.'", "':'", "'::'", "'_'", 
			"'\"'", "'''", "'\\u00E2\\u20AC\\u2122'", "'['", "']'", "'{'", "'}'", 
			"'~'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "PUBLIC", "PRIVATE", 
			"IMPORT", "REQUIRE", "FROM", "FOR", "CONST", "WHILE", "DO", "IF", "ELSE", 
			"RETURN", "SWITCH", "CASE", "BREAK", "CLASS", "CONSTRUCTOR", "FUNCTION", 
			"TRY", "EXCEPT", "FI", "INT", "FLOAT", "BOOL", "STRING", "TRUE", "FALSE", 
			"NEW", "THEN", "DONE", "ASLONGAS", "SEMI", "WHEN", "END", "INHERITED", 
			"END_CLASS", "VECTOR", "ATSIGN", "DOLLAR", "QUESTIONMARK", "ARROW", "HASHTAG", 
			"LPAREN", "RPAREN", "DOUBLE_LPAREN", "DOUBLE_RPAREN", "CARET", "DOUBLE_PLUS", 
			"DOUBLE_MINUS", "LEFT_SHIFT", "RIGHT_SHIFT", "PLUS", "MINUS", "SLASH", 
			"DOUBLE_SLASH", "PERCENT", "DOUBLE_STAR", "STAR", "AMPERSAND", "AND", 
			"PIPE", "OR", "EX_MARK", "SMALLER", "GREATER", "SMALLEREQ", "GREATEREQ", 
			"NOT_EQUAL", "DOUBLE_EQUAL", "EQPLUS", "EQMINUS", "STAR_EQUAL", "SLASH_EQUAL", 
			"EQUALS", "COMMA", "DOT", "COLON", "DOUBLE_COLON", "UNDERSCORE", "DOUBLEQ", 
			"QUOTE", "APOSTROPHE", "LBRACK", "RBRACK", "LCURLY", "RCURLY", "TILDE", 
			"SPACE", "STRINGVALUE", "CAPITAL_STRING", "INTVALUE", "FLOATVALUE", "WORD", 
			"ARRAY", "ARRAY_VALUE", "VECTOR_VALUE", "VECTOR_REF"
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
	public String getGrammarFileName() { return "AntlrProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AntlrProjectParser.EOF, 0); }
		public List<ImmportContext> immport() {
			return getRuleContexts(ImmportContext.class);
		}
		public ImmportContext immport(int i) {
			return getRuleContext(ImmportContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==REQUIRE) {
				{
				{
				setState(36);
				immport();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			statement();
			setState(43);
			match(EOF);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(AntlrProjectParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(AntlrProjectParser.BREAK, i);
		}
		public List<IfContext> if_() {
			return getRuleContexts(IfContext.class);
		}
		public IfContext if_(int i) {
			return getRuleContext(IfContext.class,i);
		}
		public List<WhileContext> while_() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while_(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<DowhileContext> dowhile() {
			return getRuleContexts(DowhileContext.class);
		}
		public DowhileContext dowhile(int i) {
			return getRuleContext(DowhileContext.class,i);
		}
		public List<ForContext> for_() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for_(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public List<SwitchcaseContext> switchcase() {
			return getRuleContexts(SwitchcaseContext.class);
		}
		public SwitchcaseContext switchcase(int i) {
			return getRuleContext(SwitchcaseContext.class,i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ExceptionContext> exception() {
			return getRuleContexts(ExceptionContext.class);
		}
		public ExceptionContext exception(int i) {
			return getRuleContext(ExceptionContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public List<TerminalNode> DOUBLE_PLUS() { return getTokens(AntlrProjectParser.DOUBLE_PLUS); }
		public TerminalNode DOUBLE_PLUS(int i) {
			return getToken(AntlrProjectParser.DOUBLE_PLUS, i);
		}
		public List<TerminalNode> DOUBLE_MINUS() { return getTokens(AntlrProjectParser.DOUBLE_MINUS); }
		public TerminalNode DOUBLE_MINUS(int i) {
			return getToken(AntlrProjectParser.DOUBLE_MINUS, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(45);
						variable();
						}
						break;
					case 2:
						{
						setState(46);
						experssion(0);
						}
						break;
					case 3:
						{
						setState(47);
						match(BREAK);
						}
						break;
					case 4:
						{
						setState(48);
						if_();
						}
						break;
					case 5:
						{
						setState(49);
						while_();
						}
						break;
					case 6:
						{
						setState(50);
						dowhile();
						}
						break;
					case 7:
						{
						setState(51);
						for_();
						}
						break;
					case 8:
						{
						setState(52);
						switchcase();
						}
						break;
					case 9:
						{
						setState(53);
						class_();
						}
						break;
					case 10:
						{
						setState(54);
						arrow();
						}
						break;
					case 11:
						{
						setState(55);
						function();
						}
						break;
					case 12:
						{
						setState(56);
						exception();
						}
						break;
					case 13:
						{
						setState(57);
						call();
						}
						break;
					case 14:
						{
						setState(58);
						match(STRINGVALUE);
						setState(59);
						_la = _input.LA(1);
						if ( !(_la==DOUBLE_PLUS || _la==DOUBLE_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_statementContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(AntlrProjectParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(AntlrProjectParser.BREAK, i);
		}
		public List<IfContext> if_() {
			return getRuleContexts(IfContext.class);
		}
		public IfContext if_(int i) {
			return getRuleContext(IfContext.class,i);
		}
		public List<WhileContext> while_() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while_(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<DowhileContext> dowhile() {
			return getRuleContexts(DowhileContext.class);
		}
		public DowhileContext dowhile(int i) {
			return getRuleContext(DowhileContext.class,i);
		}
		public List<ForContext> for_() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for_(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public List<SwitchcaseContext> switchcase() {
			return getRuleContexts(SwitchcaseContext.class);
		}
		public SwitchcaseContext switchcase(int i) {
			return getRuleContext(SwitchcaseContext.class,i);
		}
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public List<ExceptionContext> exception() {
			return getRuleContexts(ExceptionContext.class);
		}
		public ExceptionContext exception(int i) {
			return getRuleContext(ExceptionContext.class,i);
		}
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public List<TerminalNode> DOUBLE_PLUS() { return getTokens(AntlrProjectParser.DOUBLE_PLUS); }
		public TerminalNode DOUBLE_PLUS(int i) {
			return getToken(AntlrProjectParser.DOUBLE_PLUS, i);
		}
		public List<TerminalNode> DOUBLE_MINUS() { return getTokens(AntlrProjectParser.DOUBLE_MINUS); }
		public TerminalNode DOUBLE_MINUS(int i) {
			return getToken(AntlrProjectParser.DOUBLE_MINUS, i);
		}
		public Class_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterClass_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitClass_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitClass_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statementContext class_statement() throws RecognitionException {
		Class_statementContext _localctx = new Class_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114913260872285744L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 14847836161L) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(65);
					variable();
					}
					break;
				case 2:
					{
					setState(66);
					experssion(0);
					}
					break;
				case 3:
					{
					setState(67);
					match(BREAK);
					}
					break;
				case 4:
					{
					setState(68);
					if_();
					}
					break;
				case 5:
					{
					setState(69);
					while_();
					}
					break;
				case 6:
					{
					setState(70);
					dowhile();
					}
					break;
				case 7:
					{
					setState(71);
					for_();
					}
					break;
				case 8:
					{
					setState(72);
					switchcase();
					}
					break;
				case 9:
					{
					setState(73);
					arrow();
					}
					break;
				case 10:
					{
					setState(74);
					exception();
					}
					break;
				case 11:
					{
					setState(75);
					match(STRINGVALUE);
					setState(76);
					_la = _input.LA(1);
					if ( !(_la==DOUBLE_PLUS || _la==DOUBLE_MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				setState(81);
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
	public static class ImmportContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AntlrProjectParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(AntlrProjectParser.FROM, 0); }
		public TerminalNode LPAREN() { return getToken(AntlrProjectParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AntlrProjectParser.RPAREN, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(AntlrProjectParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> COLON() { return getTokens(AntlrProjectParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AntlrProjectParser.COLON, i);
		}
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AntlrProjectParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AntlrProjectParser.DOT, i);
		}
		public TerminalNode COMMA() { return getToken(AntlrProjectParser.COMMA, 0); }
		public TerminalNode REQUIRE() { return getToken(AntlrProjectParser.REQUIRE, 0); }
		public ImmportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterImmport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitImmport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitImmport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmportContext immport() throws RecognitionException {
		ImmportContext _localctx = new ImmportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_immport);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(IMPORT);
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOUBLE_COLON:
					{
					setState(83);
					match(DOUBLE_COLON);
					}
					break;
				case COLON:
					{
					setState(84);
					match(COLON);
					setState(85);
					match(COLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88);
				match(FROM);
				setState(89);
				match(LPAREN);
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(90);
					match(STRINGVALUE);
					setState(91);
					match(DOT);
					setState(92);
					match(STRINGVALUE);
					}
					break;
				case 2:
					{
					setState(93);
					match(STRINGVALUE);
					setState(94);
					match(DOT);
					setState(95);
					match(STRINGVALUE);
					setState(96);
					match(COMMA);
					setState(97);
					match(STRINGVALUE);
					setState(98);
					match(DOT);
					setState(99);
					match(STRINGVALUE);
					}
					break;
				}
				setState(102);
				match(RPAREN);
				}
				break;
			case REQUIRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(REQUIRE);
				setState(104);
				match(LPAREN);
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(105);
					match(STRINGVALUE);
					}
					break;
				case 2:
					{
					setState(106);
					match(STRINGVALUE);
					setState(107);
					match(COMMA);
					setState(108);
					match(STRINGVALUE);
					}
					break;
				}
				setState(111);
				match(RPAREN);
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
	public static class ExperssionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AntlrProjectParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AntlrProjectParser.RPAREN, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public TerminalNode TILDE() { return getToken(AntlrProjectParser.TILDE, 0); }
		public TerminalNode PLUS() { return getToken(AntlrProjectParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AntlrProjectParser.MINUS, 0); }
		public TerminalNode DOUBLE_PLUS() { return getToken(AntlrProjectParser.DOUBLE_PLUS, 0); }
		public TerminalNode DOUBLE_MINUS() { return getToken(AntlrProjectParser.DOUBLE_MINUS, 0); }
		public TerminalNode EX_MARK() { return getToken(AntlrProjectParser.EX_MARK, 0); }
		public TerminalNode INTVALUE() { return getToken(AntlrProjectParser.INTVALUE, 0); }
		public TerminalNode FLOATVALUE() { return getToken(AntlrProjectParser.FLOATVALUE, 0); }
		public TerminalNode TRUE() { return getToken(AntlrProjectParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AntlrProjectParser.FALSE, 0); }
		public TerminalNode STRINGVALUE() { return getToken(AntlrProjectParser.STRINGVALUE, 0); }
		public TerminalNode WORD() { return getToken(AntlrProjectParser.WORD, 0); }
		public TerminalNode ARRAY_VALUE() { return getToken(AntlrProjectParser.ARRAY_VALUE, 0); }
		public TerminalNode VECTOR_VALUE() { return getToken(AntlrProjectParser.VECTOR_VALUE, 0); }
		public TerminalNode DOUBLE_STAR() { return getToken(AntlrProjectParser.DOUBLE_STAR, 0); }
		public TerminalNode STAR() { return getToken(AntlrProjectParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(AntlrProjectParser.SLASH, 0); }
		public TerminalNode DOUBLE_SLASH() { return getToken(AntlrProjectParser.DOUBLE_SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(AntlrProjectParser.PERCENT, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(AntlrProjectParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(AntlrProjectParser.RIGHT_SHIFT, 0); }
		public TerminalNode AMPERSAND() { return getToken(AntlrProjectParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(AntlrProjectParser.PIPE, 0); }
		public TerminalNode CARET() { return getToken(AntlrProjectParser.CARET, 0); }
		public TerminalNode DOUBLE_EQUAL() { return getToken(AntlrProjectParser.DOUBLE_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AntlrProjectParser.NOT_EQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(AntlrProjectParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(AntlrProjectParser.GREATER, 0); }
		public TerminalNode SMALLEREQ() { return getToken(AntlrProjectParser.SMALLEREQ, 0); }
		public TerminalNode GREATEREQ() { return getToken(AntlrProjectParser.GREATEREQ, 0); }
		public TerminalNode AND() { return getToken(AntlrProjectParser.AND, 0); }
		public TerminalNode OR() { return getToken(AntlrProjectParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(AntlrProjectParser.EQUALS, 0); }
		public TerminalNode EQPLUS() { return getToken(AntlrProjectParser.EQPLUS, 0); }
		public TerminalNode EQMINUS() { return getToken(AntlrProjectParser.EQMINUS, 0); }
		public TerminalNode STAR_EQUAL() { return getToken(AntlrProjectParser.STAR_EQUAL, 0); }
		public TerminalNode SLASH_EQUAL() { return getToken(AntlrProjectParser.SLASH_EQUAL, 0); }
		public ExperssionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experssion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterExperssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitExperssion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitExperssion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExperssionContext experssion() throws RecognitionException {
		return experssion(0);
	}

	private ExperssionContext experssion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExperssionContext _localctx = new ExperssionContext(_ctx, _parentState);
		ExperssionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_experssion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(115);
				match(LPAREN);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114912160852738048L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 14847836161L) != 0)) {
					{
					setState(116);
					experssion(0);
					}
				}

				setState(119);
				match(RPAREN);
				}
				break;
			case TILDE:
				{
				setState(120);
				match(TILDE);
				setState(121);
				experssion(22);
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				experssion(21);
				}
				break;
			case DOUBLE_PLUS:
			case DOUBLE_MINUS:
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE_PLUS || _la==DOUBLE_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				experssion(19);
				}
				break;
			case EX_MARK:
				{
				setState(126);
				match(EX_MARK);
				setState(127);
				experssion(11);
				}
				break;
			case INTVALUE:
				{
				setState(128);
				match(INTVALUE);
				}
				break;
			case FLOATVALUE:
				{
				setState(129);
				match(FLOATVALUE);
				}
				break;
			case TRUE:
				{
				setState(130);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(131);
				match(FALSE);
				}
				break;
			case STRINGVALUE:
				{
				setState(132);
				match(STRINGVALUE);
				}
				break;
			case WORD:
				{
				setState(133);
				match(WORD);
				}
				break;
			case ARRAY_VALUE:
				{
				setState(134);
				match(ARRAY_VALUE);
				}
				break;
			case VECTOR_VALUE:
				{
				setState(135);
				match(VECTOR_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(138);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(139);
						match(DOUBLE_STAR);
						setState(140);
						experssion(24);
						}
						break;
					case 2:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(141);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(142);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3314649325744685056L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						experssion(19);
						}
						break;
					case 3:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(144);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						experssion(18);
						}
						break;
					case 4:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(147);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(148);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						experssion(17);
						}
						break;
					case 5:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(150);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(151);
						_la = _input.LA(1);
						if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 20481L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						experssion(16);
						}
						break;
					case 6:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(153);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(154);
						_la = _input.LA(1);
						if ( !(_la==NOT_EQUAL || _la==DOUBLE_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						experssion(15);
						}
						break;
					case 7:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(156);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(157);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 15L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						experssion(14);
						}
						break;
					case 8:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(159);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(160);
						experssion(13);
						}
						break;
					case 9:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(161);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(162);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						experssion(11);
						}
						break;
					case 10:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(164);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(165);
						_la = _input.LA(1);
						if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 31L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						experssion(10);
						}
						break;
					case 11:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(167);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(168);
						match(LPAREN);
						setState(169);
						experssion(0);
						setState(170);
						match(RPAREN);
						}
						break;
					case 12:
						{
						_localctx = new ExperssionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_experssion);
						setState(172);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(173);
						_la = _input.LA(1);
						if ( !(_la==DOUBLE_PLUS || _la==DOUBLE_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AntlrProjectParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(AntlrProjectParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(AntlrProjectParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(AntlrProjectParser.STRING, 0); }
		public TerminalNode CONST() { return getToken(AntlrProjectParser.CONST, 0); }
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public TerminalNode SMALLEREQ() { return getToken(AntlrProjectParser.SMALLEREQ, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public TerminalNode PUBLIC() { return getToken(AntlrProjectParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AntlrProjectParser.PRIVATE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			int _alt;
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(179);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(182);
					match(CONST);
					}
				}

				setState(185);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(186);
						match(STRINGVALUE);
						setState(189);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case COMMA:
							{
							setState(187);
							match(COMMA);
							}
							break;
						case EOF:
						case PUBLIC:
						case PRIVATE:
						case FOR:
						case CONST:
						case WHILE:
						case DO:
						case IF:
						case ELSE:
						case RETURN:
						case CASE:
						case BREAK:
						case CONSTRUCTOR:
						case TRY:
						case EXCEPT:
						case FI:
						case INT:
						case FLOAT:
						case BOOL:
						case STRING:
						case TRUE:
						case FALSE:
						case DONE:
						case ASLONGAS:
						case WHEN:
						case END:
						case VECTOR:
						case ATSIGN:
						case LPAREN:
						case DOUBLE_PLUS:
						case DOUBLE_MINUS:
						case PLUS:
						case MINUS:
						case EX_MARK:
						case SMALLEREQ:
						case TILDE:
						case STRINGVALUE:
						case INTVALUE:
						case FLOATVALUE:
						case WORD:
						case ARRAY_VALUE:
						case VECTOR_VALUE:
							{
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(193); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMALLEREQ) {
					{
					setState(195);
					match(SMALLEREQ);
					}
				}

				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						experssion(0);
						setState(201);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case COMMA:
							{
							setState(199);
							match(COMMA);
							}
							break;
						case EOF:
						case PUBLIC:
						case PRIVATE:
						case FOR:
						case CONST:
						case WHILE:
						case DO:
						case IF:
						case ELSE:
						case RETURN:
						case CASE:
						case BREAK:
						case CONSTRUCTOR:
						case TRY:
						case EXCEPT:
						case FI:
						case INT:
						case FLOAT:
						case BOOL:
						case STRING:
						case TRUE:
						case FALSE:
						case DONE:
						case ASLONGAS:
						case WHEN:
						case END:
						case VECTOR:
						case ATSIGN:
						case LPAREN:
						case DOUBLE_PLUS:
						case DOUBLE_MINUS:
						case PLUS:
						case MINUS:
						case EX_MARK:
						case TILDE:
						case STRINGVALUE:
						case INTVALUE:
						case FLOATVALUE:
						case WORD:
						case ARRAY_VALUE:
						case VECTOR_VALUE:
							{
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				vector();
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode STRINGVALUE() { return getToken(AntlrProjectParser.STRINGVALUE, 0); }
		public TerminalNode NEW() { return getToken(AntlrProjectParser.NEW, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AntlrProjectParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AntlrProjectParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AntlrProjectParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AntlrProjectParser.RBRACK, i);
		}
		public TerminalNode SMALLEREQ() { return getToken(AntlrProjectParser.SMALLEREQ, 0); }
		public List<TerminalNode> INT() { return getTokens(AntlrProjectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AntlrProjectParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(AntlrProjectParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(AntlrProjectParser.FLOAT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(AntlrProjectParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(AntlrProjectParser.BOOL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AntlrProjectParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AntlrProjectParser.STRING, i);
		}
		public TerminalNode ARRAY_VALUE() { return getToken(AntlrProjectParser.ARRAY_VALUE, 0); }
		public TerminalNode CONST() { return getToken(AntlrProjectParser.CONST, 0); }
		public TerminalNode PUBLIC() { return getToken(AntlrProjectParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AntlrProjectParser.PRIVATE, 0); }
		public TerminalNode INTVALUE() { return getToken(AntlrProjectParser.INTVALUE, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(212);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(215);
					match(CONST);
					}
				}

				setState(218);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				match(STRINGVALUE);
				setState(220);
				match(NEW);
				setState(221);
				match(LBRACK);
				setState(222);
				match(RBRACK);
				setState(223);
				match(SMALLEREQ);
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
					{
					{
					setState(224);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(225);
					match(LBRACK);
					setState(226);
					match(INTVALUE);
					setState(227);
					match(RBRACK);
					}
					}
					break;
				case ARRAY_VALUE:
					{
					setState(228);
					match(ARRAY_VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(231);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(234);
					match(CONST);
					}
				}

				setState(237);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				match(STRINGVALUE);
				setState(239);
				match(LBRACK);
				setState(240);
				match(RBRACK);
				setState(241);
				match(SMALLEREQ);
				setState(242);
				match(LBRACK);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114912160852738048L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 14847836161L) != 0)) {
					{
					{
					setState(243);
					experssion(0);
					setState(246);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(244);
						match(COMMA);
						}
						break;
					case TRUE:
					case FALSE:
					case LPAREN:
					case DOUBLE_PLUS:
					case DOUBLE_MINUS:
					case PLUS:
					case MINUS:
					case EX_MARK:
					case RBRACK:
					case TILDE:
					case STRINGVALUE:
					case INTVALUE:
					case FLOATVALUE:
					case WORD:
					case ARRAY_VALUE:
					case VECTOR_VALUE:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(RBRACK);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AntlrProjectParser.IF, 0); }
		public TerminalNode LBRACK() { return getToken(AntlrProjectParser.LBRACK, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AntlrProjectParser.RBRACK, 0); }
		public TerminalNode THEN() { return getToken(AntlrProjectParser.THEN, 0); }
		public TerminalNode FI() { return getToken(AntlrProjectParser.FI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(AntlrProjectParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(AntlrProjectParser.BREAK, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(AntlrProjectParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(AntlrProjectParser.RETURN, i);
		}
		public TerminalNode ELSE() { return getToken(AntlrProjectParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(IF);
			setState(257);
			match(LBRACK);
			setState(258);
			experssion(0);
			setState(259);
			match(RBRACK);
			setState(260);
			match(THEN);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(261);
				statement();
				}
				break;
			}
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(264);
				match(BREAK);
				}
				break;
			}
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(267);
				match(RETURN);
				setState(268);
				experssion(0);
				}
				break;
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(271);
				match(ELSE);
				}
			}

			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(274);
				statement();
				}
				break;
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(277);
				match(BREAK);
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(280);
				match(RETURN);
				setState(281);
				experssion(0);
				}
			}

			setState(284);
			match(FI);
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AntlrProjectParser.WHILE, 0); }
		public TerminalNode LBRACK() { return getToken(AntlrProjectParser.LBRACK, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AntlrProjectParser.RBRACK, 0); }
		public TerminalNode DO() { return getToken(AntlrProjectParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DONE() { return getToken(AntlrProjectParser.DONE, 0); }
		public TerminalNode BREAK() { return getToken(AntlrProjectParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(AntlrProjectParser.RETURN, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(WHILE);
			setState(287);
			match(LBRACK);
			setState(288);
			experssion(0);
			setState(289);
			match(RBRACK);
			setState(290);
			match(DO);
			setState(291);
			statement();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(292);
				match(BREAK);
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(295);
				match(RETURN);
				setState(296);
				experssion(0);
				}
			}

			setState(299);
			match(DONE);
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
	public static class DowhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AntlrProjectParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ASLONGAS() { return getToken(AntlrProjectParser.ASLONGAS, 0); }
		public TerminalNode LBRACK() { return getToken(AntlrProjectParser.LBRACK, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AntlrProjectParser.RBRACK, 0); }
		public TerminalNode BREAK() { return getToken(AntlrProjectParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(AntlrProjectParser.RETURN, 0); }
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(DO);
			setState(302);
			statement();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(303);
				match(BREAK);
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(306);
				match(RETURN);
				setState(307);
				experssion(0);
				}
			}

			setState(310);
			match(ASLONGAS);
			setState(311);
			match(LBRACK);
			setState(312);
			experssion(0);
			setState(313);
			match(RBRACK);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AntlrProjectParser.FOR, 0); }
		public TerminalNode DOUBLE_LPAREN() { return getToken(AntlrProjectParser.DOUBLE_LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AntlrProjectParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AntlrProjectParser.SEMI, i);
		}
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public TerminalNode DOUBLE_RPAREN() { return getToken(AntlrProjectParser.DOUBLE_RPAREN, 0); }
		public TerminalNode DO() { return getToken(AntlrProjectParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DONE() { return getToken(AntlrProjectParser.DONE, 0); }
		public TerminalNode EQUALS() { return getToken(AntlrProjectParser.EQUALS, 0); }
		public TerminalNode BREAK() { return getToken(AntlrProjectParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(AntlrProjectParser.RETURN, 0); }
		public TerminalNode INT() { return getToken(AntlrProjectParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(AntlrProjectParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(AntlrProjectParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(AntlrProjectParser.STRING, 0); }
		public TerminalNode ARRAY_VALUE() { return getToken(AntlrProjectParser.ARRAY_VALUE, 0); }
		public TerminalNode VECTOR_VALUE() { return getToken(AntlrProjectParser.VECTOR_VALUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FOR);
			setState(316);
			match(DOUBLE_LPAREN);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) || _la==ARRAY_VALUE || _la==VECTOR_VALUE) {
				{
				setState(317);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) || _la==ARRAY_VALUE || _la==VECTOR_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRINGVALUE) {
					{
					{
					setState(318);
					match(STRINGVALUE);
					setState(321);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(319);
						match(COMMA);
						}
						break;
					case EQUALS:
					case STRINGVALUE:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(EQUALS);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114912160852738048L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 14847836161L) != 0)) {
					{
					{
					setState(329);
					experssion(0);
					setState(332);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(330);
						match(COMMA);
						}
						break;
					case TRUE:
					case FALSE:
					case SEMI:
					case LPAREN:
					case DOUBLE_PLUS:
					case DOUBLE_MINUS:
					case PLUS:
					case MINUS:
					case EX_MARK:
					case TILDE:
					case STRINGVALUE:
					case INTVALUE:
					case FLOATVALUE:
					case WORD:
					case ARRAY_VALUE:
					case VECTOR_VALUE:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(341);
			match(SEMI);
			setState(342);
			experssion(0);
			setState(343);
			match(SEMI);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114912160852738048L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 14847836161L) != 0)) {
				{
				{
				setState(344);
				experssion(0);
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(345);
					match(COMMA);
					}
					break;
				case TRUE:
				case FALSE:
				case LPAREN:
				case DOUBLE_RPAREN:
				case DOUBLE_PLUS:
				case DOUBLE_MINUS:
				case PLUS:
				case MINUS:
				case EX_MARK:
				case TILDE:
				case STRINGVALUE:
				case INTVALUE:
				case FLOATVALUE:
				case WORD:
				case ARRAY_VALUE:
				case VECTOR_VALUE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(DOUBLE_RPAREN);
			setState(355);
			match(DO);
			setState(356);
			statement();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(357);
				match(BREAK);
				}
			}

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(360);
				match(RETURN);
				setState(361);
				experssion(0);
				}
			}

			setState(364);
			match(DONE);
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
	public static class SwitchcaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AntlrProjectParser.CASE, 0); }
		public ExperssionContext experssion() {
			return getRuleContext(ExperssionContext.class,0);
		}
		public TerminalNode END() { return getToken(AntlrProjectParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(AntlrProjectParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(AntlrProjectParser.WHEN, i);
		}
		public List<TerminalNode> WORD() { return getTokens(AntlrProjectParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AntlrProjectParser.WORD, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AntlrProjectParser.ELSE, 0); }
		public SwitchcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterSwitchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitSwitchcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitSwitchcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchcaseContext switchcase() throws RecognitionException {
		SwitchcaseContext _localctx = new SwitchcaseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switchcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(CASE);
			setState(367);
			experssion(0);
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				match(WHEN);
				setState(369);
				match(WORD);
				setState(370);
				statement();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(375);
				match(ELSE);
				setState(376);
				statement();
				}
			}

			setState(379);
			match(END);
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
	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public TerminalNode ARROW() { return getToken(AntlrProjectParser.ARROW, 0); }
		public TerminalNode FUNCTION() { return getToken(AntlrProjectParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(AntlrProjectParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AntlrProjectParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(AntlrProjectParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AntlrProjectParser.COLON, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode END() { return getToken(AntlrProjectParser.END, 0); }
		public TerminalNode PUBLIC() { return getToken(AntlrProjectParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AntlrProjectParser.PRIVATE, 0); }
		public List<TerminalNode> INT() { return getTokens(AntlrProjectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AntlrProjectParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(AntlrProjectParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(AntlrProjectParser.FLOAT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(AntlrProjectParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(AntlrProjectParser.BOOL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AntlrProjectParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AntlrProjectParser.STRING, i);
		}
		public List<TerminalNode> ARRAY() { return getTokens(AntlrProjectParser.ARRAY); }
		public TerminalNode ARRAY(int i) {
			return getToken(AntlrProjectParser.ARRAY, i);
		}
		public List<TerminalNode> VECTOR_REF() { return getTokens(AntlrProjectParser.VECTOR_REF); }
		public TerminalNode VECTOR_REF(int i) {
			return getToken(AntlrProjectParser.VECTOR_REF, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(STRINGVALUE);
			setState(382);
			match(ARROW);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(383);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(386);
			match(FUNCTION);
			setState(387);
			match(LPAREN);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) || _la==ARRAY || _la==VECTOR_REF) {
				{
				{
				setState(388);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) || _la==ARRAY || _la==VECTOR_REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(389);
				match(COLON);
				setState(390);
				match(STRINGVALUE);
				setState(393);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(391);
					match(COMMA);
					}
					break;
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
				case RPAREN:
				case ARRAY:
				case VECTOR_REF:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(RPAREN);
			setState(401);
			match(COLON);
			setState(402);
			statement();
			setState(403);
			match(END);
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ATSIGN() { return getToken(AntlrProjectParser.ATSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(AntlrProjectParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AntlrProjectParser.RPAREN, 0); }
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(AntlrProjectParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(AntlrProjectParser.WORD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ATSIGN);
			setState(406);
			_la = _input.LA(1);
			if ( !(_la==STRINGVALUE || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(407);
			match(LPAREN);
			{
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRINGVALUE || _la==WORD) {
				{
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==STRINGVALUE || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(409);
					match(COMMA);
					setState(410);
					match(STRINGVALUE);
					}
					break;
				}
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(413);
					match(COMMA);
					}
					break;
				case RPAREN:
				case STRINGVALUE:
				case WORD:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(422);
			match(RPAREN);
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AntlrProjectParser.CLASS, 0); }
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public TerminalNode INHERITED() { return getToken(AntlrProjectParser.INHERITED, 0); }
		public TerminalNode FROM() { return getToken(AntlrProjectParser.FROM, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(AntlrProjectParser.CONSTRUCTOR, 0); }
		public TerminalNode ARROW() { return getToken(AntlrProjectParser.ARROW, 0); }
		public TerminalNode FUNCTION() { return getToken(AntlrProjectParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(AntlrProjectParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AntlrProjectParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(AntlrProjectParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode END() { return getToken(AntlrProjectParser.END, 0); }
		public TerminalNode END_CLASS() { return getToken(AntlrProjectParser.END_CLASS, 0); }
		public TerminalNode PUBLIC() { return getToken(AntlrProjectParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AntlrProjectParser.PRIVATE, 0); }
		public Class_statementContext class_statement() {
			return getRuleContext(Class_statementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public List<TerminalNode> INT() { return getTokens(AntlrProjectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AntlrProjectParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(AntlrProjectParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(AntlrProjectParser.FLOAT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(AntlrProjectParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(AntlrProjectParser.BOOL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AntlrProjectParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AntlrProjectParser.STRING, i);
		}
		public List<TerminalNode> ARRAY() { return getTokens(AntlrProjectParser.ARRAY); }
		public TerminalNode ARRAY(int i) {
			return getToken(AntlrProjectParser.ARRAY, i);
		}
		public List<TerminalNode> VECTOR_REF() { return getTokens(AntlrProjectParser.VECTOR_REF); }
		public TerminalNode VECTOR_REF(int i) {
			return getToken(AntlrProjectParser.VECTOR_REF, i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_class);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !(_la==PUBLIC || _la==PRIVATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(425);
			match(CLASS);
			setState(426);
			match(STRINGVALUE);
			setState(427);
			match(INHERITED);
			setState(428);
			match(FROM);
			setState(434); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(429);
					match(STRINGVALUE);
					setState(432);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(430);
						match(COMMA);
						}
						break;
					case PUBLIC:
					case PRIVATE:
					case FOR:
					case CONST:
					case WHILE:
					case DO:
					case IF:
					case CASE:
					case BREAK:
					case CONSTRUCTOR:
					case TRY:
					case INT:
					case FLOAT:
					case BOOL:
					case STRING:
					case TRUE:
					case FALSE:
					case VECTOR:
					case LPAREN:
					case DOUBLE_PLUS:
					case DOUBLE_MINUS:
					case PLUS:
					case MINUS:
					case EX_MARK:
					case TILDE:
					case STRINGVALUE:
					case INTVALUE:
					case FLOATVALUE:
					case WORD:
					case ARRAY_VALUE:
					case VECTOR_VALUE:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(436); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(438);
				class_statement();
				}
				break;
			}
			setState(441);
			match(CONSTRUCTOR);
			setState(442);
			match(STRINGVALUE);
			setState(443);
			match(ARROW);
			setState(444);
			match(FUNCTION);
			setState(445);
			match(LPAREN);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) || _la==ARRAY || _la==VECTOR_REF) {
				{
				{
				setState(446);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) || _la==ARRAY || _la==VECTOR_REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(447);
				match(STRINGVALUE);
				setState(450);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(448);
					match(COMMA);
					}
					break;
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
				case RPAREN:
				case ARRAY:
				case VECTOR_REF:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(457);
			match(RPAREN);
			setState(458);
			match(COLON);
			setState(459);
			statement();
			setState(460);
			match(END);
			setState(461);
			match(END_CLASS);
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
	public static class ArrowContext extends ParserRuleContext {
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public TerminalNode ARROW() { return getToken(AntlrProjectParser.ARROW, 0); }
		public TerminalNode NEW() { return getToken(AntlrProjectParser.NEW, 0); }
		public TerminalNode LBRACK() { return getToken(AntlrProjectParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AntlrProjectParser.RBRACK, 0); }
		public TerminalNode PUBLIC() { return getToken(AntlrProjectParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AntlrProjectParser.PRIVATE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(463);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(466);
			match(STRINGVALUE);
			setState(467);
			match(STRINGVALUE);
			setState(468);
			match(ARROW);
			setState(469);
			match(NEW);
			setState(470);
			match(STRINGVALUE);
			setState(471);
			match(LBRACK);
			setState(477); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(472);
				match(STRINGVALUE);
				setState(475);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(473);
					match(COMMA);
					}
					break;
				case RBRACK:
				case STRINGVALUE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRINGVALUE );
			setState(481);
			match(RBRACK);
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
	public static class ExceptionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AntlrProjectParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(AntlrProjectParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AntlrProjectParser.COLON, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EXCEPT() { return getToken(AntlrProjectParser.EXCEPT, 0); }
		public List<TerminalNode> STRINGVALUE() { return getTokens(AntlrProjectParser.STRINGVALUE); }
		public TerminalNode STRINGVALUE(int i) {
			return getToken(AntlrProjectParser.STRINGVALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public ExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionContext exception() throws RecognitionException {
		ExceptionContext _localctx = new ExceptionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exception);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(TRY);
			setState(484);
			match(COLON);
			setState(485);
			statement();
			setState(486);
			match(EXCEPT);
			setState(492); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(487);
				match(STRINGVALUE);
				setState(490);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(488);
					match(COMMA);
					}
					break;
				case COLON:
				case STRINGVALUE:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(494); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRINGVALUE );
			setState(496);
			match(COLON);
			setState(497);
			statement();
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
	public static class VectorContext extends ParserRuleContext {
		public List<TerminalNode> VECTOR() { return getTokens(AntlrProjectParser.VECTOR); }
		public TerminalNode VECTOR(int i) {
			return getToken(AntlrProjectParser.VECTOR, i);
		}
		public List<TerminalNode> SMALLER() { return getTokens(AntlrProjectParser.SMALLER); }
		public TerminalNode SMALLER(int i) {
			return getToken(AntlrProjectParser.SMALLER, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(AntlrProjectParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(AntlrProjectParser.GREATER, i);
		}
		public TerminalNode STRINGVALUE() { return getToken(AntlrProjectParser.STRINGVALUE, 0); }
		public TerminalNode SMALLEREQ() { return getToken(AntlrProjectParser.SMALLEREQ, 0); }
		public TerminalNode NEW() { return getToken(AntlrProjectParser.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(AntlrProjectParser.LPAREN, 0); }
		public TerminalNode INTVALUE() { return getToken(AntlrProjectParser.INTVALUE, 0); }
		public TerminalNode RPAREN() { return getToken(AntlrProjectParser.RPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(AntlrProjectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AntlrProjectParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(AntlrProjectParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(AntlrProjectParser.FLOAT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(AntlrProjectParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(AntlrProjectParser.BOOL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AntlrProjectParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AntlrProjectParser.STRING, i);
		}
		public TerminalNode CONST() { return getToken(AntlrProjectParser.CONST, 0); }
		public TerminalNode PUBLIC() { return getToken(AntlrProjectParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AntlrProjectParser.PRIVATE, 0); }
		public TerminalNode LBRACK() { return getToken(AntlrProjectParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AntlrProjectParser.RBRACK, 0); }
		public List<ExperssionContext> experssion() {
			return getRuleContexts(ExperssionContext.class);
		}
		public ExperssionContext experssion(int i) {
			return getRuleContext(ExperssionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AntlrProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AntlrProjectParser.COMMA, i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrProjectListener ) ((AntlrProjectListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrProjectVisitor ) return ((AntlrProjectVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vector);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(499);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(502);
					match(CONST);
					}
				}

				setState(505);
				match(VECTOR);
				setState(506);
				match(SMALLER);
				setState(507);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				match(GREATER);
				setState(509);
				match(STRINGVALUE);
				setState(510);
				match(SMALLEREQ);
				setState(511);
				match(NEW);
				setState(512);
				match(VECTOR);
				setState(513);
				match(SMALLER);
				setState(514);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(515);
				match(GREATER);
				setState(516);
				match(LPAREN);
				setState(517);
				match(INTVALUE);
				setState(518);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(519);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(522);
					match(CONST);
					}
				}

				setState(525);
				match(VECTOR);
				setState(526);
				match(SMALLER);
				setState(527);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(528);
				match(GREATER);
				setState(529);
				match(STRINGVALUE);
				setState(530);
				match(SMALLEREQ);
				setState(531);
				match(LBRACK);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114912160852738048L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 14847836161L) != 0)) {
					{
					{
					setState(532);
					experssion(0);
					setState(535);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(533);
						match(COMMA);
						}
						break;
					case TRUE:
					case FALSE:
					case LPAREN:
					case DOUBLE_PLUS:
					case DOUBLE_MINUS:
					case PLUS:
					case MINUS:
					case EX_MARK:
					case RBRACK:
					case TILDE:
					case STRINGVALUE:
					case INTVALUE:
					case FLOATVALUE:
					case WORD:
					case ARRAY_VALUE:
					case VECTOR_VALUE:
						{
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(542);
				match(RBRACK);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return experssion_sempred((ExperssionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean experssion_sempred(ExperssionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 24);
		case 11:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u0222\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001"+
		"@\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002Q\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"e\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0003\u0003\u0003"+
		"q\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0089"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00af\b\u0004\n\u0004\f\u0004\u00b2\t\u0004\u0001\u0005"+
		"\u0003\u0005\u00b5\b\u0005\u0001\u0005\u0003\u0005\u00b8\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00be\b\u0005\u0004"+
		"\u0005\u00c0\b\u0005\u000b\u0005\f\u0005\u00c1\u0001\u0005\u0003\u0005"+
		"\u00c5\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ca\b"+
		"\u0005\u0005\u0005\u00cc\b\u0005\n\u0005\f\u0005\u00cf\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00d3\b\u0005\u0001\u0006\u0003\u0006\u00d6\b"+
		"\u0006\u0001\u0006\u0003\u0006\u00d9\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e6\b\u0006\u0001\u0006\u0003"+
		"\u0006\u00e9\b\u0006\u0001\u0006\u0003\u0006\u00ec\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00f7\b\u0006\u0005\u0006\u00f9\b"+
		"\u0006\n\u0006\f\u0006\u00fc\t\u0006\u0001\u0006\u0003\u0006\u00ff\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0107\b\u0007\u0001\u0007\u0003\u0007\u010a\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u010e\b\u0007\u0001\u0007\u0003\u0007\u0111"+
		"\b\u0007\u0001\u0007\u0003\u0007\u0114\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0117\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u011b\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0126\b\b\u0001\b\u0001\b\u0003\b\u012a\b\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0131\b\t\u0001\t\u0001\t\u0003\t\u0135"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0142\b\n\u0005\n\u0144\b\n\n\n\f\n\u0147\t"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u014d\b\n\u0005\n\u014f\b\n"+
		"\n\n\f\n\u0152\t\n\u0003\n\u0154\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u015c\b\n\u0005\n\u015e\b\n\n\n\f\n\u0161\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0167\b\n\u0001\n\u0001\n\u0003\n\u016b"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0174\b\u000b\u000b\u000b\f\u000b\u0175\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u017a\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u0181\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u018a\b\f\u0005\f\u018c\b\f\n\f\f\f\u018f\t"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u019c\b\r\u0001\r\u0001\r\u0003\r\u01a0\b\r"+
		"\u0005\r\u01a2\b\r\n\r\f\r\u01a5\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01b1\b\u000e\u0004\u000e\u01b3\b\u000e\u000b\u000e"+
		"\f\u000e\u01b4\u0001\u000e\u0003\u000e\u01b8\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u01c3\b\u000e\u0005\u000e\u01c5\b\u000e"+
		"\n\u000e\f\u000e\u01c8\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u01d1\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01dc\b\u000f\u0004\u000f\u01de"+
		"\b\u000f\u000b\u000f\f\u000f\u01df\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01eb\b\u0010\u0004\u0010\u01ed\b\u0010\u000b\u0010\f\u0010"+
		"\u01ee\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u01f5"+
		"\b\u0011\u0001\u0011\u0003\u0011\u01f8\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0209\b\u0011\u0001\u0011\u0003\u0011\u020c\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0218"+
		"\b\u0011\u0005\u0011\u021a\b\u0011\n\u0011\f\u0011\u021d\t\u0011\u0001"+
		"\u0011\u0003\u0011\u0220\b\u0011\u0001\u0011\u0000\u0001\b\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u000e\u0001\u000034\u0001\u000078\u0002\u00009;==\u0001"+
		"\u000056\u0003\u000022>>@@\u0001\u0000GH\u0001\u0000CF\u0002\u0000??A"+
		"A\u0001\u0000IM\u0001\u0000\u0004\u0005\u0001\u0000\u0019\u001c\u0002"+
		"\u0000\u0019\u001cbc\u0003\u0000\u0019\u001caadd\u0002\u0000\\\\``\u0284"+
		"\u0000\'\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004"+
		"O\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\b\u0088\u0001"+
		"\u0000\u0000\u0000\n\u00d2\u0001\u0000\u0000\u0000\f\u00fe\u0001\u0000"+
		"\u0000\u0000\u000e\u0100\u0001\u0000\u0000\u0000\u0010\u011e\u0001\u0000"+
		"\u0000\u0000\u0012\u012d\u0001\u0000\u0000\u0000\u0014\u013b\u0001\u0000"+
		"\u0000\u0000\u0016\u016e\u0001\u0000\u0000\u0000\u0018\u017d\u0001\u0000"+
		"\u0000\u0000\u001a\u0195\u0001\u0000\u0000\u0000\u001c\u01a8\u0001\u0000"+
		"\u0000\u0000\u001e\u01d0\u0001\u0000\u0000\u0000 \u01e3\u0001\u0000\u0000"+
		"\u0000\"\u021f\u0001\u0000\u0000\u0000$&\u0003\u0006\u0003\u0000%$\u0001"+
		"\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000*+\u0003\u0002\u0001\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001"+
		"\u0000\u0000\u0000-=\u0003\n\u0005\u0000.=\u0003\b\u0004\u0000/=\u0005"+
		"\u0012\u0000\u00000=\u0003\u000e\u0007\u00001=\u0003\u0010\b\u00002=\u0003"+
		"\u0012\t\u00003=\u0003\u0014\n\u00004=\u0003\u0016\u000b\u00005=\u0003"+
		"\u001c\u000e\u00006=\u0003\u001e\u000f\u00007=\u0003\u0018\f\u00008=\u0003"+
		" \u0010\u00009=\u0003\u001a\r\u0000:;\u0005\\\u0000\u0000;=\u0007\u0000"+
		"\u0000\u0000<-\u0001\u0000\u0000\u0000<.\u0001\u0000\u0000\u0000</\u0001"+
		"\u0000\u0000\u0000<0\u0001\u0000\u0000\u0000<1\u0001\u0000\u0000\u0000"+
		"<2\u0001\u0000\u0000\u0000<3\u0001\u0000\u0000\u0000<4\u0001\u0000\u0000"+
		"\u0000<5\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000<7\u0001\u0000"+
		"\u0000\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AN\u0003\n\u0005\u0000BN\u0003\b\u0004\u0000CN\u0005\u0012"+
		"\u0000\u0000DN\u0003\u000e\u0007\u0000EN\u0003\u0010\b\u0000FN\u0003\u0012"+
		"\t\u0000GN\u0003\u0014\n\u0000HN\u0003\u0016\u000b\u0000IN\u0003\u001e"+
		"\u000f\u0000JN\u0003 \u0010\u0000KL\u0005\\\u0000\u0000LN\u0007\u0000"+
		"\u0000\u0000MA\u0001\u0000\u0000\u0000MB\u0001\u0000\u0000\u0000MC\u0001"+
		"\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000"+
		"MF\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000"+
		"\u0000MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RV\u0005\u0006\u0000\u0000SW\u0005Q\u0000\u0000TU\u0005P\u0000\u0000"+
		"UW\u0005P\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0005\b\u0000\u0000Yd\u0005.\u0000\u0000"+
		"Z[\u0005\\\u0000\u0000[\\\u0005O\u0000\u0000\\e\u0005\\\u0000\u0000]^"+
		"\u0005\\\u0000\u0000^_\u0005O\u0000\u0000_`\u0005\\\u0000\u0000`a\u0005"+
		"N\u0000\u0000ab\u0005\\\u0000\u0000bc\u0005O\u0000\u0000ce\u0005\\\u0000"+
		"\u0000dZ\u0001\u0000\u0000\u0000d]\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fq\u0005/\u0000\u0000gh\u0005\u0007\u0000\u0000hm\u0005.\u0000"+
		"\u0000in\u0005\\\u0000\u0000jk\u0005\\\u0000\u0000kl\u0005N\u0000\u0000"+
		"ln\u0005\\\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0005/\u0000\u0000pR\u0001\u0000\u0000\u0000"+
		"pg\u0001\u0000\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rs\u0006\u0004"+
		"\uffff\uffff\u0000su\u0005.\u0000\u0000tv\u0003\b\u0004\u0000ut\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w\u0089\u0005/\u0000\u0000xy\u0005Z\u0000\u0000y\u0089\u0003\b\u0004\u0016"+
		"z{\u0007\u0001\u0000\u0000{\u0089\u0003\b\u0004\u0015|}\u0007\u0000\u0000"+
		"\u0000}\u0089\u0003\b\u0004\u0013~\u007f\u0005B\u0000\u0000\u007f\u0089"+
		"\u0003\b\u0004\u000b\u0080\u0089\u0005^\u0000\u0000\u0081\u0089\u0005"+
		"_\u0000\u0000\u0082\u0089\u0005\u001d\u0000\u0000\u0083\u0089\u0005\u001e"+
		"\u0000\u0000\u0084\u0089\u0005\\\u0000\u0000\u0085\u0089\u0005`\u0000"+
		"\u0000\u0086\u0089\u0005b\u0000\u0000\u0087\u0089\u0005c\u0000\u0000\u0088"+
		"r\u0001\u0000\u0000\u0000\u0088x\u0001\u0000\u0000\u0000\u0088z\u0001"+
		"\u0000\u0000\u0000\u0088|\u0001\u0000\u0000\u0000\u0088~\u0001\u0000\u0000"+
		"\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000"+
		"\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000"+
		"\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u00b0\u0001\u0000\u0000\u0000\u008a\u008b\n\u0017\u0000\u0000"+
		"\u008b\u008c\u0005<\u0000\u0000\u008c\u00af\u0003\b\u0004\u0018\u008d"+
		"\u008e\n\u0012\u0000\u0000\u008e\u008f\u0007\u0002\u0000\u0000\u008f\u00af"+
		"\u0003\b\u0004\u0013\u0090\u0091\n\u0011\u0000\u0000\u0091\u0092\u0007"+
		"\u0001\u0000\u0000\u0092\u00af\u0003\b\u0004\u0012\u0093\u0094\n\u0010"+
		"\u0000\u0000\u0094\u0095\u0007\u0003\u0000\u0000\u0095\u00af\u0003\b\u0004"+
		"\u0011\u0096\u0097\n\u000f\u0000\u0000\u0097\u0098\u0007\u0004\u0000\u0000"+
		"\u0098\u00af\u0003\b\u0004\u0010\u0099\u009a\n\u000e\u0000\u0000\u009a"+
		"\u009b\u0007\u0005\u0000\u0000\u009b\u00af\u0003\b\u0004\u000f\u009c\u009d"+
		"\n\r\u0000\u0000\u009d\u009e\u0007\u0006\u0000\u0000\u009e\u00af\u0003"+
		"\b\u0004\u000e\u009f\u00a0\n\f\u0000\u0000\u00a0\u00af\u0003\b\u0004\r"+
		"\u00a1\u00a2\n\n\u0000\u0000\u00a2\u00a3\u0007\u0007\u0000\u0000\u00a3"+
		"\u00af\u0003\b\u0004\u000b\u00a4\u00a5\n\t\u0000\u0000\u00a5\u00a6\u0007"+
		"\b\u0000\u0000\u00a6\u00af\u0003\b\u0004\n\u00a7\u00a8\n\u0018\u0000\u0000"+
		"\u00a8\u00a9\u0005.\u0000\u0000\u00a9\u00aa\u0003\b\u0004\u0000\u00aa"+
		"\u00ab\u0005/\u0000\u0000\u00ab\u00af\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\n\u0014\u0000\u0000\u00ad\u00af\u0007\u0000\u0000\u0000\u00ae\u008a\u0001"+
		"\u0000\u0000\u0000\u00ae\u008d\u0001\u0000\u0000\u0000\u00ae\u0090\u0001"+
		"\u0000\u0000\u0000\u00ae\u0093\u0001\u0000\u0000\u0000\u00ae\u0096\u0001"+
		"\u0000\u0000\u0000\u00ae\u0099\u0001\u0000\u0000\u0000\u00ae\u009c\u0001"+
		"\u0000\u0000\u0000\u00ae\u009f\u0001\u0000\u0000\u0000\u00ae\u00a1\u0001"+
		"\u0000\u0000\u0000\u00ae\u00a4\u0001\u0000\u0000\u0000\u00ae\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\t\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0007\t\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0005\n\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bf\u0007\n\u0000\u0000\u00ba\u00bd\u0005\\\u0000\u0000\u00bb"+
		"\u00be\u0005N\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00ba\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c5"+
		"\u0005E\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00cd\u0001\u0000\u0000\u0000\u00c6\u00c9\u0003"+
		"\b\u0004\u0000\u00c7\u00ca\u0005N\u0000\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d3\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0003\f\u0006"+
		"\u0000\u00d1\u00d3\u0003\"\u0011\u0000\u00d2\u00b4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u000b\u0001\u0000\u0000\u0000\u00d4\u00d6\u0007\t\u0000\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005\n\u0000\u0000\u00d8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0007\n\u0000\u0000\u00db\u00dc\u0005"+
		"\\\u0000\u0000\u00dc\u00dd\u0005\u001f\u0000\u0000\u00dd\u00de\u0005V"+
		"\u0000\u0000\u00de\u00df\u0005W\u0000\u0000\u00df\u00e5\u0005E\u0000\u0000"+
		"\u00e0\u00e1\u0007\n\u0000\u0000\u00e1\u00e2\u0005V\u0000\u0000\u00e2"+
		"\u00e3\u0005^\u0000\u0000\u00e3\u00e6\u0005W\u0000\u0000\u00e4\u00e6\u0005"+
		"b\u0000\u0000\u00e5\u00e0\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00ff\u0001\u0000\u0000\u0000\u00e7\u00e9\u0007\t\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005\n\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\n\u0000\u0000\u00ee"+
		"\u00ef\u0005\\\u0000\u0000\u00ef\u00f0\u0005V\u0000\u0000\u00f0\u00f1"+
		"\u0005W\u0000\u0000\u00f1\u00f2\u0005E\u0000\u0000\u00f2\u00fa\u0005V"+
		"\u0000\u0000\u00f3\u00f6\u0003\b\u0004\u0000\u00f4\u00f7\u0005N\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0005W\u0000\u0000\u00fe\u00d5\u0001\u0000\u0000\u0000"+
		"\u00fe\u00e8\u0001\u0000\u0000\u0000\u00ff\r\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\r\u0000\u0000\u0101\u0102\u0005V\u0000\u0000\u0102\u0103"+
		"\u0003\b\u0004\u0000\u0103\u0104\u0005W\u0000\u0000\u0104\u0106\u0005"+
		" \u0000\u0000\u0105\u0107\u0003\u0002\u0001\u0000\u0106\u0105\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0005\u0012\u0000\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005\u000f\u0000\u0000\u010c\u010e\u0003\b\u0004"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0111\u0005\u000e\u0000"+
		"\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0114\u0003\u0002\u0001"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0117\u0005\u0012\u0000"+
		"\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u000f\u0000"+
		"\u0000\u0119\u011b\u0003\b\u0004\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0005\u0018\u0000\u0000\u011d\u000f\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\u000b\u0000\u0000\u011f\u0120\u0005V\u0000\u0000\u0120"+
		"\u0121\u0003\b\u0004\u0000\u0121\u0122\u0005W\u0000\u0000\u0122\u0123"+
		"\u0005\f\u0000\u0000\u0123\u0125\u0003\u0002\u0001\u0000\u0124\u0126\u0005"+
		"\u0012\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"\u000f\u0000\u0000\u0128\u012a\u0003\b\u0004\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005!\u0000\u0000\u012c\u0011\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0005\f\u0000\u0000\u012e\u0130\u0003\u0002\u0001\u0000"+
		"\u012f\u0131\u0005\u0012\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005\u000f\u0000\u0000\u0133\u0135\u0003\b\u0004\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0005\"\u0000\u0000\u0137\u0138"+
		"\u0005V\u0000\u0000\u0138\u0139\u0003\b\u0004\u0000\u0139\u013a\u0005"+
		"W\u0000\u0000\u013a\u0013\u0001\u0000\u0000\u0000\u013b\u013c\u0005\t"+
		"\u0000\u0000\u013c\u0153\u00050\u0000\u0000\u013d\u0145\u0007\u000b\u0000"+
		"\u0000\u013e\u0141\u0005\\\u0000\u0000\u013f\u0142\u0005N\u0000\u0000"+
		"\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000"+
		"\u0143\u013e\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0148\u0150\u0005M\u0000\u0000\u0149\u014c\u0003\b\u0004\u0000\u014a"+
		"\u014d\u0005N\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a"+
		"\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u014f"+
		"\u0001\u0000\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014f\u0152"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u013d\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0005#\u0000\u0000\u0156\u0157\u0003\b\u0004\u0000\u0157\u015f\u0005"+
		"#\u0000\u0000\u0158\u015b\u0003\b\u0004\u0000\u0159\u015c\u0005N\u0000"+
		"\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000"+
		"\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u00051\u0000\u0000\u0163\u0164\u0005\f\u0000\u0000"+
		"\u0164\u0166\u0003\u0002\u0001\u0000\u0165\u0167\u0005\u0012\u0000\u0000"+
		"\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
		"\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u000f\u0000\u0000"+
		"\u0169\u016b\u0003\b\u0004\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0005!\u0000\u0000\u016d\u0015\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005\u0011\u0000\u0000\u016f\u0173\u0003\b\u0004\u0000\u0170\u0171\u0005"+
		"$\u0000\u0000\u0171\u0172\u0005`\u0000\u0000\u0172\u0174\u0003\u0002\u0001"+
		"\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u000e\u0000"+
		"\u0000\u0178\u017a\u0003\u0002\u0001\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005%\u0000\u0000\u017c\u0017\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0005\\\u0000\u0000\u017e\u0180\u0005,\u0000\u0000\u017f"+
		"\u0181\u0007\t\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0005\u0015\u0000\u0000\u0183\u018d\u0005.\u0000\u0000\u0184\u0185\u0007"+
		"\f\u0000\u0000\u0185\u0186\u0005P\u0000\u0000\u0186\u0189\u0005\\\u0000"+
		"\u0000\u0187\u018a\u0005N\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0184\u0001\u0000\u0000\u0000"+
		"\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0191\u0005/\u0000\u0000\u0191"+
		"\u0192\u0005P\u0000\u0000\u0192\u0193\u0003\u0002\u0001\u0000\u0193\u0194"+
		"\u0005%\u0000\u0000\u0194\u0019\u0001\u0000\u0000\u0000\u0195\u0196\u0005"+
		")\u0000\u0000\u0196\u0197\u0007\r\u0000\u0000\u0197\u01a3\u0005.\u0000"+
		"\u0000\u0198\u019b\u0007\r\u0000\u0000\u0199\u019a\u0005N\u0000\u0000"+
		"\u019a\u019c\u0005\\\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0005N\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a1\u0198\u0001\u0000\u0000\u0000\u01a2\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005/\u0000\u0000\u01a7\u001b\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0007\t\u0000\u0000\u01a9\u01aa\u0005\u0013"+
		"\u0000\u0000\u01aa\u01ab\u0005\\\u0000\u0000\u01ab\u01ac\u0005&\u0000"+
		"\u0000\u01ac\u01b2\u0005\b\u0000\u0000\u01ad\u01b0\u0005\\\u0000\u0000"+
		"\u01ae\u01b1\u0005N\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b2\u01ad\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b8\u0003\u0004\u0002\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005\u0014\u0000\u0000\u01ba\u01bb\u0005\\\u0000\u0000\u01bb\u01bc"+
		"\u0005,\u0000\u0000\u01bc\u01bd\u0005\u0015\u0000\u0000\u01bd\u01c6\u0005"+
		".\u0000\u0000\u01be\u01bf\u0007\f\u0000\u0000\u01bf\u01c2\u0005\\\u0000"+
		"\u0000\u01c0\u01c3\u0005N\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01be\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005/\u0000\u0000\u01ca"+
		"\u01cb\u0005P\u0000\u0000\u01cb\u01cc\u0003\u0002\u0001\u0000\u01cc\u01cd"+
		"\u0005%\u0000\u0000\u01cd\u01ce\u0005\'\u0000\u0000\u01ce\u001d\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d1\u0007\t\u0000\u0000\u01d0\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005\\\u0000\u0000\u01d3\u01d4\u0005\\\u0000"+
		"\u0000\u01d4\u01d5\u0005,\u0000\u0000\u01d5\u01d6\u0005\u001f\u0000\u0000"+
		"\u01d6\u01d7\u0005\\\u0000\u0000\u01d7\u01dd\u0005V\u0000\u0000\u01d8"+
		"\u01db\u0005\\\u0000\u0000\u01d9\u01dc\u0005N\u0000\u0000\u01da\u01dc"+
		"\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01d8"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01dd"+
		"\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005W\u0000\u0000\u01e2\u001f\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0005\u0016\u0000\u0000\u01e4\u01e5\u0005"+
		"P\u0000\u0000\u01e5\u01e6\u0003\u0002\u0001\u0000\u01e6\u01ec\u0005\u0017"+
		"\u0000\u0000\u01e7\u01ea\u0005\\\u0000\u0000\u01e8\u01eb\u0005N\u0000"+
		"\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ec\u01e7\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005P\u0000\u0000"+
		"\u01f1\u01f2\u0003\u0002\u0001\u0000\u01f2!\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f5\u0007\t\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f8"+
		"\u0005\n\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"(\u0000\u0000\u01fa\u01fb\u0005C\u0000\u0000\u01fb\u01fc\u0007\n\u0000"+
		"\u0000\u01fc\u01fd\u0005D\u0000\u0000\u01fd\u01fe\u0005\\\u0000\u0000"+
		"\u01fe\u01ff\u0005E\u0000\u0000\u01ff\u0200\u0005\u001f\u0000\u0000\u0200"+
		"\u0201\u0005(\u0000\u0000\u0201\u0202\u0005C\u0000\u0000\u0202\u0203\u0007"+
		"\n\u0000\u0000\u0203\u0204\u0005D\u0000\u0000\u0204\u0205\u0005.\u0000"+
		"\u0000\u0205\u0206\u0005^\u0000\u0000\u0206\u0220\u0005/\u0000\u0000\u0207"+
		"\u0209\u0007\t\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a\u020c"+
		"\u0005\n\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0005"+
		"(\u0000\u0000\u020e\u020f\u0005C\u0000\u0000\u020f\u0210\u0007\n\u0000"+
		"\u0000\u0210\u0211\u0005D\u0000\u0000\u0211\u0212\u0005\\\u0000\u0000"+
		"\u0212\u0213\u0005E\u0000\u0000\u0213\u021b\u0005V\u0000\u0000\u0214\u0217"+
		"\u0003\b\u0004\u0000\u0215\u0218\u0005N\u0000\u0000\u0216\u0218\u0001"+
		"\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0216\u0001"+
		"\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u0214\u0001"+
		"\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021e\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0220\u0005"+
		"W\u0000\u0000\u021f\u01f4\u0001\u0000\u0000\u0000\u021f\u0208\u0001\u0000"+
		"\u0000\u0000\u0220#\u0001\u0000\u0000\u0000J\'<>MOVdmpu\u0088\u00ae\u00b0"+
		"\u00b4\u00b7\u00bd\u00c1\u00c4\u00c9\u00cd\u00d2\u00d5\u00d8\u00e5\u00e8"+
		"\u00eb\u00f6\u00fa\u00fe\u0106\u0109\u010d\u0110\u0113\u0116\u011a\u0125"+
		"\u0129\u0130\u0134\u0141\u0145\u014c\u0150\u0153\u015b\u015f\u0166\u016a"+
		"\u0175\u0179\u0180\u0189\u018d\u019b\u019f\u01a3\u01b0\u01b4\u01b7\u01c2"+
		"\u01c6\u01d0\u01db\u01df\u01ea\u01ee\u01f4\u01f7\u0208\u020b\u0217\u021b"+
		"\u021f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}