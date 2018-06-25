
public class Resident {

	private String name, birthDate;
	
	//Constructor
	public Resident(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	//Access methods
	public String getName() {
		return this.name;
	}
	
	public String getBirthDate() {
		return this.birthDate;
	}
	
	//Setup methods
	public void setName(final String name) {
		this.name = name;
	}
	
	public void setBirthDate(final String birthDate) {
		this.birthDate =  birthDate;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nBirthdate: " + this.birthDate;
	}

}
