
public class Building {

	private double area;
	private int numberRooms, houseOccupants;
	private Resident resident;
	
	//Constructors
	public Building(final double area, final int numberRooms, final int houseOccupants) {
		this.area = area;
		this.numberRooms = numberRooms;
		this.houseOccupants = houseOccupants;
	}
	
	public Building(final double area, final int numberRooms, final int houseOccupants, final Resident resident) {
		this.area = area;
		this.numberRooms = numberRooms;
		this.houseOccupants = houseOccupants;
		this.resident = resident;
	}
	
	//Access methods
	public double getArea() {
		return this.area;
	}
	
	public int getNumberRooms() {
		return this.numberRooms;
	}
	
	public int getHouseOccupants() {
		return this.houseOccupants;
	}
	
	public Resident getResident() {
		return this.resident;
	}
	
	//Setup methods
	public void setArea(final double area) {
		this.area = area;
	}
	
	public void setNumberRooms(final int numberRooms) {
		this.numberRooms = numberRooms;
	}
	
	public void setHouseOccupants(final int houseOccupants) {
		this.houseOccupants = houseOccupants;
	}
	
	public void setResidents(final Resident resident) {
		this.resident = resident;
	}
	
	public String toString() {
		return "Area: " + this.area + "\nNumber rooms: " + this.numberRooms + "\nHouse Occupants: " + this.houseOccupants; 
	}
}
