/**
 * 
 */
package ejercicio07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class ConversorMoneda {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		HashMap<String, BigDecimal> monedas = new HashMap<String,BigDecimal>();
		
		monedas.put ("Euro", new BigDecimal(1));
		monedas.put ("Dolar", new BigDecimal(1.1951000896325));
		monedas.put ("Libra", new BigDecimal(0.88526912181303));
		monedas.put ("Yen", new BigDecimal(133.9225927414));
		
		System.out.print("Introduzca moneda de origen: ");
		BufferedReader entradaOrigen = new BufferedReader(new InputStreamReader(System.in));
		
		String monedaOrigen = entradaOrigen.readLine().toLowerCase();
		
		System.out.print("Introduzca moneda de destino: ");
		BufferedReader entradaDestino = new BufferedReader(new InputStreamReader(System.in));
		
		String monedaDestino = entradaDestino.readLine().toLowerCase();
		
		System.out.print("Introduzca importe a convertir: ");
		BufferedReader entradaImporte = new BufferedReader(new InputStreamReader(System.in));
		
		BigDecimal importe = new BigDecimal (entradaImporte.readLine());
		
		System.out.println(monedas.get(monedaOrigen));	
		System.out.println(monedas.get(monedaDestino));
		System.out.println(importe);	
		
		
		
		/*if(entradaOrigen.equals(monedas.containsKey(monedas) && entradaDestino.equals(monedas.containsKey(monedas)))){
			
				BigDecimal resultado;
				
				System.out.println(monedas.get(entradaDestino));*/
				
				
				
				
			
			}
			
		

	}


