package tema2;

import java.util.Scanner;

public class Ejercicios2Bucles02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e inicializamos las variables
		int i;
		int n;
		int sumatorio = 0;
		int factorial = 1;

		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el numero
		System.out.print("Introduce el numero:");
		n = teclado.nextInt();

		// Se ejecutarán las instrucciones dentro del bucle mientra i sea menor o igual
		// a n
		for (i = 1; i <= n; i++) {
			// Se le suma al valor de sumatorio el valor de i
			sumatorio += i;
		}

		// Se ejecutarán las instrucciones dentro del bucle mientra i sea menor o igual
		// a n
		for (i = 1; i <= n; i++) {
			// Se multiplicará el valor del factorial por el valor de i
			factorial = factorial * i;
		}

		// Informamos por pantalla
		System.out.println("Sumatorio: " + sumatorio);
		System.out.println("Factorial: " + factorial);

	}// main

}// class
