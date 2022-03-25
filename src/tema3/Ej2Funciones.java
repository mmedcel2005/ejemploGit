package tema3;

import java.util.Scanner;

public class Ej2Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radioCirculo;
		double baseTriangulo, alturaTriangulo;
		float ladoCuadrado;
		float ladoRectangulo, alturaRectangulo;
		Scanner teclado = new Scanner(System.in);

		// CIRCULO
		System.out.print("Introduce el radio del circulo: ");
		radioCirculo = teclado.nextDouble();

		System.out.println("El area del circulo es: " + calcularArea(radioCirculo));

		// TRIANGULO
		System.out.print("\n\nIntroduce la base del triangulo: ");
		baseTriangulo = teclado.nextDouble();

		System.out.print("Introduce la altura del triangulo: ");
		alturaTriangulo = teclado.nextDouble();

		System.out.println("El area del triangulo es: " + calcularArea(baseTriangulo, alturaTriangulo));

		// CUADRADO
		System.out.print("\n\nIntroduce el lado del cuadrado: ");
		ladoCuadrado = teclado.nextFloat();

		System.out.println("El area del cuadrado es: " + calcularArea(ladoCuadrado));

		// RECTANGULO
		System.out.print("\n\nIntroduce el lado del rectangulo: ");
		ladoRectangulo = teclado.nextFloat();

		System.out.print("Introduce la altura del rectangulo: ");
		alturaRectangulo = teclado.nextFloat();

		System.out.println("El area del rectangulo es: " + calcularArea(ladoRectangulo, alturaRectangulo));

	}// main

	/**
	 * Funciones que recibe el radio de un circulo y devuelve el area
	 * 
	 * @param radio
	 * @return double con el area del circulo
	 */
	static double calcularArea(double radio) {

		// Damos valor a pi
		double PI = 3.1416;

		// Devuele el valor de la operacion para calcular el area
		return PI * Math.pow(radio, 2);

	}

	/**
	 * Funcion que recibe la base y la altura de un triangulo y devuelve el area del
	 * triangulo
	 * 
	 * @param base
	 * @param altura
	 * @return double con el area del triangulo
	 */
	static double calcularArea(double base, double altura) {
		return (base * altura) / 2;
	}

	/**
	 * Funcion que recibe el lado y devuelve el area del cuadrado
	 * 
	 * @param lado
	 * @return float con el area del cuadrado
	 */
	static float calcularArea(float lado) {
		return lado * lado;
	}

	/**
	 * Funcion que recibe el lado y la altura de un rectangulo y devuelve el area
	 * del rectangulo
	 * 
	 * @param lado
	 * @param altura
	 * @return float con el area del rectangulo
	 */
	static float calcularArea(float lado, float altura) {
		return lado * altura;
	}

}
// class
