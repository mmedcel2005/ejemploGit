package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el largo del segmento 1
		System.out.println("Introduce el largo del segmento 'a'");
		a = teclado.nextInt();

		// Leemos por teclado el largo del segmento 2
		System.out.println("Introduce el largo del segmento 'b'");
		b = teclado.nextInt();

		// Leemos por teclado el largo del segmento 3
		System.out.println("Introduce el largo del segmento 'c'");
		c = teclado.nextInt();

		// Si todos los lados son iguales es equilatero
		if (a == b && b == c) {
			System.out.println("Es un triangulo equil�tero");
		} else {
			// Si no se cumple la condicion anterior se comprobar� mediante el
			// Teorema de desigualdad si se puede formar o no un triangulo
			if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
				// En el caso de que se cumpla la condicion anterior comprobar�
				// si todos los lados son diferentes es decir si es escaleno
				if (a != b && a != c && b != c) {
					System.out.println("Es escaleno");
				}
				// Si no es escaleno por descarte ser� isosceles
				else {
					System.out.println("Es is�sceles");
				}
			}
			// Si no se cumple la anterior condicion, es decir, el teorema de desigualdad
			// entoces no se podr� formar un triangulo
			else {
				System.out.println("NO es un tri�ngulo");
			}
		}

	}

}
