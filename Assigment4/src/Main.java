import java.util.Scanner;

public class Main {
	
	private static Scanner read = new Scanner(System.in);
	private static InsInfoContainer insInfoContainer = new InsInfoContainer();
	
	public static void storeInsuranceInfo() {
		InsuranceInfo insuranceInfo;
		String type, location, key = "-1";
		double insuredValue;
		
		while (!key.equals("0")) {
			System.out.print("\nIntroduce type: ");
			type = read.nextLine();
			System.out.print("Introduce location: ");
			location = read.nextLine();
			System.out.print("Introduce insured value: ");
			insuredValue = read.nextDouble();
			read.nextLine();
			insuranceInfo = new InsuranceInfo(type, location, insuredValue);
			insInfoContainer.insert(insuranceInfo);
			System.out.print("Do you want to stop? (Type 0 otherwise press enter): ");
			key = read.nextLine();
		}
	}
	
	public static void menu() {
		int option = -1;
		
		while(true) {
			System.out.println("Please choose an option: ");
			System.out.println("1. Store insurance info.");
			System.out.println("2. Print all the content.");
			System.out.println("3. Print all the content greater than a value.");
			System.out.println("4. Print all the content lower than a value.");
			System.out.println("0. To exit.");
			System.out.print("Your option: ");
			option = read.nextInt();
			read.nextLine();
			switch(option) {
			case 0:
				System.out.println("Goodbye, have a good day!");
				return;
			case 1:
				storeInsuranceInfo(); 
				break;
			case 2:
				printElements();
				break;
			case 3:
				printGreater();
				break;
			case 4:
				printLower();
				break;
			default:
				System.out.println("This option is not available. Try again!");
				break;
			}
			System.out.println();
		}
	}
	
	public static void printGreater() {
		double value;
		
		if (emptyVector() == true) {
			System.out.print("Introduce a value: ");
			value = read.nextDouble();
			System.out.println("\nThe properties with insurance value greater than " + value + " are: ");
			insInfoContainer.printGreater(value);
		}
	}
	
	public static void printElements() {
		if (emptyVector() == true) {
			insInfoContainer.printElements();
		}
	}
	
	public static boolean emptyVector() {
		boolean content = false;
		
		if (insInfoContainer.getSize() == 0) {
			System.out.println("There is not content.");
			content = false;
		}else {
			content = true;
		}
		return content;
	}
	
	public static void printLower() {
		double value;
		
		if (emptyVector() == true) {
			System.out.print("Introduce an insurance value: ");
			value = read.nextDouble();
			System.out.println("The properties with insurance value lower than " + value + " are: ");
			insInfoContainer.printLower(value);
		}
	}
	
	public static void main(String[] args) {
		menu();
	}

}
