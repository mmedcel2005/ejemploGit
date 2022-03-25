package tema2;

import java.util.Scanner;

public class ProblemaCondicionalSimple03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos la variable "num"
		int num;
				
		Scanner teclado = new Scanner(System.in);
		
		//Leemos por teclado el número
		System.out.println("Introduce el numero");
		num = teclado.nextInt();
		
		//Si el número esta entre 1 y 9 o es 1 o 9 el programa informará que
		//el número introducido solo tiene un dígito
		if ((num >=1) && (num<=9)) {
			System.out.println("El numero introducido tiene un dígito");
			}//if
		else {
			//Si el número esta entre 10 y 99 o es 10 o 99 el programa informará que
			//el número introducido tiene dos dígitos
			if ((num>=10)&&(num<99)) {
				System.out.println("El número introducido tiene dos dígitos");
			}//if
			//Si no se da ninguna de las condiciones anteriores el número introducido no es válido
			else {
				System.out.println("El número introducido no es valido");
				}//else2
			}//else
		
	}//main

}//class
