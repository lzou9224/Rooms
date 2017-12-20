import java.util.Scanner;

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
		double b = (Math.random()*10);
		
		double sum = a + b;
		System.out.println("Time for a math question!");
		
		Scanner in = new Scanner(System.in);
		
		if(user.input = sum)
		{
			System.out.println("You're right! Good job. Here's the next letter.");
			
		}
		else
		{
			System.out.println("Wrong. Increased risk of vomitting.");
			
			vomitpts++;
		}
		
	}
	
	
	
	
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
