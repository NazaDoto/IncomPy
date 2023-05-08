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
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SimpleParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(SimpleParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(SimpleParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(SimpleParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(SimpleParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(SimpleParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(SimpleParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#valorbool}.
	 * @param ctx the parse tree
	 */
	void enterValorbool(SimpleParser.ValorboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#valorbool}.
	 * @param ctx the parse tree
	 */
	void exitValorbool(SimpleParser.ValorboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void enterRepeticion(SimpleParser.RepeticionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#repeticion}.
	 * @param ctx the parse tree
	 */
	void exitRepeticion(SimpleParser.RepeticionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#pregunta}.
	 * @param ctx the parse tree
	 */
	void enterPregunta(SimpleParser.PreguntaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#pregunta}.
	 * @param ctx the parse tree
	 */
	void exitPregunta(SimpleParser.PreguntaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(SimpleParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(SimpleParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#bloqueElse}.
	 * @param ctx the parse tree
	 */
	void enterBloqueElse(SimpleParser.BloqueElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#bloqueElse}.
	 * @param ctx the parse tree
	 */
	void exitBloqueElse(SimpleParser.BloqueElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(SimpleParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(SimpleParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#oprel}.
	 * @param ctx the parse tree
	 */
	void enterOprel(SimpleParser.OprelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#oprel}.
	 * @param ctx the parse tree
	 */
	void exitOprel(SimpleParser.OprelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#ingresar}.
	 * @param ctx the parse tree
	 */
	void enterIngresar(SimpleParser.IngresarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#ingresar}.
	 * @param ctx the parse tree
	 */
	void exitIngresar(SimpleParser.IngresarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SimpleParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SimpleParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(SimpleParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(SimpleParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void enterMensaje(SimpleParser.MensajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void exitMensaje(SimpleParser.MensajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#elementoMensaje}.
	 * @param ctx the parse tree
	 */
	void enterElementoMensaje(SimpleParser.ElementoMensajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#elementoMensaje}.
	 * @param ctx the parse tree
	 */
	void exitElementoMensaje(SimpleParser.ElementoMensajeContext ctx);
}