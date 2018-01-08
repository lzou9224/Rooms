//Lingli 
public class Room {
	Person occupant;
	int xLoc,yLoc;
	private boolean explored = false;
	int vomitPts;

	//print method, subject to change 
	//fixed print by defining print in person 
	public void print()
	{
		if(!explored && occupant == null)
		{
			if(this.xLoc == 4 && this.yLoc == 4) 
			{
				System.out.print("[B]");
			}
			else if(this.xLoc == 4 && this.yLoc == 0)
			{
				System.out.print("[I]");
			}
			else if(this.xLoc == 2 && this.yLoc == 4)
			{
				System.out.print("[K]");
			}
			else if(this.xLoc == 4 && this.yLoc == 1)
			{
				System.out.print("[E]");
			}
			else if(this.xLoc == 1 && this.yLoc == 2)
			{
				System.out.print("[L]");
			}
			else 
			{
				System.out.print("[ ]");
			}
		}
		else if(occupant != null)
		{
			System.out.print("[");
			occupant.print();
			System.out.print("]");
		}
		
		if(explored)
		{
			System.out.print("[-]");
		}
		
	}

	public Room(int x, int y, Person occupant, boolean explored, int vomitPts)
	{
		this.xLoc = x;
		this.yLoc = y;
        this.occupant = occupant;
        this.explored = false;
        this.vomitPts = vomitPts;
	}
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
    public Person getOccupant() {
        return occupant;
    }

    public void setOccupants(Person occupant) {
        this.occupant = occupant;
    }

	public void leaveRoom(Person x)
	{
		occupant = null;
		
	}	
}