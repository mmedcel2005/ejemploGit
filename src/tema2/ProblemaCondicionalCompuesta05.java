package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables para eje X e Y
		int x,y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el valor de x:");
		//Leemos por teclado la posicion X
		x = teclado.nextInt();
		
		System.out.println("Introduce el valor de y:");
		//Leemos por teclado la posicion X
		y = teclado.nextInt();
		
		//Si x e y es positivo se encontrara en el primer cuadrante
		if ((x>0)&&(y>0)) {
			System.out.println("Se encuentra en el primer cuadrante");
		}
		else {
			//Si x es negativo e y es positivo se encuentra en el segundo cuadrante
			if ((x<0)&&(y>0)) {
				System.out.println("Se encuentra en el segundo cuadrante");
		}
			else {
				//Si x e y son negativo se encuentran en el terce cuadrante
				if ((x<0)&&(y<0)) {
					System.out.println("Se encuentra en el tercer cuadrante");
			}
				//Si x es positivo e y negativo se encuentra en el cuarto cuadrante
				else {
					System.out.println("Se encuentra en el cuarto cuadrante");
				}
			}
		}
	}//main

}//class
