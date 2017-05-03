package strategicGame;

public class protagonist extends cell
{
	public protagonist(int x, int y, int s)
	private int currentspeed = 12;
	private int x;
	private int y;
	private boolean isPoisoned;
	private boolean isDoublePoisoned;
	private boolean contactMonster;
	private boolean contactFood; 
	private int poisonTime;
	private int doublepTime;	
	
	if(contactFood == true)
	{
		if(isPoisoned == true)
		{
			isDoublePoisoned = true;
			doublepTime = poisonTime; 
			poisonTime = 20; 
			currentspeed = currentspeed/2;
		}
		else
		{
			isPoisoned = true;
			poisonTime = 20;
			currentspeed = currentspeed/2;
			
		}
	}
	
	if(contactMonster == true)
	{
		System.out.println("Game over, you lose");
	}
}
