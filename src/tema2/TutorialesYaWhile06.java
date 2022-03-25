package tema2;

import java.util.Scanner;

public class TutorialesYaWhile06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Incializamos las variables
		int i = 1;
		int num;
		int suma1 = 0;
		int suma2 = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("------------PRIMERA LISTA------------");
		// Se ejecutaran las instrucciones mientras i sea menor o igual a 15
		while (i <= 15) {
			System.out.println("Introduce el " + i + "� numero");
			// Lee por teclado el numero
			num = teclado.nextInt();
			// Sumamos al total el numero
			suma1 += num;
			// Incrementamos en 1 el valor de i
			i++;
		}
		

		i = 1;

		System.out.println("------------SEGUNDA LISTA------------");
		// Se ejecutaran las instrucciones mientras i sea menor o igual a 15
		while (i <= 15) {
			System.out.println("Introduce el " + i + "� numero");
			// Lee por teclado el numero
			num = teclado.nextInt();
			// Sumamos al total el numero
			suma2 += num;
			// Incrementamos en 1 el valor de i
			i++;
		}

		// Si la suma1 es mayor que suma 2 imprimira "Lista 1 mayor"
		if (suma1 > suma2) {
			System.out.println("Lista 1 mayor");
		} else {
			// Si la suma2 es mayor que suma1 imprimira "Lista 2 mayor"
			if (suma1 < suma2) {
				System.out.println("Lista 2 mayor");
			}
			// Si no se cumple ninguna de las dos condiciones anteriores
			// por descarte seran iguales por lo que imprimira "Listas iguales"
			else {
				System.out.println("Listas iguales");
			}
		}
		// Cerramos el teclado
		teclado.close();

	}

}
