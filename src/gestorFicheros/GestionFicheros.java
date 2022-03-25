package gestorFicheros;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class GestionFicheros {

	public static final int OK = 0;
	public static final int FICHERO_NO_ENCONTRADO = -1;
	public static final int ERROR_LECTURA = -2;
	public static final int ERROR_BORRADO = -3;
	public static final int TIPO_ERROR = -4;
	public static final int FICHERO_EXISTE = -5;
	public static final int ERROR_ESCRITURA = -6;

	public int eliminarFichero(String rutaFichero) {
		// Definimos la variables que guarda el resultado
		int resultado = OK;

		File fichero = new File(rutaFichero);

		if (!fichero.delete())
			resultado = ERROR_BORRADO;

		// Devolvemos el resultado de la operacion
		return resultado;
	}

	/**
	 * Devuelve null si el directorio esta vacio y Ok si no La salida logica seria
	 * true o false, pero es para testear con junit
	 * 
	 * @param rutaDirectorio
	 * @return
	 */
	public static String directorioVacio(String rutaDirectorio) {
		// Definimos la variables que guarda el resultado
		String resultado = null;

		File directorio = new File(rutaDirectorio);
		if (!directorio.isDirectory()) {
			resultado = null;
			System.out.println("No es un directorio");
		} else {

			// Con esta funcion nos devuelve un array de file
			// Y podemos modificarlos y hacer lo que queramos
			//
			// File listaficheros[] = fichero.listFiles()

			String listaFicheros[] = directorio.list();

			System.out.println("El directorio contiene " + listaFicheros.length);

			if (listaFicheros.length == 0)
				resultado = "OK";
			else
				resultado = null;

		}

		// Devolvemos el resultado de la operacion
		return resultado;
	}

	public static int mostrarContenidoDirectorio(String rutaDirectorio) {
		// Definimos la variables que guarda el resultado
		int resultado = OK;

		File fichero = new File(rutaDirectorio);
		if (!fichero.isDirectory())
			resultado = TIPO_ERROR;
		else {

			// Con esta funcion nos devuelve un array de file
			// Y podemos modificarlos y hacer lo que queramos
			//
			// File listaficheros[] = fichero.listFiles()

			String listaFicheros[] = fichero.list();
			// Mostramos por pantalla todos los nombres
			for (int i = 0; i < listaFicheros.length; i++) {
				System.out.println(listaFicheros[i]);
			}

		}

		// Devolvemos el resultado de la operacion
		return resultado;
	}

	public static int crearFichero(String rutaFichero) {
		// Definimos la variables que guarda el resultado
		int resultado = OK;

		File fichero = new File(rutaFichero);

		if (fichero.exists())
			resultado = FICHERO_EXISTE;
		else
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		// Devolvemos el resultado de la operacion
		return resultado;
	}

	public static int crearDirectorio(String rutaDirectorio, String nombre) {
		// Definimos la variables que guarda el resultado
		int resultado = OK;

		File directorioRaiz = new File(rutaDirectorio);
		File directorio = new File(rutaDirectorio + "\\" + nombre);

		// Compruebo si es un directorio
		if (!directorioRaiz.isDirectory())
			resultado = TIPO_ERROR;
		else if (!directorioRaiz.canWrite())
			resultado = ERROR_ESCRITURA;
		else
			directorio.mkdir();

		// Devolvemos el resultado de la operacion
		return resultado;
	}

	/**
	 * Funcion que renombra todos los archivos que se encuentren en un directorio
	 * introducido, y ademas los enumera
	 * 
	 * @param directorio
	 * @param nombreModificado
	 * @return 0 si se ha ejecutado correctamente
	 */
	static int modificarNombres(String directorio, String nombreModificado) {

		// Definimos la variables que guarda el resultado
		int resultado = OK;

		File fichero = new File(directorio);

		// Metemos los ficheros que se encuentran en el directorio en una lista de
		// arrays
		File listaFicheros[] = fichero.listFiles();
		if (!fichero.isDirectory())
			resultado = TIPO_ERROR;
		else {
			// Bucle que recorre una a una cada posion del array y realiza los cambios
			// necesarios
			for (int i = 0; i < listaFicheros.length; i++) {
				// Coje la
				File archivo = listaFicheros[i];
				File parent = fichero.getParentFile();
				archivo.renameTo(new File(directorio, nombreModificado + String.valueOf(i)));
			}

		}

		// Devolvemos el resultado de la operacion
		return resultado;
	}

	/**
	 * Funcion que recibe un directorio y una extension y eliminara todos los
	 * archivos con dicha extension que se encuentre dentro de este directorio
	 * 
	 * @param directorio
	 * @param extension
	 * @return 0 si se ha ejecutado correctamente
	 */
	static int borrarFicheros(String directorio, String extension) {
		File fichero = new File(directorio);
		// Guardamos en un array los ficheros que hay dentro del directorio
		File[] listaFicheros = fichero.listFiles();

		int resultado = OK;
		// Comprobamos q sea un directorio
		if (!fichero.isDirectory()) {
			return TIPO_ERROR;
		} else {
			// Recorremos uno a uno cada posicion del array
			for (int i = 0; i < listaFicheros.length; i++) {
				// Comprobamos la extension
				if (listaFicheros[i].getName().endsWith(extension)) {
					// Eliminamos el archivo
					if (listaFicheros[i].delete()) {
					} else {
						return TIPO_ERROR;
					}
				}
			}
		}
		return resultado;
	}

	/**
	 * Funcion que recibe un numero y un tamaño de ficheros en bytes y eliminará los
	 * archivos que sean mayores de dicho tamaño
	 * 
	 * @param directorio
	 * @param size
	 * @return 0 si se ha ejecutado correctamente
	 */
	static int borrarFicherosSize(String directorio, int size) {
		File fichero = new File(directorio);
		// Guardamos en un array los ficheros que hay dentro del directorio
		File[] listaFicheros = fichero.listFiles();

		int resultado = OK;
		// Comprobamos q sea un directorio
		if (!fichero.isDirectory()) {
			return TIPO_ERROR;
		} else {
			// Recorremos uno a uno cada posicion del array
			for (int i = 0; i < listaFicheros.length; i++) {
				// Comprobamos el tamaño en Bytes
				if (listaFicheros[i].length() > size) {
					// Eliminamos el archivo
					if (listaFicheros[i].delete()) {
					} else {
						return TIPO_ERROR;
					}
				}
			}
		}
		return resultado;
	}

	/**
	 * Funcion que recibe el directorio y un numero de dias y mostrará los ficheros
	 * que se encuentren en dicho directorio y tenga una antiguedad menor que el
	 * numero de dias introducidos
	 * 
	 * @param directorio
	 * @param dias
	 * @return 0 si se ha ejecutado correctamente
	 */
	static int mostrarFicherosRecientes(String directorio, int dias) {
		File fichero = new File(directorio);
		// Guardamos en un array los ficheros que hay dentro del directorio
		File[] listaFicheros = fichero.listFiles();

		int resultado = OK;
		// Comprobamos q sea un directorio
		if (!fichero.isDirectory()) {
			return TIPO_ERROR;
		} else {
			// Recorremos uno a uno cada posicion del array
			for (int i = 0; i < listaFicheros.length; i++) {
				// Date con la fecha de ultima modificacion
				Date fechaFichero = new Date(listaFicheros[i].lastModified());

				// Paso los das introducidos a millis
				long diasMillis = dias * 24 * 60 * 60 * 1000;

				// Resto para saber la diferencia y encontrar la fecha limite de modificacion
				Date diferenciaDias = new Date(System.currentTimeMillis() - diasMillis);

				// Comprueba que el fichero tenga una antiguedad menor que el numero de dias
				// introducidos
				if (diferenciaDias.compareTo(fechaFichero) < 0) {
					System.out.println("El fichero " + listaFicheros[i] + " fue modificado el " + fechaFichero);
				}
				// System.currentTimeMillis()
			}

		}
		return resultado;
	}

	/**
	 * Funcion que recibe una ruta y dice si el directorio está o no vacio
	 * 
	 * @param rutaDirectorio
	 * @return boolean indica true si esta vacio y false si contiene algo
	 */
	public static Boolean directorioVacioBoolean(String rutaDirectorio) {
		// Definimos la variables que guarda el resultado
		Boolean resultado = false;

		// Comprueba si es un directorio
		File directorio = new File(rutaDirectorio);
		if (!directorio.isDirectory()) {
			resultado = false;
			System.out.println("No es un directorio");
		} else {

			// Array con los archivos que se encuentran en el directorio
			String listaFicheros[] = directorio.list();

			System.out.println("El directorio contiene " + listaFicheros.length);

			// Si el tamaño del array es 0 quiere decir que esta vacio por lo que devolvera
			// true
			if (listaFicheros.length == 0)
				resultado = true;
			else {
				// Si no esta vacio devuelve false
				resultado = false;
			}

		}

		// Devolvemos el resultado de la operacion
		return resultado;
	}

}// clase
