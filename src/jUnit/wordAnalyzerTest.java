package jUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import Ejercicios.WordAnalyzer;

class wordAnalyzerTest {

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

	/************** firstRepeatedCharacter **************/

	@RepeatedTest(200)
	public void aardvarkfirstRepeatedCharacter() {
		WordAnalyzer wa = new WordAnalyzer("aardvark");
		char result = wa.firstRepeatedCharacter();
		assertEquals(result, 'a');
	}

	@RepeatedTest(200)
	public void roommatefirstRepeatedCharacter() {
		WordAnalyzer wa = new WordAnalyzer("roommate");
		char result = wa.firstRepeatedCharacter();
		assertEquals(result, 'o');
	}

	@RepeatedTest(200)
	public void matefirstRepeatedCharacter() {
		WordAnalyzer wa = new WordAnalyzer("mate");
		char result = wa.firstRepeatedCharacter();
		assertEquals(result, 0);
	}

	@RepeatedTest(200)
	public void testfirstRepeatedCharacter() {
		WordAnalyzer wa = new WordAnalyzer("test");
		char result = wa.firstRepeatedCharacter();
		assertEquals(result, 0);
	}

	/************** firstMultipleCharacter **************/

	@RepeatedTest(200)
	public void roommatefirstMultipleCharacter() {
		WordAnalyzer wa = new WordAnalyzer("missisippi");
		char result = wa.firstMultipleCharacter();
		assertEquals(result, 'i');
	}

	@RepeatedTest(200)
	public void matefirstMultipleCharacter() {
		WordAnalyzer wa = new WordAnalyzer("mate");
		char result = wa.firstMultipleCharacter();
		assertEquals(result, 0);
	}

	@RepeatedTest(200)
	public void testfirstMultipleCharacterr() {
		WordAnalyzer wa = new WordAnalyzer("test");
		char result = wa.firstMultipleCharacter();
		assertEquals(result, 't');
	}

	/************** countRepeatedCharacters **************/

	@RepeatedTest(200)
	public void missisippicountRepeatedCharacters() {
		WordAnalyzer wa = new WordAnalyzer("mississippiii");
		int result = wa.countRepeatedCharacters();
		assertEquals(result, 4);
	}

	@RepeatedTest(200)
	public void matecountRepeatedCharacters() {
		WordAnalyzer wa = new WordAnalyzer("mate");
		int result = wa.countRepeatedCharacters();
		assertEquals(result, 0);
	}

	@RepeatedTest(200)
	public void aabbcdaaaabbcountRepeatedCharacters() {
		WordAnalyzer wa = new WordAnalyzer("aabbcdaaaabb");
		int result = wa.countRepeatedCharacters();
		assertEquals(result, 4);
	}

}
