package RecupT3;

public class Procesador {
	// Definimos las variables
	private String marca = "";
	private String modelo = "";
	private int stock = 0;
	private double precio = 0;
	private int frecuencia = 0;
	private boolean overclock = true;

	// Constructor con todas las variables
	public Procesador(String marca, String modelo, int stock, double precio, int frecuencia, boolean overclock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
		this.frecuencia = frecuencia;
		this.overclock = overclock;
	}

	// Constructor vacio
	public Procesador() {
		super();
	}

	// Metodos get/set
	// Marca no tiene set
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public boolean isOverclock() {
		return overclock;
	}

	public void setOverclock(boolean overclock) {
		this.overclock = overclock;
	}

}
