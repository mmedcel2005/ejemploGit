package tema2;

import java.util.Scanner;

public class EjemploFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El programa lee un numero y devuelve un factorial
		// El factorial de un numero consiste en multiplicar desde 1 hasta dicho numero
		// todos los numero, por ejemplo el factorial de 4 es 4!= 4X3X2X1

		// Leemos un numero entre 1 y 100
		int numLeido = -1;
		int factorial = 1;
		long tiempo = 0;

		Scanner teclado = new Scanner(System.in);

		// leemos un el numero

		do {
			System.out.println("Introduce el numero: ");
			numLeido = teclado.nextInt();
		} while (numLeido < 1 || numLeido > 100);

		// Guardamos el instante actual
		tiempo = System.currentTimeMillis();

		// El bucle va a ir desde 1 hasta el numLeido, tiene que multiplicar
		// factorial por todos los numeros en ese intervalo
		for (int i = 1; i <= numLeido; i++) {

			System.out.print(i + "x");

			// vamos multiplicando factorial por el numero que se va incrementando y
			// añadiendo
			// La multiplicacion en factorial

			factorial = factorial * 1;

		}

		System.out.println("=" + factorial);

		// El tiempo que ha pasado es el tiempo actual menos el tiempo que guardamos
		// al inicio
		tiempo = System.currentTimeMillis() - tiempo;

		System.out.println("Ha tardado:" + (float) (tiempo / 100));

		teclado.close();

	}

}
