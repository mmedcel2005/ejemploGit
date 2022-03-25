package tema2;

import java.util.Scanner;

public class TutorialesYaFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e incializamos las variables
		int i;
		int numLeido;
		int mayor = 0;
		int base;
		int altura;
		float superficie = 0;
		Scanner teclado = new Scanner(System.in);

		// Leemos la cantidad de datos de triangulos q el usuario va a introducir
		System.out.println("Introduce la cantidad de pares de datos a leer");
		numLeido = teclado.nextInt();

		// El bucle va a ir desde 1 hasta el numLeido
		for (i = 1; i <= numLeido; i++) {
			System.out.println("----------------TRIANGULO " + i + "----------------");

			// Leemos por teclado la base
			System.out.print("Introduce la base: ");
			base = teclado.nextInt();
			// Leemos por teclado la altura
			System.out.print("Introduce la altura: ");
			altura = teclado.nextInt();

			// Realizamos el calculo de superficie pasandolo a float
			// para que no de un FALLO MORTAL TERRIBLE DE LA MUERTE
			superficie = ((float) (base * altura) / 2);

			// Informamos al usuario por pantalla
			System.out.println("                 Informacion");
			System.out.println("Base: " + base);
			System.out.println("Altura: " + altura);
			System.out.println("Superficie: " + superficie);

			System.out.println("\n");

			// Si la superficie es mayor de 12 se incrementara en 1 el valor
			// de triangulos mayores de 12
			if (superficie > 12) {
				mayor++;
			}

		}

		System.out.println("TRIANGULOS CON SUPERFICIE MAYOR DE 12: " + mayor);

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
