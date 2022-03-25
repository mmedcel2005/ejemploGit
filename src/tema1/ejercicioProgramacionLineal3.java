package tema1;

import java.util.Scanner;

public class ejercicioProgramacionLineal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definimos las variables
		float sueldoMes;
		int npagas;
		int porcentajeirpf;
		float irpfTotal;
		float salarioAnual;
		
		//Para leer vamos a usar un objeto de tipo scanner
		Scanner teclado = new Scanner(System.in);
		
		//Leemos los datos por teclado
		System.out.println("Introduce el sueldo mensual:");
		sueldoMes = teclado.nextFloat();
		
		//Leemos los datos por teclado
		System.out.println("Introduce el numero de pagas:");
		npagas = teclado.nextInt();	
		
		//Leemos los datos por teclado
		System.out.println("Introduce porcentaje de irpf:");
		porcentajeirpf = teclado.nextInt();	
		
		//Realizamos la formula necesaria para calcularla
		
		salarioAnual = sueldoMes * npagas ;
		
		irpfTotal = (float) (salarioAnual * (porcentajeirpf / 100));
		
		//Imprimimos en pantalla los datos de los cuales queremos informar al usuario
		System.out.println("El salario anual es: " + salarioAnual );
		
		System.out.println("El porcentaje total de irpf que paga al año es: " + irpfTotal );
		
		
		
	}

}
