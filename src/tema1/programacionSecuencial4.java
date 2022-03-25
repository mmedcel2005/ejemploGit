package tema1;

import java.util.Scanner;

public class programacionSecuencial4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		int cantidad;
		double precio;
		double pago;
		
		//Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);
		
		//Leemos los datos por teclado
		System.out.println("Precio del articulo: ");
		precio = teclado.nextDouble();
		
		//Leemos los datos por teclado
		System.out.println("Cantidad: ");
		cantidad = teclado.nextInt();
		
		//Multiplicamos el precio por la cantidad para saber 
		//la cantidad a pagar por el cliente
		pago = (double) precio * cantidad;
		
		System.out.println("El cliente debe abonar " + pago + "€");
		
		
		

	}

}
