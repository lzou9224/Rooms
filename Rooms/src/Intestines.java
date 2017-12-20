
public class Intestines extends Room 
{
	public Intestines(int x, int y) {
		super(x, y);
	}

	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the Kidneys.");
	}
	
	//testing out math question
	public static void mathv1()
	{
		double a = (Math.random()*10);
		double b = (5)(Math.random()*10);
		System.out.println("Time for a math question! ");
		
	}
	
	
	
	
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
