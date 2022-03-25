package tema1;

import java.util.Scanner;

public class EjemploCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		String texto,palabra;
		int inicio,fin;
		
		Scanner teclado = new Scanner(System.in);
		
		
		//Leemos los datos por teclado
		System.out.println("Introduce la primera cadena (string):");
		texto = teclado.nextLine();
		
		
		System.out.println("Introduce la segunda cadena (string):");
		palabra = teclado.next();
		
		
		System.out.println("Introduce el incio:");
		inicio = teclado.nextInt();
		
		
		System.out.println("Introduce el fin:");
		fin = teclado.nextInt();
		
		//Probamos algunas funciones de cadenas
		
		System.out.println("La longitud de la primera cadena es: " + texto.length());
		
		//Concadenacion
		System.out.println(texto.concat(" es la primera cadena"));
		
		System.out.println("El caracter en la posición 4 es "+ inicio + " es " + texto.charAt(3));
		
		System.out.println("El caracter en la posición "+ inicio + " es " + texto.charAt(inicio-1));
		
		//Substring nos corta la cadena por las posiciones que le indicamos
		String subCadena = texto.substring(inicio, fin);
		System.out.println("La subcadena es: " + subCadena);
		
		System.out.println("El primer String es igual al segundo? " + texto.equals(palabra));
		
		System.out.println("Posición de la 2 cadena en la 1: " + texto.indexOf(palabra));
		
		
	}

}
