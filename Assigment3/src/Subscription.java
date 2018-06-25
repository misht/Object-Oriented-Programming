
public class Subscription {
	
	private String journal_name, subscriber_name, delivery_address;
	private double monthly_price;
	
	public Subscription() {
		this.journal_name = "Cosmopolitan";
		this.subscriber_name = "Mike Johns";
		this.delivery_address = "Music Row, 18";
		this.monthly_price = 20.50;
		//System.out.println(this.toString());
	}
	
	public Subscription(String journal_name, String subscriber_name, String delivery_address, double monthly_price) {
		this.journal_name = journal_name;
		this.subscriber_name = subscriber_name;
		this.delivery_address = delivery_address;
		this.monthly_price = monthly_price;
	}
	
	public String getJournalName() {
		return this.journal_name;
	}
	
	public String getSubscriberName() {
		return this.subscriber_name;
	}
	
	public String getDeliveryAddress() {
		return this.delivery_address;
	}
	
	public double getMonthlyPrice() {
		return this.monthly_price;
	}
	
	public void setJournalName(String journal_name) {
		this.journal_name = journal_name;
	}
	
	public void setSubscriberName(String subscriber_name) {
		this.subscriber_name = subscriber_name;
	}
	
	public void setDeliveryAddress(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	
	public void setMonthlyPrice(double monthly_price) {
		this.monthly_price = monthly_price;
	}
	
	public void printInVoice() {
		System.out.print("Journal name: " + this.journal_name + "\nSubscriber's name: " + this.subscriber_name + 
				   "\nDelivery address: " + this.delivery_address + "\nMonthly price: " + this.monthly_price + "€");
	}
	
	public String toString() {
		return "Journal name: " + this.journal_name + "\nSubscriber's name: " + this.subscriber_name + 
			   "\nDelivery address: " + this.delivery_address + "\nMonthly price: " + this.monthly_price + "€";
	}

}
