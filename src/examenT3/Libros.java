package examenT3;

public class Libros {

	// Constantes estáticas de tipo numérico que esppecifican las categorías
	public static final int AVENTURAS = 0;
	public static final int THRILLER = 1;
	public static final int EDUCATIVOS = 2;
	public static final int AUTOAYUDA = 3;
	public static final int DEPORTES = 4;

	// Creamos e inicializamos la variables miembro
	private String nombre = "";
	private String autor = "";
	private int categoria = 0;
	private int ejemplaresVendidos = 0;
	private int numPaginas = 1;
	private boolean prestado = false;
	private int diaPrestamo = 1;
	private int añoPublicacion = 1;
	private String isbn = "";

	// Constructor vacio
	public Libros() {
		super();
	}

	// Constructor con nombre e isbn
	public Libros(String nombre, String isbn) {
		super();
		this.nombre = nombre;
		this.isbn = isbn;
	}

	// Constructor con todos los atributos
	public Libros(String nombre, String autor, int categoria, int ejemplaresVendidos, int numPaginas, boolean prestado,
			int diaPrestamo, int añoPublicacion, String isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.categoria = categoria;
		this.ejemplaresVendidos = ejemplaresVendidos;
		this.numPaginas = numPaginas;
		this.prestado = prestado;
		this.diaPrestamo = diaPrestamo;
		this.añoPublicacion = añoPublicacion;
		this.isbn = isbn;
	}

	// Generamos get y set de todo excepto la variable isbn que solo tiene get

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getEjemplaresVendidos() {
		return ejemplaresVendidos;
	}

	public void setEjemplaresVendidos(int ejemplaresVendidos) {
		this.ejemplaresVendidos = ejemplaresVendidos;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int getDiaPrestamo() {
		return diaPrestamo;
	}

	public void setDiaPrestamo(int diaPrestamo) {
		this.diaPrestamo = diaPrestamo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public String getIsbn() {
		return isbn;
	}

	/**
	 * Funcion que comprueba si esta prestado o no el libro y en caso de no estar
	 * prestado cambia su estado a true y cambia el valor del diaPrestamo
	 * 
	 * Si el libro está actualmente prestado devolverá false y no cambiará nada, si
	 * puede prestarse cambiará dichos campos y devolverá true.
	 * 
	 * @param dia
	 * @return boolean que dependiendo del valor inicial de this.prestado devuelve
	 *         true o false
	 */
	public boolean prestar(int dia) {
		if (this.prestado = false) {
			this.diaPrestamo = dia;
			this.prestado = true;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Funcion que comprueba el valor de prestamos, si es false devolverá false, y
	 * si es true pondrá a 0 el día y cambiará prestado a false.
	 * 
	 * @return boolean que indica si debe o no devolverse dependiendo de si esta o
	 *         no prestado
	 */
	public boolean devolver() {
		if (this.prestado = false) {
			return false;
		} else {
			this.diaPrestamo = 0;
			this.prestado = false;
			return true;
		}
	}

}
