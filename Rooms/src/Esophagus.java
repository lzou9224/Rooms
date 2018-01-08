//Lingli Zou
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
		System.out.println("Welcome to the ESOPHAGUS!");
		System.out.println("\nGet ready to begin your QUEST to escape!!");

		//individualized trivia question for the esophagus
		System.out.print("What does the esophagus say to the trachea when water comes? ");
		System.out.println("A) Run away! B) I will protect you C) DRINK DRINK DRINK! D) Loosen up man");
		Scanner in = new Scanner(System.in);
		String response= "";
		boolean question = true; 
		
		while(question)
		{
			response = in.nextLine();

			if(response.toLowerCase().equals("c"))
			{
				System.out.println("Congratulations! " + response + " is correct! You just obtained the letter 'L'"); 
				System.out.println("\nProcess to the next room to continue your QUEST!");

				question= false;
			}
			else
			{
				System.out.println(response + " is incorrect. Vomit Points: " + vomitPts + ". Please try again!");
				//excess vomit points will cause the player to 'vomit' or 'game over!'
				vomitPts++;
			}
		}
		Runner.leaveRoom();
	}
}
