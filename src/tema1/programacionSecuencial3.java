package tema1;

import java.util.Scanner;

public class programacionSecuencial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables
		int numero1,numero2,numero3,numero4;
		int suma;
		float promedio;
		
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
		
		//Realizamos la suma de los numeros
		suma = numero1 + numero2 + numero3 + numero4;
		
		//Dividimos el resultado de la suma anterior entre 4
		promedio = suma/4;
		
		//Imprimimos en pantalla los datos de los que queremos informar
		System.out.println("El resultado de la suma de dichos numeros es: " + suma );
		
		System.out.println("El resultado del promedio de dichos numeros es: " + promedio);
	}

}
