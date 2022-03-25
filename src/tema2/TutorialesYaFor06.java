package tema2;

import java.util.Scanner;

public class TutorialesYaFor06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que pida ingresar coordenadas (x,y) que representan
		 * puntos en el plano.
		 * 
		 * Informar cuántos puntos se han ingresado en el primer, segundo, tercer y
		 * cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad
		 * de puntos a procesar.
		 */

		// Definimos e inicializamos las variables
		int nPuntos;
		int i;
		int x, y;
		int cuadrante1 = 0, cuadrante2 = 0, cuadrante3 = 0, cuadrante4 = 0;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado la cantidad de puntos
		System.out.print("Introduce la cantidad de puntos a procesar: ");
		nPuntos = teclado.nextInt();

		System.out.println("\n");

		// El bucle se ejecutará mientras i sea menor o igual que el numero de puntos a
		// procesar
		for (i = 1; i <= nPuntos; i++) {
			System.out.println("---------- Punto " + i + " ----------");

			// Leemos el valor de x por teclado
			System.out.print("Introduce el valor de x: ");
			x = teclado.nextInt();

			// Leemos el valor de y por teclado
			System.out.print("Introduce el valor de y: ");
			y = teclado.nextInt();

			// Si x e y son posiitivo se encuentra en el primer cuadrante
			if (x > 0 && y > 0) {
				cuadrante1++;
			} else {
				// Si x es negativo e y positivo se encuentra en el segundo cuadrante
				if (x < 0 && y > 0) {
					cuadrante2++;
				} else {
					// Si x e y son negativo se encuentra en el tercer cuadrante
					if (x < 0 && y < 0) {
						cuadrante3++;
					} else {
						// Si no por descarte se encuentra en el cuarto cuadrante
						cuadrante4++;
					}
				}
			}
			System.out.println("\n");
		} // for

		// Informamos por pantalla el numero de puntos que se han ingresado
		// en el primer, segundo, tercer y cuarto cuadrante
		System.out.println("---------- Información general ----------");

		System.out.println("Puntos en el primer cuadrante: " + cuadrante1);
		System.out.println("Puntos en el segundo cuadrante: " + cuadrante2);
		System.out.println("Puntos en el tercer cuadrante: " + cuadrante3);
		System.out.println("Puntos en el cuarto cuadrante: " + cuadrante4);

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
