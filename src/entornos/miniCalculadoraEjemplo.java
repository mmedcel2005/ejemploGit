/*
 * 
 */
package entornos;

public class miniCalculadoraEjemplo {

	/*
	 * Que tenga dos m�todos (basados en el uso de m�todos de la clase Math): un
	 * m�todo valorAbsoluto que recibe un n�mero de tipo double y devuelva su valor
	 * absoluto, y otro m�todo raizCuadrada que reciba un n�mero de tipo double y
	 * devuelva su ra�z cuadrada. Documenta esta clase conforme a los est�ndares
	 * JavaDoc y comprueba c�mo se visualiza la documentaci�n. Una vez creados los
	 * comentarios, investigar un metodo para generar la documenaci�n de la clase en
	 * pdf
	 * 
	 */

	/**
	 * Funcion que recibe un numero y devuelve el valor absoluto de dicho numero
	 * 
	 * @param numeroRecibido
	 * @return int con el valor absoluto
	 */
	int valorAbsoluto(double numeroRecibido) {
		return (int) Math.abs(numeroRecibido);

	}

	/**
	 * Funcion que recibe un numero y devuelve la raiz cuadrada de dicho numero
	 * 
	 * @param numeroRecibido
	 * @return double con la raiz cuadrada del numero recibido
	 */
	double raizCuadrada(double numeroRecibido) {
		return Math.sqrt(numeroRecibido);
	}

}
