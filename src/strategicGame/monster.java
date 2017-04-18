package strategicGame;

public class monster 
{
	private int currentspeed = 2;
	private int x;
	private int y;
	public monster(int x, int y)
	{
		if((x>Map.width) || (y>Map.height) || ((x=hollowArea.x) && (y=hollAwarea.y)))
		{
			System.out.println("not available");
		}
		else
		{
			monster.x=x;
			monster.y=y;
		}
	
	}
	
	

}
