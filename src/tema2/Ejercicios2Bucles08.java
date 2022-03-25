package tema2;

import java.util.Scanner;

public class Ejercicios2Bucles08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e iniciamos laS variableS
		int opcion;
		int i = 0;
		int k;
		String circuito;
		int posicion;
		int puntos = 0;
		int adelantamientos;
		int safetyCar[];
		String accidente[];
		int totalAccidentes = 0;
		int mejorPosicion = 99;
		String nombreMejorCircuito = "";
		int nCarreras = 0;
		float porcentajeAccidentes[] = null;
		int totalSafetyCar = 0;
		int posicionesTotales = 0;
		float mediaPosiciones = 0;
		int adelTotal = 0;
		float mediaAdelantamientos = 0;
		float porcentajeSafetyCars[] = null;
		int acciBinario[];
		Scanner teclado = new Scanner(System.in);

		// Mientras i sea menor de 1 se ejecutaran las instrucciones del bucle.
		while (i < 1) {
			// Mostramos el menu
			System.out.print(
					"------------ MENU ------------\n  1) Introducir datos \n  2) Mostrar estadísticas \n  3) Salir \n\nIntroduce la opcion: ");
			// Leemos por teclado la opcion
			opcion = teclado.nextInt();
			// Si la opcion es 1 se ejecutará las siguientes instrucciones
			if (opcion == 1) {
				System.out.println("------------ DATOS ------------");
				// Leemos el numero de carreras
				System.out.println("Introduce el numero de carreras: ");
				nCarreras = teclado.nextInt();

				// Definimos el tamaño de los array en funcion del numero de carreras
				safetyCar = new int[nCarreras];
				accidente = new String[nCarreras];
				acciBinario = new int[nCarreras];
				porcentajeAccidentes = new float[nCarreras];
				porcentajeSafetyCars = new float[nCarreras];

				// Mientras el valor de k sea menor que el numero de carrera se ejecutará lo
				// siguiente
				for (k = 0; k < nCarreras; k++) {
					System.out.println("-------- Carrera " + (k + 1) + " -----------");

					// Leemos el nombre del circuito
					System.out.print("Nombre del circuito: ");
					circuito = teclado.next();

					// Leemos la posicion por teclado
					System.out.print("Posicion: ");
					posicion = teclado.nextInt();
					// Le sumamos a las posiciones totales la posicion recien leida
					posicionesTotales += posicion;

					// Leemos los adelantamientos por teclado
					System.out.print("Adelantamientos: ");
					adelantamientos = teclado.nextInt();
					// Le sumamos al valor de adelantamientos totales el numero de adelantamientos
					// recien leido
					adelTotal += adelantamientos;

					// Leemos el numero de safety cars
					System.out.print("Safety car: ");
					safetyCar[k] = teclado.nextInt();

					// Leemos si hay accidente o no
					System.out.print("Accidente (si/no): ");
					accidente[k] = teclado.next();

					// Si la posicion leida es mejor (menor) que la mejor posicion se hará lo
					// siguiente
					if (posicion < mejorPosicion) {
						// Se cambiara el nombre del circuito con mejor posicion a la recien leida
						nombreMejorCircuito = circuito;
						// Cambiamos el valor de la mejor posicion y le damos el valor de la posicion
						// recien leida
						mejorPosicion = posicion;

					}

					// Este switch dependiendo de la posicion leida le incrementará al valor de
					// puntos totales una cantidad de puntos determinada
					switch (posicion) {
					case 10:
						puntos += 1;

					case 9:
						puntos += 2;
						break;

					case 8:
						puntos += 4;
						break;

					case 7:
						puntos += 6;
						break;

					case 6:
						puntos += 8;
						break;

					case 5:
						puntos += 10;
						break;

					case 4:
						puntos += 12;
						break;

					case 3:
						puntos += 15;
						break;

					case 2:
						puntos += 18;
						break;

					case 1:
						puntos += 25;
						break;

					default:
						puntos += 0;
					}

					// Le sumaremos al valor de totalSafetyCar el valor de safetyCar recien leido
					totalSafetyCar += safetyCar[k];

					// Si el valor de accidente leido por teclado es SI se incrementará en 1 el
					// valor total de accidentes
					if (accidente[k].equalsIgnoreCase("si")) {
						totalAccidentes++;
					}

				}

				// Este bucle for comprueba uno a uno los valores introducidos en el array
				// accidente y dependiendo del valor de esta se pondra un 1 o un 0
				for (k = 0; k < accidente.length; k++) {
					if (accidente[k].equalsIgnoreCase("si")) {
						acciBinario[k] = 1;
					} else {
						acciBinario[k] = 0;
					}
				}

				// Este bucle calcula el porcentaje de accidentes
				for (k = 0; k < accidente.length; k++) {
					porcentajeAccidentes[k] = 100 / (float) totalAccidentes * acciBinario[k];
				}

				// Este bucle calcula el porcentaje de safety car
				for (k = 0; k < safetyCar.length; k++) {
					porcentajeSafetyCars[k] = 100 / (float) totalSafetyCar * safetyCar[k];
				}

				// Se hace la media de posiciones totales
				mediaPosiciones = ((float) posicionesTotales / nCarreras);

				// Se hace la media de adelantamientos totales
				mediaAdelantamientos = ((float) adelTotal / nCarreras);
			}

			if (opcion == 2) {
				System.out.println("--------- ESTADISTICA ---------");

				// Se informa por pantalla
				System.out.println("La mejor posición obtenida es: " + mejorPosicion + "º");
				System.out.println("En el circuito " + nombreMejorCircuito);
				System.out.println("Ha conseguido " + puntos + " puntos en total");
				// Se muestra la media del porcentaje de safety cars en cada carrera
				for (k = 0; k < porcentajeSafetyCars.length; k++) {
					System.out.println("Porcentaje de safety cars en la carrera " + (k + 1) + " : "
							+ porcentajeSafetyCars[k] + "%");
				}

				// Se muestra la media del porcentaje de accidentes en cada carrera
				for (k = 0; k < porcentajeAccidentes.length; k++) {
					System.out.println(
							"Porcentaje de accidentes en la carrera " + (k + 1) + ": " + porcentajeAccidentes[k] + "%");
				}

				// Si la media de posiciones es menor o igual de 3 (menor por que la mejor
				// posicion es la menor, es decir, la mejor posicion es la 1)
				if (mediaPosiciones <= 3) {
					// Se felicitará por pantalla
					System.out.println("Felicitaciones la media de posiciones es mejor de 3");
				} else {
					// Si no se informará de que está despedido
					System.out.println("Despedido, no has conseguido los objetivos en la media de posiciones");
				}

				// Si la media de adelantamientos esta por encima de 3 se informará que tiene el
				// título al piloto más audaz
				if (mediaAdelantamientos >= 3) {
					System.out.println("Título al piloto más audaz");
				}

			}

			// Si elige la opcion 3, es decir, salir, se incrementará en 1 el valor de i
			// haciendo que se deje de cumplir la condicion impuesta en el bucle haciendo
			// asi que termine
			if (opcion == 3) {
				i++;
			}

		}

		// Se cierra el teclado1
		teclado.close();

	}// main

}// class
