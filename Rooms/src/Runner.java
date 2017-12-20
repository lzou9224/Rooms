//Lingli Zou
//Lily Li
//Alyssa Ma
//** Donde estas el agua?

import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[5][5];
		
		//Fill the building with normal rooms
		for (int x = 0; x<building.length; x++)
		{
			Room[] row = building[x];
			for (int y = 0; y < row.length; y++)
			{
				boolean[] tubes = {true, true, true, true};
				Person[] occupants = {};
				row[y] = new Room(x,y, tubes, occupants);
			}
		}
		//Mouth Room 
		/*int a =(int)(3*building.length);
		int b = (int)(3*building.length);
		building[a][b] = new Mouth(a,b);
		
		
		//Kidneys Room
		int c = (int)(4*building.length);
		int d = (int)(6*building.length);
		building[c][d] = new Kidneys(c,d);

		
		//Intestines Room
		int e = (int)(2*building.length);
		int f = (int)(8*building.length);
		building[e][f] = new Intestines(e,f);
		
		//Create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new Bladder(x, y);
*/
		 //Setup player 1 and the input scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to 'DONDE ESTAS EL AGUA?'\nPlease enter a valid user name: ");
		String userName = in.nextLine();
		Person player1 = new Person(userName, 0, 0);
		
		building[0][0].enterRoom(player1);
	
		while(gameOn)  
		{
			System.out.println("Welcome, "+ player1 +"! Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}