package JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraderTest {

	
	@Test
	void negativeOneShouldReturnIllegalArgumentException() {
		var grader = new Grader();
		assertThrows(IllegalArgumentException.class,
		() -> {
			grader.determineLetterGrade(-1);
		});
	}
	
	
	
	@Test
	void fiftyNineShouldReturnIllegal() {
	var grader = new Grader();
		assertEquals("Unclassified Grade", grader.determineLetterGrade(59));
	}
	@Test
	void sixtyNineShouldReturnF() {
		var grader = new Grader();
		assertEquals('F', grader.determineLetterGrade(69));
	}
	

	@Test
	void SeventyNineShouldReturnD() {
	var grader = new Grader();
		assertEquals('D', grader.determineLetterGrade(79));
	
	}
	

	@Test
	void eightyNineShouldReturnC() {
	var grader = new Grader();
		assertEquals('C', grader.determineLetterGrade(89));
	}

	@Test
	void ninetyShouldReturnB() {
	var grader = new Grader();
		assertEquals('B', grader.determineLetterGrade(90));

	}
	@Test
	void aboveNinetyShouldReturnA() {
	var grader = new Grader();
	assertEquals('A',grader.determineLetterGrade(91));
	
	
	
}


}
