package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se definen las variables del primero, segundo, tercer numero
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
		
		//Se comprueban si los número son menores de 10
		if ((num1<10)||(num2<10)||(num3<10)){

			//Se imrpime en pantalla el mensaje indicando que uno de los numero es menor a 10
			System.out.println("Alguno de los números es menor a 10");
			
		}//if
		else {
			//Se imrpime en pantalla el mensaje indicando que ningun numero es menor a 10
			System.out.println("Ninguno de los números es menor a 10");
		}
		
		
	}

}
