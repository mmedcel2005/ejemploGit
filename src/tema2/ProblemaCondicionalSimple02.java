package tema2;

import java.util.Scanner;

public class ProblemaCondicionalSimple02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		int nota1,nota2,nota3;
		double promedio;
		
		Scanner teclado = new Scanner(System.in);
		
		//Leemos por teclado la primera nota
		System.out.println("Introduce la primera nota");
		nota1 = teclado.nextInt();
		
		//Leemos por teclado la segunda nota
		System.out.println("Introduce la segunda nota");
		nota2 = teclado.nextInt();
		
		//Leemos por teclado la tercera nota
		System.out.println("Introduce la tercera nota");
		nota3 = teclado.nextInt();
		
		//Realizamos el promedio
		promedio = (nota1+nota2+nota3)/3;
		
		//Si el promedio es mayor o igual a 7 se mostrará en pantalla "Promocionado"
		if (promedio >=7) {
			
			System.out.println("Promocionado");
			
		}//if
		//de lo contrario, si el promedio es menor a 7 se mostrará en pantalla "NO promocionado"
		else {
			System.out.println("No promocionado");
		}//else
	}//main

}//class
