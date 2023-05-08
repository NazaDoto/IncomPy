package Taller.ast;

import java.util.Map;

public class Asignacion implements ASTNode {
	private String name;
	private ASTNode expresion;
	public Asignacion(String name, ASTNode expresion) {
		super();
		this.name = name;
		this.expresion = expresion;
	}
	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		System.out.println("Haciendo una asignacion: " + name);
		tablaSimbolos.put(name, String.valueOf(expresion.execute(tablaSimbolos).toString()));
		return null;
	}

}
