package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int tarifa, horas, tasas, salarioBruto, salarioNeto;

		Scanner teclado = new Scanner(System.in);

		// Leemos los datos de teclado
		System.out.println("Introduce tu nombre:");
		// Nextline recibe tambien los espacios en blanco
		nombre = teclado.next();

		// Leemos los datos de teclado
		System.out.println("Introduce tu tarifa:");
		// Nextline recibe tambien los espacios en blanco
		tarifa = teclado.nextInt();

		// Leemos los datos de teclado
		System.out.println("Introduce el número de horas trabajadas:");
		// Nextline recibe tambien los espacios en blanco
		horas = teclado.nextInt();

		if (horas > 35) {

			salarioNeto = (int) ((tarifa * 35) + (horas - 35) * (tarifa * 1.5));

		} else {
			salarioNeto = tarifa * horas;
		}

		if (salarioNeto <= 500) {

			salarioBruto = salarioNeto;

		} else {
			if ((salarioNeto > 500) && (salarioNeto <= 900)) {

				salarioBruto = (int) (500 + ((salarioNeto - 500) * 0.75));

			} else {
				salarioBruto = (int) (500 + ((salarioNeto - 500) * 0.75) + ((salarioNeto - 900) * 0.55));

			}
		}

		System.out.println(nombre);
		System.out.println("Salario neto: " + salarioNeto);
		System.out.println("Salario bruto: " + salarioBruto);

	}// main

}// class
