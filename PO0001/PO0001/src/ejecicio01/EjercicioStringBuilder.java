/**
 * 
 */
package ejecicio01;

import java.lang.StringBuilder;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class EjercicioStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Crear un StringBuilder con el String "Vuenos dias" y mostrarlo por
		 * consola
		 */

		StringBuilder sb = new StringBuilder("Vuenos dias");

		System.out.println(sb);

		/**
		 * Mostrar por consola su capacidad y longitud
		 */

		System.out.println("La capacidad es " + sb.capacity());
		System.out.println("La longitud es " + sb.length());

		/**
		 * Sustituir el primer caracter del StringBuilder anterior por "B" y
		 * mostrarlo por consola
		 */

		StringBuilder cadenaCorregida = sb.replace(0, 1, "B");

		System.out.println(
				"La cadena orignal es " + sb + " corregimos el error ortográfico y obtenemos " + cadenaCorregida);

		/**
		 * Agregar al final del StringBuilder anterior el numero 20 y el String
		 * "chicos"
		 */

		cadenaCorregida.insert(11, 20);
		cadenaCorregida.insert(13, " chicos");

		System.out.println(cadenaCorregida);

		/**
		 * Insertar en el StringBuilder anterior despues de "dias" el String
		 * "tengan. Mostrar por consola
		 */

		cadenaCorregida.insert(11, " tengan ");
		System.out.println(cadenaCorregida);

		/**
		 * Eliminar los seis primeros caracteres del StringBuilder y mostrar por
		 * consola.
		 */

		cadenaCorregida.delete(0, 5);
		System.out.println(cadenaCorregida);

		/**
		 * Almacenar en un String los cuatro últimos caracteres del
		 * StringBuilder y mostrarlo.
		 */

		String almacenaCaracteres = cadenaCorregida.substring(19, 23);

		System.out.println(almacenaCaracteres);

		/**
		 * Mostrar por consola la capacidad y la longitud del StringBuilder
		 * final.
		 */

		System.out.println("La capacidad del StringBuilder modificado es " + cadenaCorregida.capacity());
		System.out.println("La longitud del StringBuilder modificado es " + cadenaCorregida.length());

		/**
		 * Crear un array de tres StringBuilder con vuestro nombre, primer
		 * apellido y segundo apellido.
		 */

		StringBuilder nombre = new StringBuilder("Jesús Manuel");
		StringBuilder primerApellido = new StringBuilder("Ruiz");
		StringBuilder segundoApellido = new StringBuilder("Verdejo");

		StringBuilder[] miNombre = new StringBuilder[3];

		miNombre[0] = nombre;
		miNombre[1] = primerApellido;
		miNombre[2] = segundoApellido;

		for (int i = 0; i <= 2; i++) {

			System.out.print(miNombre[i] + " ");

		}

		System.out.println("");

		/**
		 * Visualizar el nombre escrito de derecha a izquierda.
		 */

		for (int i = 2; i >= 0; i--) {

			System.out.print(miNombre[i] + " ");
		}

	}

}
