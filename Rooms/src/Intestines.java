
public class Intestines extends Blood 
{
	public Intestines(int e, int f) {
		super(e, f);
	}

	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the Kidneys.");
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
