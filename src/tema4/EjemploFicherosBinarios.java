package tema4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class EjemploFicherosBinarios {

	// Constantes para definir los dos posibles errores.
	public static final int ERROR_FILENOTFOUND = -1;
	public static final int ERROR_LECTURA = -2;
	public static final int COPIA_CORRECTA = 0;

	public static final String RUTA = "c:\\logs\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = copiarFichero(RUTA + "libros.txt", "");
		switch (resultado) {
		case COPIA_CORRECTA:
			System.out.println("Se ha copiado correctamente");
			break;

		case ERROR_LECTURA:
			System.out.println("Error de lectura");
			break;

		case ERROR_FILENOTFOUND:
			System.out.println("No se ha encontrado el archivo o no tenemos permisos");
			break;

		}

	}

	/**
	 * El modulo copia el ficehro origen en a ruta destino de forma binaria
	 * 
	 * @param rutaOrigen
	 * @param rutaDestino
	 * @return
	 */
	public static int copiarFichero(String rutaOrigen, String rutaDestino) {

		// Por defecto suponemso que se va a copiar bien.
		int resultado = COPIA_CORRECTA;

		// Creao los fichero de lectura y escritura
		File fichOrigen = new File(rutaOrigen);

		byte bufferLectura[] = new byte[200];

		Logger logConsola = (Logger) LoggerFactory.getLogger("ConsolaBinario");
		Logger logFichero = (Logger) LoggerFactory.getLogger("FicheroBinario");

		try {
			// Informamos que se esta intentado copiar el archivo por consola
			logConsola.info("Se esta intentado copiar el archivo de " + rutaOrigen + " a " + rutaDestino);

			FileInputStream fi = new FileInputStream(fichOrigen);
			// Para escribir no necesitamos previamente el objeto File directamente ponemos
			// la ruta del ficherp y si queremos hacer append
			FileOutputStream fo = new FileOutputStream(rutaDestino, false);

			// Creamos los Buffered que son los que escriben y leen al final
			BufferedInputStream br = new BufferedInputStream(fi);
			BufferedOutputStream bw = new BufferedOutputStream(fo);

			// Leemos por primera vez fuera del bucle
			int byteLeidos = br.read(bufferLectura);

			while (byteLeidos == 200) {
				// Escribo el array de bytes en el fichero destino
				bw.write(bufferLectura);

				// Inicializo de nuevo Buffer lectura.
				bufferLectura = new byte[200];

				// Leo otra vez
				byteLeidos = br.read(bufferLectura);
			}

			// Esbimos el ultimo buffer que no ha llegado a 200 bytes
			// Escribo el array de bytes en el fichero destino.
			bw.write(bufferLectura, 0, byteLeidos - 1);

			// Cerramos los streams
			fi.close();
			br.close();
			fo.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultado = ERROR_FILENOTFOUND;
			// Mostramos en el el fichero de log el error
			logFichero.error("ERROR: NO se ha podido encontrar el archivo " + rutaOrigen);
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
			resultado = ERROR_LECTURA;
			// Mostramos en el el fichero de log el error
			logFichero.error("ERROR: NO se ha podido encontrar el archivo " + rutaOrigen);
		}

		// Devolvemos el resultado
		return resultado;

	}

}
