/**
 * 
 */
package ejercicio06;

import java.util.HashMap;

/**
 * @author Jes�s Manuel Ruiz Verdejo
 *
 */
public class NotasHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Utilizar un HashMap con una capacidad de 10 y un factor de carga
		 * del 80%. Contendr� los pares clave/valor de la siguiente tabla (las
		 * claves ser�n objetos Integer, los valores Strings)
		 */
		
		HashMap<Integer, String> notas = new HashMap <Integer,String>(10,0.8f);
		
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
		
		
		
		/**
		 * Si existe, se mostrar� su calificaci�n y un mensaje de �Enhorabuena�
		 * si ha aprobado o un "Lo siento" si ha suspendido. Despu�s el programa
		 * finalizar�.
		 */
		
		/**
		 * Si no existe la clave, el programa debe mostrar "Clave
		 * incorrecta" y finalizar.
		 */
		
		
	}

}
