//Alyssa

import java.util.Scanner;

public class Intestines extends Room 
{
	public Intestines(int x, int y, Person occupant, boolean explored, int vomitPts) {
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
		System.out.println("You have entered the Intestines");
	
	//multiplication question, returns letter if correct, else increases vomit pts.
	
		Scanner in = new Scanner(System.in);
		System.out.println("Here's a math question. Answer this correctly, or risk vomitting.");
		
		int a = (int)(Math.random()*201);
		int b = (int)(Math.random()*101);
		double result = a * b;
		int guess;
		boolean right = false;
		while(right == false)
		{
			guess = in.nextInt();
			
			if(guess == result)
			{
				right = true;
				System.out.println("Correct. Your next letter is W.");
			}
			else if(guess != result)
			{
				System.out.println("Wrong. Increased risk of vomitting.");
			}
		}
		//return("Move along now.");   Lily: Use System.out.print instead
		System.out.println("Move along now.");
		
		Runner.leaveRoom();
	}
}
