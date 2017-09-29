/**
 * 
 */
package ejercicio09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class CuentaPalabras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String origen ="texto.txt"; //Ruta relativa hace referencia al .project
		String destino ="contador.txt";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		try{
			//Lectura del fichero, contamos las plabra cuardandolas en un HashMap
			
			FileReader fr = new FileReader(origen);
			BufferedReader br = new BufferedReader(fr);
			
			String siguienteLinea;
			
			while((siguienteLinea = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(siguienteLinea, " ");
				
				while (st.hasMoreTokens()){
					String palabra = st.nextToken();
					
					if(hm.containsKey(palabra)){
						
						int contador = hm.get(palabra);
						hm.remove(palabra);
						hm.put(palabra, contador+1);
					} else hm.put(palabra, 1);
					
				}
			}
			br.close();
			
			
		}catch (IOException e){
			
			System.out.println("ERROR---"+ e.getMessage());
				}
			}

}
