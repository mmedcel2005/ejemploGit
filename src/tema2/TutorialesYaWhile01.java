package tema2;

import java.util.Scanner;

public class TutorialesYaWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inicializamos las variables
		int i = 0;
		int nota = 0;
		int mayores = 0;
		int menores = 0;
		Scanner teclado = new Scanner(System.in);

		// El programa pedira la nota del alumno mientras que i sea menor o igual a 10
		while (i <= 10) {

			// Leemos por teclado la nota
			System.out.println("Introduce la nota del alumno");
			nota = teclado.nextInt();

			// Incrementamos el numero de i
			i++;

			// Si la nota es mayor o igual que 7 se incrementara el numero de la variable
			// "mayores"
			if (nota >= 7) {
				mayores++;
			}
			// Si la condicion anterior no se cumple quiere decir que la nota es menor que
			// 7,
			// por lo que se sumará 1 a la variable "menores"
			else {
				menores++;
			}
		}

		// Informamos al usuario del numero de personas con notas mayores o iguales que
		// 7 y
		// el numero de persona con nota menor que 7.
		System.out.println("Numero de personas con notas mayor o igual a 7: " + mayores);
		System.out.println("Numero de personas con notas menor a 7: " + menores);

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
