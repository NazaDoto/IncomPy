package Taller.ast;

import java.util.List;
import java.util.Map;

public class While implements ASTNode {
	private ASTNode cond;
	private List<ASTNode> body;
	public While(ASTNode cond, List<ASTNode> body) {
		super();
		this.cond = cond;
		this.body = body;
	}
	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		if(cond.execute(tablaSimbolos) == "true") {
			while(cond.execute(tablaSimbolos) == "true") {
				for(ASTNode n : body) {
					n.execute(tablaSimbolos);
				}
			} }else {
				
				while((boolean) cond.execute(tablaSimbolos)) {
					for(ASTNode n : body) {
						n.execute(tablaSimbolos);
					}
				}
			}
		
		return null;
	}

}
