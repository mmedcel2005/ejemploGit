package tema2;

import java.util.Scanner;

public class Ejercicios2Bucles04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e incializamos las variables
		int n;
		int i;
		String nombre;
		String nombreMejorATP = "";
		String nombreMasGanados = "";
		float torneosJugados;
		float torneosGanados;
		float masTorneosGanados = 0;
		float mediaGanados = 0;
		int posicion;
		int mejorPosicion;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el numero de jugadores
		System.out.print("Introduce el numero de jugadores:");
		n = teclado.nextInt();

		mejorPosicion = n + 1;

		// Las instrucciones del bucle se ejecutaran mientras i sea menor o igual a n
		for (i = 1; i <= n; i++) {
			System.out.println("\n---------- " + i + " º Jugador ----------");
			// Leemos por teclado el nombre
			System.out.print("Introduce el nombre: ");
			nombre = teclado.next();

			// Leemos por teclado el numero de torneos jugados para poder hacer la media de
			// torneos ganados
			System.out.print("Torneos jugados: ");
			torneosJugados = teclado.nextInt();

			// Leemos por teclado el numero de torneos ganados
			System.out.print("Introduce el numero de torneos ganados: ");
			torneosGanados = teclado.nextInt();

			// Leemos por teclado la posicion atp
			System.out.print("Introduce la posicion atp: ");
			posicion = teclado.nextInt();

			// Si la posicion es menor que la mayor posicion se hará lo siguiente
			if (posicion < mejorPosicion) {

				// El valor de la variable mejorPosicion sera el valor de la posicion leida
				mejorPosicion = posicion;

				// El valor de nombreMejorATP cambiara al nombre leido
				nombreMejorATP = nombre;

			} else {
				if (posicion == mejorPosicion) {
					// Si hay dos posiciones iguales se informara por pantalla de esto
					System.out.println("No puede haber dos posiciones iguales");
				}
			}

			// Si el numero de torneos ganados que se ha leido es mayor que el valor de
			// masTorneos ganados se aplicara lo siguiente

			if (torneosGanados > masTorneosGanados) {

				// El nombre de la persona que mas torneos ha ganado se cambiara por el nombre
				// que acabamos de leer
				nombreMasGanados = nombre;

				// Se calcula la media de torneos ganados
				mediaGanados = (torneosGanados / torneosJugados) * 100;

				masTorneosGanados = torneosGanados;

			}
		}

		// Se informa por pantalla
		System.out.println("\nEl jugador en mejor posicion en la lista atp es: " + nombreMejorATP);
		System.out.println("El jugador con más torneos ganados es: " + nombreMasGanados);
		System.out.println("Con una media de " + mediaGanados + "%");

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
