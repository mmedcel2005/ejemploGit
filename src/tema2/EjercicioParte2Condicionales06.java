package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos una variable para cada dato a introducir  por el usuario
		String pelo,ojo,nariz,boca;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("�Como es el pelo? (rizado ,liso o peinado)");
		// Leemos por teclado como es el pelo
		pelo = teclado.next();
		
		System.out.println("�Como son los ojos? (cerrados, redondos o estrellados)");
		// Leemos por teclado como son los ojos
		ojo = teclado.next();
		
		System.out.println("�Como es la nariz? (aplastado, respingona o agilenc)");
		// Leemos por teclado como es la nariz
		nariz = teclado.next();
		
		System.out.println("�Como es la boca? (normal, bigote o dientes-salidas)");
		// Leemos por teclado como es la boca
		boca = teclado.next();
		
		//PELO
		//Pasamos la variable a minusculas y si es rizado imprimir� @@@@@
		if (pelo.toLowerCase ().equals("rizado")) {
			System.out.println("@@@@@");
		}
		//Pasamos la variable a minusculas y si es liso imprimir� VVVVV
		if (pelo.toLowerCase ().equals("liso")) {
			System.out.println("VVVVV");
		}
		//Pasamos la variable a minusculas y si es peinado imprimir� XXXXX
		if (pelo.toLowerCase ().equals("peinado")) {
			System.out.println("XXXXX");
		}
		
		//OJOS
		//Pasamos la variable a minusculas y si es cerrados imprimir�  -.-
		if (ojo.toLowerCase ().equals("cerrados")) {
			System.out.println(" -.-");
		}
		//Pasamos la variable a minusculas y si es redondos imprimir� o-o
		if (ojo.toLowerCase ().equals("redondos")) {
			System.out.println(" o-o");
		}
		//Pasamos la variable a minusculas y si es estrellados imprimir� * - *
		if (ojo.toLowerCase ().equals("estrellados")) {
			System.out.println("* - *");
		}
				
		//NARIZ
		//Pasamos la variable a minusculas y si es aplastado imprimir� 0
		if (nariz.toLowerCase ().equals("aplastado")) {
			System.out.println("  0");
		}
		//Pasamos la variable a minusculas y si es respingona imprimir� C
		if (nariz.toLowerCase ().equals("respingona")) {
			System.out.println("  C");
		}
		//Pasamos la variable a minusculas y si es agilenc imprimir� V
		if (nariz.toLowerCase ().equals("agilenc")) {
			System.out.println("  V");
		}
		
		//BOCA
		//Pasamos la variable a minusculas y si es normal imprimir� ===
		if (boca.toLowerCase ().equals("normal")) {
			System.out.println(" ===");
		}
		//Pasamos la variable a minusculas y si es bigote imprimir� ...
		if (boca.toLowerCase ().equals("bigote")) {
			System.out.println(" ...");
		}
		//Pasamos la variable a minusculas y si es dientes-salidas imprimir� www
		if (boca.toLowerCase ().equals("dientes-salidas")) {
			System.out.println(" www");
		}
		
		
		
		
		
		
		
	}//main

}//class
