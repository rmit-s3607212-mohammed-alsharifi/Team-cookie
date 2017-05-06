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

cell c00 = new cell();
cell c01 = new cell();
cell c02 = new cell();
cell c03 = new cell();
cell c04 = new cell();
cell c05 = new cell();
cell c06 = new cell();
cell c07 = new cell();
cell c08 = new cell();
cell c09 = new cell();

cell c10 = new cell();
cell c11 = new cell();
cell c12 = new cell();
cell c13 = new cell();
cell c14 = new cell();
cell c15 = new cell();
cell c16 = new cell();
cell c17 = new cell();
cell c18 = new cell();
cell c19 = new cell();

cell c20 = new cell();
cell c21 = new cell();
cell c22 = new cell();
cell c23 = new cell();
cell c24 = new cell();
cell c25 = new cell();
cell c26 = new cell();
cell c27 = new cell();
cell c28 = new cell();
cell c29 = new cell();

cell c30 = new cell();
cell c31 = new cell();
cell c32 = new cell();
cell c33 = new cell();
cell c34 = new cell();
cell c35 = new cell();
cell c36 = new cell();
cell c37 = new cell();
cell c38 = new cell();
cell c39 = new cell();

cell c40 = new cell();
cell c41 = new cell();
cell c42 = new cell();
cell c43 = new cell();
cell c44 = new cell();
cell c45 = new cell();
cell c46 = new cell();
cell c47 = new cell();
cell c48 = new cell();
cell c49 = new cell();

cell c50 = new cell();
cell c51 = new cell();
cell c52 = new cell();
cell c53 = new cell();
cell c54 = new cell();
cell c55 = new cell();
cell c56 = new cell();
cell c57 = new cell();
cell c58 = new cell();
cell c59 = new cell();

cell c60 = new cell();
cell c61 = new cell();
cell c62 = new cell();
cell c63 = new cell();
cell c64 = new cell();
cell c65 = new cell();
cell c66 = new cell();
cell c67 = new cell();
cell c68 = new cell();
cell c69 = new cell();

cell c70 = new cell();
cell c71 = new cell();
cell c72 = new cell();
cell c73 = new cell();
cell c74 = new cell();
cell c75 = new cell();
cell c76 = new cell();
cell c77 = new cell();
cell c78 = new cell();
cell c79 = new cell();

cell c80 = new cell();
cell c81 = new cell();
cell c82 = new cell();
cell c83 = new cell();
cell c84 = new cell();
cell c85 = new cell();
cell c86 = new cell();
cell c87 = new cell();
cell c88 = new cell();
cell c89 = new cell();

cell c90 = new cell();
cell c91 = new cell();
cell c92 = new cell();
cell c93 = new cell();
cell c94 = new cell();
cell c95 = new cell();
cell c96 = new cell();
cell c97 = new cell();
cell c98 = new cell();
cell c99 = new cell();


void setTerrain()
{
	c00.setPassable(false);
	c01.setPassable(false);
	c02.setPassable(false);
	c03.setPassable(false);
	c04.setPassable(false);
	c05.setPassable(false);
	c06.setPassable(false);
	c07.setPassable(false);
	c08.setPassable(false);
	c09.setPassable(false);
	c10.setPassable(false);
	
	c10.setPassable(false);
	c19.setPassable(false);
	
	c20.setPassable(false);
	c22.setPassable(false);
	c24.setPassable(false);
	c25.setPassable(false);
	c27.setPassable(false);
	c29.setPassable(false);
	
	c30.setPassable(false);
	c32.setPassable(false);
	c34.setPassable(false);
	c35.setPassable(false);
	c37.setPassable(false);
	c39.setPassable(false);
	
	c40.setPassable(false);
	c42.setPassable(false);
	c47.setPassable(false);
	c49.setPassable(false);
	
	c50.setPassable(false);
	c54.setPassable(false);
	c55.setPassable(false);
	c59.setPassable(false);
	
	c60.setPassable(false);
	c69.setPassable(false);
	
	c70.setPassable(false);
	c72.setPassable(false);
	c73.setPassable(false);
	c76.setPassable(false);
	c77.setPassable(false);
	c79.setPassable(false);
	
	c80.setPassable(false);
	c89.setPassable(false);
	
	c90.setPassable(false);
	c91.setPassable(false);
	c92.setPassable(false);
	c93.setPassable(false);
	c94.setPassable(false);
	c95.setPassable(false);
	c96.setPassable(false);
	c97.setPassable(false);
	c98.setPassable(false);
	c99.setPassable(false);
	
	

	//playArea[2][2].setPassable(false);
}

cell playArea[][] = {

{c00,c01,c02,c03,c04,c05,c06,c07,c08,c09},
{c10,c11,c12,c13,c14,c15,c16,c17,c18,c19},
{c20,c21,c22,c23,c24,c25,c26,c27,c28,c29},
{c30,c31,c32,c33,c34,c35,c36,c37,c38,c39},
{c40,c41,c42,c43,c44,c45,c46,c47,c48,c49},
{c50,c51,c52,c53,c54,c55,c56,c57,c58,c59},
{c60,c61,c62,c63,c64,c65,c66,c67,c68,c69},
{c70,c71,c72,c73,c74,c75,c76,c77,c78,c79},
{c80,c81,c82,c83,c84,c85,c86,c87,c88,c89},
{c90,c91,c92,c93,c94,c95,c96,c97,c98,c99},

};




public void printTerrain()
{
	for (col = 0; col <= 9; col++)
	{
		for (row = 0;  row <= 9; row++)
		{
			if (playArea[col][row].getPassable() == false)//Impassable
			{
				System.out.print("0");
			}
			else if (playArea[col][row].getPassable() == true)
			{
				System.out.print("_");
			}
			
		}
		System.out.println();		
	}
}


/*
cell playArea[][]  = 
{
	{c00,c01,new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()},
	{new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell(),new cell()}
};
*/

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
//cell[] cellGrid = {food1,food2};

/*
public void changeFood2()
{
	//food2.live = false;
	food2.setLiveFalse();
}
*/


/*
	public void CheckArray()
	{
		for (col = 0; col <= 1; col++)
		{
			if (cellGrid[col] == food1)
			{
				food1.getLive();
				//System.out.print(food1.live);
			}
			else if (cellGrid[col] == food2)
			{
				food2.getLive();
				//System.out.print(food2.live);
			}		
		}
	}
*/

		
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
