
public class Mouth extends Blood
{
	public Mouth(int x, int y) {
		super(x, y);
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
	
}
