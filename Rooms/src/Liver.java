//Lingli
import java.util.Scanner;

public class Liver extends Room
{
	private static final String x = null;
	
	public Liver(int x, int y, Person occupant, boolean explored, int vomitPts) {
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
		System.out.println("Welcome to TU LIVER >:(!");

		//individualized trivia question for the liver
		System.out.print("As the largest organ in your body, what % of water is your liver consist of?");
		System.out.println("\nA) 45% B) 68% C) 85% D) 96%\n");
		Scanner in = new Scanner(System.in);
		String response= "";
		boolean question = true; 
		
		while(question)
		{
			response = in.nextLine();

			if(response.toLowerCase().equals("d"))
			{
				System.out.println("\nHmmmm unfortunately " + response + " is correct! You just obtained the letter 'H'");
				System.out.println("FINE...I'll let you go THIS time but THIS TIME ONLY");

				question= false;
			}
			else
			{
				System.out.println("\nHA AS EXPECTED... " + response + " is INCORRECT! Vomit point: " + vomitPts + ".");
				System.out.println("Poor you. I mean, I am sure it was not your fault :'D");
				//excess vomit points will cause the player to 'vomit' or 'game over!'
				vomitPts++;
			}
		}
	}
	
}
