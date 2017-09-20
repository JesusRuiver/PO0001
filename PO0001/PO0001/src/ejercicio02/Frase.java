/**
 * 
 */
package ejercicio02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * @author Jes�s Manuel Ruiz Verdejo
 *
 */
public class Frase {

	/**
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {

		/**
		 * Solicitar al usuario una frase con varias palabras
		 */

		
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader leerEntrada = new BufferedReader(entrada);
		
		System.out.println("Introduzca una frase por favor");
		
		String frase = leerEntrada.readLine();
		System.out.println(frase);
		

		/**
		 * Mostrar el n�mero de palabras de la frase.
		 */
		
		System.out.println(frase.split("\\s+"));
		

		/**
		 * Mostrar cada palabra en una l�nea diferente.
		 */

		

		/**
		 * Almacenar en un array de StringBuilder las palabras de la frase.
		 */

		/*int i = frase.countTokens();

		StringBuilder[] palabras = new StringBuilder[i];

		for (int j = 0; j < i; j++) {

			String palabra = frase.nextToken();*/

			/**
			 * Mostrar los elementos del array anterior y la clase a la que
			 * pertenecen mediante los m�todos: Class getClass() de java.lang
			 * Object y String getName() de java.lang.Class
			 */

			//System.out.println(j + " " + palabra + "\t " + palabras.getClass());
			

		}

	}


