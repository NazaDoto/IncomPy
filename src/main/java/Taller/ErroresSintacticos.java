package Taller;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErroresSintacticos extends BaseErrorListener{
	
	// Lista que contendrá los errores encontrados
	private ArrayList<String> errores = new ArrayList<String>();

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {

		ArrayList<String> simbolos = new ArrayList<String>();
		String m = "";
		Pattern patron = Pattern.compile("'(.*?)'");
		Matcher mach = patron.matcher(msg);
		while(mach.find()){
			simbolos.add(mach.group(0));
		}
		String error = simbolos.remove(0);
		String errorSimbolos = "";
		if (msg.contains("extraneous")) {
			for(String s: simbolos){
				String ej = errorSimbolos;
				int count = ej.length() - ej.replaceAll("#", "").length();
				if(count % 3 != 0)
					errorSimbolos+="#"+s+" ";
				else
					errorSimbolos+="\n#"+s+" ";
			}
			m = String.format("Error en %s:%s - Simbolo %s no válido.", line, charPositionInLine, error);


		} else if (msg.contains("mismatched")) {
			for(String s: simbolos){
				s = s.replaceAll("\'", "");
				s = s + " ";
				errorSimbolos+=s;
			}
			if (error.contains("'<EOF>'")) {
				errorSimbolos = "&";
			}
			m = String.format("Error en %s:%s - Simbolo %s no reconocido, se recomienda [%s]", line, charPositionInLine, error, errorSimbolos);


		} else if (msg.contains("missing")) {
			for(String s: simbolos){
				errorSimbolos+=" "+s;
			}
			m = String.format("Error en %s:%s - Falta el símbolo %s", line, charPositionInLine, error, errorSimbolos);

		}else if(msg.contains("viable")){
			m = String.format("Error en %s:%s - No se encuentra una derivación para %s, se ignora", line, charPositionInLine, error, errorSimbolos);

		}else{
			m = String.format("Error en %s:%s - Error desconocido", line, charPositionInLine);
		}
		errores.add(m);
	}

	public ArrayList<String> getErrores() {
		return errores;
	}

	public void setErrores(ArrayList<String> errores) {
		this.errores = errores;
	}

}

