package tema2;
import java.util.Scanner;

public class ProblemaCondicionalSimple01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		int num1,num2,suma,diferencia,producto;
		double division;
		
		Scanner teclado = new Scanner(System.in);
		
		//Leemos por teclado el numero 1
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();
		
		//Leemos por teclado el numero 2
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();
		
		// Si el número 1 es mayor que el número 2 se realizará la suma y la diferencia
		// y se mostrará en pantalla
		if (num1>num2) {
			suma=num1+num2;
			diferencia= num1-num2;
			System.out.println("El resultado de la suma es:" + suma);
			System.out.println("La diferencia es:" + diferencia);
		}//if
		
		//Por el contrario, si num 1 es menor que num 2 entoces se hara el producto y la división
		// y se mostrará en pantalla el resultado
		else {
			producto=num1*num2;
			division = (double) num1/num2;
			
			System.out.println("El resultado del producto es:" + producto);
			System.out.println("La division da como resultado:" + division);
			
		}//else
		
	}//main

}//class
