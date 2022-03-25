package tema1;

import java.util.Scanner;

public class EjerciciosProgramacionSecuencial03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		int billetes_de_10, billetes_de_100, billetes_de_20, billetes_de_5;
        int billetes_de_50, cantidad_de_euros, monedas_de_1, monedas_de_2;
        
        //Leemos por teclado la cantidad de euros
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa el valor de cantidad de euros");
		//Leemos un String (cadena de texto)
		cantidad_de_euros = teclado.nextInt();
		
		//Realizamos las cuentas necesarias
        monedas_de_1=cantidad_de_euros;
        billetes_de_100=(monedas_de_1-monedas_de_1%100)/100;
        monedas_de_1=monedas_de_1%100;
        billetes_de_50=(monedas_de_1-monedas_de_1%50)/50;
        monedas_de_1=monedas_de_1%50;
        billetes_de_20=(monedas_de_1-monedas_de_1%20)/20;
        monedas_de_1=monedas_de_1%20;
        billetes_de_10=(monedas_de_1-monedas_de_1%10)/10;
        monedas_de_1=monedas_de_1%10;
        billetes_de_5=(monedas_de_1-monedas_de_1%5)/5;
        monedas_de_1=monedas_de_1%5;
        monedas_de_2=(monedas_de_1-monedas_de_1%2)/2;
        monedas_de_1=monedas_de_1%2;
        
        //Mostramos en pantalla el resultado
        System.out.println(
            "Valor de billetes de 10: " + billetes_de_10);
        System.out.println(
            "Valor de billetes de 100: " + billetes_de_100);
        System.out.println(
            "Valor de billetes de 20: " + billetes_de_20 );
        System.out.println(
            "Valor de billetes de 5: " + billetes_de_5 );
        System.out.println(
            "Valor de billetes de 50: " + billetes_de_50);
        System.out.println(
            "Valor de monedas de 1: " + monedas_de_1);
        System.out.println(
            "Valor de monedas de 2: " + monedas_de_2);
	}

}
