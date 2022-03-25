package tema3;

import java.util.Scanner;

public class Ej2FuncionesRecursivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int numero;
		Scanner teclado = new Scanner(System.in);

		// Leemos el numero por teclado
		System.out.print("Introduce un número: ");
		numero = teclado.nextInt();

		// Imprimimos en pantalla el resultado
		System.out.println("Número invertido: " + numInvertido(numero));

		// Cerramos el teclado
		teclado.close();
	}

	/**
	 * Recibe un numero entero y devuelve un String con el numero invertido
	 * 
	 * @param num
	 * @return string con el numero invertido
	 */
	private static String numInvertido(int num) {
		if (num < 10) {
			return String.valueOf(num);
		} else {
			return String.valueOf(num % 10) + numInvertido(num / 10);
		}
	}
}
