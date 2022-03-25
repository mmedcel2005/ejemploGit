package examenT3;

public class Prueba {
	public static void main(String[] args) {
		Libros JuanVaAlCole = new Libros("Juan va al cole", "David Bisbal", 2, 4000, 30, false, 20, 2010,
				"1234-5678-1234");
		Libros Biblia = new Libros("Biblia", "Antonio Lopez", 3, 900000, 30, false, 20, 1980, "1234-5678-12345");
		Libros AprendeIngles = new Libros("Porque el ingles se enseña mal", "nose", 2, 4000, 30, true, 20, 2015,
				"1234-5773-3421");

		Estanteria Infatiles = new Estanteria(23, 2, 2);
		Infatiles.listaLibros[0] = JuanVaAlCole;
		Infatiles.listaLibros[1] = Biblia;
		Infatiles.listaLibros[2] = AprendeIngles;
		// sergio.listaAsignaturas[Alumno.POS_LENGUA] = lengua;

		System.out
				.println("¿El libro '" + JuanVaAlCole.getNombre() + "' se puede prestar? " + JuanVaAlCole.prestar(25));

		System.out.println("¿El libro '" + JuanVaAlCole.getNombre() + "' debe devolverse? " + JuanVaAlCole.devolver());
		System.out.println("El libro más antiguo es: " + Infatiles.libroMasAntiguo().toString());
		System.out.println("El libro más antiguo es: " + Infatiles.librosDeCategoria(2));
	}
}
