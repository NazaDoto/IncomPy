// Generated from Practico\Ejercicio_3\Simple.g4 by ANTLR 4.5.1
package Practico.Ejercicio_3;

	import java.util.Map;
	import java.util.HashMap;
	import javax.swing.*;
	import java.util.Scanner;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.Dimension;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.math.*;
	import Taller.ast.*;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_start = 0, RULE_sentencia = 1, RULE_comentario = 2, RULE_asignacion = 3, 
		RULE_b = 4, RULE_valor = 5, RULE_factor = 6, RULE_term = 7, RULE_valorbool = 8, 
		RULE_repeticion = 9, RULE_pregunta = 10, RULE_bloque = 11, RULE_bloqueElse = 12, 
		RULE_operacion = 13, RULE_oprel = 14, RULE_ingresar = 15, RULE_tipo = 16, 
		RULE_mostrar = 17, RULE_mensaje = 18, RULE_elementoMensaje = 19;
	public static final String[] ruleNames = {
		"start", "sentencia", "comentario", "asignacion", "b", "valor", "factor", 
		"term", "valorbool", "repeticion", "pregunta", "bloque", "bloqueElse", 
		"operacion", "oprel", "ingresar", "tipo", "mostrar", "mensaje", "elementoMensaje"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'break'", "'int'", "'float'", "'str'", 
		"'bool'", "'true'", "'false'", "'print'", "'input'", "'\n'", "'='", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'('", 
		"')'", "':'", "';'", "','", "'$'", "'.'", null, null, "'\"'", "'#'", null, 
		null, null, null, "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "WHILE", "BREAK", "INT", "FLOAT", "STR", "BOOL", "TRUE", 
		"FALSE", "PRINT", "INPUT", "ENTER", "ASSIGN", "MEN", "MAY", "MENIG", "MAYIG", 
		"IGUAL", "DIST", "SUM", "REST", "MULT", "DIV", "PARENTESIS_A", "PARENTESIS_C", 
		"DOSP", "PUNCOM", "COMA", "SIGPESOS", "PUNTO", "COMENTARIO", "MENSAJE", 
		"COMILLA", "COMMENT", "ID", "NUMERO", "LETRA", "DIGITO", "FIN", "WS"
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
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		HashMap<String, Object> Tabla = new HashMap<String, Object>();
		public ArrayList<String> erroresSem = new ArrayList<String>();
		HashMap<String, Object> tablaSimbolos = new HashMap<String, Object>();
		JTextArea areaOutput;
		public SimpleParser(TokenStream input, JTextArea areaOutput) {
			super(input);
			this.areaOutput = areaOutput;
			areaOutput.setText(null);
			_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		}

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public HashMap<String, Object> tabla;
		public SentenciaContext sentencia;
		public TerminalNode FIN() { return getToken(SimpleParser.FIN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> ENTER() { return getTokens(SimpleParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(SimpleParser.ENTER, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StartContext(ParserRuleContext parent, int invokingState, HashMap<String, Object> tabla) {
			super(parent, invokingState);
			this.tabla = tabla;
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start(HashMap<String, Object> tabla) throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState(), tabla);
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

					this.Tabla = tabla;
					
					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				((StartContext)_localctx).sentencia = sentencia();
				body.add(((StartContext)_localctx).sentencia.node);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENTER) {
					{
					{
					setState(43);
					match(ENTER);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << INT) | (1L << FLOAT) | (1L << STR) | (1L << BOOL) | (1L << PRINT) | (1L << COMENTARIO) | (1L << ID))) != 0) );
			for(ASTNode n : body){
					n.execute(tablaSimbolos);
				}
			setState(54);
			match(FIN);
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

	public static class SentenciaContext extends ParserRuleContext {
		public ASTNode node;
		public RepeticionContext repeticion;
		public PreguntaContext pregunta;
		public AsignacionContext asignacion;
		public IngresarContext ingresar;
		public MostrarContext mostrar;
		public RepeticionContext repeticion() {
			return getRuleContext(RepeticionContext.class,0);
		}
		public PreguntaContext pregunta() {
			return getRuleContext(PreguntaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IngresarContext ingresar() {
			return getRuleContext(IngresarContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public List<TerminalNode> ENTER() { return getTokens(SimpleParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(SimpleParser.ENTER, i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			int _alt;
			setState(78);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((SentenciaContext)_localctx).repeticion = repeticion();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).repeticion.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((SentenciaContext)_localctx).pregunta = pregunta();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).pregunta.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				((SentenciaContext)_localctx).asignacion = asignacion();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).asignacion.node;
				}
				break;
			case INT:
			case FLOAT:
			case STR:
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				((SentenciaContext)_localctx).ingresar = ingresar();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).ingresar.node;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				((SentenciaContext)_localctx).mostrar = mostrar();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).mostrar.node;
				}
				break;
			case COMENTARIO:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				comentario();
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(72);
						match(ENTER);
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO() { return getToken(SimpleParser.COMENTARIO, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(COMENTARIO);
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

	public static class AsignacionContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public BContext b;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(83);
			match(ASSIGN);
			setState(84);
			((AsignacionContext)_localctx).b = b();
			((AsignacionContext)_localctx).node =  new Asignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).b.node);
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

	public static class BContext extends ParserRuleContext {
		public ASTNode node;
		public IngresarContext ingresar;
		public ValorContext valor;
		public ValorboolContext valorbool;
		public IngresarContext ingresar() {
			return getRuleContext(IngresarContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ValorboolContext valorbool() {
			return getRuleContext(ValorboolContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_b);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((BContext)_localctx).ingresar = ingresar();
				((BContext)_localctx).node =  ((BContext)_localctx).ingresar.node;
				}
				break;
			case PARENTESIS_A:
			case MENSAJE:
			case ID:
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((BContext)_localctx).valor = valor();
				((BContext)_localctx).node =  ((BContext)_localctx).valor.node;
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				((BContext)_localctx).valorbool = valorbool();
				((BContext)_localctx).node =  ((BContext)_localctx).valorbool.node;
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

	public static class ValorContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(SimpleParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(SimpleParser.SUM, i);
		}
		public List<TerminalNode> REST() { return getTokens(SimpleParser.REST); }
		public TerminalNode REST(int i) {
			return getToken(SimpleParser.REST, i);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((ValorContext)_localctx).t1 = factor();
			((ValorContext)_localctx).node =  ((ValorContext)_localctx).t1.node;
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				setState(108);
				switch (_input.LA(1)) {
				case SUM:
					{
					setState(100);
					match(SUM);
					setState(101);
					((ValorContext)_localctx).t2 = factor();
					((ValorContext)_localctx).node =  new Suma(_localctx.node, ((ValorContext)_localctx).t2.node);
					}
					break;
				case REST:
					{
					setState(104);
					match(REST);
					setState(105);
					((ValorContext)_localctx).t2 = factor();
					((ValorContext)_localctx).node =  new Resta(_localctx.node, ((ValorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(112);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SimpleParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SimpleParser.DIV, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(123);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(115);
					match(MULT);
					setState(116);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplicacion(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					break;
				case DIV:
					{
					setState(119);
					match(DIV);
					setState(120);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMERO;
		public Token ID;
		public Token MENSAJE;
		public ValorContext valor;
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode MENSAJE() { return getToken(SimpleParser.MENSAJE, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(SimpleParser.PARENTESIS_A, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PARENTESIS_C() { return getToken(SimpleParser.PARENTESIS_C, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((TermContext)_localctx).NUMERO = match(NUMERO);
				((TermContext)_localctx).node =  new Constante((((TermContext)_localctx).NUMERO!=null?((TermContext)_localctx).NUMERO.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new Referencia((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null), areaOutput);
				}
				break;
			case MENSAJE:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((TermContext)_localctx).MENSAJE = match(MENSAJE);
				((TermContext)_localctx).node =  new Constante((((TermContext)_localctx).MENSAJE!=null?((TermContext)_localctx).MENSAJE.getText():null));
				}
				break;
			case PARENTESIS_A:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(PARENTESIS_A);
				setState(135);
				((TermContext)_localctx).valor = valor();
				((TermContext)_localctx).node =  ((TermContext)_localctx).valor.node;
				setState(137);
				match(PARENTESIS_C);
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

	public static class ValorboolContext extends ParserRuleContext {
		public ASTNode node;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(SimpleParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimpleParser.FALSE, 0); }
		public ValorboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterValorbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitValorbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitValorbool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorboolContext valorbool() throws RecognitionException {
		ValorboolContext _localctx = new ValorboolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valorbool);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((ValorboolContext)_localctx).TRUE = match(TRUE);
				((ValorboolContext)_localctx).node =  new Constante(Boolean.parseBoolean((((ValorboolContext)_localctx).TRUE!=null?((ValorboolContext)_localctx).TRUE.getText():null)));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((ValorboolContext)_localctx).FALSE = match(FALSE);
				((ValorboolContext)_localctx).node =  new Constante(Boolean.parseBoolean((((ValorboolContext)_localctx).FALSE!=null?((ValorboolContext)_localctx).FALSE.getText():null)));
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

	public static class RepeticionContext extends ParserRuleContext {
		public ASTNode node;
		public OperacionContext operacion;
		public BloqueContext bloque;
		public TerminalNode WHILE() { return getToken(SimpleParser.WHILE, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public RepeticionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRepeticion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRepeticion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitRepeticion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticionContext repeticion() throws RecognitionException {
		RepeticionContext _localctx = new RepeticionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeticion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(WHILE);
			setState(148);
			((RepeticionContext)_localctx).operacion = operacion();
			setState(149);
			((RepeticionContext)_localctx).bloque = bloque();
			((RepeticionContext)_localctx).node =  new While(((RepeticionContext)_localctx).operacion.node, ((RepeticionContext)_localctx).bloque.node); 	
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

	public static class PreguntaContext extends ParserRuleContext {
		public ASTNode node;
		public OperacionContext operacion;
		public BloqueContext bloque;
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public PreguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pregunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPregunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPregunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitPregunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreguntaContext pregunta() throws RecognitionException {
		PreguntaContext _localctx = new PreguntaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pregunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IF);
			setState(153);
			((PreguntaContext)_localctx).operacion = operacion();
			setState(154);
			((PreguntaContext)_localctx).bloque = bloque();
			((PreguntaContext)_localctx).node =  new If(((PreguntaContext)_localctx).operacion.node, ((PreguntaContext)_localctx).bloque.node, ((PreguntaContext)_localctx).bloque.nodeElse);
				
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

	public static class BloqueContext extends ParserRuleContext {
		public List<ASTNode> node;
		public List<ASTNode> nodeElse;
		public SentenciaContext sentencia;
		public BloqueElseContext bloqueElse;
		public TerminalNode DOSP() { return getToken(SimpleParser.DOSP, 0); }
		public List<TerminalNode> ENTER() { return getTokens(SimpleParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(SimpleParser.ENTER, i);
		}
		public TerminalNode PUNCOM() { return getToken(SimpleParser.PUNCOM, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueElseContext bloqueElse() {
			return getRuleContext(BloqueElseContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(DOSP);
				setState(158);
				match(ENTER);

						List<ASTNode> bodyBloque = new ArrayList<ASTNode>();
					
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					((BloqueContext)_localctx).sentencia = sentencia();
					bodyBloque.add(((BloqueContext)_localctx).sentencia.node);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENTER) {
						{
						{
						setState(162);
						match(ENTER);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << INT) | (1L << FLOAT) | (1L << STR) | (1L << BOOL) | (1L << PRINT) | (1L << COMENTARIO) | (1L << ID))) != 0) );
				setState(172);
				match(PUNCOM);

					 	((BloqueContext)_localctx).node =  bodyBloque;
					 	((BloqueContext)_localctx).nodeElse =  null;
					 		
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(DOSP);
				setState(176);
				match(ENTER);

						List<ASTNode> bodyBloque = new ArrayList<ASTNode>();
					
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					((BloqueContext)_localctx).sentencia = sentencia();
					bodyBloque.add(((BloqueContext)_localctx).sentencia.node);
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENTER) {
						{
						{
						setState(180);
						match(ENTER);
						}
						}
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << INT) | (1L << FLOAT) | (1L << STR) | (1L << BOOL) | (1L << PRINT) | (1L << COMENTARIO) | (1L << ID))) != 0) );
				setState(190);
				((BloqueContext)_localctx).bloqueElse = bloqueElse();
				setState(191);
				match(PUNCOM);

					 	((BloqueContext)_localctx).node =  bodyBloque;
					 	((BloqueContext)_localctx).nodeElse =  ((BloqueContext)_localctx).bloqueElse.node;	
						
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

	public static class BloqueElseContext extends ParserRuleContext {
		public List<ASTNode> node;
		public SentenciaContext sentencia;
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public TerminalNode DOSP() { return getToken(SimpleParser.DOSP, 0); }
		public List<TerminalNode> ENTER() { return getTokens(SimpleParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(SimpleParser.ENTER, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBloqueElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBloqueElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBloqueElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueElseContext bloqueElse() throws RecognitionException {
		BloqueElseContext _localctx = new BloqueElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloqueElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ELSE);
			setState(197);
			match(DOSP);
			setState(198);
			match(ENTER);

					List<ASTNode> elseBody = new ArrayList<ASTNode>();
				
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				((BloqueElseContext)_localctx).sentencia = sentencia();
				elseBody.add(((BloqueElseContext)_localctx).sentencia.node);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENTER) {
					{
					{
					setState(202);
					match(ENTER);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << INT) | (1L << FLOAT) | (1L << STR) | (1L << BOOL) | (1L << PRINT) | (1L << COMENTARIO) | (1L << ID))) != 0) );
			((BloqueElseContext)_localctx).node =  elseBody;
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

	public static class OperacionContext extends ParserRuleContext {
		public ASTNode node;
		public ValorContext v1;
		public OprelContext oprel;
		public ValorContext v2;
		public ValorboolContext valorbool;
		public Token ID;
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ValorboolContext valorbool() {
			return getRuleContext(ValorboolContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operacion);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((OperacionContext)_localctx).v1 = valor();
				setState(215);
				((OperacionContext)_localctx).oprel = oprel();
				setState(216);
				((OperacionContext)_localctx).v2 = valor();
				((OperacionContext)_localctx).node =  new Booleanos(((OperacionContext)_localctx).v1.node, ((OperacionContext)_localctx).oprel.node, ((OperacionContext)_localctx).v2.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((OperacionContext)_localctx).valorbool = valorbool();
				((OperacionContext)_localctx).node =  ((OperacionContext)_localctx).valorbool.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				((OperacionContext)_localctx).ID = match(ID);
				((OperacionContext)_localctx).node =  new Referencia((((OperacionContext)_localctx).ID!=null?((OperacionContext)_localctx).ID.getText():null), areaOutput);
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

	public static class OprelContext extends ParserRuleContext {
		public ASTNode node;
		public Token MEN;
		public Token MAY;
		public Token MENIG;
		public Token MAYIG;
		public Token IGUAL;
		public Token DIST;
		public TerminalNode MEN() { return getToken(SimpleParser.MEN, 0); }
		public TerminalNode MAY() { return getToken(SimpleParser.MAY, 0); }
		public TerminalNode MENIG() { return getToken(SimpleParser.MENIG, 0); }
		public TerminalNode MAYIG() { return getToken(SimpleParser.MAYIG, 0); }
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public TerminalNode DIST() { return getToken(SimpleParser.DIST, 0); }
		public OprelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOprel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOprel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOprel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprelContext oprel() throws RecognitionException {
		OprelContext _localctx = new OprelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_oprel);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case MEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((OprelContext)_localctx).MEN = match(MEN);
				((OprelContext)_localctx).node =  new Constante((((OprelContext)_localctx).MEN!=null?((OprelContext)_localctx).MEN.getText():null));
				}
				break;
			case MAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				((OprelContext)_localctx).MAY = match(MAY);
				((OprelContext)_localctx).node =  new Constante((((OprelContext)_localctx).MAY!=null?((OprelContext)_localctx).MAY.getText():null));
				}
				break;
			case MENIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				((OprelContext)_localctx).MENIG = match(MENIG);
				((OprelContext)_localctx).node =  new Constante((((OprelContext)_localctx).MENIG!=null?((OprelContext)_localctx).MENIG.getText():null));
				}
				break;
			case MAYIG:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				((OprelContext)_localctx).MAYIG = match(MAYIG);
				((OprelContext)_localctx).node =  new Constante((((OprelContext)_localctx).MAYIG!=null?((OprelContext)_localctx).MAYIG.getText():null));
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				((OprelContext)_localctx).IGUAL = match(IGUAL);
				((OprelContext)_localctx).node =  new Constante((((OprelContext)_localctx).IGUAL!=null?((OprelContext)_localctx).IGUAL.getText():null));
				}
				break;
			case DIST:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				((OprelContext)_localctx).DIST = match(DIST);
				((OprelContext)_localctx).node =  new Constante((((OprelContext)_localctx).DIST!=null?((OprelContext)_localctx).DIST.getText():null));
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

	public static class IngresarContext extends ParserRuleContext {
		public ASTNode node;
		public TipoContext tipo;
		public MensajeContext mensaje;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> PARENTESIS_A() { return getTokens(SimpleParser.PARENTESIS_A); }
		public TerminalNode PARENTESIS_A(int i) {
			return getToken(SimpleParser.PARENTESIS_A, i);
		}
		public TerminalNode INPUT() { return getToken(SimpleParser.INPUT, 0); }
		public MensajeContext mensaje() {
			return getRuleContext(MensajeContext.class,0);
		}
		public List<TerminalNode> PARENTESIS_C() { return getTokens(SimpleParser.PARENTESIS_C); }
		public TerminalNode PARENTESIS_C(int i) {
			return getToken(SimpleParser.PARENTESIS_C, i);
		}
		public IngresarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingresar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIngresar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIngresar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitIngresar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngresarContext ingresar() throws RecognitionException {
		IngresarContext _localctx = new IngresarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ingresar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((IngresarContext)_localctx).tipo = tipo();
			setState(241);
			match(PARENTESIS_A);
			setState(242);
			match(INPUT);
			setState(243);
			match(PARENTESIS_A);
			setState(244);
			((IngresarContext)_localctx).mensaje = mensaje();
			setState(245);
			match(PARENTESIS_C);
			setState(246);
			match(PARENTESIS_C);
			((IngresarContext)_localctx).node =  new Input(((IngresarContext)_localctx).tipo.node, ((IngresarContext)_localctx).mensaje.node, areaOutput);
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

	public static class TipoContext extends ParserRuleContext {
		public ASTNode node;
		public Token INT;
		public Token FLOAT;
		public Token STR;
		public Token BOOL;
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(SimpleParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(SimpleParser.BOOL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		try {
			setState(257);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((TipoContext)_localctx).INT = match(INT);
				((TipoContext)_localctx).node =  new Constante((((TipoContext)_localctx).INT!=null?((TipoContext)_localctx).INT.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((TipoContext)_localctx).FLOAT = match(FLOAT);
				((TipoContext)_localctx).node =  new Constante((((TipoContext)_localctx).FLOAT!=null?((TipoContext)_localctx).FLOAT.getText():null));
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				((TipoContext)_localctx).STR = match(STR);
				((TipoContext)_localctx).node =  new Constante((((TipoContext)_localctx).STR!=null?((TipoContext)_localctx).STR.getText():null));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				((TipoContext)_localctx).BOOL = match(BOOL);
				((TipoContext)_localctx).node =  new Constante((((TipoContext)_localctx).BOOL!=null?((TipoContext)_localctx).BOOL.getText():null));
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

	public static class MostrarContext extends ParserRuleContext {
		public ASTNode node;
		public MensajeContext mensaje;
		public TerminalNode PRINT() { return getToken(SimpleParser.PRINT, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(SimpleParser.PARENTESIS_A, 0); }
		public MensajeContext mensaje() {
			return getRuleContext(MensajeContext.class,0);
		}
		public TerminalNode PARENTESIS_C() { return getToken(SimpleParser.PARENTESIS_C, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PRINT);
			setState(260);
			match(PARENTESIS_A);
			setState(261);
			((MostrarContext)_localctx).mensaje = mensaje();
			setState(262);
			match(PARENTESIS_C);
			((MostrarContext)_localctx).node =  new Print(((MostrarContext)_localctx).mensaje.node, areaOutput);
				
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

	public static class MensajeContext extends ParserRuleContext {
		public ASTNode node;
		public ElementoMensajeContext elementoMensaje;
		public List<ElementoMensajeContext> elementoMensaje() {
			return getRuleContexts(ElementoMensajeContext.class);
		}
		public ElementoMensajeContext elementoMensaje(int i) {
			return getRuleContext(ElementoMensajeContext.class,i);
		}
		public MensajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensaje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMensaje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMensaje(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMensaje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MensajeContext mensaje() throws RecognitionException {
		MensajeContext _localctx = new MensajeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mensaje);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<ASTNode> comp = new ArrayList<ASTNode>();
			setState(269); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(266);
					((MensajeContext)_localctx).elementoMensaje = elementoMensaje();
					comp.add(((MensajeContext)_localctx).elementoMensaje.node);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			((MensajeContext)_localctx).node =  new Mensaje(comp);	
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

	public static class ElementoMensajeContext extends ParserRuleContext {
		public ASTNode node;
		public Token MENSAJE;
		public Token ID;
		public Token NUMERO;
		public ValorContext valor;
		public MensajeContext mensaje;
		public TerminalNode MENSAJE() { return getToken(SimpleParser.MENSAJE, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(SimpleParser.NUMERO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SimpleParser.COMA, 0); }
		public MensajeContext mensaje() {
			return getRuleContext(MensajeContext.class,0);
		}
		public ElementoMensajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoMensaje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterElementoMensaje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitElementoMensaje(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitElementoMensaje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoMensajeContext elementoMensaje() throws RecognitionException {
		ElementoMensajeContext _localctx = new ElementoMensajeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementoMensaje);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((ElementoMensajeContext)_localctx).MENSAJE = match(MENSAJE);
				((ElementoMensajeContext)_localctx).node =  new Constante((((ElementoMensajeContext)_localctx).MENSAJE!=null?((ElementoMensajeContext)_localctx).MENSAJE.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((ElementoMensajeContext)_localctx).ID = match(ID);
				((ElementoMensajeContext)_localctx).node =  new Referencia((((ElementoMensajeContext)_localctx).ID!=null?((ElementoMensajeContext)_localctx).ID.getText():null), areaOutput);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				((ElementoMensajeContext)_localctx).NUMERO = match(NUMERO);
				((ElementoMensajeContext)_localctx).node =  new Constante((((ElementoMensajeContext)_localctx).NUMERO!=null?((ElementoMensajeContext)_localctx).NUMERO.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				((ElementoMensajeContext)_localctx).valor = valor();
				((ElementoMensajeContext)_localctx).node =  ((ElementoMensajeContext)_localctx).valor.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(COMA);
				setState(285);
				((ElementoMensajeContext)_localctx).mensaje = mensaje();
				((ElementoMensajeContext)_localctx).node =  ((ElementoMensajeContext)_localctx).mensaje.node;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\5\3Q\n\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6c"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\3"+
		"\n\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\6\r\u00ab\n\r\r\r\16"+
		"\r\u00ac\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb"+
		"\13\r\6\r\u00bd\n\r\r\r\16\r\u00be\3\r\3\r\3\r\3\r\5\r\u00c5\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16"+
		"\6\16\u00d3\n\16\r\16\16\16\u00d4\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00e3\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0104"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u0110\n\24"+
		"\r\24\16\24\u0111\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0123\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\2\u0138\2*\3\2\2\2\4P\3\2\2\2\6R\3\2\2\2"+
		"\bT\3\2\2\2\nb\3\2\2\2\fd\3\2\2\2\16s\3\2\2\2\20\u008d\3\2\2\2\22\u0093"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u009a\3\2\2\2\30\u00c4\3\2\2\2\32\u00c6\3"+
		"\2\2\2\34\u00e2\3\2\2\2\36\u00f0\3\2\2\2 \u00f2\3\2\2\2\"\u0103\3\2\2"+
		"\2$\u0105\3\2\2\2&\u010b\3\2\2\2(\u0122\3\2\2\2*\63\b\2\1\2+,\5\4\3\2"+
		",\60\b\2\1\2-/\7\17\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2"+
		"\2\61\64\3\2\2\2\62\60\3\2\2\2\63+\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\3\2\2\2\678\b\2\1\289\7*\2\29\3\3\2\2\2:;\5\24\13"+
		"\2;<\b\3\1\2<Q\3\2\2\2=>\5\26\f\2>?\b\3\1\2?Q\3\2\2\2@A\5\b\5\2AB\b\3"+
		"\1\2BQ\3\2\2\2CD\5 \21\2DE\b\3\1\2EQ\3\2\2\2FG\5$\23\2GH\b\3\1\2HQ\3\2"+
		"\2\2IM\5\6\4\2JL\7\17\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2P:\3\2\2\2P=\3\2\2\2P@\3\2\2\2PC\3\2\2\2PF\3\2\2\2PI\3"+
		"\2\2\2Q\5\3\2\2\2RS\7\"\2\2S\7\3\2\2\2TU\7&\2\2UV\7\20\2\2VW\5\n\6\2W"+
		"X\b\5\1\2X\t\3\2\2\2YZ\5 \21\2Z[\b\6\1\2[c\3\2\2\2\\]\5\f\7\2]^\b\6\1"+
		"\2^c\3\2\2\2_`\5\22\n\2`a\b\6\1\2ac\3\2\2\2bY\3\2\2\2b\\\3\2\2\2b_\3\2"+
		"\2\2c\13\3\2\2\2de\5\16\b\2ep\b\7\1\2fg\7\27\2\2gh\5\16\b\2hi\b\7\1\2"+
		"io\3\2\2\2jk\7\30\2\2kl\5\16\b\2lm\b\7\1\2mo\3\2\2\2nf\3\2\2\2nj\3\2\2"+
		"\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2st\5\20\t\2t\177"+
		"\b\b\1\2uv\7\31\2\2vw\5\20\t\2wx\b\b\1\2x~\3\2\2\2yz\7\32\2\2z{\5\20\t"+
		"\2{|\b\b\1\2|~\3\2\2\2}u\3\2\2\2}y\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\17\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\'"+
		"\2\2\u0083\u008e\b\t\1\2\u0084\u0085\7&\2\2\u0085\u008e\b\t\1\2\u0086"+
		"\u0087\7#\2\2\u0087\u008e\b\t\1\2\u0088\u0089\7\33\2\2\u0089\u008a\5\f"+
		"\7\2\u008a\u008b\b\t\1\2\u008b\u008c\7\34\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0082\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0088\3\2"+
		"\2\2\u008e\21\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0094\b\n\1\2\u0091\u0092"+
		"\7\f\2\2\u0092\u0094\b\n\1\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\23\3\2\2\2\u0095\u0096\7\5\2\2\u0096\u0097\5\34\17\2\u0097\u0098\5\30"+
		"\r\2\u0098\u0099\b\13\1\2\u0099\25\3\2\2\2\u009a\u009b\7\3\2\2\u009b\u009c"+
		"\5\34\17\2\u009c\u009d\5\30\r\2\u009d\u009e\b\f\1\2\u009e\27\3\2\2\2\u009f"+
		"\u00a0\7\35\2\2\u00a0\u00a1\7\17\2\2\u00a1\u00aa\b\r\1\2\u00a2\u00a3\5"+
		"\4\3\2\u00a3\u00a7\b\r\1\2\u00a4\u00a6\7\17\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\36"+
		"\2\2\u00af\u00b0\b\r\1\2\u00b0\u00c5\3\2\2\2\u00b1\u00b2\7\35\2\2\u00b2"+
		"\u00b3\7\17\2\2\u00b3\u00bc\b\r\1\2\u00b4\u00b5\5\4\3\2\u00b5\u00b9\b"+
		"\r\1\2\u00b6\u00b8\7\17\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00b4\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00c2\7"+
		"\36\2\2\u00c2\u00c3\b\r\1\2\u00c3\u00c5\3\2\2\2\u00c4\u009f\3\2\2\2\u00c4"+
		"\u00b1\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\7\35\2"+
		"\2\u00c8\u00c9\7\17\2\2\u00c9\u00d2\b\16\1\2\u00ca\u00cb\5\4\3\2\u00cb"+
		"\u00cf\b\16\1\2\u00cc\u00ce\7\17\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\16\1\2\u00d7"+
		"\33\3\2\2\2\u00d8\u00d9\5\f\7\2\u00d9\u00da\5\36\20\2\u00da\u00db\5\f"+
		"\7\2\u00db\u00dc\b\17\1\2\u00dc\u00e3\3\2\2\2\u00dd\u00de\5\22\n\2\u00de"+
		"\u00df\b\17\1\2\u00df\u00e3\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e3\b\17"+
		"\1\2\u00e2\u00d8\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\35\3\2\2\2\u00e4\u00e5\7\21\2\2\u00e5\u00f1\b\20\1\2\u00e6\u00e7\7\22"+
		"\2\2\u00e7\u00f1\b\20\1\2\u00e8\u00e9\7\23\2\2\u00e9\u00f1\b\20\1\2\u00ea"+
		"\u00eb\7\24\2\2\u00eb\u00f1\b\20\1\2\u00ec\u00ed\7\25\2\2\u00ed\u00f1"+
		"\b\20\1\2\u00ee\u00ef\7\26\2\2\u00ef\u00f1\b\20\1\2\u00f0\u00e4\3\2\2"+
		"\2\u00f0\u00e6\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f3\5\"\22\2\u00f3"+
		"\u00f4\7\33\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f6\7\33\2\2\u00f6\u00f7"+
		"\5&\24\2\u00f7\u00f8\7\34\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\b\21\1"+
		"\2\u00fa!\3\2\2\2\u00fb\u00fc\7\7\2\2\u00fc\u0104\b\22\1\2\u00fd\u00fe"+
		"\7\b\2\2\u00fe\u0104\b\22\1\2\u00ff\u0100\7\t\2\2\u0100\u0104\b\22\1\2"+
		"\u0101\u0102\7\n\2\2\u0102\u0104\b\22\1\2\u0103\u00fb\3\2\2\2\u0103\u00fd"+
		"\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0104#\3\2\2\2\u0105"+
		"\u0106\7\r\2\2\u0106\u0107\7\33\2\2\u0107\u0108\5&\24\2\u0108\u0109\7"+
		"\34\2\2\u0109\u010a\b\23\1\2\u010a%\3\2\2\2\u010b\u010f\b\24\1\2\u010c"+
		"\u010d\5(\25\2\u010d\u010e\b\24\1\2\u010e\u0110\3\2\2\2\u010f\u010c\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\b\24\1\2\u0114\'\3\2\2\2\u0115\u0116\7#\2\2"+
		"\u0116\u0123\b\25\1\2\u0117\u0118\7&\2\2\u0118\u0123\b\25\1\2\u0119\u011a"+
		"\7\'\2\2\u011a\u0123\b\25\1\2\u011b\u011c\5\f\7\2\u011c\u011d\b\25\1\2"+
		"\u011d\u0123\3\2\2\2\u011e\u011f\7\37\2\2\u011f\u0120\5&\24\2\u0120\u0121"+
		"\b\25\1\2\u0121\u0123\3\2\2\2\u0122\u0115\3\2\2\2\u0122\u0117\3\2\2\2"+
		"\u0122\u0119\3\2\2\2\u0122\u011b\3\2\2\2\u0122\u011e\3\2\2\2\u0123)\3"+
		"\2\2\2\31\60\65MPbnp}\177\u008d\u0093\u00a7\u00ac\u00b9\u00be\u00c4\u00cf"+
		"\u00d4\u00e2\u00f0\u0103\u0111\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}