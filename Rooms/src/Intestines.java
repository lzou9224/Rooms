
//Alyssa


import java.util.Scanner;

public class Intestines extends Room 
{
	public Intestines(int x, int y, boolean[] tubes, Person occupant) {
		super(x, y, tubes, occupant);
	}

	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the Kidneys.");
	}
	
	//testing out math question
	public static void mathv1()
	{
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		
		double sum = a + b;
		
		
		System.out.println("Time for a math question!");
		
		Scanner in = new Scanner(System.in);
		
		if(user.input = sum)
		{
			System.out.println("You're right! Good job. Here's the next letter.");
			
		}
		else
		{
			System.out.println("Wrong. Increased risk of vomitting.");
			
			vomitpts++;
		}
		
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
	public String toString()
	{
	   boolean[] tubes = this.getTubes();
	   String response = "These are the intestines. They are connected to the ";
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
	
	
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
