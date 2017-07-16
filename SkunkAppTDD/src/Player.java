
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
	
	public void set_points_this_round(int points)
	{
		this.pointsThisRound = this.pointsThisRound + points;
	}
	
	public int get_points_this_round()
	{
		return this.pointsThisRound;
	}
	

}

