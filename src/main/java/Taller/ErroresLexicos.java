package Taller;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErroresLexicos extends BaseErrorListener{
	
	//Lista que contendrá los errores encontrados
	private ArrayList<TokenTxt> errores = new ArrayList<TokenTxt>();
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, 
			Object offendingSymbol, int line, 
			int charPositionInLine,
			String msg, RecognitionException e) {

        String symbol = "";
        Pattern patron = Pattern.compile("'(.*?)'");
		Matcher mach = patron.matcher(msg);
        if(mach.find()){
            symbol = mach.group(1);
        }
		if(symbol.length() >= 0){
			TokenTxt t = new TokenTxt(line, charPositionInLine, symbol,-2);
		    errores.add(t);
		}
		
	}

	public ArrayList<TokenTxt> getErrores() {
		return errores;
	}

	public void setErrores(ArrayList<TokenTxt> errores) {
		this.errores = errores;
	}
	
	

}

