package Taller.ast;

import java.util.Map;

public class Division implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Division(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Map<String, Object> tablaSimbolos) {
		try {
            int op1=Integer.parseInt(operand1.execute(tablaSimbolos).toString());
            int op2=Integer.parseInt(operand2.execute(tablaSimbolos).toString());
            
            if(op1 % op2 == 0) {
            	return op1 / op2;
            } else {return (float) op1 / op2;}
        } catch(NumberFormatException e) {
        	float op1=Float.parseFloat(operand1.execute(tablaSimbolos).toString());
            float op2=Float.parseFloat(operand2.execute(tablaSimbolos).toString());
            return op1 / op2;
        }
	}

}
