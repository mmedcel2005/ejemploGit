package tema3;

public class Ej1FuncionesRecursivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una funci�n recursiva que reciba un n�mero entero y devuelve el
		 * sumatorio desde 1 hasta dicho n�mero, es decir, si recibe 8 devolver� el
		 * resultado de la suma 1+2+3+4+5+6+7+8
		 */
		int num = 4;
		System.out.println(sumatorio(num));

	}

	/**
	 * Funcion recursiva que calcula el sumatorio de un numero
	 * 
	 * @param num
	 * @return numero entero resultado del sumatorio
	 */
	public static int sumatorio(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num + sumatorio(num - 1);
		}
	}

}
