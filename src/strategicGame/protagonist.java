package strategicGame;

public class protagonist 
{
	int cellX;
	int cellY;
	boolean isPoisoned;
	boolean isDoublePoisoned;
	boolean contactMonster;
	boolean contactFood; 
	int victoryTime;
	int poisonTime;
	int doublePoisonTime;	
	
	if(contactFood == true)
	{
		if(isPoisoned == true)
		{
			isDoublePoisoned = true;
			doublePoisonTime = poisonTime; 
			poisonTime = 20; 
		}
		else
		{
			isPoisoned = true;
			poisonTime = 20;
		}
	}
	
	if(contactMonster == true)
	{
		System.out.println("Game over, you lose");
	}
	
	if(victoryTime == 0)
	{
		System.out.println("Congratulations, you win")
	}
}
