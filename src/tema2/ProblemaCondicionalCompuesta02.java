package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se definen las variables del primero, segundo, tercer numero
		int num1,num2,num3;
		//Se define la variable suma para imprimir en pantalla el resultado de la suma
		int suma;
		//Se define la variable multiplicacion para imprimir en pantalla el resultado de la multiplicacion
		int multiplicacion;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		//Leemos por teclado el primer número
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número:");
		//Leemos por teclado el segundo número
		num2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número:");
		//Leemos por teclado el tercer número
		num3 = teclado.nextInt();
		
		//Se comprueban sin los número son iguales
		if ((num1==num2)&&(num1==num3)){
			//Se realiza la suma y la multiplicacion en caso de que sea cierta la condición
			suma=num1+num2;
			multiplicacion=suma*num3;
			
			//Se imrpime en pantalla el resultado de la suma
			System.out.println("El resultado de la suma es: " + suma);
			
			//Se imrpime en pantalla el resultado de la multiplicacion
			System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
			
		}//if
		else {
			System.out.println("Los tres valores no son iguales");
		}
		
	}//main

}//class
