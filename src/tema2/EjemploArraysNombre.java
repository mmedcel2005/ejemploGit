package tema2;

import java.util.Scanner;

public class EjemploArraysNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El ejercicio busca un nombre en un array de nombres y nos dice si esta o no

		// Inicializo el array
		String alumnos[] = { "Daniel", "Ivan", "Natan", "Alvaro", "Francisco", "Miguel" };
		String nombreBuscar = "";
		Scanner teclado = new Scanner(System.in);
		// Encontrado sera true si el nombre se encuentra en el array
		boolean encontrado = false;
		int posAlumno = -1;

		System.out.println("Introduce el nombre a buscar");
		nombreBuscar = teclado.nextLine();

		int i = 0;
		// La i se va incrementando, paramos cuando llegue al ultimo elemento, el 5
		while (i < 6 && posAlumno == -1) {
			if (nombreBuscar.equals(alumnos[i])) {
				// encontrado = true;
				posAlumno = i;
				// Nos salimos del bucle
				// break;
			}

			// Pasamos al siguiente elemento
			i++;
		}

		if (encontrado) {
			System.out.println("El nombre esta en la lista" + (posAlumno + 1));
		} else {
			System.out.println("El nombre no está en la lista");
		}

		// Cerramos la entrada
		teclado.close();

	}

}
