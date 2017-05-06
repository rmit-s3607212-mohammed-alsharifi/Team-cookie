//Test Change 27/4/17

package strategicGame;

/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
*/

//import strategicGame.cell.Contents;

public class grid
{

//These two ints are for use in the RenderGameboard function.
static int col;
static int row;

food food1 = new food();
food food2 = new food();




//cell cellref = new cell();
/*
for (i = 1; i <= 2; i++)
{
	
}
*/
/*
void checkvar()
{
	if (food2.live == true)
	{
		food2.live = false;
		System.out.print("Success!");
	}
}
*/
cell[] cellGrid = {food1,food2};

public void changeFood2()
{
	food2.live = false;
}

	public void CheckArray()
	{

		for (col = 0; col <= 1; col++)
		{
			if (cellGrid[col] == food1)
			{
				System.out.print(food1.live);
			}
			else if (cellGrid[col] == food2)
			{
				System.out.print(food2.live);
			}		
		}
	}


		
}


/*
void returnContent()
{
	if foodvariablle == cell.food;
	{
		System.out.print("0");
	}
}
*/



/*
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
3: Monster 1
4: Monster 2
5: Player
6: Food
7: PlayerPlaceFood
8: ContactPlayerMonster
9: ContactPlayerFood
10: ContactMonsterFood
 */

//A sample grid that gives the player and monsters adequate room to strategise.
/*
	static int[][] sampleGrid = 
	{
			{1,1,1,1,1,1,1,1,1,1},
			{1,5,2,2,2,2,2,2,2,1},
			{1,2,1,2,1,1,2,1,2,1},
			{1,2,1,2,1,1,2,1,2,1},
			{1,2,1,2,2,2,2,1,2,1},
			{1,2,2,2,1,1,2,2,2,1},
			{1,2,2,2,2,2,2,2,2,1},
			{1,2,1,1,2,2,1,1,2,1},
			{1,3,2,2,4,2,2,2,2,1},
			{1,1,1,1,1,1,1,1,1,1}
	};
*/


//Make each item a reference to the cell class!
/*
static Contents IMPASSABLE = cell.IMPASSABLE;
static Contents EMPTY = cell.EMPTY;
static Contents MONSTER = cell.MONSTER;
static Contents PLAYER = cell.PLAYER;
static Contents PLAYERPLACEFOOD = cell.PLAYERPLACEFOOD;
static Contents FOOD = cell.FOOD;
static Contents CONTACTPLAYERMONSTER = cell.CONTACTPLAYERMONSTER;
static Contents CONTACTPLAYERFOOD = cell.CONTACTPLAYERFOOD;
static Contents CONTACTMONSTERFOOD = cell.CONTACTMONSTERFOOD;


static Contents[][] sampleGrid = {
	
{IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE },
{IMPASSABLE,PLAYER,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,EMPTY,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,MONSTER,EMPTY,EMPTY,MONSTER,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE }

};
*/
/*
static Contents[][] sampleGrid = 
	{
		
	{cell.IMPASSABLE, cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.PLAYER,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.IMPASSABLE,cell.IMPASSABLE,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE,cell.IMPASSABLE,cell.EMPTY,cell.EMPTY,cell.IMPASSABLE,cell.IMPASSABLE,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.MONSTER,cell.EMPTY,cell.EMPTY,cell.MONSTER,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.EMPTY,cell.IMPASSABLE },
	{cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE }

	};
*/
/*
{
	
{cell.IMPASSABLE, cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,cell.IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE },
{IMPASSABLE,PLAYER,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,EMPTY,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,EMPTY,IMPASSABLE,IMPASSABLE,EMPTY,IMPASSABLE },
{IMPASSABLE,MONSTER,EMPTY,EMPTY,MONSTER,EMPTY,EMPTY,EMPTY,EMPTY,IMPASSABLE },
{IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE,IMPASSABLE }

};
*/

//This is the correct function!
/*
public void RenderGameboard(){

	for (col = 0; col <= 9; col++)
	{
		for (row = 0;  row <= 9; row++)
		{
			if (sampleGrid[col][row] == 1)//Impassable
			{
				System.out.print("0");
			}
			else if (sampleGrid[col][row] == 2)//Empty
			{
				System.out.print("_");
			}
			else if (sampleGrid[col][row] == 3)//Monster 1
			{
				System.out.print("1");
			}
			else if (sampleGrid[col][row] == 4)//Monster 2
			{
				System.out.print("2");
			}
			else if (sampleGrid[col][row] == 5)//Player
			{
				System.out.print("P");
			}
			else if (sampleGrid[col][row] == 6)//food
			{
				System.out.print("F");
			}
			else if (sampleGrid[col][row] == 7) //Playerplacefood
			{
				System.out.print("%");
			}
			else if (sampleGrid[col][row] == 8) //Contact player monster
			{
				System.out.print("X");
			}
			else if (sampleGrid[col][row] ==  9) //Contact player food
			{
				System.out.print("@");
			}
			else if (sampleGrid[col][row] ==  10) //Contact monster food
			{
				System.out.print("V");
			}
		}
		System.out.println();
	}
}

*/




