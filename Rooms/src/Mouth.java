
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
	
}
