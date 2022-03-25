package tema3;

public class Ej4Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "esternocleidomastoideo";
		char caracter = 'e';

		System.out.println(
				"La letra '" + caracter + "' aparece " + contarCaracteres(cadena, caracter) + " veces en la cadena");

	}

	/**
	 * La función recibe una cadena y un carácter y cuenta el numero de veces que
	 * aparece ese caracter en la cadena
	 * 
	 * @param cadena
	 * @param caracter
	 * @return número de veces que ese carácter aparece en la cadena
	 */
	public static int contarCaracteres(String cadena, char caracter) {
		int contador = 0;

		// Comprueba cada caracter de la cadena
		for (int i = 0; i < cadena.length(); i++) {
			// Si el caracter de la posicion en la que esta es la misma que
			// el caracter que buscamos se incrementa el contador
			if (cadena.charAt(i) == caracter)
				contador++;
		}

		return contador;
	}

}
