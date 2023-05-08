package Taller;

import org.antlr.v4.runtime.Token;


public class TokenTxt {

	private int linea, posicion, tipo; // Posicion y linea en la que se
										// encuentra
	private String lexema; // Lexema asociado al token

	public TokenTxt(int l, int p, String s, int tipo) {
		this.linea = l;
		this.posicion = p;
		this.lexema = s;
		this.tipo = tipo;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getSimbolo() {
		return lexema;
	}

	public void setSimbolo(String simbolo) {
		this.lexema = simbolo;
	}

	public static TokenTxt get(Token t) {
		if (t != null) {
			TokenTxt t2 = new TokenTxt(t.getLine(), t.getCharPositionInLine(), t.getText(), t.getType());
			return t2;
		}
		return null;

	}

}
