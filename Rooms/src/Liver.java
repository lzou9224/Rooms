//Lingli Zou
import java.util.Scanner;

public class Liver extends Room
{
	private static final String x = null;
	private boolean explored;
	
	public Liver(int x, int y, boolean[] tubes, Person occupant) {
		super(x, y, tubes, occupant);
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("Welcome to the TU LIVER >;)!");
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public void print()
	{
		if (getOccupant().yLoc != 0)
	    {
	      System.out.println(getOccupant().print();
	    }
	    else if (this.explored)
	    {
	      System.out.print("[ H ]");
	    }
	    else
	    {
	      System.out.print("[   ]");
	    }

	}

	public static void askQuestion()
	{
		//individualized trivia question for the liver
		System.out.print("As the largest organ in your body, what % of water is your liver consist of?");
		System.out.println("A) 45% B) 68% C) 85% D) 96%");
		Scanner in = new Scanner(System.in);
		String response= "";
		boolean question = true; 
		
		while(true)
		{
			response = in.nextLine();

			if(response.equals("D"))
			{
				System.out.println("Congratulations! " + response + " is correct! You just obtained the letter 'T'");
				question= false;
			}
			else
			{
				System.out.println(response + " is incorrect. Vomit point +10. Please try again!");
				//excess vomit points will cause the player to 'vomit' or 'game over!'
				occupant.vomitPts;
			}
		}
	}
	
	public String toString()
	{
	   boolean[] tubes = this.getTubes();
	   String response = "This is the liver. It is connected to the ";
	   if (tubes[0])
	   {
		   response += "N";
	   }
	   
	   if(tubes[1]) {
		   response += " and E";
	   }
	    	
	   if (tubes[2]) {
		   response += " and S";
	   }
	    	
	   if (tubes[3]) {
		   response += " and W";
	   }
	    	
	    	return response;
	   }
}
