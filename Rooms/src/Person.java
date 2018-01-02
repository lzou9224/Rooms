import java.util.Scanner;


public class Person {
	static String userName;
	int xLoc, yLoc;
	//int vomitPts;
	
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

	public Person (String userName, int xLoc, int yLoc, int vomitPts)
	{
		this.userName = userName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		//this.vomitPts = vomitPts;
	}
	
	public void print()
	{
		System.out.print("x");
	}
	
/*	public int getVomitPts(int vomitPts){
		int sum = 0;
		sum += vomitPts;
		return sum;
	}
*/

}
