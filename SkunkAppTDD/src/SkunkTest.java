import static org.junit.Assert.*;

import org.junit.Test;

public class SkunkTest {

	@Test
	public void testPatron() {
		Die D1 = new Die();
		  int high = 6;
		  int low = 1;
		  assertTrue("Error, random is too high", high > D1.roll());
		  assertTrue("Error, random is too low",  low  < D1.roll());
		
	}
}
