package tema2;

import java.util.Scanner;

public class ProblemaCondicionalAnidada04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables para respuestas realizadas y correctas, y otra para el porcentaje
		int realizadas,correctas,porcentaje;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero de respuestas realizadas:");
		//Leemos por teclado el numero de respuestas realizadas
		realizadas = teclado.nextInt();
		
		System.out.println("Introduce el n�mero de respuestas correctas:");
		//Leemos por teclado el numero de respuestas realizadas
		correctas = teclado.nextInt();
		
		//Realizamos el c�lculo del porcentaje de preguntas correctas y realizadas
		porcentaje = correctas * 100 / realizadas;
		
		//Comprobamos si el porcentaje es mayor o igual a noventa
		if (porcentaje>=90) {
			System.out.println("Nivel m�ximo");
		}
		else {
			// Si no se cumple la condicion anterior comprobar� si el porcentaje 
			// est� entre 75 y 90
			if ((porcentaje>=75)&&(porcentaje<90)) {
				System.out.println("Nivel medio");
			}
			else {
				// Si tampoco se cumple la condicion anterior comprobar� si el porcentaje 
				// est� entre 50 y 75
				if ((porcentaje>=50)&&(porcentaje<75)) {
				System.out.println("Nivel regular");	
				}
				else {
					//Como �ltima opci�n si no se ha cumplido ninguna de las condiciones
					//anteriores esto significar� que el porcentaje esta por debajo de 50
					// encontr�ndose esta fuera del nivel
					System.out.println("Fuera del nivel");
				}
			}
		}
		
	}//main

}//class
