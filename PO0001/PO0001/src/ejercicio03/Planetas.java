/**
 * 
 */
package ejercicio03;

import java.util.Vector;

/**
 * @author Jes�s Manuel Ruiz Verdejo
 * 
 */
public class Planetas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Crear un Vector que contenga los nombres de los planetas del sistema
		 * solar en orden alfab�tico (Jupiter, Marte, Mercurio, Neptuno, Pluton,
		 * Saturno, Tierra, Urano, Venus)
		 */

		Vector <String> planetas = new Vector ();

		planetas.add("Jupiter");
		planetas.add("Marte");
		planetas.add("Mercurio");
		planetas.add("Neptuno");
		planetas.add("Plut�n");
		planetas.add("Saturno");
		planetas.add("Tierra");
		planetas.add("Urano");
		planetas.add("Venus");

		/**
		 * Mostrar la capacidad y tama�o originales.
		 */
		System.out.println("El tama�o del vector es de " + planetas.size());
		System.out.println("La capacidad del vector es de " + planetas.capacity());
		/**
		 * Comprobar si el Vector contiene la cadena �Saturno�. Si la contiene,
		 * mostrar su posici�n.
		 */
		if (planetas.contains("Saturno")) {

			System.out.println("La posici�n de Saturno en la lista es la " + planetas.indexOf("Saturno") + "�");
		} else

			System.out.println("El elemento no existe");

		/**
		 * Mostrar por consola el primer y �ltimo elemento del Vector.
		 */
		System.out.println("El primer elemento de la lista es " + planetas.get(0));

		int ultimoElemento = planetas.size();

		System.out.println("El ultimo elemento de la lista es " + planetas.get(ultimoElemento - 1));

		/**
		 * Insertar �Logro�o� justo despu�s del elemento �Tierra�. Mostrar el
		 * Vector, su capacidad y su tama�o.
		 */
		
		//A�adimos Logro�o en la posici�n de la Tierra + 1
		
		planetas.add(planetas.indexOf("Tierra") + 1, "Logro�o");

		System.out.println(planetas.contains("Logro�o")); //Comprobamos si el Vector contiene Logro�o
		System.out.println(planetas.indexOf("Logro�o")); //Le pedimos que nos devuelva la posici�n que ocupa Logro�o en el Vector

		System.out.println(planetas);

		/**
		 * Eliminar todos los elementos del Vector.
		 */
		
		planetas.removeAll(planetas); //Borramos el contenido del Vector
		
		System.out.println(planetas); //Comprobamos que no elementos en el Vector

		/**
		 * Mostrar por consola la capacidad y el tama�o del Vector final.
		 */
		
		System.out.println ("El tama�o del Vector es de " + planetas.size());
		System.out.println ("La capacidad del Vector es de " + planetas.capacity());

		/**
		 * NOTA: Si los planetas no se agregan al Vector por orden alfab�tico,
		 * pueden ordenarse mediante el m�todo est�tico void sort(List lista) de
		 * la clase java.util.Collections. El argumento del m�todo debe ser una
		 * objeto de la interface List (equivale a una clase que implemente la
		 * interface List). Como la clase Vector implementa por defecto dicha
		 * interface es consistente. Muy usado para ordenar vectores que
		 * almacenan cadenas de texto. Es similar al m�todo sort(..) de la clase
		 * Arrays.
		 */
	}

}
