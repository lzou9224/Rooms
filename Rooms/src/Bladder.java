//Lily
//1/2 put a value to vomitpts
import java.util.Scanner;

public class Bladder extends Room 
{
	public static int bladderVomitPts;
	
	public static int getBladderVomitPts() {
		return bladderVomitPts;
	}

	public static int getBVomitPts(int vomitPts) {
		vomitPts = getBladderVomitPts();
		bladderVomitPts += vomitPts;
		return bladderVomitPts;
	}

	public Bladder(int x, int y, boolean[] tubes, Person occupant) {
		super(x, y, tubes, occupant);
		// TODO Auto-generated constructor stub
	} 
	
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		
		//Input the correct keyword
		
		
		System.out.println("You found the winning room! Ten points for Gryffindor.");
		Runner.gameOff();
	}
	

}
