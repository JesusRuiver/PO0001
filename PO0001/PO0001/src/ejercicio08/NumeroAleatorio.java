/**
 * 
 */
package ejercicio08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author Jesus Manuel Ruiz Verdejo
 *
 */

class Contador {
	int i = 1;

	public String toString() {
		return Integer.toString(i);
	}
}

public class NumeroAleatorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Medir la aleatoriedad del método random: Generar 10000 números entre
		 * 0 y 19 y contar las apariciones de cada uno.
		 */

		Random numeroRandom = new Random();

		HashMap<Integer, Contador> hm = new HashMap<Integer, Contador>();

		for (int i = 0; i < 10000; i++) {

			Integer r = new Integer((int) numeroRandom.nextInt(19));
			if (hm.containsKey(r)) {
				(hm.get(r)).i++;
			} else
				hm.put(r, new Contador());

		}

		System.out.println(hm);

	}

}
