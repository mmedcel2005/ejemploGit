package tema2;

import java.util.Scanner;

public class Ejercicios2Bucles05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int i;
		int k;
		int alto;
		int base;
		Scanner teclado = new Scanner(System.in);

		// Leemos el alto
		System.out.print("Introduce el alto: ");
		alto = teclado.nextInt();

		// Leemos el base
		System.out.print("Introduce el base: ");
		base = teclado.nextInt();

		// Cerramos el teclado
		teclado.close();

		System.out.println("\n");

		// Mientras i sea menor que el valor del alto se ejecutarán las instrucciones
		// dentro del bucle
		for (i = 0; i < alto; i++) {
			System.out.print(" ");

			// Mientras k sea menor que el valor de la base se ejecutarán las instrucciones
			// dentro del bucle
			for (k = 0; k < base; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}// main

}// class
