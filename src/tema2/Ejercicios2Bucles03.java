package tema2;

import java.util.Scanner;

public class Ejercicios2Bucles03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaramos las variables de variables
		int i;
		int n = 0;
		int numMax = 0;
		int posicion;
		char[] numSeparados;
		String numString;

		// Leemos el numero
		System.out.println("Introduce el número: ");
		n = teclado.nextInt();

		// Convertimos el numero introducido anteriormente en un String
		numString = String.valueOf(n);

		// Mediante el uso de toCharArray lo que hacemos es convertir la cadena obtenida
		// anteriormente
		// en un array separando cada uno de los caracteres de la cadena
		numSeparados = numString.toCharArray();

		// Mientras el valor de i sea menor que la longitud de numSeparados se
		// ejecutaran las instrucciones dentro de la misma
		for (i = 0; i < numSeparados.length; i++) {
			// Si el numero maximo es menor que el valor de numSeparados el numero
			// maximo pasara a ser el valor de numSeparados
			if (numMax < numSeparados[i]) {
				numMax = numSeparados[i];
			}
		}

		// El valor de la variable posicion se obtendra mediante el uso de indexOf,
		// ya que esta buscara en numString la posicion en la que se encuentra
		// numMaximo.
		// Ya que indexOf empieza la busqueda desde -1 le sumaremos 1
		posicion = numString.indexOf(numMax) + 1;

		// Informamos en pantalla la posicion de la difra mayor
		System.out.println("\nLa posición de la cifra mayor es: " + posicion);

		// Cerramos el teclado
		teclado.close();
	}

}
