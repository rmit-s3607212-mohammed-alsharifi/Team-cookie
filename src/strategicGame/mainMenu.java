package strategicGame;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javafx.scene.shape.Path;

public class mainMenu 
{

	static User user = new User();
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		
	int choice;
//		System.out.println("------------------------------");
//		System.out.println("Single Player Strategic Game");
//		System.out.println("1. Register");
//		System.out.println("2. Login");
//		System.out.println("3. Play Game");
//		System.out.println("4. Exit");
//		System.out.println("------------------------------");
//		
//		choice = reader.nextInt();
        
		do
		{
			
			
			System.out.println("------------------------------");
			System.out.println("Single Player Strategic Game");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Play Game");
			System.out.println("4. Exit");
			System.out.println("------------------------------");
			
			choice = reader.nextInt();
			
        switch (choice) {
            case 1:  registerUser();
                     break;
            case 2:  userLogin();
                     break;
            case 3:  System.out.println("Game Started :)");
                     break;
            case 4:  System.out.println("Good Bye!");
            	     break;
            default: System.out.println("-----------)");
            		 break;
            
        }
		}while(choice !=4);
		

		
		reader.close();
		
		
		
		
		
		
	}
		

private static void registerUser()
	{
	
	// Initialize variables
	boolean check = true;

	String username;
	String password;
	String verifyPassword;
	
	
	
		while (check)
		{
		System.out.println("Enter username:");
		username = reader.nextLine();
		
		// check user has input correct character amount.
		if (username.length() < 5 || username.length() > 10)
			{
			System.out.println("The username must be between 5 and 10 charachters long");
			continue;
			}
		
		// prompt user for password input	
			System.out.println("Enter Password");
			password = reader.nextLine();
		
		// check user has input correct character amount.
		if (password.length() < 5 || username.length() > 10)
			{
			System.out.println("The password must be between 5 and 10 charachters long");
			continue;
			}
		
		// prompt user to re-enter password
			System.out.println("Re-enter Password");
			verifyPassword = reader.nextLine();
	
		// check user has input correct character amount.
		if (!verifyPassword.equals(password))
			{
			System.out.println("password does not match");
			continue;
			}
		// check username is not already in user
		if(user.authenticateUser(username) == true)
			{
			user.usernameList.add(username);
			user.passwordList.add(password);
			
			//////////////////////////////////////////
			//Path path = Paths.get("/output.txt");
			PrintWriter out;
			try {
				out = new PrintWriter("filename.txt");

				out.println("hello world");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
//			int n = user.usernameList.toString().indexOf(username);
//			Charset charset = Charset.forName("US-ASCII");
//			String s = user.usernameList.get(n).toString();
//			
//			try (BufferedWriter writer = Files.newBufferedWriter(stored_usernames.txt, charset)) {
//			    writer.write(s, 0, s.length());
//			} catch (IOException x) {
//			    System.err.format("IOException: %s%n", x);
//			}
		
			//////////////////////////////////////////////////////////
			System.out.println("account created successfully, your username: "  + username + " password: "  +password);
		
		
			check = false;
			}
		else
			{
			System.out.println("username already exists ,  please enter different username");
			}
	
	
		}
	}
	

private static boolean userLogin()
	{
	
		String username;
		String password;
		Scanner readerTwo = new Scanner(System.in);
//		User user = new User();
	
		System.out.println(user.usernameList);
		System.out.println(user.passwordList);
		
		System.out.println("Login");
		System.out.println("Enter username: ");
		username = readerTwo.nextLine();
	
		System.out.println("password: ");
		password = readerTwo.nextLine();
		
		int n = user.usernameList.toString().indexOf(username);
		int z = user.passwordList.toString().indexOf(password);
		System.out.println("the value of n is " +n);
		System.out.println("the value of z is " +z);
		System.out.println("the size of the list is " +n);
		int x = user.usernameList.size();
		
		if ( n == -1)
		{
			System.out.println("no account exists with the specified username:");	
			return false;
		}
		else
		{
			if (user.passwordList.get(z-1).toString().equals(password))
			{
				System.out.print("Login Successful");
				return true;
			}
			else
			{
				System.out.println("Incorrect password");
				return false;
			}
		}
	
	
	
	}

}
