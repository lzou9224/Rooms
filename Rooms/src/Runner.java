//Lingli Zou
//Lily Li
//Alyssa Ma
//**Text-Based Adventure Project: Donde estas el agua?

//IF TIME: ADD clear console, 

import java.util.Scanner;

public class Runner {

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[5][5];
		Board gb = new Board(building);
		boolean explored = false;
		Person occupants = null;
		int vomitPts = 1;
		Bladder bladder;
		Esophagus esophagus;
		Intestines intestines;
		Kidneys kidneys;
		Liver liver;
		
		//Fill the building with normal rooms
		for (int x = 0; x < building.length; x++)
		{
			Room[] row = building[x];
			for (int y = 0; y < row.length; y++)
			{	
				row[y] = new Room(x,y, occupants,explored,vomitPts);
			}
		}

		 //Setup player 1 and the input scanner
		Scanner in = new Scanner(System.in); //initialize a scanner
		
		//obtain Username from the player
		System.out.println("Welcome to 'DONDE ESTAS EL AGUA?'\nPlease enter your Username: ");
		String userName = in.nextLine();
		Person player1 = new Person(userName, 0, 0);
		String p1Name = player1.getUserName();
		
		building[0][0].enterRoom(player1); //Player always starts at 0,0.
		
		System.out.println("\nWelcome, " + p1Name + "!\n");
		//game mission
		System.out.println("You entered the mouth and is on the brink of being absorbed! YAY :)\n"
				+ "Go through all of the organs and gather letters to find the missing word.\n"
				+ "The missing word will allow you to escape through the Bladder at the last row and last column.\n"
				+ "Correct answers to the trivia questions will gain you letters! Incorrect answers will surprise you with VOMIT POINTS\n"
				+ "Once you have reached 5 vomit points... GAME OVER, YOU GO BACK TO THE MOUTH AND VOMIT AHAHAHAH");
		
		System.out.println("\nWhere would you like to move? Use the 'W','A','S','D' keys to move");
		System.out.println("\nYour location will be given by 'x' on the board\n");
		while(gameOn)  
		{	gb.printBoard(); 
			String move = in.nextLine();

			if(validMove(move, player1, building))
			{
				//if player inputs a valid move, then indicate whether the player entered a room
			
				//Esophagus
			    if(player1.getxLoc() == 4 && player1.getyLoc() == 1) {
					gb.printBoard(); 
			    	esophagus = new Esophagus(player1.getxLoc(), player1.getyLoc(), player1, gameOn,vomitPts);
					esophagus.enterRoom(player1);
					System.out.println("\n*You exit the room*");
				}
				//Intestines
				else if(player1.getxLoc() == 4 && player1.getyLoc() == 0) {
					gb.printBoard(); 
					intestines = new Intestines(player1.getxLoc(), player1.getyLoc(), player1, gameOn,vomitPts);
					intestines.enterRoom(player1);
					System.out.println("\n*You exit the room*");
				}
				//Kidney
				else if(player1.getxLoc() == 2 && player1.getyLoc() == 4) {
					gb.printBoard(); 
					kidneys = new Kidneys(player1.getxLoc(), player1.getyLoc(), player1, gameOn,vomitPts);
					kidneys.enterRoom(player1);
					System.out.println("\n*You exit the room*");
				}
				//Liver
				else if(player1.getxLoc() == 1 && player1.getyLoc() == 2) {
					gb.printBoard(); 
					liver = new Liver(player1.getxLoc(), player1.getyLoc(), player1, gameOn,vomitPts);
					liver.enterRoom(player1);
					System.out.println("\n*You exit the room*");
				}
				//Bladder
				else if(player1.getxLoc() == 4 && player1.getyLoc()==4) { 
					gb.printBoard(); 
					bladder = new Bladder(player1.getxLoc(), player1.getyLoc(), player1, gameOn,vomitPts);
					bladder.enterRoom(player1);
				}
				else {
					System.out.println("\nYour coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc() + "\nVomit Points = " + vomitPts);	
				}
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
	
	public static void leaveRoom()
	{
			gameOn = true;	
	}
		


}