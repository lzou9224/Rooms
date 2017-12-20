
public class Board {
	private Room[][] BodyMap;

	public Board(Room[][] BodyMap)
	    {
	        this.BodyMap = BodyMap;
	    }   

	    public void printMap()
	    {

	        for(Room[] row : BodyMap)
	        {
	            for (Room room : row)
	            {
	                room.print();
	            }
	            System.out.println();
	        }
	    }
	    public Room[][] getBodyMap() {
	        return BodyMap;
	    }

	    public void setBodyMap(Room[][] bodyMap) {
	        this.BodyMap = bodyMap;
	    }

	 public void printBoard()
	 {
		 for(int x=0; x<Room.length; x++)
		 {
			 for( int y=0; y<BodyMap[x].length; y++)
			 {
				 System.out.println();

	 }
		 }
	 }
}
