//Lily
import java.util.Scanner;

public class Bladder extends Room 
{
	public Bladder(int x, int y, Person occupant, boolean explored, int vomitPts) {
		super(x, y,occupant,explored,vomitPts);
		// TODO Auto-generated constructor stub
	} 
	
	public int getVomitPts() {
		return vomitPts;
	}
	  
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		//Cannot Enter unless all other rooms are explored.
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("\nYou just eneterd the bladder!!!");
		System.out.println("\nThis is your final chance to get out of here! What is the word?\nAnswer: ");
		
		Scanner in = new Scanner(System.in);
		boolean question = true; 
		
		while(question)
		{
			String response = in.nextLine();
			if(response.toLowerCase().equals("hole")) {
				System.out.println("\nCONGRATSS YOU WON!!! Now get out of here!!!\n\n*You are now out of the system*");
				question = false;
				Runner.gameOff();
			}
			else {
				vomitPts++;
				System.out.println("\nSORRY, TRY AGAIN! Vomit Points: " + vomitPts +"\nAnswer: ");
				if(vomitPts >= 5) {
					System.out.println("I'm sorry, but you just vomited yourself out of the system! Good Bye :(\n<<<GAME OVER! AHAAHA>>");
					Runner.gameOff();
					question = false;
				}
			}
		}
	}
	
}
