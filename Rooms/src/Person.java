
public class Person {
	String userName;
	int xLoc, yLoc;
	int vomittingPoints;
	
	public String getUserName() {
		return userName;
	}
	
	public String getxLoc() {
		return "(" + xLoc +"," + yLoc + ")";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person (String userName, int xLoc, int yLoc)
	{
		this.userName = userName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	//testing out print method -alyssa
	public void print()
	{
		System.out.print("[x]");
	}
	
	public int vomittingPoints
	{
		
	}

}
