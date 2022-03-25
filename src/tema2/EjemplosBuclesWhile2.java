package tema2;

import java.util.Scanner;

public class EjemplosBuclesWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final static int OPCION_INTRODUCIR = 1;
		final static int OPCION_CALCULAR = 2;
		final static int OPCION_SALIR = 3;
		Scanner teclado = new Scanner(System.in);

		// Hacer un programa que lea por teclado varios usuarios
		// nombre, edad, renta, numero de suspensos
		// Y calcule si tiene derecho a beca

		// La beca se le dará si es menor de 25 años y la renta es menor de 10000
		// O es menor de 18 y ha suspendido 0 asignaturas
		// el importe será un 10% de la renta, divido entre los suspensos en el primer
		// caso
		// Y un 20% de la renta en el segundo

		// Declaracion de variables
		int edad = 0, numSuspensos = 0, opcionmenu = 0;
		double renta = 0.0;
		boolean becaAceptada = false;
		double cuantiaBeca = 0.0;
		String nombre = "";

		// Mientras el usuario no seleccione la opcion de salir seguimos ejecutando
		while (opcionMenu != OPCION_SALIR) {
			if (opcionMenu == OPCION_INTRODUCIR) {
				System.out.println("Introduce el nombre: ");
				nombre = teclado.nextLine();
				System.out.println("Introduce la edad: ");
				edad = teclado.nextInt();
				System.out.println("Introduce el numero de suspensos: ");
				numSuspensos = teclado.nextInt();
				System.out.println("Introduce la renta: ");
				renta = teclado.nextDouble();

			}
			if (opcionMenu == OPCIONCALCULAR) {
				if (edad > 25 && renta < 2000.0)
					cuantiaBeca = renta * 10 / 100;
				if (edad < 18 && numSuspensos == 0)
					cuantiaBeca = renta * 20 / 100;

				System.out.println("\nTubeca ha sido concedidad!!\nLacuantia es: " + cuantiaBeca);
			} else {
				System.out.println("Tu beca ha sido denegada. Try again.");
				teclado.next();
			}

			// Pasar al siguiente elemento

			System.out.println("\n\n\n\n\n\n********************************************");
			System.out.println("                  OPCIONES                  ");
			System.out.println("                  1. INTRODUCIR DATOS                  ");
			System.out.println("                  2. CALCULAR BECA                 ");
			System.out.println("                  3. FINALIZAR PROGRAMA                  ");
			System.out.println("\n\n\n********************************************");
			System.out.println("                  OPCION:                  ");

		} // wile

	}// main

}// class
