package tema2;

import java.util.Scanner;

public class ProblemaCondicionalSimple03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos la variable "num"
		int num;
				
		Scanner teclado = new Scanner(System.in);
		
		//Leemos por teclado el n�mero
		System.out.println("Introduce el numero");
		num = teclado.nextInt();
		
		//Si el n�mero esta entre 1 y 9 o es 1 o 9 el programa informar� que
		//el n�mero introducido solo tiene un d�gito
		if ((num >=1) && (num<=9)) {
			System.out.println("El numero introducido tiene un d�gito");
			}//if
		else {
			//Si el n�mero esta entre 10 y 99 o es 10 o 99 el programa informar� que
			//el n�mero introducido tiene dos d�gitos
			if ((num>=10)&&(num<99)) {
				System.out.println("El n�mero introducido tiene dos d�gitos");
			}//if
			//Si no se da ninguna de las condiciones anteriores el n�mero introducido no es v�lido
			else {
				System.out.println("El n�mero introducido no es valido");
				}//else2
			}//else
		
	}//main

}//class
