
public class TerracedHouses extends Building{

	public TerracedHouses(int dwellingsNumber, int rooms, double dwellingsArea, Resident resident) {
		super(dwellingsNumber, rooms, dwellingsArea, resident);
	}
	
	public TerracedHouses(int dwellingsNumber, int rooms, double dwellingsArea, String resident) {
		super(dwellingsNumber, rooms, dwellingsArea, resident);
	} 
	
	public String toString() {
		return "\nType of building: Terraced houses" + super.toString();
	}
}
