
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
		//tubes = hallways??
		this.xLoc = x;
		this.yLoc = y;
        this.tubes = tubes;
        this.occupant = occupant;
        this.explored = false;
	}

	public void enterRoom(Person x)
	{
		System.out.println("You entered the mouth and is on the brink of being absorbed! YAY :)\n"
							+ "Go through all of the ogans and gather letters to find the missing word.\n"
							+ "The missing word will allow you to escape through the Bladder at the last row and last column.\n"
							+ "Input the correct answers = letters! Input the incorrect letters = VOMIT POINTS\n"
							+ "Once you have reached 5 vomit points... GAME OVER, YOU GO BACK TO THE MOUTH AND VOMIT AHAHAHAH");
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