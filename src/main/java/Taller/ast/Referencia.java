package Taller.ast;

import java.util.Map;
import javax.swing.JTextArea;

public class Referencia implements ASTNode {
	private String name;
	JTextArea areaOutput;
	public Referencia(String name, JTextArea areaOutput) {
		super();
		this.name = name;
		this.areaOutput = areaOutput;
	}
	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		// TODO Auto-generated method stub
		if (tablaSimbolos.containsKey(name)){
			return tablaSimbolos.get(name);
		} else {
			return "No se reconoce el símbolo \""+ name + "\"";		
	} 
		
	
		
	}

}
