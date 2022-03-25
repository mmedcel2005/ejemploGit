package coche;

public class Circuito {
	// Creamos las variables
	public String nombre;
	public String pais;
	public String ciudad;
	public int longitud;
	long vueltaRapida;
	public String nombrePilotoVueltaRapida;

	// Constructor
	public Circuito(String nombre, String pais, String ciudad, int longitud, long vueltaRapida,
			String nombrePilotoVueltaRapida) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.longitud = longitud;
		this.vueltaRapida = vueltaRapida;
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

	// Constructor vacio
	public Circuito() {
		// TODO Auto-generated constructor stub
	}

	// Get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public long getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(long vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	public String getNombrePilotoVueltaRapida() {
		return nombrePilotoVueltaRapida;
	}

	public void setNombrePilotoVueltaRapida(String nombrePilotoVueltaRapida) {
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

	/**
	 * Funcion que recibe el nombre del piloto y el tiempo que ha hecho en el
	 * circuito, y en el caso de que sea mas rapido que la vuelta mas rapida se
	 * actualizara el valor de la vuelta mas rapida
	 * 
	 * @param NombrePiloto
	 * @param tiempo
	 * @return 0 si el tiempo es menor que el de la vuelta rapida y -1 si no se
	 *         cumple la condicion
	 */
	int vueltaRapida(String NombrePiloto, long tiempo) {
		if (tiempo < this.vueltaRapida) {
			this.vueltaRapida = tiempo;
			this.nombrePilotoVueltaRapida = NombrePiloto;
			return 0;
		} else {
			return -1;
		}
	}

}
