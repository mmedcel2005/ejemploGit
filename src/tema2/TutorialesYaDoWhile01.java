package tema2;

import java.util.Scanner;

public class TutorialesYaDoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int suma = 0;
		int n;
		Scanner teclado = new Scanner(System.in);

		do {
			// Leemos por teclado el numero
			System.out.print("Introduce un numero:");
			n = teclado.nextInt();

			// Si el numero es diferente de 9999 se sumara el numero leido a la suma total
			if (n != 9999) {
				suma += n;
			}

			// Mientras la suma tenga un valor diferentee de 9999 se ejecutara las
			// instucciones dentro del do
		} while (suma != 9999);

		// Mostramos en pantalla el valor total
		System.out.println("El valor total es: " + suma);

		// Si la suma es mayor de 0 el valor es positivo
		if (suma > 0) {
			System.out.println("El valor total es positivo");
		} else {
			// Si la suma es menor de 0 el valor es negativo
			if (suma < 0) {
				System.out.println("El valor total es negativo");
			} else {
				// Si no se han cumplido las condiciones anteriores, por descarte el valor es 0
				System.out.println("El valor total es cero");
			}
		}

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
