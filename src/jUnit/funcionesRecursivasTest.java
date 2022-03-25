package jUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import tema3.Ejemplo1FuncionesRecursivas;

class funcionesRecursivasTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/************************** FATORIAL RECURSIVO **************************/

	@Test
	void factorialRecursivoTest4() {
		assertEquals(24, Ejemplo1FuncionesRecursivas.factorialRecursivo(4));
	}

	@Test
	void factorialRecursivoTest5() {
		assertEquals(120, Ejemplo1FuncionesRecursivas.factorialRecursivo(5));
	}

	@Test
	void factorialRecursivoTest6() {
		assertEquals(720, Ejemplo1FuncionesRecursivas.factorialRecursivo(6));
	}

	@Test
	void factorialRecursivoTest7() {
		assertEquals(5040, Ejemplo1FuncionesRecursivas.factorialRecursivo(7));
	}

	@Test
	void factorialRecursivoTes8() {
		assertEquals(40320, Ejemplo1FuncionesRecursivas.factorialRecursivo(8));
	}

	/************************** FATORIAL ITERATIVO **************************/
	@Test
	void factorialIterativoTest4() {
		assertEquals(24, Ejemplo1FuncionesRecursivas.factorialIterativa(4));
	}

	@Test
	void factorialIterativoTest5() {
		assertEquals(120, Ejemplo1FuncionesRecursivas.factorialIterativa(5));
	}

	@Test
	void factorialIterativoTest6() {
		assertEquals(720, Ejemplo1FuncionesRecursivas.factorialIterativa(6));
	}

	@Test
	void factorialIterativoTest7() {
		assertEquals(5040, Ejemplo1FuncionesRecursivas.factorialIterativa(7));
	}

	@Test
	void factorialIterativoTest8() {
		assertEquals(40320, Ejemplo1FuncionesRecursivas.factorialRecursivo(8));
	}

	/************************** REPEATED TEST **************************/
	@RepeatedTest(200)
	void factorialesRepeatedTest() {
		int num = generarNumero();

		assertEquals(Ejemplo1FuncionesRecursivas.factorialIterativa(num),
				Ejemplo1FuncionesRecursivas.factorialRecursivo(num));
	}

	// Generar el numero aleatorio
	int generarNumero() {
		int positivoNegativo = 0;
		if ((((int) Math.random() * 2 + 1)) == 1) {
			positivoNegativo = 1;
		} else {
			positivoNegativo = -1;
		}

		return (positivoNegativo * ((int) Math.random() * 200 + 1));
	}

	@RepeatedTest(10)
	void contieneTest() {

		// Creo el numero al azar
		int numeroBuscar = ((int) Math.random() * 20 + 1);
		boolean siTiene = false;
		// Creo un array
		int array[] = new int[10];
		// Bucle que da un valor al azar del array
		// Podria comprobar en otro bucle cada posicion del array y ver si este es el
		// mismo que el valor creado al azar pero lo hare en el mismo bucle
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int) Math.random() * 20 + 1);
			if (array[i] == numeroBuscar) {
				siTiene = true;
			}
		}

		assertEquals(siTiene, Ejemplo1FuncionesRecursivas.contiene(numeroBuscar, array));

	}

}
