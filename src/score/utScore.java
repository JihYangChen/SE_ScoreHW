package score;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class utScore {
	
	score s = new score();
	
	@Test
	public void test_1() {
		assertEquals('A', score.letterGrade(93));
	}
	
	@Test
	public void test_2() {
		assertEquals('B', score.letterGrade(88));
	}
	
	@Test
	public void test_3() {
		assertEquals('C', score.letterGrade(75));
	}
	
	@Test
	public void test_4() {
		assertEquals('D', score.letterGrade(62));
	}
	
	@Test
	public void test_5() {
		assertEquals('F', score.letterGrade(34));
	}
	
	@Test
	public void test_6() {
		assertEquals('X', score.letterGrade(-10));
	}
	
	@Test
	public void test_7() {
		assertEquals('X', score.letterGrade(123));
	}
	
	@Test
	public void test_8() {
		assertEquals('X', score.letterGrade(101));
	}
	
	@Test
	public void test_9() {
		assertEquals('A', score.letterGrade(100));
	}
	
	@Test
	public void test_10() {
		assertEquals('A', score.letterGrade(99));
	}
	
	@Test
	public void test_11() {
		assertEquals('A', score.letterGrade(91));
	}
	
	@Test
	public void test_12() {
		assertEquals('A', score.letterGrade(90));
	}
	
	@Test
	public void test_13() {
		assertEquals('B', score.letterGrade(89));
	}
	
	@Test
	public void test_14() {
		assertEquals('B', score.letterGrade(81));
	}
	
	@Test
	public void test_15() {
		assertEquals('B', score.letterGrade(80));
	}
	
	@Test
	public void test_16() {
		assertEquals('C', score.letterGrade(79));
	}
	
	@Test
	public void test_17() {
		assertEquals('C', score.letterGrade(71));
	}
	
	@Test
	public void test_18() {
		assertEquals('C', score.letterGrade(70));
	}
	
	@Test
	public void test_19() {
		assertEquals('D', score.letterGrade(69));
	}
	
	@Test
	public void test_20() {
		assertEquals('D', score.letterGrade(61));
	}
	
	@Test
	public void test_21() {
		assertEquals('D', score.letterGrade(60));
	}
	
	@Test
	public void test_22() {
		assertEquals('F', score.letterGrade(59));
	}
	
	@Test
	public void test_23() {
		assertEquals('F', score.letterGrade(1));
	}
	
	@Test
	public void test_24() {
		assertEquals('F', score.letterGrade(0));
	}
	
	@Test
	public void test_25() {
		assertEquals('X', score.letterGrade(-1));
	}

}
