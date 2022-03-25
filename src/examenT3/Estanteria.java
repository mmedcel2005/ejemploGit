package examenT3;

public class Estanteria {

	// constante estática pública que guarda el número máximo de libros por defecto
	// 100
	public static final int MAX_LIBROS = 3;

	// Creamos e inicializamos las variables
	private int codigo = 0;
	private int bloque = 0;
	private int categoria = 0;
	public Libros listaLibros[];

	// Generamos el constructor de las variables
	public Estanteria(int codigo, int bloque, int categoria) {
		super();
		this.codigo = codigo;
		this.bloque = bloque;
		this.categoria = categoria;

		// Inicializamos el tamaño del array
		listaLibros = new Libros[MAX_LIBROS];
	}

	// Generamos get y set de las variables miembro
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getBloque() {
		return bloque;
	}

	public void setBloque(int bloque) {
		this.bloque = bloque;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public Libros[] getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(Libros[] listaLibros) {
		this.listaLibros = listaLibros;
	}

	/**
	 * Funcion recorre el array y devuelve el libro con año de publicación más
	 * antiguo.
	 * 
	 * .
	 * 
	 * @return
	 */
	public Libros libroMasAntiguo() {
		// Definimos las variables una para guardar la fecha del libro mas antiguo y
		// otro para guardar el libro mas antiguo
		int fechaMasAntigua = Integer.MAX_VALUE;
		Libros libroMasAntiguo = new Libros();

		// Bucle que recorre todo el array y compruebas el libro más antiguo
		for (int i = 0; i > listaLibros.length; i++) {
			if (listaLibros[i].getAñoPublicacion() < fechaMasAntigua) {
				fechaMasAntigua = listaLibros[i].getAñoPublicacion();
				libroMasAntiguo = listaLibros[i];
			}

		}

		return libroMasAntiguo;

	}

	/**
	 * Funcion que devuelve el número de libros de la categoría introducida que hay
	 * en la estantería
	 * 
	 * @param categoria
	 * @return
	 */
	public int librosDeCategoria(int categoria) {
		int numLibrosDeCategoria = 0;
		for (int i = 0; i < listaLibros.length; i++) {
			if (listaLibros[i].getCategoria() == categoria) {
				numLibrosDeCategoria++;
			}
		}

		return numLibrosDeCategoria;

	}
}
