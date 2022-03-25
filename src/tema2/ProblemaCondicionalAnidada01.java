package tema2;

import java.util.Scanner;

public class ProblemaCondicionalAnidada01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		int num1,num2,num3;
		
		Scanner teclado = new Scanner(System.in);
		
		//Leemos por teclado el numero 1
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();
		
		//Leemos por teclado el numero 2
		System.out.println("Introduce el segundo número");
		num2 = teclado.nextInt();
		
		//Leemos por teclado el numero 3
		System.out.println("Introduce el tercer numero");
		num3 = teclado.nextInt();
		
		//PASO 1 . Vemos si num1 es mayor que num2
		//En caso de que se cumpla la condicion, pasará al paso 2, pero si no se cumple pasará al paso 3
		if (num1>num2) {
			// PASO 2 . Vemos si num1 es mayor que num3, en caso cierto imprimirá num1 en pantalla,
			// en caso de que num3 sea mayor se imprimira num3 en pantalla
			if (num1>num3) {
				System.out.println("El numero " + num1 + " es el mayor de ellos");
			}//if1
			else {
				System.out.println("El numero " + num3 + " es el mayor de ellos");
			}
		}//if2
		// PASO 3. Se comprobará sin num2 es mayor que num3 en caso cierto imprimirá en pantalla
		// num2 pero en caso de que no se cumpla dicha condicion se mostrará en pantalla num3
		else {
			if (num2>num3) {
				System.out.println("El numero " + num2 + " es el mayor de ellos");
			}//if3
			else {
				System.out.println("El numero " + num3 + " es el mayor de ellos");
			}
		}//else
		
	}//main

}//class
