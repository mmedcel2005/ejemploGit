package tema4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2Ficheros {

	public static void main(String[] args) {
		String rutaArchivo = "C:\\logs\\ficheroSecuencial";

		System.out.println("El archivo " + rutaArchivo + " tiene " + contarLineas(rutaArchivo) + " lineas");
	}

	public static int contarLineas(String fichero) {

		// Creamos el contador para contar las lineas
		int contadorLineas = 0;

		try {
			FileReader fr = new FileReader(fichero);
			// Creamos el Buffer para leer cada linea del programa
			BufferedReader bf = new BufferedReader(fr);

			// Se leerá una a una las lineas del archivo mientras que no sea nula y se
			// incrementará en uno el valor del contador
			while (bf.readLine() != null) {
				contadorLineas++;
			}

			// Cerramos los stream
			bf.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// devolvemos el numero de lineas contadas
		return contadorLineas;

	}

}
