import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	
	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd2() {
		assertEquals(2, cal.add(1, 1));
	}
	
	@Test
	public void testAdd3() {
		assertEquals(3, cal.add(2, 1));
	}
	
	@Test
	public void testAdd4() {
		assertEquals(4, cal.add(2, 2));
	}

	@Test
	public void testSub() {
		assertEquals(0, cal.sub(1, 1));
		assertEquals(1, cal.sub(2, 1));
		assertEquals(2, cal.sub(3, 1));
	}
	
	@Test
	public void testMulti() {
		assertEquals(1, cal.multiply(1, 1));
		assertEquals(2, cal.multiply(2, 1));
		assertEquals(15, cal.multiply(3, 5));
	}
	
	@Test
	public void testDivide() {
		assertEquals(1, cal.divide(1, 1));
		assertEquals(3, cal.divide(9, 3));
	}
}
