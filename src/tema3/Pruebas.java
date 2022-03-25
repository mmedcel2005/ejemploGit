package tema3;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 8;

		System.out.println(Ejemplo1FuncionesRecursivas.factorialRecursivo(numero));

		int listaNum[] = { 3, 5, 7, 2, 3, 34, 56, 23, 45, 3, 2, 1, 99, 67, 87, 54 };

		if (Ejemplo1FuncionesRecursivas.contiene(numero, listaNum)) {
			System.out.println("El numero " + numero + " esta en la lista");
		} else {
			System.out.println("El numero " + numero + " NO esta en la lista");
		}

	}

}
