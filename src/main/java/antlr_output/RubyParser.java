// Generated from C:/Users/Kluch/IdeaProjects/RubyLLVMTranslate/src/main/antlr4\Ruby.g4 by ANTLR 4.8
package antlr_output;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		IF=9, THEN=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, RETRY=15, BREAK=16, 
		FOR=17, TRUE=18, FALSE=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, 
		EXP=25, EQUAL=26, NOT_EQUAL=27, GREATER=28, LESS=29, LESS_EQUAL=30, GREATER_EQUAL=31, 
		ASSIGN=32, PLUS_ASSIGN=33, MINUS_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, 
		MOD_ASSIGN=37, EXP_ASSIGN=38, BIT_AND=39, BIT_OR=40, BIT_XOR=41, BIT_NOT=42, 
		BIT_SHL=43, BIT_SHR=44, AND=45, OR=46, NOT=47, LEFT_RBRACKET=48, RIGHT_RBRACKET=49, 
		LEFT_SBRACKET=50, RIGHT_SBRACKET=51, NIL=52, PRINT=53, SL_COMMENT=54, 
		ML_COMMENT=55, WS=56, RSYM=57, INT=58, FLOAT=59, ID=60, ID_GLOBAL=61, 
		ID_FUNCTION=62;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_require_block = 3, 
		RULE_function_definition = 4, RULE_function_definition_body = 5, RULE_function_definition_header = 6, 
		RULE_function_name = 7, RULE_function_definition_params = 8, RULE_function_definition_params_list = 9, 
		RULE_return_statement = 10, RULE_function_call = 11, RULE_function_call_param_list = 12, 
		RULE_function_call_params = 13, RULE_if_elsif_statement = 14, RULE_if_statement = 15, 
		RULE_unless_statement = 16, RULE_while_statement = 17, RULE_while_expression_list = 18, 
		RULE_for_statement = 19, RULE_for_expression_list = 20, RULE_assignment = 21, 
		RULE_array_assignment = 22, RULE_array_definition = 23, RULE_array_definition_elements = 24, 
		RULE_array_selector = 25, RULE_int_result = 26, RULE_float_result = 27, 
		RULE_string_result = 28, RULE_lvalue = 29, RULE_rvalue = 30, RULE_literal_t = 31, 
		RULE_float_t = 32, RULE_int_t = 33, RULE_bool_t = 34, RULE_nil_t = 35, 
		RULE_id = 36, RULE_id_global = 37, RULE_id_function = 38, RULE_terminator = 39, 
		RULE_crlf = 40, RULE_printer = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression_list", "expression", "require_block", "function_definition", 
			"function_definition_body", "function_definition_header", "function_name", 
			"function_definition_params", "function_definition_params_list", "return_statement", 
			"function_call", "function_call_param_list", "function_call_params", 
			"if_elsif_statement", "if_statement", "unless_statement", "while_statement", 
			"while_expression_list", "for_statement", "for_expression_list", "assignment", 
			"array_assignment", "array_definition", "array_definition_elements", 
			"array_selector", "int_result", "float_result", "string_result", "lvalue", 
			"rvalue", "literal_t", "float_t", "int_t", "bool_t", "nil_t", "id", "id_global", 
			"id_function", "terminator", "crlf", "printer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'", "'\n'", "'require'", "'end'", "'def'", "'return'", 
			"'if'", "'then'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", 
			"'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", 
			"'<<'", "'>>'", null, null, null, "'('", "')'", "'['", "']'", "'nil'", 
			"'print'", null, null, null, "'\r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
			"RETURN", "IF", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", 
			"BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
			"EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
			"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", 
			"BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", 
			"LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "PRINT", "SL_COMMENT", "ML_COMMENT", 
			"WS", "RSYM", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
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
	public String getGrammarFileName() { return "Ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public RubyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			expression_list(0);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(87);
			expression();
			setState(88);
			terminator(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(90);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(91);
					expression();
					setState(92);
					terminator(0);
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public PrinterContext printer() {
			return getRuleContext(PrinterContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				function_definition();
				}
				break;
			case REQUIRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				require_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				if_statement();
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				unless_statement();
				}
				break;
			case LITERAL:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				rvalue(0);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				return_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				for_statement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				printer();
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

	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(RubyParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterRequire_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitRequire_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitRequire_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(REQUIRE);
			setState(111);
			literal_t();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			function_definition_header();
			setState(114);
			function_definition_body();
			setState(115);
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

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_definition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_definition_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_definition_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expression_list(0);
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

	public static class Function_definition_headerContext extends ParserRuleContext {
		public Function_nameContext function_name;
		public TerminalNode DEF() { return getToken(RubyParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_definition_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_definition_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_definition_header);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(DEF);
				setState(120);
				((Function_definition_headerContext)_localctx).function_name = function_name();
				setState(121);
				crlf();

				                              String func = (((Function_definition_headerContext)_localctx).function_name!=null?_input.getText(((Function_definition_headerContext)_localctx).function_name.start,((Function_definition_headerContext)_localctx).function_name.stop):null);
				                              if (is_defined(definitions, func)) {
				                                System.out.println("line " + NumStr + " Error! Function " + func + " is already defined!");
				                                SemanticErrorsNum++;
				                              }
				                              else {
				                                definitions.add(func);
				                              }
				                             
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(DEF);
				setState(125);
				((Function_definition_headerContext)_localctx).function_name = function_name();
				setState(126);
				function_definition_params();
				setState(127);
				crlf();

				                              String func = (((Function_definition_headerContext)_localctx).function_name!=null?_input.getText(((Function_definition_headerContext)_localctx).function_name.start,((Function_definition_headerContext)_localctx).function_name.stop):null);
				                              if (is_defined(definitions, func)) {
				                                System.out.println("line " + NumStr + " Error! Function " + func + " is already defined!");
				                                SemanticErrorsNum++;
				                              }
				                              else {
				                                definitions.add(func);
				                              }
				                             
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

	public static class Function_nameContext extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_name);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				id();
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

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_definition_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_definition_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_definition_params);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(LEFT_RBRACKET);
				setState(137);
				function_definition_params_list(0);
				setState(138);
				match(RIGHT_RBRACKET);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				function_definition_params_list(0);
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

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_definition_params_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_definition_params_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_definition_params_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(144);
			id();
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(146);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(147);
					match(COMMA);
					setState(148);
					id();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(RubyParser.RETURN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(RETURN);
			setState(155);
			rvalue(0);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends Function_callContext {
		public Function_nameContext function_name;
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((FunctionCallContext)_localctx).function_name = function_name();
				setState(158);
				match(LEFT_RBRACKET);
				setState(159);
				function_call_param_list();
				setState(160);
				match(RIGHT_RBRACKET);

				                  String func = (((FunctionCallContext)_localctx).function_name!=null?_input.getText(((FunctionCallContext)_localctx).function_name.start,((FunctionCallContext)_localctx).function_name.stop):null);
				                  if (!is_defined(definitions, func)) {
				                    System.out.println("line " + NumStr + " Error! Undefined function " + func + "!");
				                    SemanticErrorsNum++;
				                  }
				                
				}
				break;
			case 2:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((FunctionCallContext)_localctx).function_name = function_name();
				setState(164);
				function_call_param_list();

				                  String func = (((FunctionCallContext)_localctx).function_name!=null?_input.getText(((FunctionCallContext)_localctx).function_name.start,((FunctionCallContext)_localctx).function_name.stop):null);
				                  if (!is_defined(definitions, func)) {
				                    System.out.println("line " + NumStr + " Error! Undefined function " + func + "!");
				                    SemanticErrorsNum++;
				                  }
				                
				}
				break;
			case 3:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				((FunctionCallContext)_localctx).function_name = function_name();
				setState(168);
				match(LEFT_RBRACKET);
				setState(169);
				match(RIGHT_RBRACKET);

				                  String func = (((FunctionCallContext)_localctx).function_name!=null?_input.getText(((FunctionCallContext)_localctx).function_name.start,((FunctionCallContext)_localctx).function_name.stop):null);
				                  if (!is_defined(definitions, func)) {
				                    System.out.println("line " + NumStr + " Error! Undefined function " + func + "!");
				                    SemanticErrorsNum++;
				                  }
				                
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

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_call_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_call_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_call_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			function_call_params(0);
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

	public static class Function_call_paramsContext extends ParserRuleContext {
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFunction_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFunction_call_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFunction_call_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		return function_call_params(0);
	}

	private Function_call_paramsContext function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, _parentState);
		Function_call_paramsContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			rvalue(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(179);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(180);
					match(COMMA);
					setState(181);
					rvalue(0);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RubyParser.ELSIF, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(RubyParser.ELSE, 0); }
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitIf_elsif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitIf_elsif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_elsif_statement);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(ELSIF);
				setState(188);
				rvalue(0);
				setState(189);
				crlf();
				setState(190);
				expression_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(ELSIF);
				setState(193);
				rvalue(0);
				setState(194);
				crlf();
				setState(195);
				expression_list(0);
				setState(196);
				match(ELSE);
				setState(197);
				crlf();
				setState(198);
				expression_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(ELSIF);
				setState(201);
				rvalue(0);
				setState(202);
				crlf();
				setState(203);
				expression_list(0);
				setState(204);
				if_elsif_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public TerminalNode THEN() { return getToken(RubyParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(RubyParser.ELSE, 0); }
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(IF);
				setState(209);
				rvalue(0);
				setState(210);
				crlf();
				setState(211);
				expression_list(0);
				setState(212);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(IF);
				setState(215);
				rvalue(0);
				setState(216);
				match(THEN);
				setState(217);
				expression_list(0);
				setState(218);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(IF);
				setState(221);
				rvalue(0);
				setState(222);
				crlf();
				setState(223);
				expression_list(0);
				setState(224);
				match(ELSE);
				setState(225);
				crlf();
				setState(226);
				expression_list(0);
				setState(227);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(IF);
				setState(230);
				rvalue(0);
				setState(231);
				match(THEN);
				setState(232);
				expression_list(0);
				setState(233);
				match(ELSE);
				setState(234);
				expression_list(0);
				setState(235);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(IF);
				setState(238);
				rvalue(0);
				setState(239);
				crlf();
				setState(240);
				expression_list(0);
				setState(241);
				if_elsif_statement();
				setState(242);
				match(END);
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

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(RubyParser.UNLESS, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterUnless_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitUnless_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitUnless_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unless_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(UNLESS);
			setState(247);
			rvalue(0);
			setState(248);
			crlf();
			setState(249);
			expression_list(0);
			setState(250);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public While_expression_listContext while_expression_list() {
			return getRuleContext(While_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(WHILE);
			setState(253);
			rvalue(0);
			setState(254);
			crlf();
			setState(255);
			while_expression_list(0);
			setState(256);
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

	public static class While_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(RubyParser.RETRY, 0); }
		public TerminalNode BREAK() { return getToken(RubyParser.BREAK, 0); }
		public While_expression_listContext while_expression_list() {
			return getRuleContext(While_expression_listContext.class,0);
		}
		public While_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterWhile_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitWhile_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitWhile_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_expression_listContext while_expression_list() throws RecognitionException {
		return while_expression_list(0);
	}

	private While_expression_listContext while_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		While_expression_listContext _localctx = new While_expression_listContext(_ctx, _parentState);
		While_expression_listContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_while_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case PRINT:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(259);
				expression();
				setState(260);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(262);
				match(RETRY);
				setState(263);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(264);
				match(BREAK);
				setState(265);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(268);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(269);
						expression();
						setState(270);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(273);
						match(RETRY);
						setState(274);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new While_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_while_expression_list);
						setState(275);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(276);
						match(BREAK);
						setState(277);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(282);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RubyParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RubyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RubyParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public For_expression_listContext for_expression_list() {
			return getRuleContext(For_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_statement);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(FOR);
				setState(284);
				match(LEFT_RBRACKET);
				setState(285);
				expression();
				setState(286);
				match(SEMICOLON);
				setState(287);
				expression();
				setState(288);
				match(SEMICOLON);
				setState(289);
				expression();
				setState(290);
				match(RIGHT_RBRACKET);
				setState(291);
				crlf();
				setState(292);
				for_expression_list(0);
				setState(293);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(FOR);
				setState(296);
				expression();
				setState(297);
				match(SEMICOLON);
				setState(298);
				expression();
				setState(299);
				match(SEMICOLON);
				setState(300);
				expression();
				setState(301);
				crlf();
				setState(302);
				for_expression_list(0);
				setState(303);
				match(END);
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

	public static class For_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(RubyParser.RETRY, 0); }
		public TerminalNode BREAK() { return getToken(RubyParser.BREAK, 0); }
		public For_expression_listContext for_expression_list() {
			return getRuleContext(For_expression_listContext.class,0);
		}
		public For_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFor_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFor_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFor_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expression_listContext for_expression_list() throws RecognitionException {
		return for_expression_list(0);
	}

	private For_expression_listContext for_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_expression_listContext _localctx = new For_expression_listContext(_ctx, _parentState);
		For_expression_listContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_for_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case RETURN:
			case IF:
			case UNLESS:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case PRINT:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(308);
				expression();
				setState(309);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(311);
				match(RETRY);
				setState(312);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(313);
				match(BREAK);
				setState(314);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						expression();
						setState(319);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(RETRY);
						setState(323);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new For_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_for_expression_list);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(325);
						match(BREAK);
						setState(326);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((AssignmentContext)_localctx).lvalue = lvalue();
				setState(333);
				match(ASSIGN);
				setState(334);
				rvalue(0);

				              definitions.add((((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null));
				             
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				((AssignmentContext)_localctx).lvalue = lvalue();
				setState(338);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				rvalue(0);

				              String variable = (((AssignmentContext)_localctx).lvalue!=null?_input.getText(((AssignmentContext)_localctx).lvalue.start,((AssignmentContext)_localctx).lvalue.stop):null);
				              if (!is_defined(definitions, variable)) {
				                System.out.println("line " + NumStr + " Error! Undefined variable " + variable + "!");
				                SemanticErrorsNum++;
				              }
				             
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public LvalueContext lvalue;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitArray_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitArray_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_assignment);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				((Array_assignmentContext)_localctx).lvalue = lvalue();
				setState(345);
				array_definition();
				setState(346);
				match(ASSIGN);
				setState(347);
				rvalue(0);

				                    String variable = (((Array_assignmentContext)_localctx).lvalue!=null?_input.getText(((Array_assignmentContext)_localctx).lvalue.start,((Array_assignmentContext)_localctx).lvalue.stop):null);
				                    if (!is_defined(definitions, variable)) {
				                      System.out.println("line " + NumStr + " Error! Undefined variable " + variable + "!");
				                      SemanticErrorsNum++;
				                    }
				                   
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				((Array_assignmentContext)_localctx).lvalue = lvalue();
				setState(351);
				match(ASSIGN);
				setState(352);
				array_definition();

				                    definitions.add((((Array_assignmentContext)_localctx).lvalue!=null?_input.getText(((Array_assignmentContext)_localctx).lvalue.start,((Array_assignmentContext)_localctx).lvalue.stop):null));
				                   
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitArray_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitArray_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_definition);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(LEFT_SBRACKET);
				setState(358);
				array_definition_elements(0);
				setState(359);
				match(RIGHT_SBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(LEFT_SBRACKET);
				setState(362);
				match(RIGHT_SBRACKET);
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

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterArray_definition_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitArray_definition_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitArray_definition_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(366);
			rvalue(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(368);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(369);
					match(COMMA);
					setState(370);
					rvalue(0);
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Array_selectorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterArray_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitArray_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitArray_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array_selector);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				id();
				setState(377);
				match(LEFT_SBRACKET);
				setState(378);
				rvalue(0);
				setState(379);
				match(RIGHT_SBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				id_global();
				setState(382);
				match(LEFT_SBRACKET);
				setState(383);
				rvalue(0);
				setState(384);
				match(RIGHT_SBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				function_call();
				setState(387);
				match(LEFT_SBRACKET);
				setState(388);
				rvalue(0);
				setState(389);
				match(RIGHT_SBRACKET);
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

	public static class Int_resultContext extends ParserRuleContext {
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitInt_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitInt_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			int_t();
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(396);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(397);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(398);
						int_result(4);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(399);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(400);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(401);
						int_result(3);
						}
						break;
					}
					} 
				}
				setState(406);
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

	public static class Float_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFloat_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFloat_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(408);
				int_result(0);
				setState(409);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				float_result(6);
				}
				break;
			case 2:
				{
				setState(412);
				int_result(0);
				setState(413);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(414);
				float_result(3);
				}
				break;
			case 3:
				{
				setState(416);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(419);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(420);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(421);
						float_result(8);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(422);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(423);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(424);
						float_result(5);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(425);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(426);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(427);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(428);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(429);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(430);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class String_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitString_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitString_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(437);
				int_result(0);
				setState(438);
				match(MUL);
				setState(439);
				string_result(2);
				}
				break;
			case LITERAL:
				{
				setState(441);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_resultContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_result);
					setState(444);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(445);
					match(MUL);
					setState(446);
					int_result(0);
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class LvalueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lvalue);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				id();
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				id_global();
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

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(RubyParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(RubyParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(RubyParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(RubyParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(RubyParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(RubyParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(RubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(RubyParser.OR, 0); }
		public TerminalNode AND() { return getToken(RubyParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitRvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitRvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(457);
				((RvalueContext)_localctx).lvalue = lvalue();

				          String variable = (((RvalueContext)_localctx).lvalue!=null?_input.getText(((RvalueContext)_localctx).lvalue.start,((RvalueContext)_localctx).lvalue.stop):null);
				          if (!is_defined(definitions, variable)) {
				            System.out.println("line " + NumStr + " Error! Undefined variable " + variable + "!");
				            SemanticErrorsNum++;
				          }
				         
				}
				break;
			case 2:
				{
				setState(460);
				array_assignment();
				}
				break;
			case 3:
				{
				setState(461);
				int_result(0);
				}
				break;
			case 4:
				{
				setState(462);
				float_result(0);
				}
				break;
			case 5:
				{
				setState(463);
				string_result(0);
				}
				break;
			case 6:
				{
				setState(464);
				assignment();
				}
				break;
			case 7:
				{
				setState(465);
				function_call();
				}
				break;
			case 8:
				{
				setState(466);
				literal_t();
				}
				break;
			case 9:
				{
				setState(467);
				bool_t();
				}
				break;
			case 10:
				{
				setState(468);
				float_t();
				}
				break;
			case 11:
				{
				setState(469);
				int_t();
				}
				break;
			case 12:
				{
				setState(470);
				nil_t();
				}
				break;
			case 13:
				{
				setState(471);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(472);
				rvalue(10);
				}
				break;
			case 14:
				{
				setState(473);
				match(LEFT_RBRACKET);
				setState(474);
				rvalue(0);
				setState(475);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(479);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(480);
						match(EXP);
						setState(481);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(482);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(483);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(484);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(485);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(486);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(487);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(488);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(489);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(490);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(491);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(492);
						match(BIT_AND);
						setState(493);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(494);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(495);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(496);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(497);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(498);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(499);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(500);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(501);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(502);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(503);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(504);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(RubyParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterLiteral_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitLiteral_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitLiteral_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(LITERAL);
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

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RubyParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitFloat_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitFloat_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(FLOAT);
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

	public static class Int_tContext extends ParserRuleContext {
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
	 
		public Int_tContext() { }
		public void copyFrom(Int_tContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntContext extends Int_tContext {
		public TerminalNode INT() { return getToken(RubyParser.INT, 0); }
		public IntContext(Int_tContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_int_t);
		try {
			_localctx = new IntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(INT);
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

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RubyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RubyParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitBool_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitBool_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(RubyParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitNil_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitNil_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(NIL);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RubyParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ID);
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

	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(RubyParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterId_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitId_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitId_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ID_GLOBAL);
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

	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID_FUNCTION() { return getToken(RubyParser.ID_FUNCTION, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterId_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitId_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitId_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(ID_FUNCTION);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RubyParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(528);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(529);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(532);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(533);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(534);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(535);
						crlf();
						}
						break;
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(RubyParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitCrlf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitCrlf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(CRLF);

			        NumStr++;
			       
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

	public static class PrinterContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RubyParser.PRINT, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public PrinterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).enterPrinter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyListener ) ((RubyListener)listener).exitPrinter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RubyVisitor ) return ((RubyVisitor<? extends T>)visitor).visitPrinter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrinterContext printer() throws RecognitionException {
		PrinterContext _localctx = new PrinterContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_printer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(PRINT);
			setState(545);
			rvalue(0);
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
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 9:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 13:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 18:
			return while_expression_list_sempred((While_expression_listContext)_localctx, predIndex);
		case 20:
			return for_expression_list_sempred((For_expression_listContext)_localctx, predIndex);
		case 24:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 26:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 27:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 28:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 30:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 39:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_params_sempred(Function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean while_expression_list_sempred(While_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean for_expression_list_sempred(For_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 11);
		case 18:
			return precpred(_ctx, 9);
		case 19:
			return precpred(_ctx, 8);
		case 20:
			return precpred(_ctx, 7);
		case 21:
			return precpred(_ctx, 6);
		case 22:
			return precpred(_ctx, 5);
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 4);
		case 27:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0226\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4o\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085\n\b\3\t\3\t"+
		"\5\t\u0089\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00f7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010d"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0119\n\24"+
		"\f\24\16\24\u011c\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0134"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013e\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014a\n\26\f\26\16\26\u014d"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0159\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0166"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016e\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0176\n\32\f\32\16\32\u0179\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018a\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0195\n\34\f\34\16"+
		"\34\u0198\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01a4\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u01b2\n\35\f\35\16\35\u01b5\13\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u01bd\n\36\3\36\3\36\3\36\7\36\u01c2\n\36\f\36\16\36\u01c5\13\36"+
		"\3\37\3\37\5\37\u01c9\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \5 \u01e0\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01fd\n \f \16 \u0200\13"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\5)\u0215"+
		"\n)\3)\3)\3)\3)\7)\u021b\n)\f)\16)\u021e\13)\3*\3*\3*\3+\3+\3+\3+\2\r"+
		"\4\24\34&*\62\668:>P,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRT\2\f\3\2#(\3\2\30\32\3\2\26\27\4\2,,\61\61"+
		"\3\2-.\3\2*+\3\2\36!\3\2\34\35\3\2/\60\3\2\24\25\2\u0246\2V\3\2\2\2\4"+
		"X\3\2\2\2\6n\3\2\2\2\bp\3\2\2\2\ns\3\2\2\2\fw\3\2\2\2\16\u0084\3\2\2\2"+
		"\20\u0088\3\2\2\2\22\u008f\3\2\2\2\24\u0091\3\2\2\2\26\u009c\3\2\2\2\30"+
		"\u00ae\3\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2\2\2\36\u00d0\3\2\2\2 \u00f6"+
		"\3\2\2\2\"\u00f8\3\2\2\2$\u00fe\3\2\2\2&\u010c\3\2\2\2(\u0133\3\2\2\2"+
		"*\u013d\3\2\2\2,\u0158\3\2\2\2.\u0165\3\2\2\2\60\u016d\3\2\2\2\62\u016f"+
		"\3\2\2\2\64\u0189\3\2\2\2\66\u018b\3\2\2\28\u01a3\3\2\2\2:\u01bc\3\2\2"+
		"\2<\u01c8\3\2\2\2>\u01df\3\2\2\2@\u0201\3\2\2\2B\u0203\3\2\2\2D\u0205"+
		"\3\2\2\2F\u0207\3\2\2\2H\u0209\3\2\2\2J\u020b\3\2\2\2L\u020d\3\2\2\2N"+
		"\u020f\3\2\2\2P\u0214\3\2\2\2R\u021f\3\2\2\2T\u0222\3\2\2\2VW\5\4\3\2"+
		"W\3\3\2\2\2XY\b\3\1\2YZ\5\6\4\2Z[\5P)\2[b\3\2\2\2\\]\f\3\2\2]^\5\6\4\2"+
		"^_\5P)\2_a\3\2\2\2`\\\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\5\3\2\2\2"+
		"db\3\2\2\2eo\5\n\6\2fo\5\b\5\2go\5 \21\2ho\5\"\22\2io\5> \2jo\5\26\f\2"+
		"ko\5$\23\2lo\5(\25\2mo\5T+\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2\2\2n"+
		"i\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\7\3\2\2\2pq\7\7\2\2"+
		"qr\5@!\2r\t\3\2\2\2st\5\16\b\2tu\5\f\7\2uv\7\b\2\2v\13\3\2\2\2wx\5\4\3"+
		"\2x\r\3\2\2\2yz\7\t\2\2z{\5\20\t\2{|\5R*\2|}\b\b\1\2}\u0085\3\2\2\2~\177"+
		"\7\t\2\2\177\u0080\5\20\t\2\u0080\u0081\5\22\n\2\u0081\u0082\5R*\2\u0082"+
		"\u0083\b\b\1\2\u0083\u0085\3\2\2\2\u0084y\3\2\2\2\u0084~\3\2\2\2\u0085"+
		"\17\3\2\2\2\u0086\u0089\5N(\2\u0087\u0089\5J&\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b\7\62\2\2\u008b\u008c\5\24"+
		"\13\2\u008c\u008d\7\63\2\2\u008d\u0090\3\2\2\2\u008e\u0090\5\24\13\2\u008f"+
		"\u008a\3\2\2\2\u008f\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092\b\13\1"+
		"\2\u0092\u0093\5J&\2\u0093\u0099\3\2\2\2\u0094\u0095\f\3\2\2\u0095\u0096"+
		"\7\4\2\2\u0096\u0098\5J&\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\25\3\2\2\2\u009b\u0099\3\2\2"+
		"\2\u009c\u009d\7\n\2\2\u009d\u009e\5> \2\u009e\27\3\2\2\2\u009f\u00a0"+
		"\5\20\t\2\u00a0\u00a1\7\62\2\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\7\63"+
		"\2\2\u00a3\u00a4\b\r\1\2\u00a4\u00af\3\2\2\2\u00a5\u00a6\5\20\t\2\u00a6"+
		"\u00a7\5\32\16\2\u00a7\u00a8\b\r\1\2\u00a8\u00af\3\2\2\2\u00a9\u00aa\5"+
		"\20\t\2\u00aa\u00ab\7\62\2\2\u00ab\u00ac\7\63\2\2\u00ac\u00ad\b\r\1\2"+
		"\u00ad\u00af\3\2\2\2\u00ae\u009f\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a9"+
		"\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\5\34\17\2\u00b1\33\3\2\2\2\u00b2"+
		"\u00b3\b\17\1\2\u00b3\u00b4\5> \2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\f\3"+
		"\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00b9\5> \2\u00b8\u00b5\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\35\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7\16\2\2\u00be\u00bf\5> \2\u00bf\u00c0\5R*"+
		"\2\u00c0\u00c1\5\4\3\2\u00c1\u00d1\3\2\2\2\u00c2\u00c3\7\16\2\2\u00c3"+
		"\u00c4\5> \2\u00c4\u00c5\5R*\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\7\r\2\2"+
		"\u00c7\u00c8\5R*\2\u00c8\u00c9\5\4\3\2\u00c9\u00d1\3\2\2\2\u00ca\u00cb"+
		"\7\16\2\2\u00cb\u00cc\5> \2\u00cc\u00cd\5R*\2\u00cd\u00ce\5\4\3\2\u00ce"+
		"\u00cf\5\36\20\2\u00cf\u00d1\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0\u00c2\3"+
		"\2\2\2\u00d0\u00ca\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\7\13\2\2\u00d3"+
		"\u00d4\5> \2\u00d4\u00d5\5R*\2\u00d5\u00d6\5\4\3\2\u00d6\u00d7\7\b\2\2"+
		"\u00d7\u00f7\3\2\2\2\u00d8\u00d9\7\13\2\2\u00d9\u00da\5> \2\u00da\u00db"+
		"\7\f\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\7\b\2\2\u00dd\u00f7\3\2\2\2\u00de"+
		"\u00df\7\13\2\2\u00df\u00e0\5> \2\u00e0\u00e1\5R*\2\u00e1\u00e2\5\4\3"+
		"\2\u00e2\u00e3\7\r\2\2\u00e3\u00e4\5R*\2\u00e4\u00e5\5\4\3\2\u00e5\u00e6"+
		"\7\b\2\2\u00e6\u00f7\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5> \2\u00e9"+
		"\u00ea\7\f\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ec\7\r\2\2\u00ec\u00ed\5\4"+
		"\3\2\u00ed\u00ee\7\b\2\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0\7\13\2\2\u00f0"+
		"\u00f1\5> \2\u00f1\u00f2\5R*\2\u00f2\u00f3\5\4\3\2\u00f3\u00f4\5\36\20"+
		"\2\u00f4\u00f5\7\b\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00d2\3\2\2\2\u00f6\u00d8"+
		"\3\2\2\2\u00f6\u00de\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f7"+
		"!\3\2\2\2\u00f8\u00f9\7\17\2\2\u00f9\u00fa\5> \2\u00fa\u00fb\5R*\2\u00fb"+
		"\u00fc\5\4\3\2\u00fc\u00fd\7\b\2\2\u00fd#\3\2\2\2\u00fe\u00ff\7\20\2\2"+
		"\u00ff\u0100\5> \2\u0100\u0101\5R*\2\u0101\u0102\5&\24\2\u0102\u0103\7"+
		"\b\2\2\u0103%\3\2\2\2\u0104\u0105\b\24\1\2\u0105\u0106\5\6\4\2\u0106\u0107"+
		"\5P)\2\u0107\u010d\3\2\2\2\u0108\u0109\7\21\2\2\u0109\u010d\5P)\2\u010a"+
		"\u010b\7\22\2\2\u010b\u010d\5P)\2\u010c\u0104\3\2\2\2\u010c\u0108\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u011a\3\2\2\2\u010e\u010f\f\5\2\2\u010f"+
		"\u0110\5\6\4\2\u0110\u0111\5P)\2\u0111\u0119\3\2\2\2\u0112\u0113\f\4\2"+
		"\2\u0113\u0114\7\21\2\2\u0114\u0119\5P)\2\u0115\u0116\f\3\2\2\u0116\u0117"+
		"\7\22\2\2\u0117\u0119\5P)\2\u0118\u010e\3\2\2\2\u0118\u0112\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\'\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\23\2\2\u011e\u011f"+
		"\7\62\2\2\u011f\u0120\5\6\4\2\u0120\u0121\7\5\2\2\u0121\u0122\5\6\4\2"+
		"\u0122\u0123\7\5\2\2\u0123\u0124\5\6\4\2\u0124\u0125\7\63\2\2\u0125\u0126"+
		"\5R*\2\u0126\u0127\5*\26\2\u0127\u0128\7\b\2\2\u0128\u0134\3\2\2\2\u0129"+
		"\u012a\7\23\2\2\u012a\u012b\5\6\4\2\u012b\u012c\7\5\2\2\u012c\u012d\5"+
		"\6\4\2\u012d\u012e\7\5\2\2\u012e\u012f\5\6\4\2\u012f\u0130\5R*\2\u0130"+
		"\u0131\5*\26\2\u0131\u0132\7\b\2\2\u0132\u0134\3\2\2\2\u0133\u011d\3\2"+
		"\2\2\u0133\u0129\3\2\2\2\u0134)\3\2\2\2\u0135\u0136\b\26\1\2\u0136\u0137"+
		"\5\6\4\2\u0137\u0138\5P)\2\u0138\u013e\3\2\2\2\u0139\u013a\7\21\2\2\u013a"+
		"\u013e\5P)\2\u013b\u013c\7\22\2\2\u013c\u013e\5P)\2\u013d\u0135\3\2\2"+
		"\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u014b\3\2\2\2\u013f\u0140"+
		"\f\5\2\2\u0140\u0141\5\6\4\2\u0141\u0142\5P)\2\u0142\u014a\3\2\2\2\u0143"+
		"\u0144\f\4\2\2\u0144\u0145\7\21\2\2\u0145\u014a\5P)\2\u0146\u0147\f\3"+
		"\2\2\u0147\u0148\7\22\2\2\u0148\u014a\5P)\2\u0149\u013f\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c+\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\5<\37\2\u014f\u0150\7\"\2\2\u0150\u0151\5> \2\u0151\u0152\b\27\1\2\u0152"+
		"\u0159\3\2\2\2\u0153\u0154\5<\37\2\u0154\u0155\t\2\2\2\u0155\u0156\5>"+
		" \2\u0156\u0157\b\27\1\2\u0157\u0159\3\2\2\2\u0158\u014e\3\2\2\2\u0158"+
		"\u0153\3\2\2\2\u0159-\3\2\2\2\u015a\u015b\5<\37\2\u015b\u015c\5\60\31"+
		"\2\u015c\u015d\7\"\2\2\u015d\u015e\5> \2\u015e\u015f\b\30\1\2\u015f\u0166"+
		"\3\2\2\2\u0160\u0161\5<\37\2\u0161\u0162\7\"\2\2\u0162\u0163\5\60\31\2"+
		"\u0163\u0164\b\30\1\2\u0164\u0166\3\2\2\2\u0165\u015a\3\2\2\2\u0165\u0160"+
		"\3\2\2\2\u0166/\3\2\2\2\u0167\u0168\7\64\2\2\u0168\u0169\5\62\32\2\u0169"+
		"\u016a\7\65\2\2\u016a\u016e\3\2\2\2\u016b\u016c\7\64\2\2\u016c\u016e\7"+
		"\65\2\2\u016d\u0167\3\2\2\2\u016d\u016b\3\2\2\2\u016e\61\3\2\2\2\u016f"+
		"\u0170\b\32\1\2\u0170\u0171\5> \2\u0171\u0177\3\2\2\2\u0172\u0173\f\3"+
		"\2\2\u0173\u0174\7\4\2\2\u0174\u0176\5> \2\u0175\u0172\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\63\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017b\5J&\2\u017b\u017c\7\64\2\2\u017c\u017d\5> "+
		"\2\u017d\u017e\7\65\2\2\u017e\u018a\3\2\2\2\u017f\u0180\5L\'\2\u0180\u0181"+
		"\7\64\2\2\u0181\u0182\5> \2\u0182\u0183\7\65\2\2\u0183\u018a\3\2\2\2\u0184"+
		"\u0185\5\30\r\2\u0185\u0186\7\64\2\2\u0186\u0187\5> \2\u0187\u0188\7\65"+
		"\2\2\u0188\u018a\3\2\2\2\u0189\u017a\3\2\2\2\u0189\u017f\3\2\2\2\u0189"+
		"\u0184\3\2\2\2\u018a\65\3\2\2\2\u018b\u018c\b\34\1\2\u018c\u018d\5D#\2"+
		"\u018d\u0196\3\2\2\2\u018e\u018f\f\5\2\2\u018f\u0190\t\3\2\2\u0190\u0195"+
		"\5\66\34\6\u0191\u0192\f\4\2\2\u0192\u0193\t\4\2\2\u0193\u0195\5\66\34"+
		"\5\u0194\u018e\3\2\2\2\u0194\u0191\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\67\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019a\b\35\1\2\u019a\u019b\5\66\34\2\u019b\u019c\t\3\2\2\u019c\u019d"+
		"\58\35\b\u019d\u01a4\3\2\2\2\u019e\u019f\5\66\34\2\u019f\u01a0\t\4\2\2"+
		"\u01a0\u01a1\58\35\5\u01a1\u01a4\3\2\2\2\u01a2\u01a4\5B\"\2\u01a3\u0199"+
		"\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01b3\3\2\2\2\u01a5"+
		"\u01a6\f\t\2\2\u01a6\u01a7\t\3\2\2\u01a7\u01b2\58\35\n\u01a8\u01a9\f\6"+
		"\2\2\u01a9\u01aa\t\4\2\2\u01aa\u01b2\58\35\7\u01ab\u01ac\f\7\2\2\u01ac"+
		"\u01ad\t\3\2\2\u01ad\u01b2\5\66\34\2\u01ae\u01af\f\4\2\2\u01af\u01b0\t"+
		"\4\2\2\u01b0\u01b2\5\66\34\2\u01b1\u01a5\3\2\2\2\u01b1\u01a8\3\2\2\2\u01b1"+
		"\u01ab\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b49\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7"+
		"\b\36\1\2\u01b7\u01b8\5\66\34\2\u01b8\u01b9\7\30\2\2\u01b9\u01ba\5:\36"+
		"\4\u01ba\u01bd\3\2\2\2\u01bb\u01bd\5@!\2\u01bc\u01b6\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd\u01c3\3\2\2\2\u01be\u01bf\f\5\2\2\u01bf\u01c0\7\30\2\2"+
		"\u01c0\u01c2\5\66\34\2\u01c1\u01be\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4;\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c9\5J&\2\u01c7\u01c9\5L\'\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2"+
		"\2\u01c9=\3\2\2\2\u01ca\u01cb\b \1\2\u01cb\u01cc\5<\37\2\u01cc\u01cd\b"+
		" \1\2\u01cd\u01e0\3\2\2\2\u01ce\u01e0\5.\30\2\u01cf\u01e0\5\66\34\2\u01d0"+
		"\u01e0\58\35\2\u01d1\u01e0\5:\36\2\u01d2\u01e0\5,\27\2\u01d3\u01e0\5\30"+
		"\r\2\u01d4\u01e0\5@!\2\u01d5\u01e0\5F$\2\u01d6\u01e0\5B\"\2\u01d7\u01e0"+
		"\5D#\2\u01d8\u01e0\5H%\2\u01d9\u01da\t\5\2\2\u01da\u01e0\5> \f\u01db\u01dc"+
		"\7\62\2\2\u01dc\u01dd\5> \2\u01dd\u01de\7\63\2\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01ca\3\2\2\2\u01df\u01ce\3\2\2\2\u01df\u01cf\3\2\2\2\u01df\u01d0\3\2"+
		"\2\2\u01df\u01d1\3\2\2\2\u01df\u01d2\3\2\2\2\u01df\u01d3\3\2\2\2\u01df"+
		"\u01d4\3\2\2\2\u01df\u01d5\3\2\2\2\u01df\u01d6\3\2\2\2\u01df\u01d7\3\2"+
		"\2\2\u01df\u01d8\3\2\2\2\u01df\u01d9\3\2\2\2\u01df\u01db\3\2\2\2\u01e0"+
		"\u01fe\3\2\2\2\u01e1\u01e2\f\r\2\2\u01e2\u01e3\7\33\2\2\u01e3\u01fd\5"+
		"> \16\u01e4\u01e5\f\13\2\2\u01e5\u01e6\t\3\2\2\u01e6\u01fd\5> \f\u01e7"+
		"\u01e8\f\n\2\2\u01e8\u01e9\t\4\2\2\u01e9\u01fd\5> \13\u01ea\u01eb\f\t"+
		"\2\2\u01eb\u01ec\t\6\2\2\u01ec\u01fd\5> \n\u01ed\u01ee\f\b\2\2\u01ee\u01ef"+
		"\7)\2\2\u01ef\u01fd\5> \t\u01f0\u01f1\f\7\2\2\u01f1\u01f2\t\7\2\2\u01f2"+
		"\u01fd\5> \b\u01f3\u01f4\f\6\2\2\u01f4\u01f5\t\b\2\2\u01f5\u01fd\5> \7"+
		"\u01f6\u01f7\f\5\2\2\u01f7\u01f8\t\t\2\2\u01f8\u01fd\5> \6\u01f9\u01fa"+
		"\f\4\2\2\u01fa\u01fb\t\n\2\2\u01fb\u01fd\5> \5\u01fc\u01e1\3\2\2\2\u01fc"+
		"\u01e4\3\2\2\2\u01fc\u01e7\3\2\2\2\u01fc\u01ea\3\2\2\2\u01fc\u01ed\3\2"+
		"\2\2\u01fc\u01f0\3\2\2\2\u01fc\u01f3\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fc"+
		"\u01f9\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff?\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\3\2\2\u0202A\3\2"+
		"\2\2\u0203\u0204\7=\2\2\u0204C\3\2\2\2\u0205\u0206\7<\2\2\u0206E\3\2\2"+
		"\2\u0207\u0208\t\13\2\2\u0208G\3\2\2\2\u0209\u020a\7\66\2\2\u020aI\3\2"+
		"\2\2\u020b\u020c\7>\2\2\u020cK\3\2\2\2\u020d\u020e\7?\2\2\u020eM\3\2\2"+
		"\2\u020f\u0210\7@\2\2\u0210O\3\2\2\2\u0211\u0212\b)\1\2\u0212\u0215\7"+
		"\5\2\2\u0213\u0215\5R*\2\u0214\u0211\3\2\2\2\u0214\u0213\3\2\2\2\u0215"+
		"\u021c\3\2\2\2\u0216\u0217\f\6\2\2\u0217\u021b\7\5\2\2\u0218\u0219\f\5"+
		"\2\2\u0219\u021b\5R*\2\u021a\u0216\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021e"+
		"\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021dQ\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021f\u0220\7\6\2\2\u0220\u0221\b*\1\2\u0221S\3\2\2\2\u0222"+
		"\u0223\7\67\2\2\u0223\u0224\5> \2\u0224U\3\2\2\2&bn\u0084\u0088\u008f"+
		"\u0099\u00ae\u00ba\u00d0\u00f6\u010c\u0118\u011a\u0133\u013d\u0149\u014b"+
		"\u0158\u0165\u016d\u0177\u0189\u0194\u0196\u01a3\u01b1\u01b3\u01bc\u01c3"+
		"\u01c8\u01df\u01fc\u01fe\u0214\u021a\u021c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}