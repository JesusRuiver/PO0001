/**
 * 
 */
package ejercicio09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class CuentaPalabras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String origen = "LagrimasEnLaLluvia.txt"; // Ruta relativa hace referencia donde se
										// encuentra .project
		String destino = "contador.txt";

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		try {
			// Lectura del fichero, contamos las plabra cuardandolas en un
			// HashMap

			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);

			String siguienteLinea;

			while ((siguienteLinea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(siguienteLinea, " ");

				while (st.hasMoreTokens()) {
					String palabra = st.nextToken();

					if (hm.containsKey(palabra)) {

						int contador = hm.get(palabra);
						hm.remove(palabra);
						hm.put(palabra, contador + 1);
					} else
						hm.put(palabra, 1);

				}
			}
			br.close();

		} catch (IOException e) {

			System.out.println("ERROR---" + e.toString());
		}

		// Pasamos las palabras del HashMap a un arrayList

		Set<String> claves1 = hm.keySet();
		ArrayList<String> lista = new ArrayList<String>(claves1);

		// Ordenamos

		Collections.sort(lista); // argumento List, interfaz implementada

		// Creamos el fichero de salida

		try {

			FileWriter fw = new FileWriter(destino);

			BufferedWriter brw = new BufferedWriter(fw);

			for (String clave : lista) {
				brw.write(clave + ": " + hm.get(clave));
				brw.newLine();

			}
			brw.close();

		} catch (Exception e) {
			System.out.println("ERROR---" + e.toString());

		}

	}

}
