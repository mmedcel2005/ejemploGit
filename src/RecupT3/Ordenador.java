package RecupT3;

public class Ordenador {
	/*
	 * La clase Ordenador tendrá las siguientes variables miembro: Marca, modelo,
	 * tipoTorre Además tendrá un array de discos duros y de memoria ram
	 */
	private String marca = "";
	private String modelo = "";
	private String tipoTorre = "";
	public DiscoDuro listaDiscoDuro[];
	public Memoria listaMemoria[];
	private Procesador procesador;

	// Constructor con todas las variables
	public Ordenador(String marca, String modelo, int stock, double precio, String tipoTorre,
			DiscoDuro[] listaDiscoDuro, Memoria[] listaMemoria, Procesador procesador) {
		comprobar(procesador, listaDiscoDuro, listaMemoria);
		this.marca = marca;
		this.modelo = modelo;
		this.tipoTorre = tipoTorre;
		this.listaDiscoDuro = listaDiscoDuro;
		this.listaMemoria = listaMemoria;
		this.procesador = procesador;

		/*
		 * En el constructor del ordenador que recibe todos los parámetros, deberá de
		 * comprobarse que hay stock de los componentes que recibe. En caso de que no
		 * haya stock mostrará un mensaje por pantalla y pondrá a null los componentes
		 * cuyo stock sea 0. Si todos los componentes no tienen stock a 0, reduce el
		 * stock de dichos componentes en una unidad y asigna los parámetros a las
		 * variables miembro normalmente.
		 */
	}

	// Constructor vacio
	public Ordenador() {
		super();
	}

	/**************************** Metodos get/set ****************************/
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

	public DiscoDuro[] getListaDiscoDuro() {
		return listaDiscoDuro;
	}

	public void setListaDiscoDuro(DiscoDuro[] listaDiscoDuro) {
		this.listaDiscoDuro = listaDiscoDuro;
	}

	public Memoria[] getListaMemoria() {
		return listaMemoria;
	}

	public void setListaMemoria(Memoria[] listaMemoria) {
		this.listaMemoria = listaMemoria;
	}

	public String getTipoTorre() {
		return tipoTorre;
	}

