package tema3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej5Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear las funciones esPrimo(int num), esDivisible (int dividendo, int
		 * divisor), int[] arrayDivisores(int num). Las dos primeras el nombre deja
		 * claro lo que es, en la tercera devolverá un array de números con todos los
		 * divisores del número num que recibe cómo parámetro.
		 */
		// Creamos e inicializamos las variables
		int numero = 0;
		int dividendo = 0;
		int divisor = 0;

		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado los datos necesarios
		System.out.print("Introduce el numero: ");
		numero = teclado.nextInt();

		System.out.print("Introduce el dividendo: ");
		dividendo = teclado.nextInt();

		System.out.print("Introduce el divisor: ");
		divisor = teclado.nextInt();

		// Informamos por pantalla de los datos obtenidos
		System.out.println("¿Es primo?: " + esPrimo(numero));
		System.out.println("¿Es divisible?: " + esDivisible(dividendo, divisor));
		System.out.println("Numeros divisores: ");
		System.out.println(arrayDivisores(numero));

	}

	/**
	 * La funcion recibe un numero e indica si es o no un numero primo
	 * 
	 * @param numero
	 * @return boolean que indica si es primo o no
	 */
	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;

		// Mientras primo sea true y el contador sea diferente al numero se
		// ejecutaran las siguientes instrucciones
		while ((primo) && (numero != contador)) {
			// Si el resto del numero introducido entre el contador es cero el
			// Valor de primo sera false
			if (numero % contador == 0)
				primo = false;
			// Se incrementa el valor del contador
			contador++;
		}

		return primo;
	}

	/**
	 * Recibe un numero dividendo y un divisor y dice si es o no divisible
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return boolean que indica si es o no divisible
	 */
	public static boolean esDivisible(int dividendo, int divisor) {

		// Creamos e incializamos la variable
		boolean divisible = false;

		// Si el resto de dividir el dividendo entre el divisor es cero
		// el valor de divisible se cambiará a true
		if (dividendo % divisor == 0) {
			divisible = true;
		}

		return divisible;
	}

	static ArrayList<Integer> arrayDivisores(int numero) {

		// Creamos la lista de divisores
		ArrayList<Integer> divisores = new ArrayList<Integer>();

		// Comprobamos uno a uno todos los numeros mediante el bucle for
		for (int i = 1; i <= numero; i++) {
			// Si el resto es cero se añadirá a la lista de divisores
			if (numero % i == 0) {
				divisores.add(i);

			}
		}

		return divisores;
	}

}
