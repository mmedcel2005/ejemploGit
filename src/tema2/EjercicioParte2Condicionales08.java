package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int num;
		int resultado;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el numero:");
		num = teclado.nextInt();

		// Calculamos el modulo
		resultado = num % 5;

		// Si el resultado es 0 imprime en pantalla A
		if (resultado == 0) {
			System.out.println("A");
		}

		// Si el resultado es 1 imprime en pantalla B
		if (resultado == 1) {
			System.out.println("B ");
		}

		// Si el resultado es 2 imprime en pantalla C
		if (resultado == 2) {
			System.out.println("C ");
		}

		// Si el resultado es 3 imprime en pantalla D
		if (resultado == 3) {
			System.out.println("D ");
		}

		// Si el resultado es 4 imprime en pantalla E
		if (resultado == 4) {
			System.out.println("E ");
		}

		// Si el resultado es otro diferente imprime en pantalla F
		if (resultado > 4) {
			System.out.println("F ");
		}

	}

}
