/**
 * 
 */
package ejercicio02b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Jes�sRuiver
 *
 */
public class TiempoLectura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Comparativa del tiempo de ejecuci�n de un programa que lee un fichero
		 * de texto de 2 MB. Los m�todos de lectura son: a) Car�cter a car�cter
		 * sin filtro, b) Car�cter a car�cter con filtro. c) L�nea a l�nea
		 */

		String origen = "ElQuijote.txt";
		try {

			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);

			int linea;

			while ((linea = br.read()) != -1) {

				System.out.println(linea);

			}
			fr.close();

		} catch (Exception e) {

			e.toString();
		}

		try {

			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);

			int linea;

			while ((linea = br.read()) != -1) {

				char caracter = (char) linea;

				System.out.print(caracter);

			}
			fr.close();

		} catch (Exception e) {

			e.toString();
		}

		try {

			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);

			String linea;

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);

			}
			fr.close();

		} catch (Exception e) {

			e.toString();
		}

	}

}
