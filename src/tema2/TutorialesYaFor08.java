package tema2;

import java.util.Scanner;

public class TutorialesYaFor08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e incializamos las variables
		int i;
		int edad;
		int sumaMa�ana = 0, sumaTarde = 0, sumaNoche = 0;
		float promMa�ana, promTarde, promNoche;
		Scanner teclado = new Scanner(System.in);

		// Se ejecutaran las instrucciones mientras i sea menor o igual a 50
		for (i = 1; i <= 50; i++) {
			// Generamos la edad
			edad = (int) (Math.random() * 100 + 1);
			// Le sumamos al promedio la edad que acabamos de leer
			sumaMa�ana += edad;
		}

		// Se ejecutaran las instrucciones mientras i sea menor o igual a 60
		for (i = 1; i <= 60; i++) {
			// Generamos la edad
			edad = (int) (Math.random() * 100 + 1);
			// Le sumamos al promedio la edad que acabamos de leer
			sumaTarde += edad;
		}

		// Se ejecutaran las instrucciones mientras i sea menor o igual a 110
		for (i = 1; i <= 110; i++) {
			// Generamos la edad
			edad = (int) (Math.random() * 100 + 1);
			// Le sumamos al promedio la edad que acabamos de leer
			sumaNoche += edad;
		}

		// Realizamos el promedio
		promMa�ana = (float) sumaMa�ana / 50;
		promTarde = (float) sumaTarde / 60;
		promNoche = (float) sumaNoche / 110;

		// Informamos por pantalla del promedio de edades
		System.out.println("-----------Promedio de edades-----------");
		System.out.println("Turno de ma�ana: " + promMa�ana);
		System.out.println("Turno de tarde: " + promTarde);
		System.out.println("Turno de noche: " + promNoche);
		System.out.println("\n");

		// Si el promedio de la ma�ana es el menor se informar� de esto en pantalla
		if (promMa�ana < promTarde && promMa�ana < promNoche) {
			System.out.println("El turno de ma�ana tiene un promedio de edades menor");
		} else {
			// Si el promedio de la tarde es el menor se informar� de esto en pantalla
			if (promTarde < promMa�ana && promTarde < promNoche) {
				System.out.println("El turno de tarde tiene un promedio de edades menor");
			} else {
				// Si no se cumplen las condiciones anteriores por descarte el turno de la noche
				// es el menor
				System.out.println("El turno de noche tiene un promedio de edades menor");
			}
		}

		// Cerramos el teclado
		teclado.close();
	}// main

}// class
