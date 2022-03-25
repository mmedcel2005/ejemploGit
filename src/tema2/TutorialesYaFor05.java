package tema2;

import java.util.Scanner;

public class TutorialesYaFor05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int a, b, c;
		int i;
		int nLeido;
		Scanner teclado = new Scanner(System.in);

		// Se lee el numero de triangulo que vamos a leer
		System.out.print("Introduce el numero de triangulos a leer: ");
		nLeido = teclado.nextInt();

		System.out.println("\n");

		// El valor inicial de i sera 1
		// Se ejecutarán las instrucciones dentro del bucle mientras i sea menor o igual
		// a nLeido
		// Se incrementará en 1 el valor de i al final del bucle
		for (i = 1; i <= nLeido; i++) {
			System.out.println("---------- Triangulo " + i + " ----------");

			// Leemos por teclado el largo del segmento 1
			System.out.print("Introduce el largo del segmento 'a': ");
			a = teclado.nextInt();

			// Leemos por teclado el largo del segmento 2
			System.out.print("Introduce el largo del segmento 'b': ");
			b = teclado.nextInt();

			// Leemos por teclado el largo del segmento 3
			System.out.print("Introduce el largo del segmento 'c': ");
			c = teclado.nextInt();

			// Si todos los lados son iguales es equilatero
			if (a == b && b == c) {
				System.out.println("Es un triangulo equilátero");
			} else {
				// Si no se cumple la condicion anterior se comprobará mediante el
				// Teorema de desigualdad si se puede formar o no un triangulo
				if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
					// En el caso de que se cumpla la condicion anterior comprobará
					// si todos los lados son diferentes es decir si es escaleno
					if (a != b && a != c && b != c) {
						System.out.println("Es escaleno");
					}
					// Si no es escaleno por descarte será isosceles
					else {
						System.out.println("Es isósceles");
					}
				}
				// Si no se cumple la anterior condicion, es decir, el teorema de desigualdad
				// entoces no se podrá formar un triangulo
				else {
					System.out.println("NO es un triángulo");
				}
			}
			System.out.println("\n");
		} // for

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
