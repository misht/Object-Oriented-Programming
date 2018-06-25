
public class BlockOfFlats extends Building{

	public BlockOfFlats(int dwellingsNumber, int rooms, double dwellingsArea, Resident resident) {
		super(dwellingsNumber, rooms, dwellingsArea, resident);
	}
	
	public BlockOfFlats(int dwellingsNumber, int rooms, double dwellingsArea, String resident) {
		super(dwellingsNumber, rooms, dwellingsArea, resident);
	}
	
	public String toString() {
		return "\nType of building: Block of flats" + super.toString();
	}
}
