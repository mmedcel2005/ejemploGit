package tema2;

import java.util.Scanner;

public class EjemplosBuclesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 24;
		int numero = 0;

		Scanner teclado = new Scanner(System.in);

		// Mientras la edad sea cierta seguira ejecutando las instrucciones
		// De dentro del bucle
		while (edad % 2 == 0) {
			System.out.println("Tu edad es par");
			edad = teclado.nextInt();
		}

		// ejemplo que muestre los primeros 100 numeros

		int i = 1;

		while (i <= 100) {

			System.out.println(i);
			i = i + 1;

		}

		// ejemplo qu emuestre los 100 primeros numeros pares
		System.out.println("Numeros pares");

		i = 2;

		while (i <= 100) {

			System.out.println(i);
			i = i + 2;

		}

		// Programa que lea un numero y muestre su tabla de multiplicar
		System.out.println("Introduce un numero");
		numero = teclado.nextInt();

		i = 1;
		// El buvle se repetira para i=1 hasta i= 10, al poner la condicion i<=10
		// El valor 10 todavia sera valido y entrara en el bucle
		while (i <= 10) {

			// Tratamiento del elemento actual
			// Mostramos la multiplicacion
			System.out.println(numero + "x" + i + "=" + numero * i);

			// Pasar al siguiente elemento
			i++;
		}

		teclado.close();

	}// main

}// class
