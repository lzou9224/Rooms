
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
	    
	 public printBoard(int size)
	 {
		 
	 }

}
