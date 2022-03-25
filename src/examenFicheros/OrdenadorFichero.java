package examenFicheros;

public class OrdenadorFichero {
	// Definimos las variables
	String nombre = "";
	String marca = "";
	String modelo = "";
	int precio = 0;
	String tipo = "";
	int stock = 0;

	// Constructor
	public OrdenadorFichero(String nombre, String marca, String modelo, int precio, String tipo, int stock) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.tipo = tipo;
		this.stock = stock;
	}

	// Constructor vacio
	public OrdenadorFichero() {
		super();
	}

	// Metodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Ordenadores [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", tipo=" + tipo + ", stock=" + stock + "]";
	}

}
