package tema2;

import java.util.Scanner;

public class TutorialesYaWhile07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e inicializamos las variables
		int n;
		int i = 0;
		int k = 0;
		int edad[];
		int pares = 0;
		int impares = 0;
		int numBuscar;
		boolean encontrado = false;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado la cantidad de numero que va a introducir el usuario
		System.out.print("Introduce la cantidad de numero a leer: ");
		n = teclado.nextInt();

		// Definimos el tamaño del array
		edad = new int[n];
		// Mientras i sea menor o igual se ejecutaran las instrucciones
		while (i < edad.length) {
			// Lee por teclado el numero
			System.out.print("Introduce el " + (i + 1) + "º numero: ");
			edad[i] = teclado.nextInt();

			// Si es par se incrementara en 1 el valor de la variable pares
			if (edad[i] % 2 == 0) {
				pares++;
			}
			// Si no se cumple la condicion anterior se incrementara en 1 el valor de la
			// variable impares
			else {
				impares++;
			}

			// Se incrementa en 1 el valor de i
			i++;

		}

		// Informamos por pantalla al usuario
		System.out.println("Numeros pares: " + pares);
		System.out.println("Numero impares: " + impares);

		// Leemos el numero que hay que buscar
		System.out.println("\n");
		System.out.print("Introduce el numero a buscar:");
		numBuscar = teclado.nextInt();

		i = -1;

		// Mientras i sea menor se ejecutaran las instrucciones dentro de estas
		for (i = 0; i < edad.length; i++) {
			// Si la edad es igual que el valor de numBuscar se cambiara el valor de
			// encontrado a true
			if (edad[i] == numBuscar) {
				encontrado = true;
			}
		}

		// Si el valor de encontrado es true mostrará en pantalla que el numero se
		// encuentra en la lista
		if (encontrado == true) {
			System.out.println("El numero se encuentra en la lista");
		} else {
			// Si el valor de encontrado es false mostrará en pantalla que el numero NO se
			// encuentra en la lista
			System.out.println("El numero NO se encuentra en la lista");
		}

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
