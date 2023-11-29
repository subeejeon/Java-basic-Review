package review03Java;

public class SavingsAccout extends Account {
	double interestRate;

	//Constructor
	SavingsAccout(int accountNumber, double balance, double interestRate) {
	// ** super
	super(accountNumber,balance); 
	this.interestRate = interestRate;	
	}

	@Override
	public String toString() {
	return super.toString() + " " + this.interestRate;
	}
}