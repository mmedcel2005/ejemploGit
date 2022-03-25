package tema2;

import java.util.Scanner;

public class Ejercicios2Bucles01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e inicializamos las variables
		int n;
		int i;
		int k;
		int nLeido;
		int suma = 0;
		int multiplicacion = 1;
		String info;
		Scanner teclado = new Scanner(System.in);

		// Leemos la cantidad de numeros a leer por teclado
		System.out.print("Introduce la cantidad de numeros a leer:");
		n = teclado.nextInt();

		System.out.println("\n------------------------------------------------");
		System.out.println("**Introduce numero positivos y menores de 10**");

		// Mientras i sea menor o igual que n se ejecutaran las instrucciones dentro del
		// bucle
		for (i = 1; i <= n; i++) {
			// Leemos por teclado el numero
			System.out.print("Introduce el " + i + "º numero: ");
			nLeido = teclado.nextInt();

			// Comprobamos que el numero es positivo y menor de 10
			if (nLeido > 0 && nLeido < 10) {
				// Sumamos el numero leido al valor total de suma
				suma += nLeido;
				// Realizamos la multiplicacion
				multiplicacion = multiplicacion * nLeido;
			} else {
				// Si no se cumple la condicion informaremos por pantalla
				System.out.println("El numero no cumple las condiciones");
			}

		}

		System.out.println("\n------------------------------------------------");
		// Mostramos el menu
		System.out.println("¿Que informacion desea saber? \n    -Saber la suma\n    -Saber la multiplicacion\n");

		// Leemos por teclado la informacion que quiere ver
		info = teclado.next();

		// Si info es igual a "suma" se mostrará la suma por pantalla
		if (info.toLowerCase().equals("suma")) {
			System.out.println("La suma es: " + suma);
		} else {
			// Si info es igual a "multiplicacion" se mostrara en pantalla la multiplicacion
			if (info.toLowerCase().equals("multiplicacion")) {
				System.out.println();
			} else {
				// Si no se cumple las condiciones anteriores debemos informar que el valor no
				// es valido
				System.out.println("El valor intrducido no es valido");
			}
		}
		// Cerramos el teclado
		teclado.close();

	}// main

}// class
