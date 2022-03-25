package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables para los 3 números
		int num1,num2,num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		//Leemos por teclado el primer número
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número:");
		//Leemos por teclado el segundo número
		num2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número:");
		//Leemos por teclado el tercer número
		num3 = teclado.nextInt();
		
		System.out.println("El número mas pequeño es: ");
		 
		//Comprobamos si el número 1 es el mas pequeño, en ese caso se imprimira el pantalla el numero 1
		if ((num1<num2)&&(num1<num3)) {
			System.out.println(num1);			
		}
		//Si no se cumple la condicion anterior se comprobará si el numero 2 es el más pequeño
		// si la condicion es cierta se imprimira en pantalla el numero 2
		else {
			if (num2<num3) {
				System.out.println(num2);
			}
			//Si la condicion anterior no se cumple se imprimira el número 3
			else {
				System.out.println(num3);
			}
		}
		
		System.out.println("El numero más grande es: ");
		
		//Comprobamos si el número 1 es el mas grande, en ese caso se imprimirá el pantalla el numero 1
		if ((num1>num2)&&(num1>num3)) {
			System.out.println(num1);			
		}
		//Si no se cumple la condicion anterior se comprobará si el número 2 es el más grande
		// si la condicion es cierta se imprimira en pantalla el número 2
		else {
			if (num2>num3) {
				System.out.println(num2);
			}
			//Si la condicion anterior no se cumple se imprimira el número 3
			else {
				System.out.println(num3);
			}
		}
		
		
	}//main

}//class
