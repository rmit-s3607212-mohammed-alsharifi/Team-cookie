package strategicGame;

import java.util.ArrayList;
import java.util.List;

public class User 
{
//	private static final int NUMBEROFUSERS = 50;
	
	
	String username;
	String password;
//	String storedUsernames[] = new String[NUMBEROFUSERS];
//	String storedPasswords[] = new String[NUMBEROFUSERS];
	
	static int n = 0;
	
	List<String> usernameList = new ArrayList<String>();
	List<String> passwordList = new ArrayList<String>();
	
	boolean authenticateUser (String username)
	{
		// look for index of of user
		int n = usernameList.indexOf(username);
		
		// verify 
		if ( n == -1)
		{
			return true;
		}else
		{
			System.out.println("The desired username is already in use");
			return false;
		}
	}	
	

}
