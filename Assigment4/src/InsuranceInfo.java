
public class InsuranceInfo {
	
	private Property property;
	private double insuredValue;
	
	public InsuranceInfo() {
		this.property = new Property();
		this.insuredValue = 15000.00;
	}
	
	public InsuranceInfo(Property property, double insuredValue) {
		this.property = property;
		this.insuredValue = insuredValue;
	}
	
	public InsuranceInfo(String type, String location, double insuredValue) {
		this.property = new Property(type, location);
		this.insuredValue = insuredValue;
	}
	
	public Property getProperty() {
		return this.property;
	}
	
	public double getInsuredValue() {
		return this.insuredValue;
	}
	
	public void setProperty(Property property) {
		this.property = property;
	}
	
	public void setInsuredValue(double insuredValue) {
		this.insuredValue = insuredValue;
	}
	
	public String toString() {
		return "\nProperty: " + this.property.toString() + "\nInsured value: " + this.insuredValue + "€";
	}
}
