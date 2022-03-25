package jUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Class");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Class");
	}

	// MyMath.sum
	// 1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6, MyMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		assertEquals(3, MyMath.sum(new int[] { 3 }));
	}

}
