package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se definen las variables del primero, segundo, tercer numero
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
		
		//Se comprueban si los n�mero son menores de 10
		if ((num1<10)||(num2<10)||(num3<10)){

			//Se imrpime en pantalla el mensaje indicando que uno de los numero es menor a 10
			System.out.println("Alguno de los n�meros es menor a 10");
			
		}//if
		else {
			//Se imrpime en pantalla el mensaje indicando que ningun numero es menor a 10
			System.out.println("Ninguno de los n�meros es menor a 10");
		}
		
		
	}

}
