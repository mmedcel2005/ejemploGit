package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables para los 3 n�meros
		int num1,num2,num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero:");
		//Leemos por teclado el primer n�mero
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo n�mero:");
		//Leemos por teclado el segundo n�mero
		num2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer n�mero:");
		//Leemos por teclado el tercer n�mero
		num3 = teclado.nextInt();
		
		System.out.println("El n�mero mas peque�o es: ");
		 
		//Comprobamos si el n�mero 1 es el mas peque�o, en ese caso se imprimira el pantalla el numero 1
		if ((num1<num2)&&(num1<num3)) {
			System.out.println(num1);			
		}
		//Si no se cumple la condicion anterior se comprobar� si el numero 2 es el m�s peque�o
		// si la condicion es cierta se imprimira en pantalla el numero 2
		else {
			if (num2<num3) {
				System.out.println(num2);
			}
			//Si la condicion anterior no se cumple se imprimira el n�mero 3
			else {
				System.out.println(num3);
			}
		}
		
		System.out.println("El numero m�s grande es: ");
		
		//Comprobamos si el n�mero 1 es el mas grande, en ese caso se imprimir� el pantalla el numero 1
		if ((num1>num2)&&(num1>num3)) {
			System.out.println(num1);			
		}
		//Si no se cumple la condicion anterior se comprobar� si el n�mero 2 es el m�s grande
		// si la condicion es cierta se imprimira en pantalla el n�mero 2
		else {
			if (num2>num3) {
				System.out.println(num2);
			}
			//Si la condicion anterior no se cumple se imprimira el n�mero 3
			else {
				System.out.println(num3);
			}
		}
		
		
	}//main

}//class
