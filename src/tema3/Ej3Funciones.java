package tema3;

public class Ej3Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int listaNumeros[] = { 2, 5, 8, 12, 32 };

		System.out.println(ordenMenorMayor(listaNumeros));

	}// main

	/**
	 * 
	 * @param listaNumeros
	 * @return
	 */
	public static boolean ordenMenorMayor(int listaNumeros[]) {

		boolean resultado = true;
		int mayorNumero = Integer.MIN_VALUE;

		for (int i = 0; i < listaNumeros.length; i++) {
			if (mayorNumero < listaNumeros[i]) {
				mayorNumero = listaNumeros[i];
			} else {
				resultado = false;
			}
		}
		return resultado;
	}

}// class