/*
{
	for (col = 0; col <= 9; col++)
	{
		for (row = 0;  row <= 9; row++)
		{
			//System.out.print(col);
			//System.out.print(row);
			//System.out.print("|"); //This array printing method shows that array detection is working just fine, it's the value detection that is the problem. The solution is below.
		
			if (sampleGrid[col][row] == EMPTY)//Impassable
			{
				System.out.print("0");
				continue;
			}
			else if (sampleGrid[col][row] == IMPASSABLE)//Empty
			{
				System.out.print("_");
				continue;
			}
			else if (sampleGrid[col][row] == PLAYER)//Player
			{
				System.out.print("P");
				continue;
			}
			else if (sampleGrid[col][row] == MONSTER)//monster
			{
				System.out.print("M");
				continue;
			}
			else if (sampleGrid[col][row] == FOOD)//food
			{
				System.out.print("F");
				continue;
			}
			else if (sampleGrid[col][row] == PLAYERPLACEFOOD) //Playerplacefood
			{
				System.out.print("%");
				continue;
			}
			else if (sampleGrid[col][row] == CONTACTPLAYERMONSTER) //Contact player monster
			{
				System.out.print("X");
				continue;
			}
			else if (sampleGrid[col][row] == CONTACTPLAYERFOOD) //Contact player food
			{
				System.out.print("@");
				continue;
			}
			else if (sampleGrid[col][row] == CONTACTMONSTERFOOD) //Contact monster food
			{
				System.out.print("V");
				continue;
			}
			continue;
			
		}
		System.out.println();
	}
}
*/
	
	/*
	for (col = 0; col <= 9; col++)
	{
		for (row = 0;  row <= 9; row++)
		{
		
		
			/*
			System.out.print(col);
			System.out.print(row);
			System.out.print("|"); //This array printing method shows that array detection is working just fine, it's the value detection that is the problem. The solution is below.
			
			System.out.print("|");
			
			
			if (sampleGrid[col][row] == EMPTY)//Impassable
			{
				System.out.print("0");
			}
			else if (sampleGrid[col][row] == IMPASSABLE)//Empty
			{
				System.out.print("_");
			}
			else if (sampleGrid[col][row] == PLAYER)//Player
			{
				System.out.print("P");
			}
			else if (sampleGrid[col][row] == MONSTER)//monster
			{
				System.out.print("M");
			}
			else if (sampleGrid[col][row] == FOOD)//food
			{
				System.out.print("F");
			}
			else if (sampleGrid[col][row] == PLAYERPLACEFOOD) //Playerplacefood
			{
				System.out.print("%");
			}
			else if (sampleGrid[col][row] == CONTACTPLAYERMONSTER) //Contact player monster
			{
				System.out.print("X");
			}
			else if (sampleGrid[col][row] == CONTACTPLAYERFOOD) //Contact player food
			{
				System.out.print("@");
			}
			else if (sampleGrid[col][row] == CONTACTMONSTERFOOD) //Contact monster food
			{
				System.out.print("V");
			}
			
		}
		System.out.println();
	}
*/





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

			

/*
			if (sampleGrid[col][row] == 1 || cell.IMPASSABLE)//Impassable
			{
				System.out.print("0");
			}
			else if (sampleGrid[col][row] == 2 || cell.EMPTY)//Empty
			{
				System.out.print("_");
				
			}
			else if (sampleGrid[col][row] ==  || cell.PLAYER)//Player
			{
				System.out.print("P");
			}
			else if (sampleGrid[col][row] == 3 || cell.MONSTER)//monster
			{
				System.out.print("M");
			}
			else if (sampleGrid[col][row] == 6 || cell.FOOD)//food
			{
				System.out.print("F");
			}
			else if (sampleGrid[col][row] == 5 || cell.PLAYERPLACEFOOD) //Playerplacefood
			{
				System.out.print("%");
			}
			else if (sampleGrid[col][row] == 7 || cell.CONTACTPLAYERMONSTER) //Contact player monster
			{
				System.out.print("X");
			}
			else if (sampleGrid[col][row] ==  8 || cell.CONTACTPLAYERFOOD) //Contact player food
			{
				System.out.print("@");
			}
			else if (sampleGrid[col][row] ==  9 || cell.CONTACTMONSTERFOOD) //Contact monster food
			{
				System.out.print("V");
			}
		}
*/
