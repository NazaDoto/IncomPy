package Taller.ast;
import java.util.Map;

import javax.swing.*;
public class Print implements ASTNode {
	private ASTNode datos;
	private JTextArea areaOutput;
	
	public Print(ASTNode datos, JTextArea areaOutput) {
		super();
		this.datos = datos;
		this.areaOutput = areaOutput;
	}

	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		System.out.println(datos.execute(tablaSimbolos));
				areaOutput.append(datos.execute(tablaSimbolos)+"\n");	
		return null;
	}

}
