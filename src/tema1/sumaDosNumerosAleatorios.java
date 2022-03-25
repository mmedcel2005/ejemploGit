package tema1;

public class sumaDosNumerosAleatorios {

	public static void main(String[] args) {
		
		//Definicion de variables
		//Creamos 3 numeros enteros para las operaciones
		
		int numero1;
		int numero2;
		int resultado;
		
		/*
		 * Generamos un  numero aleatorio utilizando la función random de la librería Math 
		 * random genera un numero entre 0 y 1 en formato double, hay que convertirlo en 
		 * int utilizando (int). Lo multiplicamos x100 para que el numero sea entero
		 * Se mete entre parentesis la multiplicacion x100 para que la haga primero
		 */
		
		numero1=(int) (Math.random()*100);
		
		//Mostramos el número 1 generado 
		
		System.out.println("El numero 1 es:" + numero1 + ", ahora generaremos el siguiente");
		
		numero2=(int) (Math.random()*100);
		
		//Mostramos el número 1 generado 
		
		System.out.println("El numero 2 es:" + numero2);
				
		
		resultado=numero1+numero2;	
		
		System.out.println("La suma de los dos numero es:" + resultado);
		
	}

}
