/**
 * 
 */
package ejercicio04;

import java.util.ArrayList;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class PlanetasArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Crear un Vector que contenga los nombres de los planetas del sistema
		 * solar en orden alfabético (Jupiter, Marte, Mercurio, Neptuno, Pluton,
		 * Saturno, Tierra, Urano, Venus)
		 */

		ArrayList<String> planetas = new ArrayList();

		planetas.add("Jupiter");
		planetas.add("Marte");
		planetas.add("Mercurio");
		planetas.add("Neptuno");
		planetas.add("Plutón");
		planetas.add("Saturno");
		planetas.add("Tierra");
		planetas.add("Urano");
		planetas.add("Venus");

		/**
		 * Mostrar la capacidad y tamaño originales.
		 */
		System.out.println(planetas.size());
		
		/**
		 * Comprobar si el Vector contiene la cadena “Saturno”. Si la contiene,
		 * mostrar su posición.
		 */
		if (planetas.contains("Saturno")) {

			System.out.println("La posición de Saturno en la lista es la " + planetas.indexOf("Saturno") + "ª");
		} else

			System.out.println("El elemento no existe");

		/**
		 * Mostrar por consola el primer y último elemento del Vector.
		 */
		System.out.println("El primer elemento de la lista es " + planetas.get(0));

		int ultimoElemento = planetas.size();

		System.out.println("El ultimo elemento de la lista es " + planetas.get(ultimoElemento - 1));

		/**
		 * Insertar “Logroño” justo después del elemento “Tierra”. Mostrar el
		 * Vector, su capacidad y su tamaño.
		 */
		planetas.add(planetas.indexOf("Tierra") + 1, "Logroño");

		System.out.println(planetas.contains("Logroño"));
		System.out.println(planetas.indexOf("Logroño"));

		System.out.println(planetas);

		/**
		 * Eliminar todos los elementos del Vector.
		 */
		
		planetas.removeAll(planetas);
		System.out.println(planetas);

		/**
		 * Mostrar por consola la capacidad y el tamaño del Vector final.
		 */
		
		System.out.println("El tamaño del ArrayList es de " + planetas.size());
		
		/**
		 * NOTA: Si los planetas no se agregan al Vector por orden alfabético,
		 * pueden ordenarse mediante el método estático void sort(List lista) de
		 * la clase java.util.Collections. El argumento del método debe ser una
		 * objeto de la interface List (equivale a una clase que implemente la
		 * interface List). Como la clase Vector implementa por defecto dicha
		 * interface es consistente. Muy usado para ordenar vectores que
		 * almacenan cadenas de texto. Es similar al método sort(..) de la clase
		 * Arrays.
		 */
	}

}
