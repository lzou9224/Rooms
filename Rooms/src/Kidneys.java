
public class Kidneys extends Mouth

{
	public Kidneys(int c, int d) {
		super(c, d);
	}
	
	@Override
	public void enterRoom(Person x) {
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered the Kidneys.");
	}
	
	//question game type?
	public static void kidneyGame()
	{
		System.out.println("Pop quiz! What is the purpose of your kidneys?");
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
