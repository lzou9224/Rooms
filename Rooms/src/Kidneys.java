
//Alyssa

import java.util.Scanner;

public class Kidneys extends Room

{
	public Kidneys(int x, int y, Person occupant, boolean explored, int vomitPts) {
		super(x, y,occupant,explored,vomitPts);
		// TODO Auto-generated constructor stub
	} 
	
	public int getVomitPts() {
		return vomitPts;
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc); 
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the Kidneys.");
		
		//lily: put game code here
		
		Runner.leaveRoom(); //returns to board
	}
	
	//question game type?
	public static void kidneyGame(String statement)
	{
		System.out.println("Pop quiz! How many kidneys do you have?");
		
		Scanner in = new Scanner(System.in);
		
		
		if(findKeyword(statement, "2")>=0 )
		{
			System.out.println("Good job. You are correct. You may proceed.");
		}

		if(findKeyword(statement, "two")>=0 )
		{
			System.out.println("Good job. You are correct. You may proceed.");
		}
		else
		{
			System.out.println("Wrong. Increased risk of vomitting.");
			
			vomitPts++;
		}
		
	}
	
	//simple trivia game type, returns letter if correct, else increases vomit pts.
	
	private String kGame()
	{
		System.out.print("Pop Quiz! How many kidneys do humans have?");
		Scanner in = new Scanner(System.in);
		String ans= "";
		boolean res = true; 
		
		while(true)
		{
			ans = in.nextLine();

			if(ans.equals("2"))
			{
				System.out.println("Correct. Your next letter is R.");
				res= false;
			}
			else
			{
				System.out.println("Wrong. Increased risk of vomitting.");
			}
			return("Out.");
		}
		
	}
	
	
	private static int findKeyword(String statement, String string) {
		// TODO Auto-generated method stub
		return -1;
	}

	
}
