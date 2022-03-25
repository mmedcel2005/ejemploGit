package tema2;

import java.util.Scanner;

public class EjemploWhileCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El programa le pondrá al usuario
		// Sumas de dos numeros entre 1 y 60
		// Le seguira poniendo sumas hasta que falle o tarde mas de 6 segundos en
		// contestar
		// Mientras acierte seguiremos poniendo operaciones
		// Al final se le mostraran los aciertos

		int numAciertos = -1;
		int num1 = 0, num2 = 0;
		long time, tiempoConsumido;
		int resultado = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			numAciertos++;
			// Generamos los números aleatorios
			num1 = (int) (Math.random() * 60);
			num2 = (int) (Math.random() * 60);

			System.out.println(num1 + " + " + num2 + " = ?; ");

			// Inicializamos el tiempo
			time = System.currentTimeMillis();

			resultado = teclado.nextInt();

			// En time guardamos el tiempo que ha tardado en contestar
			time = System.currentTimeMillis() - time;

		} while (resultado == (num1 + num2) && (time <= 5000));

		if (time > 5000)
			System.out.println("Se ha acabado el tiempo");

		teclado.close();

	}

}
