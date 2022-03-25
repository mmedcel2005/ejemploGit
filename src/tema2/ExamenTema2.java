package tema2;

import java.util.Scanner;

public class ExamenTema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e incializamos las variables
		int i;
		int nEmpleados;
		String nombre;
		int edad;
		int sueldo;
		String estadoCivil;
		int diasBaja;

		int mayorEdad = 0;

		String nombreMayorEdad = "";
		int totalEdad = 0;
		int mediaEdad = 0;
		int mayorSueldo = 0;
		int menorSueldo = Integer.MAX_VALUE;
		String nombreMayorSueldo = "";
		String nombreMenorSueldo = "";

		float nSolteros = 0;
		float nCasados = 0;
		float nDivorciados = 0;
		float porcentajeSolteros = 0;
		float porcentajeCasados = 0;
		float porcentajeDivorciados = 0;

		Scanner teclado = new Scanner(System.in);

		// Leemos el numero de empleados
		System.out.print("Introduce el numero de empleados: ");
		nEmpleados = teclado.nextInt();

		// Se ejecutaran las instrucciones dentro del bucle mientras que el valor de i
		// sea menor que el numero de empleados
		for (i = 0; i < nEmpleados; i++) {

			// Leemos por teclado la informacion
			System.out.println("\n------------ Empleado " + (i + 1) + " ------");
			System.out.print("Introduce el nombre: ");
			nombre = teclado.next();

			System.out.print("Introduce la edad: ");
			edad = teclado.nextInt();

			System.out.print("Introduce el sueldo: ");
			sueldo = teclado.nextInt();

			System.out.print("Introduce el estado civil (S- Soltero, C-Casado, D-Divorciado): ");
			estadoCivil = teclado.next();

			System.out.print("Introduce el numero de días de baja: ");
			diasBaja = teclado.nextInt();

			// Calcular el empleado de mayor edad y su nombre
			if (edad > mayorEdad) {
				mayorEdad = edad;
				nombreMayorEdad = nombre;
			}

			// Calcula el empleado con mayor sueldo y su nombre
			if (sueldo > mayorSueldo) {
				mayorSueldo = sueldo;
				nombreMayorSueldo = nombre;
			}

			// Calcula el empleado con menor sueldo y su nombre
			if (sueldo < menorSueldo) {
				menorSueldo = sueldo;
				nombreMenorSueldo = nombre;
			}

			// Se incrementa el valor de la edad total para luego calcular la media
			totalEdad += edad;

			// Se comprueba si el empleado tiene derecho a jubilación anticipada
			if (edad > 55 && (sueldo > 3500 || diasBaja > 100)) {
				System.out.println("El empleado " + nombre + " tiene derecho a jubilacion anticipada");
			} else {
				// Si no tiene derecho a jubilación anticipada se informará por pantalla
				System.out.println("El empleado " + nombre + " NO tiene derecho a jubilacion anticipada");
			}

			// Calculamos el numero de solteros
			if (estadoCivil.equalsIgnoreCase("Soltero") || estadoCivil.equalsIgnoreCase("S")) {
				nSolteros++;
			}

			// Calculamos el numero de casados
			if (estadoCivil.equalsIgnoreCase("Casado") || estadoCivil.equalsIgnoreCase("C")) {
				nCasados++;
			}

			// Calculamos el numero de divorciados
			if (estadoCivil.equalsIgnoreCase("Divorciado") || estadoCivil.equalsIgnoreCase("D")) {
				nDivorciados++;
			}

		} // for

		// Calculo de la media de edad
		mediaEdad = totalEdad / nEmpleados;

		// Calculo de la media de solteros
		porcentajeSolteros = (nSolteros / nEmpleados * 100);

		// Calculo de la media de casados
		porcentajeCasados = (nCasados / nEmpleados * 100);

		// Calculo de la media de divorciados
		porcentajeDivorciados = (nDivorciados / nEmpleados * 100);

		// Informamos por pantalla
		System.out.println("\n------------ INFORMACION ------------");
		System.out.println("El empleado con mayor edad es " + nombreMayorEdad + " con " + mayorEdad + " años");
		System.out.println("La edad media es " + mediaEdad);
		System.out.println(
				"El empleado con mayor sueldo es " + nombreMayorSueldo + " con  un sueldo de " + mayorSueldo + "€");
		System.out.println(
				"El empleado con menor sueldo es " + nombreMenorSueldo + " con  un sueldo de " + menorSueldo + "€");
		System.out.println("\nEl porcentaje de empleados solteros es " + porcentajeSolteros + "%");
		System.out.println("El porcentaje de empleados casados es " + porcentajeCasados + "%");
		System.out.println("El porcentaje de empleados divorciados es " + porcentajeDivorciados + "%");

	}// main

}// class
