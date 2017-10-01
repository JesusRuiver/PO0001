/**
 * 
 */
package ejercicio02b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author JesúsRuiver
 *
 */
public class TiempoLectura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String origen = "ElQuijote.txt";

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
		
		try {

			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);

			int linea;

			while ((linea = br.read()) != -1) {
				
				char caracter = (char)linea;
				
				System.out.println(caracter);

			}
			fr.close();

		} catch (Exception e) {

			e.toString();
		}

	}

}
