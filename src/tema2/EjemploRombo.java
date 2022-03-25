package tema2;

import java.util.Scanner;

public class EjemploRombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El programa pedirá la altura y mostrará un rombo de dicha altura por ejemplo
		 * si nos introduce 5 de altura
		 * 
		 * * * * * * * * * *
		 * 
		 */

		int altura = 0;
		Scanner teclado = new Scanner(System.in);

			// Leemos la altura hasta que sea impar
		// Mientraas la altura sea par seguimos leyendola
		while (altura % 2 == 0) {			System.out.println("Escribe la altura del rombo (Tiene que ser impar):");
			altura = teclado.nextInt();

		}		// cerramos
		teclado.close();

		// El bucle principal representa cada linea
		for (int i = altura / 2; i > 0; i--) {

			// En el bucle secundario, para cada lianea escribe la cantidad
			// de asterisco necesarios
			for (int j = 1; j <= 1; j++) {
				System.out.print("*");
			}
		}
		// pa
		System.out.print("*\n");

	}// main

}// class
