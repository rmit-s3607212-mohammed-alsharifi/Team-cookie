package strategicGame;

public class monster extends cell
{
	private int currentspeed = 2;
	private int x;
	private int y;
	public monster(int x, int y, int s)
	{
		if((x>Map.width) || (y>Map.height) || ((x=hollowArea.x) && (y=hollAwarea.y)))
		{
			System.out.println("not available");
		}
		else
		{
			monster.x=x;
			monster.y=y;
			monster.s=currentspeed;
		}
	
	}
	
	
	
	

}
