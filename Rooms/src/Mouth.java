
public class Mouth extends Blood
{
	public Mouth(int a, int b) {
		super(a, b);
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
	      System.out.print(getOccupants()[0].print());
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
	    	boolean[] doors = this.getTubes();
	    	String response = "This is the mouth. It has doors to the ";
	    	if (doors[0])
	    	{
	    		response += "N";
	    	}
	    	
	    	if(doors[1]) {
	    		response += " and E";
	    	}
	    	
	    	if (doors[2]) {
	    		response += " and S";
	    	}
	    	
	    	if (doors[3]) {
	    		response += " and W";
	    	}
	    	
	    	return response;
	    }
}
