package tema3;

import java.util.Scanner;

public class Ejemplo1FuncionesRecursivas {

	public static long factorialRecursivo(int num) {

		/*
		 * !5= 5*4*3*2*1 !4= 4*3*2*1 !3= 3*2*1
		 * 
		 * !n= n*!(n-1)
		 * 
		 * !1 = 1 caso base
		 * 
		 */

		if (num == 1) {
			return 1;
		} else {
			return num * factorialRecursivo(num - 1);
		}

	}

	public static long factorialIterativa(int num) {
		long resultado = 1;

		for (int i = 2; i <= num; i++) {
			resultado = resultado * i;
		}

		return resultado;
	}

	public static void menuOperaciones() {
		int op1, op2, opcion;
		Scanner teclado = new Scanner(System.in);

		// Mostramos el menu y leemos la opcion elegida
		System.out.print("MENU\n 1. Suma\n 2. Resta\n Opcion elegida:");
		opcion = teclado.nextInt();

		// Leemos los operandos
		System.out.print("Operando 1: ");
		op1 = teclado.nextInt();
		System.out.print("Operando 1: ");
		op2 = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("El resultado es: " + (op1 + op2));
			break;
		case 2:
			System.out.println("El resultado es: " + (op1 - op2));
			break;
		default:
			System.out.println("Opcion incorrecta");

		}

		menuOperaciones();

		teclado.close();

	}

	public static boolean contiene(int num, int listaNum[]) {

		// Caso basico

		if (num == listaNum[listaNum.length - 1]) {
			return true;
		} else {
			if (listaNum.length == 1) {
				return false;
			} else {
				return contiene(num, dividirArray(listaNum, 0, listaNum.length - 2));
			}
		}
	}

	public static int[] dividirArray(int listaNumeros[], int inicio, int fin) {

		if (listaNumeros == null) {
			return null;
		} else {
			if (fin >= listaNumeros.length || inicio > fin) {

			}
		}

		// Defino un array para guardar el resultado
		// El tamaño sera el indice final menos el inicial
		int listaTemp[] = new int[fin - inicio + 1];

		// Definimos j para ir rellenando las posiciones del array a devolver
		int j = 0;
		for (int i = inicio; i <= fin; i++) {
			listaTemp[j] = listaNumeros[i];

			// Pasamos a la siguiente posicion del array a devolver

			j++;

		}

		return listaTemp;

	}

}
