
public class Board {
	private static Room[][] bodyMap;
	
	public Board(Room[][] bodyMap)
    {
        Board.bodyMap = bodyMap;
    }   

	 public void printBoard()
	 {
		 for(Room[] i : bodyMap)
		 {
			 for(Room j : i)
			 {
				 j.print();
			 }
			 System.out.println();
		 }
	 }
}
