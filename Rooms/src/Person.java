
public class Person {
	static String userName;
	int xLoc, yLoc;
	
	public String getUserName() {
		return userName;
	}
	
	public int getxLoc() {
		return xLoc;
	}
	
	public int getyLoc() {
		return yLoc;
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
		System.out.print("x");
	}
}
