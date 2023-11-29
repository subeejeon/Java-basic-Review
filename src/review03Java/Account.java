package review03Java;

public class Account  {
	static int accountNumber;	
	double balance;

	//Constructor
	Account(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//Method: adds the specified amount to the balance.
	void deposit(double amount) {
		balance += amount ;
		System.out.println("Deposit is completed. Balance is : " + balance);
	}
	
	void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("Inefficient balance. Balance is:  " + balance);
			return;
		} else {
			balance -= amount;
			System.out.println("Withdraw is completed. Banlance is: " + balance);
		}
	}
	// ** Getter method for balance
	public double getBalance() {
		return balance;
	}
	
	//**toString method
	@Override
	public String toString() {
		return (this.accountNumber + " " + this.balance);
	}
}