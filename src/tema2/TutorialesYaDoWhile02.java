package tema2;

import java.util.Scanner;

public class TutorialesYaDoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int suma = 0;
		int cuenta;
		int saldo;
		Scanner teclado = new Scanner(System.in);

		// Mientras el valor de la cuenta sea mayor o igual a 0 se ejecutará las
		// instrucciones dentro del do
		do {
			System.out.println("-----------------------------------------------");

			// Leer por teclado el numero de cuenta
			System.out.print("Introduce el numero de cuenta: ");
			cuenta = teclado.nextInt();

			// Si el numero de cuenta es mayor o igual a 0 se ejecutaran las siguientes
			// instrucciones
			if (cuenta >= 0) {
				// Se lee el saldo
				System.out.print("Introduce el saldo: ");
				saldo = teclado.nextInt();
				System.out.println("\n");

				// Si el saldo es mayor de 0 sera acreedor y se le sumará el valor del saldo
				// introducido a a la suma final
				if (saldo > 0) {
					System.out.println("Acreedor");
					suma += saldo;
				} else {
					// Si el saldo es menor de 0 sera deudor
					if (saldo < 0) {
						System.out.println("Deudor");
					} else {
						// Si no se han cumplido las condiciones anteriores por descare será nulo
						System.out.println("Nulo");
					}
				}
			}

		} while (cuenta >= 0);

		// Se informará de la suma total de los saldos acreedores
		System.out.println("\nLa suma total de los saldos acreedores es: " + suma);

		// Cerrramos el teclado
		teclado.close();
	}

}
