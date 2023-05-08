grammar Simple;
@lexer::header{
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
}
@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import javax.swing.*;
	import java.util.Scanner;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.Dimension;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.math.*;
	import Taller.ast.*;
	
}
@parser::members{
	HashMap<String, Object> Tabla = new HashMap<String, Object>();
	public ArrayList<String> erroresSem = new ArrayList<String>();
	HashMap<String, Object> tablaSimbolos = new HashMap<String, Object>();
	JTextArea areaOutput;
	public SimpleParser(TokenStream input, JTextArea areaOutput) {
		super(input);
		this.areaOutput = areaOutput;
		areaOutput.setText(null);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
}
@lexer::members{
	
	JTextArea areaOutput;
	public SimpleLexer(CharStream input, JTextArea areaOutput) {
		super(input);
		this.areaOutput = areaOutput;
		areaOutput.setText(null);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	
}

//Analisis Sintactico
start [HashMap<String, Object> tabla]:  
	{
		this.Tabla = tabla;
		
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	(sentencia {body.add($sentencia.node);} ENTER*  )+ 
	{for(ASTNode n : body){
		n.execute(tablaSimbolos);
	}}
	 FIN;

sentencia returns[ASTNode node]:
	repeticion {$node = $repeticion.node;}
	| pregunta {$node = $pregunta.node;}
	| asignacion {$node = $asignacion.node;}
	| ingresar {$node = $ingresar.node;}
	| mostrar{$node = $mostrar.node;}
	| comentario ENTER*;

comentario: COMENTARIO;

asignacion returns[ASTNode node]: 
	ID ASSIGN b {$node = new Asignacion($ID.text, $b.node);};
b returns[ASTNode node]: 
	ingresar {$node = $ingresar.node;} 
	| valor {$node = $valor.node;}
	| valorbool {$node = $valorbool.node;};

valor returns[ASTNode node]: 
	t1=factor {$node = $t1.node;}
	(SUM t2=factor {$node = new Suma($node, $t2.node);} | REST t2=factor {$node = new Resta($node, $t2.node);})*;
		
factor returns [ASTNode node]: 
	t1=term {$node = $t1.node;}
	(MULT t2=term {$node = new Multiplicacion($node, $t2.node);} | DIV t2=term {$node = new Division($node, $t2.node);})*;

		
term returns [ASTNode node]:
	  NUMERO {$node = new Constante($NUMERO.text);}
	| ID{$node = new Referencia($ID.text, areaOutput);}
	| MENSAJE{$node = new Constante($MENSAJE.text);}
	| PARENTESIS_A valor {$node = $valor.node;} PARENTESIS_C ;
	
valorbool returns[ASTNode node]:
	TRUE {$node = new Constante(Boolean.parseBoolean($TRUE.text));}
	| FALSE {$node = new Constante(Boolean.parseBoolean($FALSE.text));};
		
repeticion returns[ASTNode node]: 
	WHILE operacion bloque
		{$node = new While($operacion.node, $bloque.node); 	};
pregunta returns[ASTNode node]: 
	IF operacion bloque
	{$node = new If($operacion.node, $bloque.node, $bloque.nodeElse);
	};
bloque returns[List<ASTNode> node, List<ASTNode> nodeElse]: DOSP ENTER
	{
		List<ASTNode> bodyBloque = new ArrayList<ASTNode>();
	}
	 (sentencia {bodyBloque.add($sentencia.node);} ENTER*)+
	 PUNCOM {
	 	$node = bodyBloque;
	 	$nodeElse = null;
	 		
		}
		|
		DOSP ENTER
	{
		List<ASTNode> bodyBloque = new ArrayList<ASTNode>();
	}
	 (sentencia {bodyBloque.add($sentencia.node);} ENTER*)+
	 bloqueElse
	 PUNCOM {
	 	$node = bodyBloque;
	 	$nodeElse = $bloqueElse.node;	
		}
	;
bloqueElse returns[List<ASTNode> node]: ELSE DOSP ENTER
	{
		List<ASTNode> elseBody = new ArrayList<ASTNode>();
	} (sentencia {elseBody.add($sentencia.node);} ENTER*)+ 
		{$node = elseBody;};
	

operacion returns[ASTNode node]: 
	v1=valor oprel v2=valor {$node = new Booleanos($v1.node, $oprel.node, $v2.node);}
	| valorbool {$node = $valorbool.node;} 
	| ID{$node = new Referencia($ID.text, areaOutput);};
oprel returns[ASTNode node]: 
	MEN {$node = new Constante($MEN.text);}
	| MAY {$node = new Constante($MAY.text);}
	| MENIG {$node = new Constante($MENIG.text);}
	| MAYIG {$node = new Constante($MAYIG.text);}
	| IGUAL {$node = new Constante($IGUAL.text);}
	| DIST{$node = new Constante($DIST.text);};

ingresar returns[ASTNode node]: tipo PARENTESIS_A INPUT PARENTESIS_A mensaje PARENTESIS_C PARENTESIS_C {$node = new Input($tipo.node, $mensaje.node, areaOutput);};
tipo returns[ASTNode node]: 
	INT {$node = new Constante($INT.text);}
	| FLOAT {$node = new Constante($FLOAT.text);}
	| STR {$node = new Constante($STR.text);}
	| BOOL {$node = new Constante($BOOL.text);};
mostrar returns[ASTNode node]: 
	PRINT PARENTESIS_A mensaje PARENTESIS_C {$node = new Print($mensaje.node, areaOutput);
	};
mensaje returns [ASTNode node]: 
	{List<ASTNode> comp = new ArrayList<ASTNode>();}
	(elementoMensaje {comp.add($elementoMensaje.node);})+
	{$node = new Mensaje(comp);	};
elementoMensaje returns [ASTNode node]:
MENSAJE {$node = new Constante($MENSAJE.text);}
		| ID {$node = new Referencia($ID.text, areaOutput);}
		| NUMERO {$node = new Constante($NUMERO.text);}
		| valor {$node = $valor.node;}
		| COMA mensaje {$node = $mensaje.node;};


//Analisis Lexico
IF: 'if';
ELSE: 'else';
WHILE: 'while';
BREAK: 'break';
INT: 'int';
FLOAT: 'float';
STR: 'str';
BOOL: 'bool';
TRUE: 'true';
FALSE: 'false';
PRINT: 'print';
INPUT: 'input';
ENTER: '\n';

ASSIGN: '=';
MEN: '<';
MAY: '>';
MENIG: '<=';
MAYIG: '>=';
IGUAL: '==';
DIST: '!=';
SUM: '+';
REST: '-';
MULT: '*';
DIV: '/';
PARENTESIS_A: '(';
PARENTESIS_C: ')';
DOSP: ':';
PUNCOM: ';';
COMA:',';
SIGPESOS: '$';
PUNTO: '.';
COMENTARIO: COMMENT (ID|NUMERO|SIGPESOS|PUNTO|DOSP|ASSIGN|COMMENT|PARENTESIS_A|PARENTESIS_C|MEN|MAY|MENIG|MAYIG
	|IGUAL|DIST|SUM|REST|MULT|DIV|PUNCOM|COMA|COMILLA|' ')* COMMENT ENTER? -> skip;
MENSAJE: COMILLA (ID|NUMERO|SIGPESOS|PUNTO|DOSP|ASSIGN|' ')* COMILLA;
COMILLA:'"';
COMMENT: '#';
ID: LETRA(LETRA|DIGITO)*;
NUMERO:'-'?('0'|DIGITO+)(.DIGITO+)?;
LETRA:[a-zA-Z];
DIGITO: [0-9];

FIN: '&';

WS: [ \r\t]+ -> skip;