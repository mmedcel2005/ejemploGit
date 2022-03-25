package RecupT3;

public class DiscoDuro {
	// Definimos las variables
	private String marca = "";
	private String modelo = "";
	private int stock = 0;
	private double precio = 0;
	private int almacenamiento = 0;
	private int velocidadTransferida = 0;

	// Constructor con todas las variables
	public DiscoDuro(String marca, String modelo, int stock, double precio, int almacenamiento,
			int velocidadTransferida) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
		this.almacenamiento = almacenamiento;
		this.velocidadTransferida = velocidadTransferida;
	}

	// Constructor vacio
	public DiscoDuro() {
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

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getVelocidadTransferida() {
		return velocidadTransferida;
	}

	public void setVelocidadTransferida(int velocidadTransferida) {
		this.velocidadTransferida = velocidadTransferida;
	}

}
