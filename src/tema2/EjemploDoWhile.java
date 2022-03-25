package tema2;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generar un numero aleatorio y pedir al usuario que lo acierte
		// Si el numero es mayor o menor se le indicara al usuario

		int numAleatorio = (int) (Math.random() * 100 + 1);
		int numLeido = -1;
		int numIntentos = 5;
		Scanner teclado = new Scanner(System.in);

		// El bucle se seguira ejecutado hasta que el numero leido sea el
		// generado o el numero de intentos sea 0, es decir (numIntentos=0 ||
		// numAleatorio==numLeido)
		// En el while hay que poner la condicion para que siga ejecutandose para que
		// siga ejecutandose
		do {
			System.out.println("Muahahahha jamas acertarás el número secreto. Intentalo");
			numLeido = teclado.nextInt();
			// Decrementamos del numero de intentos
			numIntentos--;

			// Si el numero es mayor le damos una pista
			if (numLeido > numAleatorio) {
				System.out.println("Alaaaa, te has pasao");
			}
			if (numLeido < numAleatorio) {
				System.out.println("Te has quedado corto");
			}

			if (numIntentos == 1) {
				System.out.println("Ultimo intento MUAHAHAHAH");
			}

		} while (numIntentos != 0 && numLeido != numAleatorio);

		// Le mostramos el mensaje final

		if (numLeido == numAleatorio) {
			System.out.println("ARGHHHHH ME SISUELVOOOOOOOO");
			if (numIntentos == 1) {
				System.out.println("EN EL ULTIMO INTENTO, QUE POTRAAAAAAA");
			} else {
				System.out.println("HAS PERDIDO, LLEVO TODOS TUS BITCOINSSSSSSS MUAHAHAHAHAHAH");
				System.out.println("El numero secreto era:" + numAleatorio);
			}
		}

		teclado.close();

	}

}
