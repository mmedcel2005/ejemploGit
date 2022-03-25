package tema2;

import java.util.Scanner;

public class TutorialesYaWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int media;
		int i = 1;
		int npersonas;
		int altura;
		int totalAltura = 0;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el numero de personas
		System.out.println("Introduce el numero de personas");
		npersonas = teclado.nextInt();

		// Mientras i sea menor que el numero de personas se seguira ejecutando las
		// instrucciones
		while (i <= npersonas) {
			// Leemos por teclado la altura
			System.out.println("Introduce la altura en cm: ");
			altura = teclado.nextInt();

			// Incrementamos en 1 el valor de i
			i++;

			// Sumamos al valor total la altura introducida recientemente por teclado
			totalAltura += altura;
		}

		// Realizamos el calculo de la media
		media = totalAltura / npersonas;
		// Imprimimos en pantalla la altura media

		System.out.println("La altura media es: " + media + " cm");

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