	public void setTipoTorre(String tipoTorre) {
		this.tipoTorre = tipoTorre;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	/**************************** Funciones ****************************/

	/**
	 * Funcion que imprime todos los precios de los elementos del ordenador
	 */
	public void precios() {
		System.out.println("---------PRECIOS---------");
		System.out.println("Procesador:" + procesador.getPrecio());
		// Imprimir precios discos duros
		for (int i = 0; i < listaDiscoDuro.length; i++) {
			System.out.println("Disco duro " + (i + 1) + ": " + listaDiscoDuro[i].getPrecio());
		}

		// Imprimir precios memoria
		for (int i = 0; i < listaMemoria.length; i++) {
			System.out.println("Memoria " + (i + 1) + ": " + listaMemoria[i].getPrecio());
		}
	}

	/**
	 * Funcion que recibe un array y suma la cantidad de memoria de todas las
	 * memorias ram del array
	 * 
	 * @param listaMemoria
	 * @return int con la cantidad de memoria RAM total
	 */
	public int memoriaTotal(Memoria listaMemoria[]) {
		int memoriaTotal = 0;
		for (int i = 0; i < listaMemoria.length; i++) {
			memoriaTotal += listaMemoria[i].getCapacidad();
		}
		return memoriaTotal;

	}

	/**
	 * Funcion que recibe un array y suma la capacidad de disco duro de todos los
	 * discos duros del array
	 * 
	 * @param listaDiscoDuro
	 * @return int con la capacidad de discos duros totales
	 */
	public int almacenamientoTotal(DiscoDuro listaDiscoDuro[]) {
		int almacenamientoTotal = 0;
		for (int i = 0; i < listaDiscoDuro.length; i++) {
			almacenamientoTotal += listaDiscoDuro[i].getAlmacenamiento();
		}
		return almacenamientoTotal;

	}

	/**
	 * Funcion que rebaja el porcentaje introducido el precio de los componentes que
	 * sean de la marca introducida
	 * 
	 * @param marca
	 * @param porcentaje
	 * @return boolean será true si se ha ejecutado correctamente
	 */
	public boolean ponerOferta(String marca, int porcentaje) {
		boolean resultado = true;
		// Bucle que comprueba la marca de cada discoduro del array
		for (int i = 0; i < listaDiscoDuro.length; i++) {
			if (listaDiscoDuro[i].getMarca() == marca) {
				listaDiscoDuro[i].setPrecio(
						listaDiscoDuro[i].getPrecio() - ((float) (listaDiscoDuro[i].getPrecio() * (porcentaje / 100))));
			}
		}
		// Bucle que comprueba la marca de cada memoria del array
		for (int i = 0; i < listaMemoria.length; i++) {
			if (listaMemoria[i].getMarca() == marca) {
				listaMemoria[i].setPrecio(
						listaMemoria[i].getPrecio() - ((float) (listaMemoria[i].getPrecio() * (porcentaje / 100))));
			}
		}

		// Comprueba la marca del procesador
		if (procesador.getMarca() == marca) {
			procesador.setPrecio(procesador.getPrecio() - ((float) (procesador.getPrecio() * (porcentaje / 100))));
		}

		return resultado;

	}

	/*
	 * La función DiscoDuro discoMasRapido() devolvera el disco duro con mayor
	 * velocidad de transferencia del ordenador
	 */

	public DiscoDuro discoMasRapido() {
		int mayorVelocidad = Integer.MIN_VALUE;
		DiscoDuro discoMasRapido = new DiscoDuro();
		for (int i = 0; i < listaDiscoDuro.length; i++) {
			if (listaDiscoDuro[i].getVelocidadTransferida() > mayorVelocidad) {
				mayorVelocidad = listaDiscoDuro[i].getVelocidadTransferida();
				discoMasRapido = listaDiscoDuro[i];
			}
		}
		return discoMasRapido;
	}

	/**
	 * Funcion que comprueba si los componentes del ordenador tienen o no stock
	 * 
	 * En caso de que tengan stock restaran 1
	 * 
	 * En caso de que no tenga stock pondra null
	 * 
	 * @param procesador
	 * @param listaDiscoDuro
	 * @param listaMemoria
	 */
	private void comprobar(Procesador procesador, DiscoDuro[] listaDiscoDuro, Memoria[] listaMemoria) {
		// Comprueba Stock de procesadores
		if (procesador.getStock() == 0) {
			// Muestra mensaje si no hay stock
			System.out.println("No hay Stock");
		} else {
			if (procesador.getStock() > 0) {
				// Resta uno al stock en caso de que haya stock
				procesador.setStock(procesador.getStock() - 1);
			}
		}

		for (int i = 0; i < listaDiscoDuro.length; i++) {
			if (listaDiscoDuro[i].getStock() == 0) {
				// Muestra mensaje si no hay stock
				System.out.println("No hay Stock");
				listaDiscoDuro[i] = null;
			} else {
				if (listaDiscoDuro[i].getStock() > 0) {
					// Resta uno al stock en caso de que haya stock
					listaDiscoDuro[i].setStock(listaDiscoDuro[i].getStock() - 1);
				}
			}
		}
		// Bucle que comprueba la marca de cada memoria del array
		for (int i = 0; i < listaMemoria.length; i++) {
			if (listaMemoria[i].getStock() == 0) {
				// Muestra mensaje si no hay stock
				listaMemoria[i] = null;
				System.out.println("No hay Stock");
			} else {
				if (listaMemoria[i].getStock() > 0) {
					// Resta uno al stock en caso de que haya stock
					listaMemoria[i].setStock(listaMemoria[i].getStock() - 1);
				}
			}
		}

	}

}
