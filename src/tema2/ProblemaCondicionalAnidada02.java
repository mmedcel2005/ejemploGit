package tema2;

import java.util.Scanner;

public class ProblemaCondicionalAnidada02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos la variable
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número");
		//Leemos por teclado el numero
		num = teclado.nextInt();
		
		if (num>=1) {
			System.out.println("El numero introducido es positivo");
		}
		else {
			if (num==0) {
				System.out.println("El numero introducido es nulo");
			}
			else {
				System.out.println("El numero introducido es negativo");
			}
		}

	}//main

}//class
