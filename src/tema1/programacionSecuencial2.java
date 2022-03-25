package tema1;

import java.util.Scanner;

public class programacionSecuencial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Definimos la variables
		int numero1,numero2,numero3,numero4;
		int suma, producto;
		
		
		//Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);
		
		
		//Leemos los datos por teclado
		System.out.println("Introduce el primer numero:");
		numero1 = teclado.nextInt();	
		
		//Leemos los datos por teclado
		System.out.println("Introduce el segundo numero:");
		numero2 = teclado.nextInt();	
		
		//Leemos los datos por teclado
		System.out.println("Introduce el tercer numero:");
		numero3 = teclado.nextInt();	
		
		//Leemos los datos por teclado
		System.out.println("Introduce el cuarto numero:");
		numero4 = teclado.nextInt();	
		
		
		//Realizamos la suma de los dos primeros numeros
		
		suma = numero1+numero2;
		
		//Realizamos el producto de los dos ultimos numeros
		
		producto = numero3*numero4;
	
		
		//Imprimimos en pantalla el resultado de la suma
		System.out.println("La suma de " + numero1 + " y " + numero2 + " da igual a " + suma);
		
		//Imprimimos en pantalla el resultado del producto
		System.out.println("El producto de " + numero2 + " y " + numero3 + " da igual a " + producto);
		
		
	}

}
