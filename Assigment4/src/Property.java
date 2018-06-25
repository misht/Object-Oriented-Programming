
public class Property {
	
	private String type, location;
	
	public Property() {
		this.type = "Apartment";
		this.location = "Oulu, Finland";
	}

	public Property(String type, String location) {
		this.type = type;
		this.location = location;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return "\nType : " + this.type + "\nLocation: " + this.location;
	}
}
