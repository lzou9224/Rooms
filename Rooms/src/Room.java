
public class Room {
	Person occupant;
	int xLoc,yLoc;
	private boolean explored = false;
	private boolean[] tubes;

	//print method, subject to change 
	//fixed print by defining print in person 
	
	public void print()
	{
		if(!explored && occupant == null)
		{
			System.out.print("[ ]");
		}
		else if(occupant != null)
		{
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		else if(explored)
			System.out.print("[-]");
	}

	public Room(int x, int y, boolean[] tubes, Person occupant)
	{
		this.xLoc = x;
		this.yLoc = y;
        this.tubes = tubes;
        this.occupant = occupant;
        this.explored = false;
	}

	public void enterRoom(Person x)
	{
		
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
    public boolean[] getTubes()
    {
    	return tubes;
    }
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}


	
}