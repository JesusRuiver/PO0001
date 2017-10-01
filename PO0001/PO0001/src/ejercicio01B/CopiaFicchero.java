/**
 * 
 */
package ejercicio01B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class CopiaFicchero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Crear un fichero de texto de varias líneas (Origen.txt). Utilizar los
		 * flujos y filtros de lectura y escritura de caracteres para crear un
		 * fichero copia del anterior.
		 */

		String original = "Origen.txt";
		String copia = "copia.txt";

		try {

			FileReader fr = new FileReader(original);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(copia);
			BufferedWriter bw = new BufferedWriter(fw);

		} catch (Exception e) {

		}

	}

}
