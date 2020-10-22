import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {

	private GradeBook gradeBook1, gradeBook2;
	
	@Before
	public void setUp() throws Exception {
		
		//Create two objects
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		
		//Add the scores to gradebook1 and gradebook2
		gradeBook1.addScore(45.5);
		gradeBook1.addScore(78.0);
		gradeBook1.addScore(93.0);
		gradeBook2.addScore(89.0);
		gradeBook2.addScore(97.0);
		gradeBook2.addScore(92.5);
		gradeBook2.addScore(86.5);
		gradeBook2.addScore(90.5);
	}

	@After
	public void tearDown() throws Exception {
		//Empty gradeBook1 and gradeBook2
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void testAddScore() {
		//Test the scores of the gradeBook1 and gradeBook2
		assertTrue((gradeBook1.toString()).equals("45.5 78.0 93.0 "));
        assertTrue((gradeBook2.toString()).equals("89.0 97.0 92.5 86.5 90.5 "));
	}

	@Test
	public void testSum() {
		//Test the sum of the gradeBook1 and gradeBook2
		assertEquals(216.5, gradeBook1.sum(), .001);
		assertEquals(455.5, gradeBook2.sum(), .001);
	}

	@Test
	public void testMinimum() {
		//Test the minimum grade of the gradeBook1 and gradeBook2
		assertEquals(45.5, gradeBook1.minimum(), .001);
		assertEquals(86.5, gradeBook2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		//Test the final score of the gradeBook1 and gradeBook2
		assertEquals(171, gradeBook1.finalScore(), .001);
		assertEquals(369, gradeBook2.finalScore(), .001);
	}

	@Test
	public void testGetScoreSize() {
		//Test the size of the gradeBook1 and gradeBook2
        assertEquals(3, gradeBook1.getScoreSize(), .1);
        assertEquals(3, gradeBook1.getScoreSize(), .1);
	}

}
