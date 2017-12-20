
public class Mouth extends Room
{
	private boolean explored;
	
	public Mouth(int a, int b, boolean[] tubes, Person[] occupants) {
		super(a, b, tubes, occupants);
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the mouth.");
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public void print()
	{
		if (getOccupants().length != 0)
	    {
	      System.out.println(getOccupants()[0].print());
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
	
	public static void askQuestions
	{
		System.out.print("Which of the following does NOT cause damage to your tooth enamel?");
		System.out.print("A) Orange Juice B) Lips and tongue piercing C) Red wine D) None of the above");
		
		if()
		{
			vomiting points++;
			
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
