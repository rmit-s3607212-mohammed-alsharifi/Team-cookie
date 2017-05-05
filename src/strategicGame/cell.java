package strategicGame;

import strategicGame.cell.Contents;

public class cell 
{
	
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

	//public static final Contents IMPASSABLE = null;
	
	
	static Contents IMPASSABLE;
	static Contents EMPTY;
	static Contents MONSTER;
	static Contents PLAYER;
	static Contents PLAYERPLACEFOOD;
	static Contents FOOD;
	static Contents CONTACTPLAYERMONSTER;
	static Contents CONTACTPLAYERFOOD;
	static Contents CONTACTMONSTERFOOD;

}
