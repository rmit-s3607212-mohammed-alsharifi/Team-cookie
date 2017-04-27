//Test Change 27/4/17

package strategicGame;

import strategicGame.cell.Contents;

public class grid
{

//These two ints are for use in the RenderGameboard function.
static int col;
static int row;

/*
cell cellref = new cell();

public enum Contents
{
	IMPASSABLE,
	EMPTY,
	MONSTER,
	PLAYER,
	PLAYERPLACEFOOD,
	FOOD,
	CONTACTPLAYERMONSTER,
	CONTACTPLAYERFOOD,
	CONTACTMONSTERFOOD
}

static Contents IMPASSABLE;
static Contents EMPTY;
static Contents MONSTER;
static Contents PLAYER;
static Contents PLAYERPLACEFOOD;
static Contents FOOD;
static Contents CONTACTPLAYERMONSTER;
static Contents CONTACTPLAYERFOOD;
static Contents CONTACTMONSTERFOOD;
*/


/*Contents guide:

1: Impassable
2: Empty
3: Monster
4: Player
5: Food
6: ContactPlayerMonster
7: ContactPlayerFood
8: ContactMonsterFood */

//A sample grid that gives the player and monsters adequate room to strategise.
static int[][] sampleGrid = 
{
		{1,1,1,1,1,1,1,1,1,1},
		{1,4,2,2,2,2,2,2,2,1},
		{1,2,1,2,1,1,2,1,2,1},
		{1,2,1,2,1,1,2,1,2,1},
		{1,2,1,2,2,2,2,1,2,1},
		{1,2,2,2,1,1,2,2,2,1},
		{1,2,2,2,2,2,2,2,2,1},
		{1,2,1,1,2,2,1,1,2,1},
		{1,3,2,2,3,2,2,2,2,1},
		{1,1,1,1,1,1,1,1,1,1}
};




	/*{
		
	{IMPASSABLE, IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE },
	{IMPASSABLE,PLAYER,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
	{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
	{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
	{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
	{IMPASSABLE,EMPTY,EMPTY,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,EMPTY,EMPTY,IMPASSABLE },
	{IMPASSABLE,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
	{IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE },
	{IMPASSABLE,MONSTER,EMPTY,EMPTY,MONSTER,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
	{IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE }

	};*/






public static void RenderGameboard()
{
	for (col = 0; col <= 9; col++)
	{
		for (row = 0;  row <= 9; row++)
		{
			//System.out.print(col);
			//System.out.print(row);
			
			if (sampleGrid[col][row] == 1)//Impassable
			{
				System.out.print("0");
			}
			else if (sampleGrid[col][row] == 2)//Empty
			{
				System.out.print("_");
				
			}
			else if (sampleGrid[col][row] == 4)//Player
			{
				System.out.print("P");
			}
			else if (sampleGrid[col][row] == 3)//monster
			{
				System.out.print("M");
			}
			else if (sampleGrid[col][row] == 6)//food
			{
				System.out.print("F");
			}
			else if (sampleGrid[col][row] == 5) //Playerplacefood
			{
				System.out.print("%");
			}
			else if (sampleGrid[col][row] == 7) //Contact player monster
			{
				System.out.print("X");
			}
			else if (sampleGrid[col][row] ==  8) //Contact player food
			{
				System.out.print("@");
			}
			else if (sampleGrid[col][row] ==  9) //Contact monster food
			{
				System.out.print("V");
			}
		}
		System.out.println();
	}
}


}

			//n = crap(sampleGrid,row,col);
			//Contents item = (sampleGrid[row][col]);
			/*
			System.out.print(col);
			System.out.print(row);
			
			if (sampleGrid[col][row] == IMPASSABLE)
			{
				System.out.print("0");
				break;
			}
			else if (sampleGrid[col][row] == EMPTY)
			{
				System.out.print("_");
			}
			else if (sampleGrid[col][row] == PLAYER)
			{
				System.out.print("P");
			}
			else if (sampleGrid[col][row] == MONSTER)
			{
				System.out.print("M");
			}
			else if (sampleGrid[col][row] == FOOD)
			{
				System.out.print("F");
				break;
			}
			else if (sampleGrid[col][row] == PLAYERPLACEFOOD)
			{
				System.out.print("%");
			}
			else if (sampleGrid[col][row] == CONTACTPLAYERMONSTER)
			{
				System.out.print("X");
			}
			else if (sampleGrid[col][row] ==  CONTACTPLAYERFOOD)
			{
				System.out.print("@");
			}
			else if (sampleGrid[col][row] ==  CONTACTMONSTERFOOD)
			{
				System.out.print("V");
			}
		}
		System.out.println();
		*/



			
			
			
			
			
			/*switch (sampleGrid[col][row])
			{
				case IMPASSABLE:
					System.out.print("0");
					break;
				case EMPTY:
					System.out.print("_");
					break;
				case PLAYER:
					System.out.print("P");
					break;
				case MONSTER:
					System.out.print("M");
					break;
				case FOOD:
					System.out.print("F");
					break;
				case PLAYERPLACEFOOD:
					System.out.print("%");
					break;
				case CONTACTPLAYERMONSTER:
					System.out.print("X");
					break;
				case CONTACTPLAYERFOOD:
					System.out.print("@");
					break;
				case CONTACTMONSTERFOOD:
					System.out.print("V");
					break;
				default:
					System.out.print("?");
					break;
			}
			*/

			


