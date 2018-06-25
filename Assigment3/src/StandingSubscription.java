
public class StandingSubscription extends Subscription{
	
	private int subscription_discount;
	
	public StandingSubscription() {
		super();
		this.subscription_discount = 20;
	}

	public StandingSubscription(String journal_name, String subscriber_name, String delivery_address, double monthly_price, int subscription_discount) {
		super(journal_name, subscriber_name, delivery_address, monthly_price);
		this.subscription_discount = subscription_discount;
	}

	public int getSubscriptionDiscount() {
		return this.subscription_discount;
	}
	
	public void setSubcriptionDiscount(int subscription_discount) {
		this.subscription_discount = subscription_discount;
	}
	
	public double price() {
		double total = 0, aux;
		
		aux = this.getMonthlyPrice() * ((double)this.subscription_discount / 100);
		total = (this.getMonthlyPrice() - aux) * 12;
		
		return total;
	}
	
	public void printInVoice() {
		System.out.println();
		System.out.println("Order type: Standing subscription");
		super.printInVoice();
		System.out.println("\nSubscription discount: " + this.subscription_discount + "\nNumber of invoiced months: 12 months" + "\nOrder price: " + this.price() + "€\n");
		
	}
	
	public String toString() {
		return super.toString() + "\nSubscription discount: " + this.subscription_discount;
	}
}