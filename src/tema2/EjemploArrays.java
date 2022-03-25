package tema2;

public class EjemploArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leer n edades y calcular la edad máxima, minima, media y la cantidad de
		// mayores de edad y jubilados

		// Array de enteros que guardara la edad
		int edad[];
		int media = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int numMayores = 0, numJubilados = 0;

		// Una caracteristica de array es que hay que definir el tamaño, el cual es fijo
		// Definimos el tamaño
		edad = new int[20];

		/*
		 *
		 * edad [0]=(int)(Math.random()*100); edad [1]=(int)(Math.random()*100); edad
		 * [2]=(int)(Math.random()*100); edad [3]=(int)(Math.random()*100);
		 * 
		 * edad [19]=(int)(Math.random()*100); Mejor utilizamos un bucle ...
		 * 
		 * 
		 */

		for (int i = 0; i <= 19; i++) {
			edad[i] = (int) (Math.random() * 100 + 1);
			System.out.println("edad generada en la posicion " + i + ": " + edad[i]);
		}

		for (int i = 0; i < 19; i++) {
			// Sumo todas las edades en la variable media
			media = media + edad[i];

			// Calculamos el maximo

			if (edad[i] > maximo) {
				maximo = edad[i];
			}

			if (edad[i] < minimo) {
				minimo = edad[i];
			}

			if (edad[i] >= 18) {
				numMayores++;
			}

			if (edad[i] >= 65) {
				numJubilados++;
			}

		}

		// Dividimos la suma de las edades entre la cantidad de elementos
		media = media / edad.length;

		// Mostramos en pantalla los resultados
		System.out.println("La media es: " + media);
		System.out.println("El máximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
		System.out.println("El numero de mayores de edad es: " + numMayores);
		System.out.println("El numero de jubilados es: " + numJubilados);

	}// main

}// class
