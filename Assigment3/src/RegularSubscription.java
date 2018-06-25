
public class RegularSubscription extends Subscription{

	private int subscription_rate;
	
	public RegularSubscription() {
		super();
		this.subscription_rate = 3;
	}
	
	public RegularSubscription(String journal_name, String subscriber_name, String delivery_address, double monthly_price, int subscription_rate) {
		super(journal_name, subscriber_name, delivery_address, monthly_price);
		this.subscription_rate = subscription_rate;
	}

	public int getSubscriptionRate() {
		return this.subscription_rate;
	}
	
	public void setSubscriptionRate(int subscription_rate) {
		this.subscription_rate = subscription_rate;
	}
	
	public double price() {
		double total = 0;
		
		total = this.getMonthlyPrice() * (double) this.subscription_rate;
		
		return total;
	}
	
	public void printInVoice() {
		System.out.println();
		System.out.println("Order type: Regular subscription");
		super.printInVoice();
		System.out.println("\nSubscription rate: " + this.subscription_rate  + " months\nOrder price: " + this.price() + "€\n");
	}
	
	public String toString() {
		return super.toString() + "\nSubscription rate: " + this.subscription_rate;
	}
}
