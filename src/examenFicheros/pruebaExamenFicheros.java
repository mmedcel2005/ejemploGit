package examenFicheros;

import java.util.Scanner;

public class pruebaExamenFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos y inicializamos las variables
		String fichero = "c:\\pruebaFicheros\\ordenadoresExamen";

		String nombre = "";
		String marca = "";
		String modelo = "";
		int precio = 0;
		String tipo = "";
		int stock = 0;

		int numOrdenadores = 0;

		// Creamos un scanner para leer por teclado
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el numero de ordenadores a leer
		System.out.println("Introduce el numero de ordenadores: ");
		numOrdenadores = teclado.nextInt();

		// Creamos un array y su longitud puesto que ya sabemos el numero de ordenadores
		// que se van a introducir
		OrdenadorFichero[] listaOrdenadores = new OrdenadorFichero[numOrdenadores];

		// Leemos uno a uno cada dato
		for (int i = 0; i < numOrdenadores; i++) {
			System.out.println("---------- " + (i + 1) + " ORDENADOR ----------");
			// Leemos por teclado la informacion

			System.out.println("Introduce el nombre:");
			nombre = teclado.next();

			System.out.println("Introduce la marca:");
			marca = teclado.next();

			System.out.println("Introduce el modelo: ");
			modelo = teclado.next();

			System.out.println("Introduce el precio:");
			precio = teclado.nextInt();

			System.out.println("Tipo portatil o sobremesa: ");
			tipo = teclado.next();

			System.out.println("Introduce el stock:");
			stock = teclado.nextInt();

			// Introducimos los datos leidos en el array creando un nuevo objeto
			listaOrdenadores[i] = new OrdenadorFichero(nombre, marca, modelo, precio, tipo, stock);

		}

		System.out.println(GestorExamenFicheros.guardarDatos(listaOrdenadores, fichero));
	}

}
