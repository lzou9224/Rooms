
public class Blood {
	Person occupant;
	int xLoc,yLoc;
	private boolean explored = false;
	
	//print method, subject to change 
	//fixed print by defining print in person -alyssa
	public void print()
	{
		if(!explored && occupant == null)
		{
			System.out.print("[]");
		}
		else if(occupant != null)
		{
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		else if(explored)
			System.out.print("[b]");
	}
	
	
	
	
	public Blood(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}