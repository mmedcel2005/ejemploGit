package coche;

public class Rueda {
	// Definimos los atributos
	private String marca;
	private int radio;
	private int perfil;
	private String tipo;
	private int desgaste;
	public float presion;
	private float precio;
	private int posicion;

	// Constructor
	public Rueda(String marca, int radio, int perfil, String tipo, int desgaste, float presion, float precio,
			int posicion) {
		super();
		this.marca = marca;
		this.radio = radio;
		this.perfil = perfil;
		this.tipo = tipo;
		this.desgaste = desgaste;
		this.presion = presion;
		this.precio = precio;
		this.posicion = posicion;
	}

	// Constructor vacío
	public Rueda() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(int desgaste) {
		this.desgaste = desgaste;
	}

	public float getPresion() {
		return presion;
	}

	public void setPresion(float presion) {
		this.presion = presion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
