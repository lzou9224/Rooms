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
		int a = (int)(Math.random()*201);
		int b = (int)(Math.random()*101);
		int result = a * b;
		int guess;
		boolean right = false;
		Scanner in = new Scanner(System.in);
		
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the Intestines");
	
		//multiplication question, returns letter if correct, else increases vomit pts.
		System.out.println("Here's a math question. Answer this correctly, or risk vomitting.");
		System.out.println("What is " + a + "*" + b+ "?");
		while(right == false)
		{
			guess = in.nextInt();	
			
			if(guess == result)
			{
				System.out.println("Correct. Your next letter is O.");
				System.out.println("Move along now.");
				right = true;
				Runner.leaveRoom();
			}
			else 
			{
				System.out.println("Wrong. Increased risk of vomitting. Vomit Points: " + vomitPts);
				vomitPts++;
				if(vomitPts >= 5) {
					System.out.println("I'm sorry, but you just vomited yourself out of the system! Good Bye :(\n<<<GAME OVER! AHAAHA>>");
					Runner.gameOff();
					right = true;
				}
			}
			//bug: does not take in consideration of strings
			 
		}
	}
}
