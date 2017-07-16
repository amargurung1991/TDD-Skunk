
public class Player 
{
	String playerName = "";
	int pointsThisRound = 0;

	
	Player(String name)
	{
		this.playerName = name;
	}
	public String getPlayerName()
	{
		return this.playerName;
	}
	
	public void setPointThisRound(int points)
	{
		this.pointsThisRound = points;
	}
	
	public int getPointsThisRound()
	{
		return this.pointsThisRound;
	}
	

}

