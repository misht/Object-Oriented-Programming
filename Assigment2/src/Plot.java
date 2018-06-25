
public class Plot {
	
	private String name, latitude, longitude;
	private double area;
	private Building building;
	
	//Constructors
	public Plot(final String name, final String latitude, final String longitude, final double area) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.area = area;
	}
	
	public Plot(final String name, final String latitude, final String longitude, final double area, final Building building) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.area = area;
		this.building = building;
	}
	
	//Access methods
	public String getName() {
		return this.name;
	}
	
	public String getLatitude() {
		return this.latitude;
	}
	
	public String getLongitude() {
		return this.longitude;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public Building getBuilding() {
		return this.building;
	}
	
	//Setup methods
	public void setName(final String name) {
		this.name = name;
	}
	
	public void setLatitude(final String latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(final String longitude) {
		this.longitude = longitude;
	}
	
	public void setArea(final double area) {
		this.area = area;
	}
	
	public void setBuilding(final Building building) {
		this.building = building;
	}

	public String toString() {
		return "Name: " + this.name + "\nLatitude: " + this.latitude + "\nLongitude: " + this.longitude + "\nArea: " + this.area;
	}
}
