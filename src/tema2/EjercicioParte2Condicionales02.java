package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos la variable n�mero
		int numero = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		//Leemos por teclado el n�mero
		numero = teclado.nextInt();
		
		//Si el numero es igual a 1,2,5,10,20,50,100,200 o 500 ser� v�lido
		if ((numero==1)||(numero==2)||(numero==5)||(numero==10)||(numero==20)||(numero==50)||(numero==100)||(numero==200)||(numero==500)) {
			System.out.println("V�lido");
		}
		//Si no se cumple la condici�n anterior ser� "No v�lido"
		else {
			System.out.println("No v�lido");
		}
		
		
	}//main

}//class
