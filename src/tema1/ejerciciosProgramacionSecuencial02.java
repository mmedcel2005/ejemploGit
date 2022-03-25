package tema1;

import java.util.Scanner;

public class ejerciciosProgramacionSecuencial02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primero definimos las variables
		int edadactual,edadfinal;
		int añoactual,añofinal;
		int nacimiento;
		
		//Usamos el obejeto de tipo scanner para leer
		Scanner teclado = new Scanner(System.in);
		
		//Leemos por teclado la edad actual
		System.out.println("Introduce tu edad actual: ");
		edadactual = teclado.nextInt();
		
		//Leemos por teclado el año actual
		System.out.println("Introduce el año actual: ");
		añoactual = teclado.nextInt();
		
		//Leemos por teclado el año determinado
		System.out.println("Introduce el año determinado: ");
		añofinal = teclado.nextInt();
		
		//Para obtener la edad que tendra en determinado año 
		// realizamos el siguiente calculo
		edadfinal = añofinal-añoactual+edadactual;
		
		//Para obtener la edad de nacimiento realizamos el siguiente calculo
		nacimiento = añoactual-edadactual;
		
		//Imprimimos en pantalla el resultado para informar
		System.out.println("En el año " + añofinal + " tendrás " + edadfinal + " años.");
		
		//Imprimimos en pantalla el resultado para informar
		System.out.println("Nacistes en el año " + nacimiento);
		
		
	}

}
