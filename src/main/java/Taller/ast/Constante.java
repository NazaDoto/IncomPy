package Taller.ast;

import java.util.Map;

public class Constante implements ASTNode {
	private Object value;
	public Constante(Object value) {
		super();
		this.value = value;
	}
	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		System.out.println(value.toString());
		if(value.toString().startsWith("\"")) {
			value = value.toString().substring(1, value.toString().length() - 1);
		}
		
		return value;
	}

}
