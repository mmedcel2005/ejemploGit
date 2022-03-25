package coche;

public class Suspension {
	// Definicion de los atributos
	private String marca;
	private float dureza;
	private int carga;
	private int compresion;

	// Constructor
	public Suspension(String marca, float dureza, int carga, int compresion) {
		super();
		this.marca = marca;
		this.dureza = dureza;
		this.carga = carga;
		this.compresion = compresion;
	}

	// Constructor vacío
	public Suspension() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getDureza() {
		return dureza;
	}

	public void setDureza(float dureza) {
		this.dureza = dureza;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getCompresion() {
		return compresion;
	}

	public void setCompresion(int compresion) {
		this.compresion = compresion;
	}

}
