//Lingli Zou
//Lily Li
//Alyssa Ma
//** Donde estas el agua?

//IF TIME: ADD clear console, 

import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[5][5];
		Board gb = new Board(building);

		
		//Fill the building with normal rooms
		for (int x = 0; x < building.length; x++)
		{
			Room[] row = building[x];
			for (int y = 0; y < row.length; y++)
			{
				boolean[] tubes = {true, true, true, true};
				Person occupants = null;
				row[y] = new Room(x,y, tubes, occupants);
			}
		}
		

		/** may or may not be necessary??
		 *  
>>>>>>> branch 'master' of https://github.com/lzou9224/Rooms.git
		//Mouth Room 
		/*int a =(int)(3*building.length);
		int b = (int)(3*building.length);
		building[a][b] = new Mouth(a,b, null, null);
		
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
<<<<<<< HEAD
*/

		 //Setup player 1 and the input scanner
		Scanner in = new Scanner(System.in); //initialize a scanner
		
		//obtain Username from the player
		System.out.println("Welcome to 'DONDE ESTAS EL AGUA?'\nPlease enter your Username: ");
		String userName = in.nextLine();
		Person player1 = new Person(userName, 0, 0);
		String p1Name = player1.getUserName();
		
		building[0][0].enterRoom(player1); //Player always starts at 0,0.
		
		System.out.println("\nWelcome, " + p1Name + "!\n");
		System.out.println("You entered the mouth and is on the brink of being absorbed! YAY :)\n"
				+ "Go through all of the ogans and gather letters to find the missing word.\n"
				+ "The missing word will allow you to escape through the Bladder at the last row and last column.\n"
				+ "Correct answers to the trivia questions will gain you letters! Incorrect answers will surprise you with VOMIT POINTS\n"
				+ "Once you have reached 5 vomit points... GAME OVER, YOU GO BACK TO THE MOUTH AND VOMIT AHAHAHAH");
		
		System.out.println("\nWhere would you like to move? Use the 'W','A','S','D' keys :D");

		while(gameOn)  
		{	
			gb.printBoard();   
			String move = in.nextLine();
			
			if(validMove(move, player1, building))
			{
				System.out.println("\nYour coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
			}
			
			else {
				System.out.println("\nERROR! Please choose a valid move.");
			}
		}
		
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
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
			case "d":
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

			case "a":
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
				System.out.println("\nERROR! Please choose a valid move.");
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}