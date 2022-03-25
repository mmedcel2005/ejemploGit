package tema1;

import java.util.Scanner;

public class ejerciciosProgramacionLineal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				//Definimos las variable texto
				String texto;
			
				//Para leer vamos a usar un objeto de tipo scanner
				Scanner teclado = new Scanner(System.in);
				
				
				//Leemos los datos por teclado
				System.out.println("Introduce la primera cadena (string):");
				texto = teclado.nextLine();

				
				//Inprimimos en pantalla el texto mostrandolo en mayusculas mediante
				//el uso de toUpperCase
				//Y contamos la longitud de la cadena mediante length
				
				System.out.println("La longitud de:" + texto.toUpperCase() + ". Es: " + texto.length());
				
				

				
	}

}
