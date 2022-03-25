package jUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import tema4.Calculadora;

class calculadoraTest {

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

	@RepeatedTest(100)
	void generarAleatorioTest() {
		int numero = Calculadora.generarAleatorio();
		boolean resultado = false;

		if (numero < 1000 && numero > -1000) {
			resultado = true;
		}

		assertTrue(resultado);

	}

	@RepeatedTest(200)
	void dividirTest() {
		int dividendo = ((int) Math.random() * 200 + 1);
		int divisor = ((int) Math.random() * 200 + 1);

		assertEquals((dividendo / divisor), Calculadora.division(dividendo, divisor));

	}

}
