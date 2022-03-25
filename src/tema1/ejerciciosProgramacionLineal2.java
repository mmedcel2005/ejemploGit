package tema1;

import java.util.Scanner;

public class ejerciciosProgramacionLineal2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos la variable radio, altura y resultado
		double resultado;
		double radio;
		double altura;
		
		//Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);
		
		//Leemos los datos por teclado
		System.out.println("Introduce el radio del cilindro: ");
		radio = teclado.nextFloat();
		
		//Leemos los datos por teclado
		System.out.println("Introduce la altura del cilindro: ");
		altura = teclado.nextFloat();
		
		
		
		resultado= (Math.PI*altura*Math.pow(radio,2));
		
		//Imprimimos en pantalla el resultado
		System.out.println("El volumen del cilindro es: " + resultado);
	
	}

}





