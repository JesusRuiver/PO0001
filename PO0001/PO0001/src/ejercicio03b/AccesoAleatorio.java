/**
 * 
 */
package ejercicio03b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class AccesoAleatorio {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File ficheroAleatorio = new File("Empleados.dat");
		RandomAccessFile fichero = new RandomAccessFile(ficheroAleatorio, "rw");

		String[] empleado = { "FERNANDEZ", "LOPEZ", "MARTINEZ", "GIL", "RUIZ" };

		StringBuffer buffer = null; // Buffer para almacenar el empleado
		int n = empleado.length; // numero de elementos del array

		for (int i = 0; i < n; i++) { // Recorremos el array

			fichero.writeInt(i + 1); // uso i+1 para identificar al empleado

			buffer = new StringBuffer(empleado[i]);
			buffer.setLength(10); // 10 Caracteres para el empleado

			fichero.writeChars(buffer.toString());// inserta el apellido
		}
		fichero.close();
	}

}
