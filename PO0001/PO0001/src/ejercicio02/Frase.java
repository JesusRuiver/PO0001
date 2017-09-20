/**
 * 
 */
package ejercicio02;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;


/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class Frase {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		/**
		 * Solicitar al usuario una frase con varias palabras
		 */

		StringTokenizer frase = new StringTokenizer(JOptionPane.showInputDialog("Introduzca una frase por favor"));

		/**
		 * Mostrar el número de palabras de la frase.
		 */

		System.out.println(frase.countTokens());

		/**
		 * Mostrar cada palabra en una línea diferente.
		 */

		

		/**
		 * Almacenar en un array de StringBuilder las palabras de la frase.
		 */

		int i = frase.countTokens();

		StringBuilder[] palabras = new StringBuilder[i];

		for (int j = 0; j < i; j++) {

			String palabra = frase.nextToken();

			/**
			 * Mostrar los elementos del array anterior y la clase a la que
			 * pertenecen mediante los métodos: Class getClass() de java.lang
			 * Object y String getName() de java.lang.Class
			 */

			System.out.println(j + " " + palabra + "\t " + palabras.getClass());
			

		}

	}

}
