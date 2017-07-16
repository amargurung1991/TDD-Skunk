import static org.junit.Assert.*;

import org.junit.Test;

public class SkunkTest {

	@Test
	public void testPatron() {
		Die D1 = new Die("A1", "Amar");
		  int high = 6;
		  int low = 1;
		  assertTrue("Error, random is too high", high >= D1.getValue());
		  assertTrue("Error, random is too low",  low  <= D1.getValue());
		
	}
}
