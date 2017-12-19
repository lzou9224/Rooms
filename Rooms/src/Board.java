
public class Board {
	private Blood[][] BodyMap;

	public Board(Blood[][] BodyMap)
	    {
	        this.BodyMap = BodyMap;
	    }   

	    public void printMap()
	    {

	        for(Blood[] row : BodyMap)
	        {
	            for (Blood room : row)
	            {
	                room.print();
	            }
	            System.out.println();
	        }
	    }
	    public Blood[][] getBodyMap() {
	        return BodyMap;
	    }

	    public void setBodyMap(Blood[][] bodyMap) {
	        this.BodyMap = bodyMap;
	    }
	    
	 public void printBoard()
	 {
		 for(int x=0; x< rooms.length; x++)
		 {
			 for( int y=0; y<rooms[x].length; y++])
			 {
				 System.out.println
		 }
	 }
		   {System.out.print(rooms[i][j]);
			  
		   }
			 System.out.println();
	 }

}
