package coche;

public class Coche {

	// Definimos los valores finales
	public static final String ROJO = "rojo";
	public static final String AZUL = "azul";
	public static final String VERDE = "verde";
	public static final String AMARILLO = "amarillo";
	public static final String NEGRO = "negro";

	public static final int DELANTERA_DERECHA = 0;
	public static final int DELANTERA_IZQUIERDA = 1;
	public static final int TRASERA_DERECHA = 2;
	public static final int TRASERA_IZQUIERDA = 3;

	// Definimos y inicializamos las variables
	private int potencia = 0;
	private String nombre = "";
	private String modelo = "";
	private String marca = "";
	private int peso = 0;
	private String color = "";
	private int velocidad = 1;

	// Creamos los arrays de objetos
	public Rueda listaRueda[];
	public Suspension listaSuspension[];

	// Constructor
	public Coche(int potencia, String nombre, String modelo, String marca, int peso, String color, int velocidad) {
		super();
		this.potencia = potencia;
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.peso = peso;
		this.color = color;
		this.velocidad = velocidad;
		listaRueda = new Rueda[4];
		listaRueda[Coche.DELANTERA_DERECHA] = new Rueda();
		listaRueda[Coche.DELANTERA_IZQUIERDA] = new Rueda();
		listaRueda[Coche.TRASERA_DERECHA] = new Rueda();
		listaRueda[Coche.TRASERA_IZQUIERDA] = new Rueda();

		listaSuspension = new Suspension[4];
		listaSuspension[Coche.DELANTERA_DERECHA] = new Suspension();
		listaSuspension[Coche.DELANTERA_IZQUIERDA] = new Suspension();
		listaSuspension[Coche.TRASERA_DERECHA] = new Suspension();
		listaSuspension[Coche.TRASERA_IZQUIERDA] = new Suspension();

		this.listaSuspension = new Suspension[4];

	}

	// Constructor vacio
	public Coche() {

	}

	// Get y set
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

	/**
	 * Recibe el porcentaje de acelerador que es pisado y la velocidad actual y
	 * devuelve la velocidad resultante de pisar el acelerador
	 * 
	 * @param porcAcelerador
	 * @param velodidad
	 * @return int con la velocidad resultante
	 */
	public int acelerar(int porcAcelerador, int velodidad) {
		velocidad += velocidad * (porcAcelerador / 100);
		setVelocidad(velodidad);

		return velocidad;
	}

	/**
	 * Funcion que recibe un color y cambia el color actual del coche por el nuevo
	 * introducido
	 * 
	 * @param colorNuevo
	 * @return boolean=true si se ha ejecutado correctamente la funcion
	 */
	public boolean pintar(String colorNuevo) {
		this.color = colorNuevo;
		this.nombre = nombre + this.color;
		return true;
	}

	/**
	 * Funcion que recibe una posicion y una rueda, y cambia la rueda.
	 * 
	 * @param posicion
	 * @param rueda
	 * @return true si se ha cambiado correctamente, false si no se ha podido
	 */
	public boolean cambiarRueda(int posicion, Rueda rueda) {

		if (posicion > 0 && posicion < 5) {
			this.listaRueda[posicion] = rueda;
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Funcion que recibe una posicion y una suspensio, y cambia la suspension.
	 * 
	 * @param posicion
	 * @param suspension
	 * @return true si se ha cambiado correctamente, false si no se ha podido
	 */
	public boolean cambiarSuspension(int posicion, Suspension suspension) {
		if (posicion > 0 && posicion < 5) {
			this.listaSuspension[posicion] = suspension;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Funcion que recibe una posicion y una presion y cambia la presion actual de
	 * dicha posicion por la presio introducida
	 * 
	 * @param posicion
	 * @param presion
	 * @return true si se ha cambiado correctamente, false si no se ha podido
	 */
	public boolean ajustarPresion(int posicion, int presion) {
		if (posicion > 0 && posicion < 5 && presion > 0 && presion < 100) {
			this.listaRueda[posicion].setPresion(presion);
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Funcion que devuelve en un string los valores de un coche
	 */
	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca
				+ ", peso=" + peso + ", color=" + color + ", velocidad=" + velocidad + "]";
	}

}
