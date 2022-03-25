package tema2;

import java.util.Scanner;

public class TutorialesYaFor07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e inicializamos las variables
		int i;
		int n;
		int negativo = 0, positivo = 0, mult15 = 0, par = 0;
		Scanner teclado = new Scanner(System.in);

		// Se ejecutarán las intrucciones mientras i sea menor o igual a 10
		for (i = 1; i <= 10; i++) {
			// Leemos por teclado el numero
			System.out.print("Introduce el " + i + "º numero: ");
			n = teclado.nextInt();

			// Si es menor de 0 es negativo por lo que se incrementará el valor de numeros
			// negativos
			if (n < 0) {
				negativo++;
			}

			// Si es mayor de 0 es positivo por lo que se incrementará el valor de numeros
			// positivos
			if (n > 0) {
				positivo++;
			}

			// Si es multiplo de 15 se incrementara el valor de la variable mult15
			if (n % 15 == 0) {
				mult15++;
			}

			// Si es par se incrementará el valor de la variable par
			if (n % 2 == 0) {
				par++;
			}
		}

		// Se informa por pantalla
		System.out.println("\n ------- Informacion -------");
		System.out.println("Numeros negativos: " + negativo);
		System.out.println("Numeros positivos: " + positivo);
		System.out.println("Numeros multiplos de 15: " + mult15);
		System.out.println("Numeros pares: " + par);

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
