
package Taller;

import java.io.IOException;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarkLaf;

public class Main {

	public static void main(String[] args) throws IOException {

		try {

			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (Exception ex) {
			System.err.println("Failed to initialize LaF");
		}
		
		Interfaz UI = new Interfaz(args);
		


	}

}
