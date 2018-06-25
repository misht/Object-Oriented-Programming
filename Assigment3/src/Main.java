import java.util.Scanner;

public class Main {
	
	private static Scanner read = new Scanner(System.in);
	
	public static void printSubscriptionInvoice(Subscription sub) {
		sub.printInVoice();
	}
	
	public static void informationUser() {
		String journal_name, subscriber_name, delivery_address, order;
		double monthly_price;
		int subscription_discount, subscription_rate;
		Subscription sub;
		
		System.out.println("Please, introduce the following data: ");
		System.out.print("Journal's name: ");
		journal_name = read.nextLine();
		System.out.print("Subscriber's name: ");
		subscriber_name = read.nextLine();
		System.out.print("Delivery address: ");
		delivery_address = read.nextLine();
		System.out.print("Monthly price: ");
		monthly_price = read.nextDouble();
		read.nextLine();
		System.out.print("Type of order (regular or standing): ");
		order = read.nextLine();
		if(order.equalsIgnoreCase("regular")) {
			System.out.print("Number of invoiced months (up to 12): ");
			subscription_rate = read.nextInt();
			while(subscription_rate <= 0 || subscription_rate > 12) {
				System.out.print("Number of invoiced months (up to 12): ");
				subscription_rate = read.nextInt();
			}
			sub = new RegularSubscription(journal_name, subscriber_name, delivery_address, monthly_price, subscription_rate);
		}else {
			System.out.print("Subscription discount: ");
			subscription_discount = read.nextInt();
			sub = new StandingSubscription(journal_name, subscriber_name, delivery_address, monthly_price, subscription_discount);
		}
		printSubscriptionInvoice(sub);
	}
	
	public static void menu() {
		int op = 1;
		
		while(true) {
			System.out.println("Welcome! What do you want to do? ");
			System.out.println("1. Make a subscription.");
			System.out.println("0. Exit.");
			System.out.print("Introduce an option: ");
			op = read.nextInt();
			read.nextLine();
			if(op == 1) {
				System.out.println();
				informationUser();
			}else if (op == 0){
				System.out.println("Goodbye. Have a nice day!");
				break;
			}else {
				System.err.println("This option is not posible. Choose another option.");
			}
		}
	}
	
	public static void main(String[] args) {
		menu();
	}

}
