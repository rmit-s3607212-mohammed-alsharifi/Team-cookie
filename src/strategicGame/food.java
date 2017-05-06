package strategicGame;

public class food extends cell
{
	private boolean live = true;
	
	public void getLive()
	{
		//return live;
		System.out.print(live);
	}
	
	public void setLiveFalse()
	{
		live = false;
		
	}
	
	public void setLiveTrue()
	{
		live = true;

	}
	
	//int foodTime = 20;
}
