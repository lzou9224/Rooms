
//Alyssa
import java.util.Scanner;

public class Kidneys extends Room

{
	public Kidneys(int x, int y, boolean[] tubes, Person occupant) {
		super(x, y, tubes, occupant);
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the Kidneys.");
	}
	
	//question game type?
	public static void kidneyGame(String statement)
	{
		System.out.println("Pop quiz! How many kidneys do you have?");
		
		Scanner in = new Scanner(System.in);
		
		
		if(findKeyword(statement, "2")>=0 )
		{
			System.out.println("Good job. You are correct. You may proceed.");
		}

		if(findKeyword(statement, "two")>=0 )
		{
			System.out.println("Good job. You are correct. You may proceed.");
		}
		else
		{
			System.out.println("Wrong. Increased risk of vomitting.");
			
			vomitpts++;
		}
		
	}
	private static int findKeyword(String statement, String string) {
		// TODO Auto-generated method stub
		
		
		return -1;
	}

	public String toString()
	{
	   boolean[] tubes = this.getTubes();
	   String response = "These are the kidneys. They are connected to the ";
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
