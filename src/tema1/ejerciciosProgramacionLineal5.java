package tema1;

import java.util.Scanner;

public class ejerciciosProgramacionLineal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto,palabra;
		int inicio,fin;
		
		Scanner teclado = new Scanner(System.in);
		
		
		//Leemos los datos por teclado
		System.out.println("Introduce la cadena (string):");
		texto = teclado.nextLine();
		
		
		System.out.println("Introduce el incio:");
		inicio = teclado.nextInt();
		
		
		System.out.println("Introduce el fin:");
		fin = teclado.nextInt();
		
		
		//Substring nos corta la cadena por las posiciones que le indicamos
		String subCadena = texto.substring(inicio, fin);
		System.out.println("La subcadena es: " + subCadena);

		
		
		
	}

}
