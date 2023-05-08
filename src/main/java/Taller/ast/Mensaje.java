package Taller.ast;

import java.util.List;
import java.util.Map;

public class Mensaje implements ASTNode {
	List<ASTNode> comp;
	String mensaje;
	String retorno;
	
	public Mensaje(List<ASTNode> comp) {
		super();
		this.comp = comp;
		this.mensaje = "";
	}

	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		for (ASTNode n : comp) {		
			mensaje += String.valueOf(n.execute(tablaSimbolos));
		}
		retorno = mensaje;
		mensaje = "";
		return retorno;
	}

}
