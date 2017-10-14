package lab6;
import java.util.Date;

public class Account {

	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000);
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.println("The current balance is $" + account1.getBalance());
		System.out.println("The monthly interest is $" 
			+ account1.getMonthlyInterest());
		System.out.println("The account was created on " + account1.getDateCreated());

	}
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated.setTime(0);
	}
	
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		annualInterestRate = 0;
		dateCreated.setTime(System.currentTimeMillis());
	}
	
	private void setId(int newId) {
		id = newId;
	}
	
	private int getId() {
		return id;
	}
	
	private void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	private double getBalance() {
		return balance;
	}
	
	private void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	private double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	private Date getDateCreated() {
		return dateCreated;
	}
	
	private double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}

	private double getMonthlyInterest() {
		return (balance * this.getMonthlyInterestRate() / 100);
	}
	
	private void withdraw(double withdrawal) {
		balance -= withdrawal;
	}
	
	private void deposit(double deposit) {
		balance += deposit;
	}
}
