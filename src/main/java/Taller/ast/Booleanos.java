package Taller.ast;

import java.util.Map;

public class Booleanos implements ASTNode {
	private ASTNode valor1;
	private ASTNode valor2;
	private ASTNode cond;
	public Booleanos(ASTNode valor1, ASTNode cond, ASTNode valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.cond = cond;
	}
	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		switch((String)cond.execute(tablaSimbolos)) {
		case ">":
			if(Float.parseFloat((String) valor1.execute(tablaSimbolos)) > Float.parseFloat((String)valor2.execute(tablaSimbolos))) {
				return true;
			} else return false;
		case ">=":
			if(Float.parseFloat((String) valor1.execute(tablaSimbolos)) >= Float.parseFloat((String)valor2.execute(tablaSimbolos))) {
				return true;
			} else return false;
		case "<":
			if(Float.parseFloat((String) valor1.execute(tablaSimbolos)) < Float.parseFloat((String)valor2.execute(tablaSimbolos))) {
				return true;
			} else return false;
		case "<=":
			
			if(Float.parseFloat((String) valor1.execute(tablaSimbolos)) <= Float.parseFloat((String)valor2.execute(tablaSimbolos))) {
				return true;
			} else return false;
		case "==":
			if(Float.parseFloat((String) valor1.execute(tablaSimbolos)) == Float.parseFloat((String)valor2.execute(tablaSimbolos))) {
				return true;
			} else return false;
		case "!=":
			if(Float.parseFloat((String) valor1.execute(tablaSimbolos)) != Float.parseFloat((String)valor2.execute(tablaSimbolos))) {
				return true;
			} else return false;
			
		}
		return null;
	}

}
