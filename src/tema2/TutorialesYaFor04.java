package tema2;

import java.util.Scanner;

public class TutorialesYaFor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se definen las variables
		int i;
		int numLeido;
		Scanner teclado = new Scanner(System.in);

		// Se lee por teclado el numero del que se quiere ver la tabla de multiplicar
		System.out.print("Introduce un numero del 1 al 10: ");
		numLeido = teclado.nextInt();

		// El valor inicial de i sera 1
		// Se ejecutarán las instrucciones dentro del bucle mientras i sea menor o igual
		// a 12
		// Se incrementará en 1 el valor de i al final del bucle
		for (i = 1; i <= 12; i++) {
			// Se multiplica el numero leido por i y se muestra por pantalla
			System.out.println(numLeido * i);
		}

		teclado.close();

	}// main

}// class
