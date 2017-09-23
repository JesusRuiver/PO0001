/**
 * 
 */
package ejercicio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class Notas {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		/**
		 * Utilizar un Hashtable con una capacidad de 10 y un factor de carga
		 * del 80%. Contendrá los pares clave/valor de la siguiente tabla (las
		 * claves serán objetos Integer, los valores Strings)
		 */
		
		Hashtable<Integer, String> notas = new Hashtable<Integer, String>(10,0.8f);
	
		notas.put(1505, "aprobado");
		notas.put(2800, "suspenso");
		notas.put(1300, "suspenso");
		notas.put(1234, "aprobado");
		notas.put(2600, "aprobado");
		
		/**
		 * Crear una clase con un método main para saber si un usuario ha
		 * aprobado o suspendido una prueba. El funcionamiento será el
		 * siguiente: el programa solicitará una clave de usuario
		 */

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader leerEntrada = new BufferedReader(entrada);

		System.out.print("Introduzca la clave de usuario: ");

		/**
		 * Si existe, se mostrará su calificación y un mensaje de “Enhorabuena”
		 * si ha aprobado o un "Lo siento" si ha suspendido. Después el programa
		 * finalizará.
		 */

		try {
			Integer clave = new Integer(leerEntrada.readLine());

			if (clave.equals(1505) || clave.equals(1234) || clave.equals(2600)) {

				System.out.println(
						"El usuario " + clave + " esta " + notas.getOrDefault(clave, "aprobado.") + " Enhorabuena");
				
				

			} else if (clave.equals(2800) || clave.equals(1300)) {

				System.out.println(
						"El usuario " + clave + " esta " + notas.getOrDefault(clave, " suspenso.") + " Lo siento");
				
			} else {
				
				System.out.println("La clave es incorrecta");
			}

			/**
			 * Si no existe la clave, el programa debe mostrar "Clave
			 * incorrecta" y finalizar.
			 */

		} catch (NumberFormatException excepcion) {

			System.out.println("La clave es incorrecta");
			System.exit(0);
		}

	}

}
