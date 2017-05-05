package strategicGame;

public class protagonist extends cell
{
	int cellX;
	int cellY;
	boolean isPoisoned;
	boolean isDoublePoisoned;
	boolean contactMonster;
	boolean contactFood; 
	int victoryTime;
	int poisonTime;
	int doublePoisonTime = 0;	{
	
	
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
		System.out.println("Congratulations, you win");
	}
}
	
}


//Pseudocode
/*

checkUp()
{
	switch(playerLocation[row,col++])
		case : IMPASSABLE/1
			break;
		case : EMPTY/2
			playerPosition = playerPosition[row,col++];
			playerPosition[row,col--] = empty/2;
			break;
		case : MONSTER1/3
			killPlayer;
			monster1Position[row,col] == PLAYERMONSTERCONTACT/8
			break;
		case : FOOD/5
			
}	


*/





