/*
 * 
 */
package entornos;

public class miniCalculadoraEjemplo {

	/*
	 * Que tenga dos métodos (basados en el uso de métodos de la clase Math): un
	 * método valorAbsoluto que recibe un número de tipo double y devuelva su valor
	 * absoluto, y otro método raizCuadrada que reciba un número de tipo double y
	 * devuelva su raíz cuadrada. Documenta esta clase conforme a los estándares
	 * JavaDoc y comprueba cómo se visualiza la documentación. Una vez creados los
	 * comentarios, investigar un metodo para generar la documenación de la clase en
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

	int hola() {
		return 1;
	}

}
