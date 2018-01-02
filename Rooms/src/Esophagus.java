import java.util.Scanner;

public class Esophagus extends Room
{
	private static final String x = null;
	private boolean explored;
	
	public Esophagus(int x, int y, boolean[] tubes, Person occupant) {
		super(x, y, tubes, occupant);
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("Welcome to the ESOPHAGUS!");
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public void print()
	{
		if (getOccupant().length != 0)
	    {
	      System.out.println(getOccupant()[0].print());
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
		System.out.print("What does the esophagus say to the trachea when water comes?");
		System.out.println("A) Run away! B) I will protect you C) DRINK DRINK DRINK! D) Loosen up man");
		Scanner in = new Scanner(System.in);
		String response= "";
		boolean question = true; 
		
		while(true)
		{
			response = in.nextLine();

			if(response.equals("C"))
			{
				System.out.println("Congratulations! " + response + " is correct! You just obtained the letter 'U'");
				question= false;
			}
			else
			{
				System.out.println(response + " is incorrect. Vomit point +10. Please try again!");
				occupant.vomitPts;
			}
		}
	}
	
	public String toString()
	{
	   boolean[] tubes = this.getTubes();
	   String response = "This is the mouth. It is connected to the ";
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
