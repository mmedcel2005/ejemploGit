package tema2;

import java.util.Scanner;

public class Ejercicios2Bucles07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int y;
		int x;
		int i;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el valor de x
		System.out.print("Introduce el valor de x: ");
		x = teclado.nextInt();

		// Leemos por teclado el valor de y
		System.out.print("Introduce el valor de y: ");
		y = teclado.nextInt();

		System.out.println("Los divisores de " + y + " que hay entre 1 y " + x + " son: ");

		// Mientras el valor de i sea menor o igual que x se ejecutarán las
		// instrucciones del bucle
		for (i = 1; i <= x; i++) {
			// Si al dividir y entre el valor de i si el resto es 0 entoces se imprimirá en
			// pantalla
			if (y % i == 0) {
				System.out.println(i);
			}
		}

	}// main

}// class
