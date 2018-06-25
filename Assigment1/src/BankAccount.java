public class BankAccount {
	
	private String accountNumber;
	private String accountOwner;
	private double balance;
	
	public BankAccount() {
		this.accountNumber = "FI2112345600000785";
		this.accountOwner = "Hena Yliantila";
		this.balance = 750.00;
		System.out.println(this.toString());
	}
	
	public BankAccount(final String accountNumber, final String accountOwner, final double balance) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		if (balance >= 0) {
			this.balance = balance;
		}
		System.out.println(this.toString());
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getAccountOwner() {
		return this.accountOwner;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setAccountNumber(final String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccountOwner(final String accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	public void setBalance(final Double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
	}
	
	public String deposit(double money) {
		if(money >= 0) {
			this.balance = this.balance + money;
			return this.toString();
		}else {
			return "You cannot deposit a negative value.";
		}
	}
	
	public String withdraw(double money) {
		if (money < 0) {
			return "You cannot withdraw a negative value.";
		}else if(money > this.balance) {
			return "You cannot withdraw more money than you have.";
		}else {
			this.balance = this.balance - money;
			return this.toString();
		}
	}

	public String toString() {
		return "\nAccount number: " + this.accountNumber + "\nAccount owner: " + this.accountOwner + "\nBalance: " + this.balance + "€";
	}
}
