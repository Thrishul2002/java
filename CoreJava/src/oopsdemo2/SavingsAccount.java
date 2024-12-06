package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :12:06:40 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class SavingsAccount extends Account {
	
	private float minimumBalance;
	protected double balance;

	public SavingsAccount(int accountNumber, String name,float minimumBalance,double balance) {
		super(accountNumber, name);
		this.minimumBalance=minimumBalance;
		this.balance=balance;
	}
	
	public void display() {
		super.display();
		System.out.println("Minimum Balance         :"+minimumBalance);
        System.out.println("Savings Account Balance :"+balance);
	}
}
