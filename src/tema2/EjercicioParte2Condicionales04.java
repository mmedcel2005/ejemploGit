package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se define las variables para los tres numeros y para saber
		// si el usuario quiere que se muestre en orden ascendente o descendente
		int num1,num2,num3;
		int menor,mediano,mayor;
		String orden;
		
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
		
		System.out.println("¿Quieres que se muestre en orden ascendente o descendente?:");
		//Leemos por teclado el primer número
		orden = teclado.next();
		
		//Calcular el mayor
		//Comprueba si el num1 es el mayor
		if ((num1>num2)&&(num1>num3)){
			mayor=num1;
		}
		else {
			//Comprueba si el num2 es el mayor
			if ((num2>num1)&&(num2>num3)) {
				mayor= num2;
			}
			//Si ninguna de las condiciones anteriores es cierta, el num3 será el mayor por descarte
				else {
					mayor = num3;
				}
		}
		
		//Calcular el menor
		//Comprueba si el num1 es el menor
		if ((num1<num2)&&(num1<num3)){
			menor=num1;
		}
		else {
			//Comprueba si el num2 es el menor
			if ((num2<num1)&&(num2<num3)) {
				menor= num2;
			}
				else {
					//Si ninguna de las condiciones anteriores es cierta, el num3 será el menor por descarte
					menor = num3;
				}
		}
		
		//Si num1 es mayor que num2 y menor que num 3, num1 será el mediano
		if ((num1 > num2)&&(num1 < num3)){
			mediano=num1;
		}
		else {
			//Si num1 es menor que num2 y mayor que num 3, num1 será el mediano
			if ((num1 < num2)&&(num1 > num3)) {
				mediano=num1;
			}
			else {
				//Si num2 es mayor que num1 y menor que num3, num2 será el mediano
				if ((num2 > num1)&&(num2 < num3)) {
					mediano=num2;
				}
				else {
					//Si num2 es menor que num1 y mayor que num3, num2 será el mediano
					if ((num2 < num1)&&(num2 > num3)) {	
						mediano=num2;
					}
					//Por descarte si ninguna de las condiciones anteriores se cumple num3 será el mediano 
					else {
						mediano=num3;
					}
				}
			}
		}

		
		
		//Se lee la variable orden y se pasa a minusculas, si esta es "ascendente" se mostrará en orden de menor a mayor
		if (orden.toLowerCase().equals("ascendente")) {
			System.out.println(menor + " - " + mediano + " - " + mayor);
		}
		//Se lee la variable orden y se pasa a minusculas, si esta es "descendente" se mostrará en orden de mayor a menor
		if (orden.toLowerCase().equals("descendente")) {
			System.out.println(mayor + " - " + mediano + " - " + menor);
		}
		
		
		
	}//main

}//class
