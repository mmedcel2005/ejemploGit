package tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFicherosSecuenciales {

	public static void lecturaSecuencial(String rutaFichero) {
		// Definimos los objetos para la lectura
		try {
			FileInputStream fin = new FileInputStream(rutaFichero);
			DataInputStream din = new DataInputStream(fin);

			// Creo un objeto de tipo LIbro para almacenar cada registro del fichero
			Libro libroLectura = new Libro();

			// Leemos los datos del fichero en el mismo orden en el que se escribieroon
			libroLectura.setNombre(din.readUTF());
			libroLectura.setAutor(din.readUTF());
			libroLectura.setCategoria(din.readInt());
			libroLectura.setEjemplaresVendidos(din.readInt());
			;
			libroLectura.setNumPaginas(din.readInt());
			libroLectura.setPrestado(din.readBoolean());
			libroLectura.setDiaPrestado(din.readInt());

			System.out.println("Libro leido: " + libroLectura.toString());

			// Cerramos los ficheros
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro arrayLibros[] = new Libro[100];

		for (int i = 0; i < 100; i++) {
			int categoria = (int) (Math.random() * 4);
			int anio = 1900 + (int) (Math.random() * 120);
			arrayLibros[i] = new Libro("Libro" + (i + 1), "Margarett", categoria, 120000, 367, true, 23, anio,
					"asdfasf-234");
		}

		try {
			FileOutputStream fo = new FileOutputStream("c:\\logs\\ficheroSecuencial");
			DataOutputStream dos = new DataOutputStream(fo);

			for (int i = 0; i < arrayLibros.length; i++) {
				dos.writeUTF(arrayLibros[i].getNombre());
				dos.writeUTF(arrayLibros[i].getAutor());
				dos.writeInt(arrayLibros[i].getCategoria());
				dos.writeInt(arrayLibros[i].getEjemplaresVendidos());
				dos.writeInt(arrayLibros[i].getNumPaginas());
				dos.writeBoolean(arrayLibros[i].isPrestado());
				dos.writeInt(arrayLibros[i].getDiaPrestado());

			}

			dos.close();
			fo.close();
			lecturaSecuencial("c:\\logs\\ficheroSecuencial");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

	}

}
