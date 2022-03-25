package tema4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploFicherosTexto {

	public static final String RUTA = "c:\\logs\\";

	public static void main(String[] args) {

		/*****************************************
		 * ESCRITURA FICHEROS TIPO TEXTO
		 *****************************************/

		// Definimos el fichero a leer
		File fich = new File(RUTA + "salidaFichero.log");

		try {
			FileReader fr = new FileReader(fich);
			BufferedReader br = new BufferedReader(fr);

			// leemos una linea
			String linea = br.readLine();

			while (linea != null) {
				int i = 1;
				// Mostramos por pantalla una linea del ficher
				System.out.println("Linea " + i + " " + linea);
				// Leemos una linea
				linea = br.readLine();
				i++;

			}

			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		/*****************************************
		 * ESCRITURA FICHEROS TIPO TEXTO
		 *****************************************/
		Libro arrayLibros[] = new Libro[100];
		// Creamos un array de 100 libros aleatorios
		for (int i = 0; i < 100; i++) {
			int categoria = (int) (Math.random() * 4);
			int anio = 1900 + (int) (Math.random() * 120);
			arrayLibros[i] = new Libro("Libro" + (i + 1), "Margarett", categoria, 120000, 367, true, 23, anio,
					"asdfasf-234");
		}

		try {
			// Creamos el fichero con FileWriter y utilizamos PrintWriter
			// Para escribir en el
			FileWriter fw = new FileWriter(RUTA + "libros.txt", false);
			PrintWriter pw = new PrintWriter(fw);

			// Recorremos el array y escribimos el libro en el fichero
			for (int i = 0; i < arrayLibros.length; i++) {
				String linea = "Titulo " + arrayLibros[i].getNombre() + ", Autor:" + arrayLibros[i].getAutor()
						+ ", ventas:" + arrayLibros[i].getEjemplaresVendidos();
				pw.println(linea);
			}

			// Cerramos los manejadores de ficheros
			fw.close();
			pw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
