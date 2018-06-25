import java.util.Vector;

public class InsInfoContainer {
	
	private Vector<InsuranceInfo> insInfoContainer;
	
	public InsInfoContainer() {
		this.insInfoContainer = new Vector<InsuranceInfo>();
	}
	
	public Vector<InsuranceInfo> getVector() {
		return this.insInfoContainer;
	}
	
	public void setVector(Vector<InsuranceInfo> insInfoContainer) {
		this.insInfoContainer = insInfoContainer;
	}
	
	public int getSize() {
		return this.insInfoContainer.size();
	}
	
	public void insert(InsuranceInfo insuranceInfo) {
		this.insInfoContainer.addElement(insuranceInfo);
	}
	
	public void printElements() {
		for(int i = 0; i < this.insInfoContainer.size(); i++) {
			System.out.println(this.insInfoContainer.get(i));
		}
	}
	
	public void printGreater(double boundary) {
		for(int i = 0; i < this.insInfoContainer.size(); i++) {
			if(this.insInfoContainer.get(i).getInsuredValue() > boundary) {
				System.out.println(this.insInfoContainer.get(i));
			}
		}
	}
	
	public void printLower(double boundary) {
		for(int i = 0; i < this.insInfoContainer.size(); i++) {
			if(this.insInfoContainer.get(i).getInsuredValue() < boundary) {
				System.out.println(this.insInfoContainer.get(i));
			}
		}
	}
}
