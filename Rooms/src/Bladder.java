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

	public Bladder(int x, int y, boolean[] tubes, Person occupant, boolean explored) {
		super(x, y, tubes, occupant,explored);
		// TODO Auto-generated constructor stub
	} 
	  
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		int vomit = 0;
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You just eneterd the bladder!!!");
		//if answer is wrong
		vomit++;
		
		//at the end
		getBVomitPts(vomit);
		
		//Input the correct keyword
		
		
		System.out.println("You found the winning room! Ten points for Gryffindor.");
		Runner.gameOff();
	}
	

}
