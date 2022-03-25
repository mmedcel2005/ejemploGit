package tema4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import coche.Rueda;
import coche.Suspension;

public class Coche2 {

	// ERROR_FICHERO y ERROR_ESCRITURA
	public static final int ESCRITO_CORRECTAMENTE = 0;
	public static final int ERROR_FICHERO = 1;
	public static final int ERROR_ESCRITURA = 2;

	public static final String ROJO = "rojo";
	public static final String AZUL = "azul";
	public static final String VERDE = "verde";
	public static final String AMARILLO = "amarillo";
	public static final String NEGRO = "negro";

	public static final int DELANTERA_DERECHA = 0;
	public static final int DELANTERA_IZQUIERDA = 1;
	public static final int TRASERA_DERECHA = 2;
	public static final int TRASERA_IZQUIERDA = 3;

	private int potencia = 0;
	private String nombre = "";
	private String modelo = "";
	private String marca = "";
	private int peso = 0;
	private String color = "";
	private int velocidad = 1;

	public Rueda listaRueda[];
	public Suspension listaSuspension[];

	public Coche2(int potencia, String nombre, String modelo, String marca, int peso, String color, int velocidad) {
		super();
		this.potencia = potencia;
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.peso = peso;
		this.color = color;
		this.velocidad = velocidad;
		listaRueda = new Rueda[4];
		listaRueda[Coche2.DELANTERA_DERECHA] = new Rueda();
		listaRueda[Coche2.DELANTERA_IZQUIERDA] = new Rueda();
		listaRueda[Coche2.TRASERA_DERECHA] = new Rueda();
		listaRueda[Coche2.TRASERA_IZQUIERDA] = new Rueda();

		listaSuspension = new Suspension[4];
		listaSuspension[Coche2.DELANTERA_DERECHA] = new Suspension();
		listaSuspension[Coche2.DELANTERA_IZQUIERDA] = new Suspension();
		listaSuspension[Coche2.TRASERA_DERECHA] = new Suspension();
		listaSuspension[Coche2.TRASERA_IZQUIERDA] = new Suspension();

		this.listaSuspension = new Suspension[4];

		Logger logCoche = (Logger) LoggerFactory.getLogger("Coche");
		logCoche.info("Info: Se ha creado un nuevo coche " + toString());

	}

	public Coche2() {
		super();
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Rueda[] getRueda() {
		return listaRueda;
	}

	public void setRuedas(Rueda[] rueda) {
		this.listaRueda = rueda;
	}

	public Suspension[] getSuspensiones() {
		return listaSuspension;
	}

	public void setSuspensiones(Suspension[] suspensiones) {
		this.listaSuspension = suspensiones;
	}

	public int acelerar(int porcAcelerador, int velodidad) {
		velocidad += velocidad * (porcAcelerador / 100);

		return velocidad;
	}

	public boolean pintar(String colorNuevo) {
		this.color = colorNuevo;
		this.nombre = nombre + this.color;
		return true;
	}

	public boolean cambiarRueda(int posicion, Rueda rueda) {

		if (posicion < 0 && posicion > 5) {
			this.listaRueda[posicion] = rueda;
			return true;
		} else {
			return false;
		}

	}

	public boolean cambiarSuspension(int posicion, Suspension suspension) {
		if (posicion < 0 && posicion > 5) {
			this.listaSuspension[posicion] = suspension;
			return true;
		} else {
			return false;
		}
	}

	public boolean ajustarPresion(int posicion, int presion) {
		if (posicion < 0 && posicion > 5 && presion < 0 && presion > 100) {

			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca
				+ ", peso=" + peso + ", color=" + color + ", velocidad=" + velocidad + "]";
	}

	/**
	 * Funcion que recorre una lista de array y escribe el contenido de dicho array
	 * en un fichero
	 * 
	 * @param listaCoches
	 * @param ficheroDestino
	 * @return int que indica si se ha completado correctamente o si ha habido algun
	 *         error
	 */
	public static int guardarCoches(Coche2 listaCoches[], String ficheroDestino) {

		try {
			// Creamos el fichero con FileWriter y utilizamos PrintWriter
			// Para escribir en el
			FileWriter fw = new FileWriter(ficheroDestino, false);
			PrintWriter pw = new PrintWriter(fw);

			// Recorremos el array y escribimos el coche en el fichero
			for (int i = 0; i < listaCoches.length; i++) {

				String linea = listaCoches[i].getPotencia() + "," + listaCoches[i].getNombre() + ","
						+ listaCoches[i].getModelo() + "," + listaCoches[i].getMarca() + "," + listaCoches[i].getPeso()
						+ "," + listaCoches[i].getColor() + "," + listaCoches[i].getVelocidad();
				pw.println(linea);
			}

			// Cerramos los manejadores de ficheros
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
	 * Funcion para contar las lineas de un fichero.
	 * 
	 * @param fichero
	 * @return int con el numero de lineas q contiene el fichero
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
	 * línea crea un objeto de tipo coche y los añade al array de coches que
	 * devolverá al final.
	 * 
	 * @param rutaFichero
	 * @return un array de los coches contenidos en el fichero
	 */

	public static Coche2[] cargarCoches(String rutaFichero) {

		// Creamos el array de coches
		Coche2[] cargarCoches = new Coche2[contarLineas(rutaFichero)];

		// Definimos e inicializamos las variables
		String potenciaString = "";
		String nombre = "";
		String modelo = "";
		String marca = "";
		String pesoString = "";
		String color = "";
		String velocidadString = "";

		try {
			FileReader fr = new FileReader(rutaFichero);
			// Leemos el fichero con el buffer
			BufferedReader bf = new BufferedReader(fr);

			// Mediante el bucle for leemos una a una cada linea del fichero
			for (int i = 0; i < cargarCoches.length; i++) {

				// linea = bf.readLine();

				// Separamos los datos de cada linea mediante el StringTokenizer
				// StringTokenizer tokens = new StringTokenizer(linea, ",");
				StringTokenizer tokens = new StringTokenizer(bf.readLine(), ",");

				// Metemos los datos leidos en su respectiva variable en el mismo orden en el
				// que estan introducidos los datos
				potenciaString = tokens.nextToken();
				nombre = tokens.nextToken();
				modelo = tokens.nextToken();
				marca = tokens.nextToken();
				pesoString = tokens.nextToken();
				color = tokens.nextToken();
				velocidadString = tokens.nextToken();

				// Anteriormente guardamos la potencia el peso y la velocidad en un String por
				// lo que ahora debemos pasarlo a int
				int potencia = Integer.parseInt(potenciaString);
				int peso = Integer.parseInt(pesoString);
				int velocidad = Integer.parseInt(velocidadString);

				// Creamos el coche con los datos recien leidos
				cargarCoches[i] = new Coche2(potencia, nombre, modelo, marca, peso, color, velocidad);
				System.out.println(cargarCoches[i].toString());
			}

			// Cerramos los ficheros
			bf.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-gen-erated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

		// Devolvemos el array de coches
		return cargarCoches;
	}

}
