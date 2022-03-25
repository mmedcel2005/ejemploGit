package coche;

public class Piloto {
	// Definimos los atributos
	public String nombre;
	public int edad;
	public int campeonatos;
	private Coche cocheAsignado;
	public int dorsal;
	public String escuderia;
	public int sueldo;

	// Consutructor
	public Piloto(String nombre, int edad, int campeonatos, Coche cocheAsignado, int dorsal, String escuderia,
			int sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.campeonatos = campeonatos;
		this.cocheAsignado = cocheAsignado;
		this.dorsal = dorsal;
		this.escuderia = escuderia;
		this.sueldo = sueldo;
	}

	// Constructor vacio
	public Piloto() {
	}

	// Get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(int campeonatos) {
		this.campeonatos = campeonatos;
	}

	public Coche getCocheAsignado() {
		return cocheAsignado;
	}

	public void setCocheAsignado(Coche cocheAsignado) {
		this.cocheAsignado = cocheAsignado;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
