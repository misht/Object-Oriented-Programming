import java.util.Scanner;

public class BankAccountMain {
	
	static Scanner read = new Scanner(System.in);
			
	public static BankAccount createBankAccount() {
		String numberAccount, ownerAccount;
		double balance;
		
		System.out.println("Please enter the following data: ");
		System.out.print("Owner's account: ");
		ownerAccount = read.nextLine();
		System.out.print("Number account: ");
		numberAccount= read.nextLine();
		System.out.print("Balance: ");
		balance = read.nextDouble();
		read.nextLine();
		
		BankAccount ba = new BankAccount(numberAccount, ownerAccount, balance);
		return ba;
	}

	public static void withdraw(BankAccount ba) {
		double money = -1;
		
		while((money < 0) || (money > ba.getBalance())) {
			System.out.println("Please enter the amount of money you want to withdraw: ");
			money = read.nextDouble();
			System.out.println(ba.withdraw(money));
		}
	}
	
	public static void deposit(BankAccount ba) {
		double money = -1;
		
		while((money < 0)) {
			System.out.println("Please enter the amount of money you want to deposit: ");
			money = read.nextDouble();
			System.out.println(ba.deposit(money));
		}
	}
	
	public static void menu(BankAccount ba) {
		int n = 1;
		
		System.out.println("Welcome " + ba.getAccountOwner() + ". What do you want to do?");
		while (true) {
			System.out.println("1. Withdraw.");
			System.out.println("2. Deposit.");
			System.out.println("3. To exit.");
			System.out.print("Enter an option: ");
			n = read.nextInt();
			read.nextLine();
			if(n == 1) {
				withdraw(ba);
			}else if (n == 2){
				deposit(ba);
			}else if (n == 3){
				System.out.println("Goodbye " + ba.getAccountOwner() + ". Have a nice day!");
				break;
			}else {
				System.err.println("This option is not posible. Choose another option.");
			}
		}
	}
	
	public static void main(String[] args) {
		BankAccount ba = createBankAccount();
		//BankAccount ba = new BankAccount();
		menu(ba);
		read.close();
	}
}
