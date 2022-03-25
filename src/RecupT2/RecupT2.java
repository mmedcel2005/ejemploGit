package RecupT2;

import java.util.Scanner;

public class RecupT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * - cpu - Memoria RAM - Disco Duro - Gráfica - Sistema Operativo instalado (si
		 * o no) - Tipo (Portátil (P) Sobremesa (S)) - Precio
		 * 
		 */
		int numOrdenadores = 0;
		String nombreCPU = "";
		String nombreGrafica = "";
		int precioGrafica = 0;
		boolean sisOper = false;
		String tipo = "";
		int precioPC = 0;

		int ordenadorMasBarato = Integer.MAX_VALUE;
		int precioTotal = 0;
		int precioGraficaMasCara = Integer.MIN_VALUE;
		String GraficaMasCara = "";
		int sobreMesaConSO = 0;
		int sobreMesaSinSO = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el numero de ordenadores: ");
		numOrdenadores = teclado.nextInt();

		for (int i = 0; i < numOrdenadores; i++) {
			System.out.println("---------- " + (i + 1) + " ORDENADOR ----------");
			// Leemos por teclado la informacion

			System.out.println("Introduce el modelo de CPU:");
			nombreCPU = teclado.next();

			System.out.println("Introduce la grafica:");
			nombreGrafica = teclado.next();

			System.out.println("Introduce precio de la grafica: ");
			precioGrafica = teclado.nextInt();

			System.out.println("¿Tiene sistema operativo? true/false");
			sisOper = teclado.nextBoolean();

			System.out.println("Tipo (P) portatil o (S) sobremesa: ");
			tipo = teclado.next();

			System.out.println("Introduce el precio:");
			precioPC = teclado.nextInt();

			// Calcular precio mas economico
			if (precioPC < ordenadorMasBarato) {

				ordenadorMasBarato = precioPC;

			}
			precioTotal += precioPC;

			// Calcular grafica mas cara
			if (precioGrafica > precioGraficaMasCara) {
				precioGraficaMasCara = precioGrafica;
				GraficaMasCara = nombreGrafica;
			}

			// Calcular el numero de ordenadores de sobremesa con sistema operativo
			if (tipo.equals("S") && sisOper == true) {
				sobreMesaConSO++;
			} else {
				// Calcular el numero de ordenadores de sobremesa SIN sistema operativo
				if (tipo.equals("S") && sisOper == false) {
					sobreMesaSinSO++;
				}
			}

			if (precioPC > 800 && tipo.equals("P") && sisOper == false) {
				System.out.println(
						"Este ordenador cuesta mas de 800 es portatil y no tiene sistema operativo, su cpu es: "
								+ nombreCPU);
			}

		}

		/**
		 * Se debe de sacar un listado de las cpus de los ordenadores de más de 800
		 * euros de tipo portátil que vengan sin el Sistema operativo instalado. Se
		 * pueden ir sacando por pantalla según se leen, aunque se valorará guardarlas
		 * en un array y mostrarlas al final.
		 * 
		 */

		// Mostrar por pantalla los resultados
		System.out.println("Ordenador mas barato: " + ordenadorMasBarato);
		System.out.println("Grafica mas cara: " + GraficaMasCara + " cuesta " + precioGraficaMasCara);
		System.out.println("Media precio: " + (precioTotal / numOrdenadores));
		System.out.println("El " + ((float) (sobreMesaConSO / numOrdenadores * 100))
				+ "% de ordenadores son de sobremesa y tienen SO instalado");
		System.out.println("El " + ((float) (sobreMesaSinSO / numOrdenadores * 100))
				+ "% de ordenadores son de sobremesa y NO tienen SO instalado");

	}

}
