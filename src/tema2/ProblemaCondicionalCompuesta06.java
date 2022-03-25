package tema2;

import java.util.Scanner;

public class ProblemaCondicionalCompuesta06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se define la variable para saber los años de antiguedad y sueldo
		int antiguedad;
		float sueldo;
		//Se define una variable para el procentaje y el total de sueldo a pagar
		float porcentaje,tsueldo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu sueldo:");
		//Leemos por teclado el sueldo
		sueldo = teclado.nextInt();
		
		System.out.println("Introduce tus años de antiguedad:");
		//Leemos por teclado el sueldo
		antiguedad = teclado.nextInt();
		
		
		if ((sueldo<500)&&(antiguedad>=10)) {
			
			//Realizamos el calculo necesario para saber el aumento que se le otorgará al trabajador
			porcentaje = sueldo* 0.20f;
			//Realizamos el calculo necesarios para saber el sueldo total con el aumento
			tsueldo = sueldo+porcentaje;
			
			//Informamos del sueldo total a pagar
			System.out.println("El sueldo a pagar es: " + tsueldo);	
		}
		else {
			if ((sueldo<500)&&(antiguedad<10)) {
				
				//Realizamos el calculo necesario para saber el aumento que se le otorgará al trabajador
				porcentaje  = sueldo*0.05f;
				//Realizamos el calculo necesarios para saber el sueldo total con el aumento
				tsueldo = sueldo+porcentaje;
				
				//Informamos del sueldo total a pagar
				System.out.println("El sueldo a pagar es: " + tsueldo);	
			}
			else {
				//Informamos del sueldo total a pagar
				System.out.println("El sueldo a pagar es: " + sueldo);	
			}
		}
		
		
	}//main

}//class
