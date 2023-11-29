package review03Java;

import java.util.ArrayList;

public class Bank {
	// ** ArrayList
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	//Method : add accounts to ArrayList
	public void addAccount(Account account) {
	accounts.add(account);
	}
	// ** Method: calculates and return the total balance of all accounts in the bank.
	public double totalBalance() {
		double totalBalance = 0.0;
		for(Account account : accounts ) {
			totalBalance += account.getBalance();
//			System.out.println(totalBalance);
		}
		return totalBalance;
	} 
}