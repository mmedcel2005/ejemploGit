package examenFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GestorExamenFicheros {

	// ERROR_FICHERO y ERROR_ESCRITURA
	public static final int ESCRITO_CORRECTAMENTE = 0;
	public static final int ERROR_FICHERO = 1;
	public static final int ERROR_ESCRITURA = 2;

	/**
	 * Funcion que recibe un array de ordenadores y el fichero de destino y escribe
	 * la informacion del array dentro del fichero
	 * 
	 * @param listaOrdenadores
	 * @param ficheroDestino
	 * @return int con el resultado, es decir si se ha escrito correctamente o ha
	 *         habido un fallo
	 */
	public static int guardarDatos(OrdenadorFichero listaOrdenadores[], String ficheroDestino) {

		try {
			FileWriter fw = new FileWriter(ficheroDestino, false);
			PrintWriter pw = new PrintWriter(fw);

			// Recorremos el array que obtiene una a una la informacion de cada posicion del
			// array y la introduce en un string Linea para mas tarde escribir dicha linea
			// en el fichero
			for (int i = 0; i < listaOrdenadores.length; i++) {

				String linea = listaOrdenadores[i].getNombre() + ":" + listaOrdenadores[i].getMarca() + ":"
						+ listaOrdenadores[i].getModelo() + ":" + listaOrdenadores[i].getPrecio() + ":"
						+ listaOrdenadores[i].getTipo() + ":" + listaOrdenadores[i].getStock() + ":";
				pw.println(linea);
			}

			// Cerramos el FileWriter y el PrintWriter
			fw.close();
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR_FICHERO;
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
			return ERROR_ESCRITURA;
		}
		return ESCRITO_CORRECTAMENTE;
	}

	/**
	 * Funcion que recive un fichero y cuenta el numero de lineas
	 * 
	 * **********FUNCION RECICLADA PARA FACILITAR*****************
	 * 
	 * 
	 * @param fichero
	 * @return int con el numero de lineas
	 */
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

	/**
	 * Funcion que lee línea a línea el fichero de la ruta especificada y para cada
	 * línea crea un objeto de tipo OrdenadorFichero y los añade al array de
	 * ordenadores que devolverá al final.
	 * 
	 * @param rutaFichero
	 * @return un array de los ordenadores contenidos en el fichero
	 */

	public static OrdenadorFichero[] leerDatos(String fichero) {

		// Creamos el array de ordenadores
		OrdenadorFichero[] leerOrdenadores = new OrdenadorFichero[contarLineas(fichero)];

		// Definimos e inicializamos las variables
		String nombre = "";
		String marca = "";
		String modelo = "";
		String precioString = "";
		String tipo = "";
		String stockString = "";

		int precio = 0;
		int stock = 0;

		try {
			FileReader fr = new FileReader(fichero);
			// Leemos el fichero con el buffer
			BufferedReader bf = new BufferedReader(fr);

			// Mediante el bucle for leemos una a una cada linea del fichero
			for (int i = 0; i < leerOrdenadores.length; i++) {

				String linea = bf.readLine();

				// Separamos los datos de cada linea mediante el StringTokenizer
				StringTokenizer tokens = new StringTokenizer(linea, ":");

				// Metemos los datos leidos en su respectiva variable en el mismo orden en el
				// que estan introducidos los datos
				nombre = tokens.nextToken();
				marca = tokens.nextToken();
				modelo = tokens.nextToken();
				precioString = tokens.nextToken();
				tipo = tokens.nextToken();
				stockString = tokens.nextToken();

				// Anteriormente guardamos el precio y la velocidad en un String por
				// lo que ahora debemos pasarlo a int
				precio = Integer.parseInt(precioString);
				stock = Integer.parseInt(stockString);

				// Creamos el ordenador con los datos recien leidos
				leerOrdenadores[i] = new OrdenadorFichero(nombre, marca, modelo, precio, tipo, stock);
				// Imprimimos en pantallas los dadtos obtenidos
				System.out.println("Ordenadores [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo
						+ ", precio=" + precio + ", tipo=" + tipo + ", stock=" + stock + "]");
			}

			// Cerramos los ficheros
			bf.close();
			fr.close();
		} catch (

		FileNotFoundException e) {
			// TODO Auto-gen-erated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

		// Devolvemos el array de coches
		return leerOrdenadores;
	}

}
