//Lingli
import java.util.Scanner;

public class Esophagus extends Room
{
	private static final String x = null;

	public Esophagus(int x, int y, Person occupant, boolean explored, int vomitPts) {
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
		System.out.println("You entered the ESOPHAGUS!");
		System.out.println("\nGet ready to begin your QUEST!!");

		//individualized trivia question for the esophagus
		System.out.print("What does the esophagus say to the trachea when water comes? ");
		System.out.println("\nA) Run away! B) I will protect you C) DRINK! DRINK! DRINK! D) Loosen up man\n");
		Scanner in = new Scanner(System.in);
		String response= "";
		boolean question = true; 
		
		while(question)
		{
			response = in.nextLine();

			if(response.toLowerCase().equals("c"))
			{
				System.out.println("\nWOOO! " + response + " is correct! You just obtained the letter 'L'"); 
				System.out.println("Don't get hyped up though. You only passed the easiest trivia question! ");
				System.out.println("Process to the next room to continue");
				question= false;
				Runner.leaveRoom();
			}
			else
			{
				System.out.println("ERRRRRRRRR " + response + " is incorrect. Vomit Points: " + vomitPts + "!");
				System.out.println("Don't get discouraged and try again!\n");
				//excess vomit points will cause the player to 'vomit' or 'game over!'
				vomitPts++;
				if(vomitPts >= 5) {
					System.out.println("I'm sorry, but you just vomited yourself out of the system! Good Bye :(\n<<<GAME OVER! AHAAHA>>");
					Runner.gameOff();
					question = false;
				}
			}
		}
	}
}
