
import Blood.blood;

public class Board {
	private Blood[][] schoolMap;

	public Board(Blood[][] schoolMap)
	    {
	        this.schoolMap = schoolMap;
	    }

	    public void printMap()
	    {

	        for(Blood[] row : schoolMap)
	        {
	            for (Blood room : row)
	            {
	                room.print();
	            }
	            System.out.println();
	        }
	    }
	    public Blood[][] getSchoolMap() {
	        return schoolMap;
	    }

	    public void setSchoolMap(Blood[][] schoolMap) {
	        this.schoolMap = schoolMap;
	    }

}
