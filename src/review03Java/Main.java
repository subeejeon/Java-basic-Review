package review03Java;

public class Main {
	public static void main(String[] args) {
		//Create Objects
		Account account = new Account(123, 500);
		Account account2 = new Account(456, 900);
		SavingsAccout savingsAccount = new SavingsAccout(123,500,2.0);
		
		//Demonstrate the deposit, withdrawal, and display functionality for both account types.
		account.deposit(300);
		account.withdraw(1000);
		System.out.println(account);	
		System.out.println(savingsAccount);	

		// a Bank instance
		Bank bank = new Bank();
		bank.addAccount(account);
		bank.addAccount(account2);

		//Call getTotal from Bank class
		System.out.println("Total Balance in the bank: " + 
		bank.totalBalance());
	}	
}