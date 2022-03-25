package tema2;

import java.util.Scanner;

public class TutorialesYaFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e inicializamos las variables
		int i;
		int numLeido;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);

		// Se ejecutara el cucle siempre y cuando el valor de i sea menor de 10
		for (i = 1; i <= 10; i++) {
			// Leemos por teclado el numero
			System.out.print("Introduce el " + i + "º numero: ");
			numLeido = teclado.nextInt();

			// Si el valor de i es mayor de 5 se sumara el numero introducido al
			// valor de la suma totals
			if (i > 5) {
				suma += numLeido;
			}

		}

		// Informamos al usuario por pantalla
		System.out.println("La suma de los ultimos 5 numeros es " + suma);

		teclado.close();

	}// main

}// class
