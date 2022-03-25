package tema2;

import java.util.Scanner;

public class EjemploBuclesWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hacer un programa que lea le edad de 10 personas
		// y calcule la edad maxima mnima y media

		int i = 0;
		Scanner teclado = new Scanner(System.in);
		int edadMaxima = Integer.MIN_VALUE;
		int edadMinima = Integer.MAX_VALUE, edadMedia = 0;
		int edad = 0;

		while (i <= 9) {
			// Tratamiento de datos
			System.out.println("Introduce la edad del alumno " + (i + 1) + ":");
			edad = teclado.nextInt();

			// Calculamos la edad maxima
			// Si la edad que hemos leido es mayor que la edadMaxima hasta este momento
			//
			if (edad > edadMaxima) {
				edadMaxima = edad;

			}
			// Sumamos en edad media los valores de las edades de los 10 alumnos
			edadMedia = edadMedia + edad;

			// Pasar al siguiente
			i++;

		}
		// Una vez fuera del bucle tengamos la suma de todas las edades
		// Para sacar las edades los dividimos entre el numero de elementos

		edadMedia = edadMedia / 10;

		System.out.println("La edad maxima es: " + edadMaxima);
		System.out.println("La edad minima es: " + edadMinima);
		System.out.println("La edad media es: " + edadMedia);

	}// main

}// class
