package RecupT3;

public class Memoria {
	// Definimos las variables
	private String marca = "";
	private String modelo = "";
	private int stock = 0;
	private double precio = 0;
	private int capacidad = 0;

	// Constructor con todas las variables
	public Memoria(String marca, String modelo, int stock, double precio, int capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
		this.capacidad = capacidad;
	}

	// Constructor vacio
	public Memoria() {
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

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

}
