package tema1;

import java.util.Scanner;

public class ejerciciosProgramacionLineal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos la variable radio y resultado
		double resultado;
		double radio;
		//He definido la variable llamada division 
		//para evitar que al hacer la division de 4/3 pase el resultado a int
		double division;
		
		//Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);
		
		//Leemos los datos por teclado
		System.out.println("Introduce el radio de la esfera");
		radio = teclado.nextFloat();
		
		//Realizamos la formula definida para hallar el volumen de la esfera
		division = (double) 4/3;
		
		resultado= (division*Math.PI*Math.pow(radio,3));
		
		//Imprimimos en pantalla el resultado
		System.out.println("El volumen de dicha esfera es:" + resultado);
	
	}

}
