package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//definimos las variables necesarias para leer las horas, los minutos y los segundos
		int hora, minutos, segundos;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la hora");
		// Leemos por teclado la hora
		hora = teclado.nextInt();
		
		System.out.println("Introduce el minuto");
		// Leemos por teclado el minuto
		minutos = teclado.nextInt();
		
		
		System.out.println("Introduce el segundo");
		// Leemos por teclado el segundo
		segundos = teclado.nextInt();
		
		//Sumamos 1 minuto al numero de minutos introducido por el usuario
		minutos = minutos +1;
		
		//Sumamos 1 segundo a los segundos introducidos por el usuario
		segundos = segundos + 1;
		
		//Si los segundos son 60 sumaremos 1 a los minutos y pondremos los segundos a 0
		if (segundos >= 60) {
			minutos = minutos +1;	
			segundos = 0;
		}
		else {
		//Si los minutos son 60 sumaremos 1 a los horas y pondremos los minutos a 0
		}
		if (minutos >=60 ) {
			hora = hora + 1;
			minutos = 0;
		}
		else {
			
		}
		//Si las horas son 24 pondremos las horas a 0
		if (hora == 24) {
			hora = 0;
		}
		
		//Informamos de la hora minutos y segundos
		System.out.println("Un minuto y un segundo después será las " + hora + ":" + minutos + ":" + segundos);
		
		

	}//main

}//class
