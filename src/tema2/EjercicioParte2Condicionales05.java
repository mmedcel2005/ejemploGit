package tema2;

import java.util.Scanner;

public class EjercicioParte2Condicionales05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A la variable "numeromaquina" le asignaremos un valor al azar que podr� ser 0,1 o 2 
		int numeromaquina = (int)(Math.random()*3);
		//Al "numerousuario" le asignaremos un valor dependidendo del valor de la variable "usuario"
		int numerousuario = 0;
		String usuario;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("�Piedra, papel o tijeras?");
		// Leemos por teclado la decisi�n del usuario
		usuario = teclado.next();
		
		//Se pasa la variable a mayusculas y si esta es igual a "PIEDRA"
		// se le asignar� a numerousuario el valor 0 y se imprimir� en
		// pantalla la decision del usuario, en este caso PIEDRA
		if (usuario.toUpperCase().equals("PIEDRA")) {
			numerousuario=0;
			System.out.println("Usuario: PIEDRA");
		}
		//Se pasa la variable a mayusculas y si esta es igual a "PAPEL"
		// se le asignar� a numerousuario el valor 1 y se imprimir� en
		// pantalla la decision del usuario, en este caso PAPEL
		if (usuario.toUpperCase().equals("PAPEL")) {
			numerousuario=1;
			System.out.println("Usuario: PAPEL");
		}
		//Se pasa la variable a mayusculas y si esta es igual a "TIJERAS"
		// se le asignar� a numerousuario el valor 2 y se imprimir� en
		// pantalla la decision del usuario, en este caso TIJERAS
		if (usuario.toUpperCase().equals("TIJERAS")) {
			numerousuario=2;
			System.out.println("Usuario: TIJERAS");
		}
		
		//Si el numero de la maquina es 0 imprimiremos el pantalla "M�quina: PIEDRA"
		if (numeromaquina==0) {
			System.out.println("M�quina: PIEDRA");
		}
		//Si el numero de la maquina es 0 imprimiremos el pantalla "M�quina: PAPEL"
		if (numeromaquina==1) {
			System.out.println("M�quina: PAPEL");
		}
		//Si el numero de la maquina es 0 imprimiremos el pantalla "M�quina: TIJERAS"
		if (numeromaquina==2) {
			System.out.println("M�quina: TIJERAS");
		}
		
		//Ahora daremos el resultado (Gana, empata, pierde)
		//Como bien hemos visto antes 0 es PIEDRA por lo que PIEDRA VS PIEDRA ES EMPATE
		if  ((numerousuario==0)&&(numeromaquina==0)) {
			System.out.println("EMPATE");
		}
		//Como bien hemos visto antes 1 es PAPEL por lo que PIEDRA VS PAPEL pierde PIEDRA
		if ((numerousuario==0)&&(numeromaquina==1)) {
			System.out.println("HAS PERDIDO");
		}
		//Como bien hemos visto antes 2 es TIJERAS por lo que PIEDRA VS TIJERAS gana PIEDRA
		if ((numerousuario==0)&&(numeromaquina==2)) {
			System.out.println("ERES EL GANADOR!");
		}
		//PAPEL VS PIEDRA gana PAPEL
		if  ((numerousuario==1)&&(numeromaquina==0)) {
			System.out.println("ERES EL GANADOR!");
		}
		//PAPEL VS PAPEL EMPATE
		if ((numerousuario==1)&&(numeromaquina==1)) {
			System.out.println("EMPATE");
		}
		//PAPEL VS TIJERAS pierde PAPEL
		if ((numerousuario==1)&&(numeromaquina==2)) {
			System.out.println("HAS PERDIDO");
		}
		//TIJERAS VS PIEDRA pierde TIJERAS
		if  ((numerousuario==2)&&(numeromaquina==0)) {
			System.out.println("HAS PERDIDO");
		}
		//TIJERAS VS PAPEL gana  TIJERAS
		if ((numerousuario==2)&&(numeromaquina==1)) {
			System.out.println("ERES EL GANADOR!");
		}
		//TIJERAS VS TIJERAS EMPATE
		if ((numerousuario==2)&&(numeromaquina==2)) {
			System.out.println("EMPATE");
		}
		
		
		
		
		
	}//main

}//class
