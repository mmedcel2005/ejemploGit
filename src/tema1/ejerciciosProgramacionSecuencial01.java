package tema1;

import java.util.Scanner;

public class ejerciciosProgramacionSecuencial01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables
		int numero1,numero2,numero3,numero4;
		int suma,resta,multiplicacion,mayor,menor;
		float division,media;
		
		//Para leer usamos el objeto scanner
		Scanner teclado  = new Scanner(System.in);
		
		//Leemos por teclado los 4 numeros
		System.out.println("Introduce el primer numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		numero2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer numero:");
		numero3 = teclado.nextInt();
		
		System.out.println("Introduce el cuarto numero:");
		numero4 = teclado.nextInt();
		
		//Realizamos las suma de los dos primeros numeros
		suma = numero1+numero2;
		//Imprimimos en pantalla el resultado de la suma
		System.out.println("El resultado de la suma de los dos primeros numeros es: " + suma);
		
		//Realizamos las suma de los dos primeros numeros
		resta = numero1-numero2;
		//Imprimimos en pantalla el resultado de la suma
		System.out.println("El resultado de la resta de los dos primeros numeros es: " + resta);
		
		//Realizamos las suma de los dos primeros numeros
		multiplicacion = numero1*numero2;
		//Imprimimos en pantalla el resultado de la suma
		System.out.println("El resultado de la multiplicacion de los dos primeros numeros es: " + multiplicacion);
		
		//Realizamos las suma de los dos primeros numeros
		division =(float) numero1/numero2;
		//Imprimimos en pantalla el resultado de la suma
		System.out.println("El resultado de la division de los dos primeros numeros es: " + division);
		
		//Realizamos las suma de los dos primeros numeros
		media = (float) ((numero1+numero2+numero3+numero4)/4);
		//Imprimimos en pantalla el resultado de la suma
		System.out.println("La media de los cuatro numeros es: " + media);
	
		
		
	}

}
