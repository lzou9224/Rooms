
public class Bladder extends Room 
{
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
		
		System.out.println("You found the winning room! Ten points for Gryffindor.");
		Runner.gameOff();
	}
	

}
