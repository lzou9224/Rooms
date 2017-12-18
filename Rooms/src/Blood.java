
public class Blood {
	Person occupant;
	int xLoc,yLoc;
	private boolean explored = false;
	private boolean[] tubes;
	private Person[] occupants;
	
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
	
	//do we need an item for the letters? -lingli
	public Blood(int x, int y, boolean[] tubes, Person[] occupants)
	{
		this.xLoc = x;
		this.yLoc = y;
        this.tubes = tubes;
        this.setOccupants(occupants);
        this.explored = false;
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter the bloodstream!");
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


	public Person[] getOccupants() {
		return occupants;
	}


	public void setOccupants(Person[] occupants) {
		this.occupants = occupants;
	}
	
}