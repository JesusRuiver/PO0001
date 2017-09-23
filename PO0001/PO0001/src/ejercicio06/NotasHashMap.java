/**
 * 
 */
package ejercicio06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Jes�s Manuel Ruiz Verdejo
 *
 */
public class NotasHashMap {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/**
		 * Utilizar un HashMap con una capacidad de 10 y un factor de carga del
		 * 80%. Contendr� los pares clave/valor de la siguiente tabla (las
		 * claves ser�n objetos Integer, los valores Strings)
		 */

		HashMap<Integer, String> notas = new HashMap<Integer, String>(10, 0.8f);

		notas.put(1505, "aprobado");
		notas.put(2800, "suspenso");
		notas.put(1300, "suspenso");
		notas.put(1234, "aprobado");
		notas.put(2600, "aprobado");

		/**
		 * Crear una clase con un m�todo main para saber si un usuario ha
		 * aprobado o suspendido una prueba. El funcionamiento ser� el
		 * siguiente: el programa solicitar� una clave de usuario
		 */

		BufferedReader leerEntrada = new BufferedReader(new InputStreamReader(System.in)); //Una forma abreviada para usar un InputStreamReader

		System.out.print("Introduzca la clave de usuario: ");

		/**
		 * Si existe, se mostrar� su calificaci�n y un mensaje de �Enhorabuena�
		 * si ha aprobado o un "Lo siento" si ha suspendido. Despu�s el programa
		 * finalizar�.
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
				System.exit(0);
			}
			
			/**
			 * Si no existe la clave, el programa debe mostrar "Clave incorrecta" y
			 * finalizar.
			 */
			
		} catch (NumberFormatException excepcion) {

			System.out.println("La clave es incorrecta");
			System.exit(0);
		}

	}
}


