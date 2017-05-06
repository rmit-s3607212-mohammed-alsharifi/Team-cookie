package strategicGame;

import java.util.Scanner;

public class main
{
	public static void main(String[] args){
	    //RenderGameboard();
	    
		grid gridref = new grid();
		
		//gridref.RenderGameboard();
		
		
		
	    String username;
	    String password;
	    Scanner input=new Scanner(System.in);
	    
	    //gridref.checkvar();
	    //gridref.changeFood2();
	    gridref.CheckArray();
	    
		System.out.println("Welcome");
		System.out.println("Please enter an username");
		username=input.next();
		System.out.println("Please enter a password");
		password=input.next();
	}
}
