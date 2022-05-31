import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddB() {
		//fail("Not yet implemented");
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testAddN() {
		//fail("Not yet implemented");
		int a = 1000;
		int b = 4000;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 5000;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testAddE() {
		//fail("Not yet implemented");
		int a = 9000;
		int b = 1000;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtractN() {
		//fail("Not yet implemented");
		int a = 5000;
		int b = 1000;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 4000;
		assertEquals (actual,expected);
	}
	
	@Test
	public void testSubtractB() {
		//fail("Not yet implemented");
		int a = 5000;
		int b = 5000;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 0;
		assertEquals (actual,expected);
	}
	
	@Test
	public void testSubtractE() {
		//fail("Not yet implemented");
		int a = 5000;
		int b = 5001;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 0;
		assertEquals (actual,expected);
	}
	
	
	
	@Test
	public void testMultipleN() {
		//fail("Not yet implemented");
		int a = 50;
		int b = 20;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 1000;
		assertEquals (actual,expected);
	}
	
	@Test
	public void testMultipleB() {
		//fail("Not yet implemented");
		int a = 9999;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 9999;
		assertEquals (actual,expected);
	}
	
	@Test
	public void testMultipleE() {
		//fail("Not yet implemented");
		int a = -1;
		int b = -1;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 1;
		assertEquals (actual,expected);
	}
	
	@Test
	public void testDivideN() {
		//fail("Not yet implemented");
		int a = 1000;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 500;
		assertEquals (actual,expected);
	}
	
	@Test
	public void testDivideB() {
		//fail("Not yet implemented");
		int a = 9999;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 9999;
		assertEquals (actual,expected);
	}
	
	@Test
	public void testDivideE() {
		//fail("Not yet implemented");
		int a = -12;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 0;
		assertEquals (actual,expected);
	}

}
