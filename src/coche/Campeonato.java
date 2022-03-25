package coche;

public class Campeonato {

	// TODO Auto-generated method stub
	// Crear la Clase Campeonato. Tendrá un array de circuitos y un array de los
	// pilotos que compiten en dicho campeonato, además los siguientes
	// atributos:categoría, nombre y la constante MAX_PILOTOS.
	public static final double PRESION_MAXIMA = 2.5;
	public static final int POTENCIA_MAXIMA = 1000;
	public static final int PESO_MINIMO = 752;
	public static final int MAX_PILOTOS = 3;

	// Creamos e inicializamos las variables
	private String nombre = "";
	private String categoria = "";

	// Crea el array de objetos
	public Circuito listaCircuitos[];
	public Piloto pilotos[];

	public Campeonato(String nombre, String categoria) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		pilotos = new Piloto[MAX_PILOTOS];
		listaCircuitos = new Circuito[MAX_PILOTOS];

		listaCircuitos[1] = new Circuito();
		listaCircuitos[2] = new Circuito();
		listaCircuitos[0] = new Circuito();

		pilotos[0] = new Piloto();
		pilotos[1] = new Piloto();
		pilotos[2] = new Piloto();

	}

	// Get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Circuito[] getCircuitos() {
		return listaCircuitos;
	}

	public void setCircuitos(Circuito[] circuitos) {
		this.listaCircuitos = circuitos;
	}

	public Piloto[] getPilotos() {
		return pilotos;
	}

	public void setPilotos(Piloto[] pilotos) {
		this.pilotos = pilotos;
	}

	/**
	 * Funcion que dice el circuito de mayor longitud
	 * 
	 * @return objeto tipo Circuito del circuito mas largo
	 */
	public Circuito circuitoMasLargo() {
		int mayorLongitud = Integer.MIN_VALUE;
		Circuito circuitoMasLargo = new Circuito();

		for (int i = 0; i < listaCircuitos.length; i++) {
			if (mayorLongitud < listaCircuitos[i].getLongitud()) {
				mayorLongitud = listaCircuitos[i].getLongitud();
				circuitoMasLargo = listaCircuitos[i];
			}
		}
		return circuitoMasLargo;
	}

	/**
	 * Recibe un nombre de escuderia y devuelve los nombres de los pilotos
	 * pertenecientes a la escuderia
	 * 
	 * @param nombreEscuderia
	 * @return nombre de los pilotos pertenecientes a la escuderia recibida
	 */
	public void mostrarEscuderia(String nombreEscuderia) {

		System.out.println(nombreEscuderia + ": ");

		for (int i = 0; i < pilotos.length; i++) {
			if (pilotos[i].escuderia == nombreEscuderia)
				System.out.println(pilotos[i].getNombre());

		}
	}

	/**
	 * Funcion que recorre un array de pilotos y comprueba si el el peso, la
	 * potencia y la presion de la rueda de su coche esta por debajo o por encima de
	 * lo permitido
	 */
	public void coprobarCoches() {

		for (int i = 0; i < pilotos.length; i++) {
			boolean presionLegal = false;
			boolean pesoLegal = false;
			boolean potenciaLegal = false;

			for (int k = 0; k < pilotos[i].getCocheAsignado().getRueda().length; k++) {
				// Peso
				if (pilotos[i].getCocheAsignado().getPeso() > (PESO_MINIMO * 1.05)) {
					System.out.println(pilotos[i].getNombre() + " Rueda " + k + " peso mayor a la estipulada.");
				} else {
					if (pilotos[i].getCocheAsignado().getPeso() < (PESO_MINIMO * 0.90)) {
						System.out.println(pilotos[i].getNombre() + " Rueda " + k + " peso menor a la estipulada.");
					} else {
						pesoLegal = true;
					}
				}
				// Potencia
				if (pilotos[i].getCocheAsignado().getPotencia() > (POTENCIA_MAXIMA * 1.05)) {
					System.out.println(pilotos[i].getNombre() + " Rueda " + k + " potencia mayor a la estipulada.");
				} else {
					if (pilotos[i].getCocheAsignado().getPotencia() < (POTENCIA_MAXIMA * 0.90)) {
						System.out.println(pilotos[i].getNombre() + " Rueda " + k + " potencia menor a la estipulada.");
					} else {
						potenciaLegal = true;
					}
				}
				// Presion
				if (pilotos[i].getCocheAsignado().getRueda()[k].getPresion() > (PRESION_MAXIMA * 1.05)) {
					System.out.println(pilotos[i].getNombre() + " Rueda " + k + " presión mayor a la estipulada.");
				} else {
					if (pilotos[i].getCocheAsignado().getRueda()[k].getPresion() < (PRESION_MAXIMA * 0.90)) {
						System.out.println(pilotos[i].getNombre() + " Rueda " + k + " presión menor a la estipulada.");
					}
					presionLegal = true;
				}

				if (pesoLegal == true && potenciaLegal == true && presionLegal == true) {
					System.out.println(pilotos[i].getNombre() + " ok");
				}

			}
		}

	}
}
