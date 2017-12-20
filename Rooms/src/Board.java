
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
		 for(int x=0; x<Blood.length; x++)
		 {
			 for( int y=0; y<Blood[x].length; y++])
			 {
				 System.out.println();

	 }
		 }
	 }
}
