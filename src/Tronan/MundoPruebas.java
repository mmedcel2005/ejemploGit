package Tronan;

public class MundoPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un objeto denominado joaquin de la clase Personaje
		// Para poder utilizar el objeto primero hay que crearlo utilizando new
		Personaje joaquin = new Personaje();

		joaquin.nombre = "Joaquin";
		joaquin.edad = 18;
		joaquin.nivel = 1;
		joaquin.sexo = Personaje.HOMBRE;

		if (joaquin.sexo == Personaje.HOMBRE) {
			System.out.println("Bienvenido " + joaquin.nombre);
		} else {
			System.out.println("Bienvenida " + joaquin.nombre);
		}

	}

}
