package tema3;

import java.util.Scanner;

public class Ej3FuncionesRecursivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int n;
		int numeros[];
		int buscarNum;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado los numeros que introducirá usuario
		System.out.print("¿Cuantos numeros introducirás? ");
		n = teclado.nextInt();

		// Definimos la longitud del array
		numeros = new int[n];

		System.out.println("Introduce los numeros de menor a mayor.");

		// Leemos los numeros mediante un bucle for
		for (int k = 0; k < n; k++) {
			System.out.print("Introduce el " + (k + 1) + "º numero:");
			numeros[k] = teclado.nextInt();
		}

		// Leemos por teclado el numero a buscar
		System.out.println("Introduce el número que quieres buscar: ");
		buscarNum = teclado.nextInt();

		// Mostramos en pantalla el resultado
		System.out.println(
				"El numero " + buscarNum + " se encuentra en la posicion " + busquedaBinaria(numeros, buscarNum));

	}

	/**
	 * Funcion recursiva que recibe una lista de nuemeros y un numero a buscar y
	 * devuelve la posicion en la que se encuentra ese numero
	 * 
	 * @param numeros
	 * @param buscarNum
	 * @return numero entero con la posicion en la que se encuentra el numero
	 *         deseado.
	 */
	public static int busquedaBinaria(int numeros[], int buscarNum) {
		int posicion = 0;
		int buscarIzquierda = 0;
		int buscarDerecha = numeros.length - 1;

		// Damos a la posicion un valor haciendo que empiece a buscar en la posicion del
		// medio
		posicion = (buscarIzquierda + buscarDerecha) / 2;

		// En la variable valor, le daremos como valor el numero que se encuentra en
		// determinada posicion
		// del array, la cual dicha posicion fue antes definida
		int valor = numeros[posicion];

		// Si el numero que buscamos es igual que el valor, devolveremos la posicion
		if (buscarNum == valor) {
			return posicion + 1;
		} else {
			// Si el numero que buscamos es mayor cambiaremos el valor de buscarIzquierda a
			// una mayor que la posicion
			if (buscarNum > valor) {
				buscarIzquierda = posicion + 1;
			} else {
				// Si el numero buscado es menor cambiamos el valor de buscarDerecha por una
				// menor que la posicion
				if (buscarNum < valor) {
					buscarDerecha = posicion - 1;
				}
			}

		}
		return busquedaBinaria(numeros, buscarNum);

	}

}
