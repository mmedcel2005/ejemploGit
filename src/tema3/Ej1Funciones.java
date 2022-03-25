package tema3;

public class Ej1Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos e inicializamos las variables
		int listaNumeros[] = { 3, 23, 8, 2, 3 };
		int num1 = 7, num2 = 8;

		// Mostramos por pantalla
		System.out.println("El minimo de la lista de numeros es: " + minimo(listaNumeros));

		System.out.println("La media de la lista de numeros es: " + media(listaNumeros));

		System.out.println("La resta de 7 y 8 es:" + suma(num1, num2));

		System.out.println("Si multiplicamos 7 x 8 da de resultado: " + multiplicacion(num1, num2));

		System.out.println("Si dividimos 7 / 8 da de resultado: " + division(num1, num2));

	}

	/**
	 * La funcion suma dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return numero entero con la suma
	 */
	public static int suma(int num1, int num2) {
		int resultado = 0;
		resultado = num1 - num2;

		return resultado;
	}

	/**
	 * Devuelve el valor minimo de un array de numeros
	 * 
	 * @param listaNumeros
	 * @return
	 */
	public static int minimo(int listaNumeros[]) {
		int minimo = Integer.MAX_VALUE;
		// Recorremos el array buscando el máximo
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] < minimo)
				minimo = listaNumeros[i];
		}

		// Devolvemos el minimo
		return minimo;
	}

	/**
	 * La funcion multiplica dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return numero entero con la multiplicacion
	 */
	public static int multiplicacion(int num1, int num2) {

		int resultado = 0;
		resultado = num1 * num2;

		return resultado;
	}

	/**
	 * La funcion divide dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un numero entero con la division
	 */
	public static float division(int num1, int num2) {

		float resultado = 0;
		resultado = (float) num1 / num2;

		return resultado;
	}

	/**
	 * La funcion realiza la media de una lista de numeros
	 * 
	 * @param listaNumeros
	 * @return un float con la media
	 */
	public static float media(int listaNumeros[]) {
		int totalNumeros = 0;
		float resultado = 0;
		int k;
		// Recorremos el array y sumamos al total el valor del numero del array
		for (int i = 0; i < listaNumeros.length; i++) {
			totalNumeros += listaNumeros[i];

		}

		resultado = (float) totalNumeros / listaNumeros.length;

		// Devolvemos el máximo
		return resultado;
	}

}
