package tema2;

import java.util.Scanner;

public class ProblemaCondicionalAnidada03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número de hasta tres cifras:");
		//Leemos por teclado el numero
		num = teclado.nextInt();
		
		if ((num>=1)&&(num<=9)) {
		System.out.println("El número introducido tiene una cifra");	
		}
		else {
			if ((num>=10)&&(num<=99)) {
				System.out.println("El número introducido tiene dos cifras");
			}
			else {
				if ((num>=100)&&(num<=999)) {
					System.out.println("El número introducido tienes tres cifras");
				}
				else {
					System.out.println("El número introducido no es valido");
				}
			}
		}
				
		
	}//main

}//class
