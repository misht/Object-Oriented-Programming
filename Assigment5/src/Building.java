
public class Building {
	
	private int dwellingsNumber, rooms;
	private double dwellingsArea;
	private Resident resident;
	
	public Building() {
		this.dwellingsNumber = 5;
		this.rooms = 4;
		this.dwellingsArea = 90.0;
		this.resident = new Resident();
	}
	
	public Building(int dwellingsNumber, int rooms, double dwellingsArea, Resident resident) {
		this.dwellingsNumber = dwellingsNumber;
		this.rooms = rooms;
		this.dwellingsArea = dwellingsArea;
		this.resident = resident;
	}
	
	public Building(int dwellingsNumber, int rooms, double dwellingsArea, String residentName) {
		this.dwellingsNumber = dwellingsNumber;
		this.rooms = rooms;
		this.dwellingsArea = dwellingsArea;
		this.resident = new Resident(residentName);
	}
	
	public int getDwellingsNumber() {
		return this.dwellingsNumber;
	}
	
	public int getRooms() {
		return this.rooms;
	}
	
	public double getDwellingsArea() {
		return this.dwellingsArea;
	}

	public Resident getResident() {
		return this.resident;
	}
	
	public void setDwellingsNumber(int dwellingsArea) {
		this.dwellingsNumber = dwellingsArea;
	}
	
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public void setDwellingsArea(double dwellingsArea) {
		this.dwellingsArea = dwellingsArea;
	}
	
	public void setResident(Resident resident) {
		this.resident = resident;
	}
	
	public String toString() {
		return "\nDwellings number: " + this.dwellingsNumber + "\nDwellings area: " + this.dwellingsArea + " m²\nRooms:" + this.rooms + "\nResident Information:" + this.resident;
	}
}
