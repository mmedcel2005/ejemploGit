package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables
		int mes,dia;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero del dia:");
		//Leemos por teclado el numero del dia
		dia = teclado.nextInt();
		
		System.out.println("Introduce el numero del mes:");
		//Leemos por teclado el numero del mes
		mes = teclado.nextInt();
		
		//Si el mes es 12 y el dia es 25 se informará que es navidad
		if ((mes == 12)&&(dia==25) ) {
			System.out.println("Es navidad");
		}//if
		//Si no se cumple la condicion anterior se informará que NO es navidad
		else {
			System.out.println("No es navidad");
		}//else
		
	}//main

}//class
