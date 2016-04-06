import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd2() {
		Calculator cal = new Calculator();
		assertEquals(2, cal.add(1, 1));
	}
	
	@Test
	public void testAdd3() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.add(2, 1));
	}
	
	@Test
	public void testAdd4() {
		Calculator cal = new Calculator();
		assertEquals(4, cal.add(2, 2));
	}

}
