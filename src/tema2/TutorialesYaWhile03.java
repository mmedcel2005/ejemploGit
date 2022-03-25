package tema2;

import java.util.Scanner;

public class TutorialesYaWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos las variables
		int i = 1;
		int nEmpleados;
		int sueldo;
		int totalSueldo = 0;
		// sueldoMayor contará el numero de personas que cobran más de 300
		int sueldoMayor = 0;
		// sueldoMenor contará el numero de personas que cobran entre 100 y 300
		int sueldoMenor = 0;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado el numero de empleados
		System.out.println("Introduce el numero de empleados: ");
		nEmpleados = teclado.nextInt();

		// Mientras i sea menor o igual q el numero de empleados se ejecutaran las
		// instrucciones
		while (i <= nEmpleados) {
			// Leemos por teclado el sueldo del empleado
			System.out.println("Introduce cuanto cobra el empleado numero " + i + ":");
			sueldo = teclado.nextInt();

			// Si el sueldo esta entre 100 y 300 se incrementará en 1 la variable
			// sueldoMenor
			if (sueldo >= 100 && sueldo <= 300) {
				sueldoMenor++;
			}

			// Si el sueldo es mayor de 300 se incrementará 1 a la variable sueldoMayor
			if (sueldo > 300) {
				sueldoMayor++;
			}

			// Se le suma al total del sueldo el sueldo leido anteriormente por teclado
			totalSueldo += sueldo;

			// Se incrementa el valor de i
			i++;
		}

		// Se informa por pantalla al usuario de los datos obtenidos
		System.out.println("La empresa gasta $" + totalSueldo + " en sueldos al personal");
		System.out.println(sueldoMenor + " persona/s cobran entre $100 y $300");
		System.out.println(sueldoMayor + " persona/s cobran mas de $300");

		// Cerramos el teclado
		teclado.close();

	}// main

}// class
