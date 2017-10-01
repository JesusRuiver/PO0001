/**
 * 
 */
package ejercicio02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Jesús Manuel Ruiz Verdejo
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

		String frase = leerEntrada.readLine().trim();

		System.out.print("La Frase introducida es: ");
		System.out.println(frase);

		/**
		 * Mostrar el número de palabras de la frase.
		 */

		System.out.println("Contiene " + frase.split("\\s+").length + " palabras.");

		/**
		 * Mostrar cada palabra en una línea diferente.
		 */

		String[] palabras = frase.split("\\s+");

		for (int i = 0; i <= frase.split("\\s+").length - 1; i++) {

			System.out.println("Muestra la linea " + i + " que contine la palabra " + palabras[i]);
		}

		/**
		 * Almacenar en un array de StringBuilder las palabras de la frase.
		 */

		int i = frase.split("\\s+").length;

		StringTokenizer palabraStringTokenizer = new StringTokenizer(frase);

		StringBuilder[] palabrasStringBuilder = new StringBuilder[i];

		for (i = 0; i <= frase.split("\\s+").length - 1; i++) {

			palabrasStringBuilder[i] = new StringBuilder(palabraStringTokenizer.nextToken());

			/**
			 * Mostrar los elementos del array anterior y la clase a la que
			 * pertenecen mediante los métodos: Class getClass() de java.lang
			 * Object y String getName() de java.lang.Class
			 */

			System.out.println(
					"Almacenammos en la posición " + i + " del Array de StringBuilder " + " " + palabrasStringBuilder[i]
							+ "\t " + " que pertenece a la Clase " + palabrasStringBuilder.getClass());

		}

	}
}
