package tema1;

import java.util.Scanner;

public class ejerciciosProgramacionSecuencial02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primero definimos las variables
		int edadactual,edadfinal;
		int a�oactual,a�ofinal;
		int nacimiento;
		
		//Usamos el obejeto de tipo scanner para leer
		Scanner teclado = new Scanner(System.in);
		
		//Leemos por teclado la edad actual
		System.out.println("Introduce tu edad actual: ");
		edadactual = teclado.nextInt();
		
		//Leemos por teclado el a�o actual
		System.out.println("Introduce el a�o actual: ");
		a�oactual = teclado.nextInt();
		
		//Leemos por teclado el a�o determinado
		System.out.println("Introduce el a�o determinado: ");
		a�ofinal = teclado.nextInt();
		
		//Para obtener la edad que tendra en determinado a�o 
		// realizamos el siguiente calculo
		edadfinal = a�ofinal-a�oactual+edadactual;
		
		//Para obtener la edad de nacimiento realizamos el siguiente calculo
		nacimiento = a�oactual-edadactual;
		
		//Imprimimos en pantalla el resultado para informar
		System.out.println("En el a�o " + a�ofinal + " tendr�s " + edadfinal + " a�os.");
		
		//Imprimimos en pantalla el resultado para informar
		System.out.println("Nacistes en el a�o " + nacimiento);
		
		
	}

}
