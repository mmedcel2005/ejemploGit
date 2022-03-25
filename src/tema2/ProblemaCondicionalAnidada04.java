package tema2;

import java.util.Scanner;

public class ProblemaCondicionalAnidada04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables para respuestas realizadas y correctas, y otra para el porcentaje
		int realizadas,correctas,porcentaje;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de respuestas realizadas:");
		//Leemos por teclado el numero de respuestas realizadas
		realizadas = teclado.nextInt();
		
		System.out.println("Introduce el número de respuestas correctas:");
		//Leemos por teclado el numero de respuestas realizadas
		correctas = teclado.nextInt();
		
		//Realizamos el cálculo del porcentaje de preguntas correctas y realizadas
		porcentaje = correctas * 100 / realizadas;
		
		//Comprobamos si el porcentaje es mayor o igual a noventa
		if (porcentaje>=90) {
			System.out.println("Nivel máximo");
		}
		else {
			// Si no se cumple la condicion anterior comprobará si el porcentaje 
			// está entre 75 y 90
			if ((porcentaje>=75)&&(porcentaje<90)) {
				System.out.println("Nivel medio");
			}
			else {
				// Si tampoco se cumple la condicion anterior comprobará si el porcentaje 
				// está entre 50 y 75
				if ((porcentaje>=50)&&(porcentaje<75)) {
				System.out.println("Nivel regular");	
				}
				else {
					//Como última opción si no se ha cumplido ninguna de las condiciones
					//anteriores esto significará que el porcentaje esta por debajo de 50
					// encontrándose esta fuera del nivel
					System.out.println("Fuera del nivel");
				}
			}
		}
		
	}//main

}//class
