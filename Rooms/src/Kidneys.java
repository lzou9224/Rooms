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
		
		System.out.print("Pop Quiz! How many kidneys do humans have?");
		Scanner in = new Scanner(System.in);
		String ans= "";
		boolean res = true; 
		
		//simple trivia game type, returns letter if correct, else increases vomit pts.
		
		while(res)
		{
			ans = in.nextLine();

			if(ans.equals("2") || ans.toLowerCase().equals("two"))
			{
				System.out.println("Correct. Your next letter is E.");
				res= false;
			}
			else
			{
				System.out.println("Wrong. Increased risk of vomitting. Vomit Points: " + vomitPts);
				vomitPts++;
				
			}
			
		}
		System.out.println("OUT YOU GO!!");
		Runner.leaveRoom(); //returns to board
		
	}	
}
