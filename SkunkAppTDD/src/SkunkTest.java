import static org.junit.Assert.*;

import org.junit.Test;

public class SkunkTest {

	@Test
	public void testDie() {
		Die D1 = new Die();
		  int high = 6;
		  int low = 1;
		  assertTrue("Error, random is too high", high >= D1.roll());
		  assertTrue("Error, random is too low",  low  <= D1.roll());
		
	}
	
	@Test
	public void testDice() {
		Dice D1 = new Dice();
		  int high = 12;
		  int low = 2;
		  assertTrue("Error, random is too high", high >= D1.rollDice());
		  assertTrue("Error, random is too low",  low  <= D1.rollDice());
		
	}
	
	@Test
	public void testPlayer() {
		Player player = new Player("yaz");
		player.getPlayerName();
		assertEquals("yaz", player.getPlayerName());
	}
	
	@Test
	public void testPlayer1() {
		Player player = new Player("yaz");
		player.setPointThisRound(10);
		assertEquals(10, player.getPointsThisRound());
	}
	
	
	
}
