package naurez11;

import static org.junit.Assert.*;
 
import naurez11.mycalculator;

import org.junit.Test;

public class mycalculatorTest {
  mycalculator calc =new mycalculator();
	@Test
	public void testsum() {
		assertEquals(30,calc.sum(10, 20));
		
	}
	public void testdiff() {
		assertEquals(10,calc.sum(20, 10));
		
	}

}
