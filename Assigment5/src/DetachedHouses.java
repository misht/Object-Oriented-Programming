
public class DetachedHouses extends Building{
	
	public DetachedHouses(int dwellingsNumber, int rooms, double dwellingsArea, Resident resident) {
		super(dwellingsNumber, rooms, dwellingsArea, resident);
	}
	
	public DetachedHouses(int dwellingsNumber, int rooms, double dwellingsArea, String resident) {
		super(dwellingsNumber, rooms, dwellingsArea, resident);
	}
	
	public String toString() {
		return "\nType of building: Detached houses" + super.toString();
	}
}
