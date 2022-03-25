package gestorFicheros;

public class PruebaFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directorio = "c:\\pruebaFicheros\\";
		String nuevoNombre = "fichero";
		String extension = ".bat";
		// Tamñao en bytes
		int syze = 5000;

		System.out.println(GestionFicheros.mostrarFicherosRecientes(directorio, 10));
		// System.out.println(Coche.cargarCoches(directorio).toString());
		// System.out.println(GestionFicheros.borrarFicheros(directorio, extension));
		// System.out.println(GestionFicheros.modificarNombres(directorio,
		// nuevoNombre));
	}

}
