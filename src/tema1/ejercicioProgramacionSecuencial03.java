package tema1;

import java.util.Scanner;

public class ejercicioProgramacionSecuencial03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos la variable para la cantidad de dinero
		int cantidad;
		//Definimos las variables de los billetes
		int bill100,bill50,bill20,bill10,bill5;
		//Definimos las variables de las monedas
		int mon1;
		
		//Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);
		
		//Leemos la cantidad de dinero
		System.out.println("Introduce la cantidad de dinero: ");
		cantidad = teclado.nextInt();
		
		//Realizamos las cuentas necesarias para obtener el desglose minimo en billetes
		mon1 = cantidad;
		bill100 = (mon1%100)/100;
		mon1 = mon1%100;
		bill50 = (mon1-mon1%50)/50;
		mon1 = mon1%50;
		bill20 = (mon1-mon1%20)/20;
		mon1 = mon1%20;
		bill10 = (mon1-mon1%10)/10;
		mon1 = mon1%10;
		bill5 = (mon1-mon1%5)/5;
		mon1 = mon1%5;
		
		//Imprimimos en pantalla el numero de billetes y monedas de cada
		
		System.out.println("Cantidad de billetes de 100€: " + bill100);
		System.out.println("Cantidad de billetes de 50€: " + bill50);
		System.out.println("Cantidad de billetes de 20€: " + bill20);
		System.out.println("Cantidad de billetes de 10€: " + bill10);
		System.out.println("Cantidad de billetes de 5€: " + bill5);
		System.out.println("Cantidad de monedas de 1€: " + mon1);

	}

}
