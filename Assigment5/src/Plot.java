
public class Plot {
	
	private String name, address;
	private double area;
	private Building building;
	
	public Plot() {
		this.name = "The Lake";
		this.address = "Oulu, Finland";
		this.area = 25000.50;
		this.building = new Building();
	}
	
	public Plot(String name, String address, double area, Building building) {
		this.name = name;
		this.address = address;
		this.area = area;
		this.building = building;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public Building getBuilding() {
		return this.building;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
	
	public String toString() {
		return "\nPlot information: " + "\nName: " + this.name + "\nAddress: " + this.address + "\nArea: " + this.area + " m²\nBuilding information: "  + this.building.toString();
	}
}
