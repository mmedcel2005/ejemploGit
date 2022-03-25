package tema3;

import java.util.Scanner;

public class Ej6Funciones {

	public static void main(String[] args) {

		int numero;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el numero
		System.out.println("Introduce un número decimal positivo: ");
		numero = teclado.nextInt();

		// Imprimimos por pantalla el numero convertido a binario
		System.out.println("El número convertido a binario es: " + decimalABinario(numero));

	}

	/**
	 * Se introduce un numero decimal positivo y se devuelve el mismo numero escrito
	 * en binario
	 * 
	 * @param numero
	 * @return String con el numero convertido a binario
	 */
	public static String decimalABinario(int numero) {
		String binario = "";

		if (numero > 0) {
			// Mientras el valor de el numero sea mayor que cero, se realizará
			// continuamente la division del numero entre dos. En dichas divisiones
			// cogeremos el resto de la division y la añadiremos al String binario
			while (numero > 0) {
				if (numero % 2 == 0) {
					binario = "0" + binario;
				} else {
					binario = "1" + binario;
				}
				numero = numero / 2;
			}
		} else {
			if (numero == 0) {
				binario = "0";
			}
		}

		return binario;
	}

}