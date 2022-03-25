package tema1;

import java.util.Scanner;

public class programacionSecuencial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos la variable lado y perimetro
		double lado;
		double perimetro;
		
		
		//Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);
		
		
		//Leemos los datos por teclado
		System.out.println("Introduce el lado del cuadrado: ");
		lado = teclado.nextDouble();	
		
		
		perimetro= (lado*4);
		
		//Imprimimos en pantalla el resultado
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	
	}
	
}
