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

		HashMap<String, BigDecimal> monedas = new HashMap<String, BigDecimal>();

		monedas.put("euro", new BigDecimal(1.0));
		monedas.put("dolar", new BigDecimal(1.1951));
		monedas.put("libra", new BigDecimal(0.8852));
		monedas.put("yen", new BigDecimal(133.9225));

		System.out.print("Introduzca moneda de origen: ");
		BufferedReader entradaOrigen = new BufferedReader(new InputStreamReader(System.in));

		String monedaOrigen = entradaOrigen.readLine().toLowerCase();

		System.out.print("Introduzca moneda de destino: ");
		BufferedReader entradaDestino = new BufferedReader(new InputStreamReader(System.in));

		String monedaDestino = entradaDestino.readLine().toLowerCase();

		System.out.print("Introduzca importe a convertir: ");
		BufferedReader entradaImporte = new BufferedReader(new InputStreamReader(System.in));

		BigDecimal importe = new BigDecimal(entradaImporte.readLine());

		if (monedas.containsKey(monedaOrigen) && monedas.containsKey(monedaDestino)) {

			BigDecimal resultado = monedas.get(monedaDestino).divide(monedas.get(monedaOrigen));
			
			
			System.out.println(resultado);

		}else{
			System.out.println("Una de las claves no existe");
		}
	}
}
