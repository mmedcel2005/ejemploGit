package tema2;

import java.util.Scanner;

public class ProblemaCondicionalAnidada03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero de hasta tres cifras:");
		//Leemos por teclado el numero
		num = teclado.nextInt();
		
		if ((num>=1)&&(num<=9)) {
		System.out.println("El n�mero introducido tiene una cifra");	
		}
		else {
			if ((num>=10)&&(num<=99)) {
				System.out.println("El n�mero introducido tiene dos cifras");
			}
			else {
				if ((num>=100)&&(num<=999)) {
					System.out.println("El n�mero introducido tienes tres cifras");
				}
				else {
					System.out.println("El n�mero introducido no es valido");
				}
			}
		}
				
		
	}//main

}//class
