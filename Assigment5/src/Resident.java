
public class Resident {
	
	private String name;
	
	public Resident() {
		this.name = "Mika Yliantila";
	}
	
	public Resident(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "\nName: " + this.name;
	}
}
