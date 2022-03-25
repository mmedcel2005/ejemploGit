package tema2;

import java.util.Scanner;

public class EjemploExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Se leeran por teclado los siguientes datos de una serie de videojuegos:
		 * nombre puntuacion fecha de publicacion (dia, mes y año) categoria (accion,
		 * plataformas, aventora, deporte) precio formato plataformas (sola una, pc, ps4
		 * ...) unidades vendidas
		 * 
		 * Una vez leidos los datos queremos tener tres listas, la lista de los mas
		 * vendidos, la lista de los mas hot, y lista por categorias
		 * 
		 * En los mas vendidos saldran los juegos con mas de 1 millon de copias vendidas
		 * que hayan sido publicados este año.
		 * 
		 * En los mas hot estaran los pertenecientes a ps5 o pc del ultimo mes con
		 * puntuacion mayor a 8
		 * 
		 * Ademas se mostrara el precio máximo y el nombre del videjuego mas caro, el
		 * precio medio de las dos listas y el porcentaje de los videojuegos de cada
		 * formato y categoria.
		 * 
		 */

		String nombre = "";
		int dia = 0, mes = 0, anio = 0;
		String categoria = "";
		double precio;
		String formatoDigital = "";
		String plataforma = "";
		int unidVend = 0;
		int numVideoJuegos = 0;
		int puntuacion = 0;

		// Array de nombres para cada lista
		String listaHot[];
		String listaVend[];

		// Variables para max, min y porcentajes
		int precioMax = Integer.MIN_VALUE;
		String nombreMax = "";
		double preciomHot = 0;
		double precioMVend = 0;
		int cantHot = 0;
		int cantVend = 0;

		Scanner teclado = new Scanner(System.in);

		// Preguntamos cuantos videojuegos leeremos
		System.out.print("Introduce el numero de videojuegos: ");
		numVideoJuegos = teclado.nextInt();

		// Inicializamos el tamaño del array
		listaVendidos = new String[numVideoJuegos];

		// Leemos numVideoJuegos veces
		for (int i = 1; i <= numVideoJuegos; i++) {

			System.out.println("------- " + i + "º JUEGO -------");

			// Leemos los datos
			System.out.print("Introduce el nombre del video juego: ");
			nombre = teclado.next();

			System.out.print("Introduce la puntuacion: ");
			puntuacion = teclado.nextInt();

			System.out.print("Introduce el dia de lanzamiento: ");
			dia = teclado.nextInt();

			System.out.print("Introduce el mes de lanzamiento: ");
			mes = teclado.nextInt();

			System.out.print("Introduce el año de lanzamiento: ");
			anio = teclado.nextInt();

			System.out.print("Introduce la categoria: ");
			categoria = teclado.next();

			System.out.print("Introduce el precio: ");
			precio = teclado.nextInt();

			System.out.print("Introduce el formato (Digital/fisico): ");
			nombre = teclado.next();

			System.out.print("Introduce la plataforma: ");
			plataforma = teclado.next();

			System.out.print("Introduce las unidades vendidas: ");
			unidVend = teclado.nextInt();

			// Creamos las listas
			if (unidVend > 1000000000 && anio == 2021) {
				// Si cumple la condicion de esta en los mas vendidos
				// Añadimos el nombre a la lista de mas vendidos
				// incrementamos la cantidad de la lista
				// Y usamos el precio para calcular la Media
				listaVend[cantVend] = nombre;
				cantVend++;
				precioMVend = precioMVend + precio;
			}

			// Em los mas hot deben pertenecer a PS5 o PC del último mes con puntuacion
			// mayor a 8
			if ((plataforma.equalsIgnoreCase("PC") || plataforma.equalsIgnoreCase("PS4")) && mes == 11
					&& puntuacion > 8) {

				listaHot[cantHot] = nombre;
				cantVend++;
				precioMHot = precioMHot + precio;

			}

		}

	}// main

}// class
