
public class Bankaccount {
	private double balance;
	private String currency;
	private static int counter;
	
	public Bankaccount() {
		balance = 0;
		currency = "TL";
		counter++;
	}
	
	public Bankaccount(double b, String c) {
		balance = b;
		currency = c;
		counter++;
	}
	
	public static int getcounter() {
		return counter;
	}
	
	
	public void display() {
		System.out.println("Your balance is " + balance + " " + currency);
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		if (amount > balance) {
			System.out.println("The amount you requested is greater than your current balance");
		}
		else {
			balance -= amount;
		}
	}
	
	public void changecurr (String c) {
		if (c == "$") {
			if (currency == "$") {
				System.out.println("Your balance is already in US dollars");
			}
			else {
				balance = balance / 6;
				currency = c;
			}
		}
		else if (c == "TL") {
			if (currency == "TL") {
				System.out.println("Your balance is already in Turkish liras");
			}
			else {
				balance = balance * 6;
				currency = c;
			}
		}
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double b) {
		balance = b;
	}
	
	public String toString() {
		return "Your balance is " + balance + " " + currency;
	}
}
