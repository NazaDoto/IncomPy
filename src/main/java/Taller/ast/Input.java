package Taller.ast;

import java.util.Map;
import javax.swing.*;

public class Input implements ASTNode {
	private ASTNode tipo;
	private ASTNode mensaje;
	public JTextArea areaOutput;
	public Input(ASTNode tipo, ASTNode mensaje, JTextArea areaOutput) {
		super();
		this.tipo = tipo;
		this.mensaje = mensaje;
		this.areaOutput = areaOutput;
	}
	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		switch(tipo.execute(tablaSimbolos).toString()) {
			case "int":
				try {
					return Integer.parseInt(JOptionPane.showInputDialog(mensaje.execute(tablaSimbolos)));
				} catch(NumberFormatException e){
					areaOutput.append("Error. La entrada no es de tipo Entero.\n");
					return null;
				}
				
				
			case "float":
				try {
					return Float.parseFloat(JOptionPane.showInputDialog(mensaje.execute(tablaSimbolos)));
				} catch(NumberFormatException e){
					areaOutput.append("Error. La entrada no es de tipo Float.\n");
					return null;
				}
				
				
			case "bool":
				try {
					return Boolean.parseBoolean(JOptionPane.showInputDialog(mensaje.execute(tablaSimbolos)));
				} catch(NumberFormatException e){
					areaOutput.append("Error. La entrada no es de tipo Booleano.\n");
					return null;
				}
				
				
			case "str":
				try {
					return JOptionPane.showInputDialog(mensaje.execute(tablaSimbolos));
				} catch(NumberFormatException e){
					areaOutput.append("Error. La entrada no es de tipo String.\n");
					return null;
				}
				
				
				default: 
					return null;
		}		
		
	}

}
