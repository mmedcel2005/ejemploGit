package tema3;

import java.util.Scanner;

public class EjerciciosFunciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		boolean resultado;
		float listaNumeros[];
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantos numeros vas a introducir?: ");
		n = teclado.nextInt();

		listaNumeros = new float[n];

		System.out.println("Ve intoduciendo los números: ");
		for (int i = 0; i < n; i++) {
			listaNumeros[i] = teclado.nextFloat();
		}

		resultado = arrayOrdenado(n, listaNumeros);

		if (resultado = true) {
			System.out.println("Está ordenado de menor a mayor");
		} else {
			System.out.println("No está ordenado de menor a mayor");
		}
	}

	private static boolean arrayOrdenado(int n, float listaNumeros[]) {
		boolean resultadoFinal, resultadoLocal;

		for (int i = 1; i < n; i++) {
			if (listaNumeros[i] > listaNumeros[i - 1]) {
				resultadoLocal = true;
			} else {
				resultadoLocal = false;
			}
		}

		if (resultadoLocal = true) {
			resultadoFinal = true;
		} else {
			resultadoFinal = true;
		}
		return resultadoFinal;
	}
}
