package Taller.ast;

import java.util.List;
import java.util.Map;

public class If implements ASTNode {
	private ASTNode condicion;
	private List<ASTNode> body;
	private List<ASTNode> elseBody; 
	public If(ASTNode condicion, List<ASTNode> body, List<ASTNode> elseBody) {
		super();
		this.condicion = condicion;
		this.body = body;
		this.elseBody = elseBody;
	}
	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		
		if((boolean)condicion.execute(tablaSimbolos)) {
			for(ASTNode n : body) {
				n.execute(tablaSimbolos);
			}
		} else {
			for(ASTNode n : elseBody) {
				n.execute(tablaSimbolos);
			}
		}
		return null;
	}

}
