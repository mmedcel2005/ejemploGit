package Tronan;

/**
 * Clase personaje
 * 
 * @author manum
 *
 */
public class Personaje {

	// Constantes globales de la clase
	public static final int HOMBRE = 1;
	public static final int MUJER = 2;

	public int vida;
	public int nivel;
	public int fuerza;
	public int resistencia;
	public int destreza;
	public String nombre;
	public int edad;
	// Pongo la variable miembro estado en privada
	// solo es accesible desde dentro de su misma clase
	private int estado = 0;
	public int sexo = 0;

	public void subirNivel() {
		// Subimos nivel
		nivel++;

		fuerza = RPGUtils.tirarDados() / 8 + 1;
		resistencia = RPGUtils.tirarDados() / 8 + 1;
		destreza = RPGUtils.tirarDados() / 8 + 1;
	}

	Personaje() {
		// Constantes globales de la clase
		public static final int HOMBRE = 1;
		public static final int MUJER = 2;

		vida = 0;
		nivel = 0;
		fuerza = 0;
		resistencia = 0;
		destreza = 0;
		String nombre = 0;
		edad = 0;
		// Pongo la variable miembro estado en privada
		// solo es accesible desde dentro de su misma clase
		estado = 0;
		sexo = 0;

	}

}
