package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :3:41:08 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(String name, double balance,double interestRate) {
		super(name, balance);
		this.balance=balance;
	}
	public double getInterestRate() {
		return interestRate;
	}

}
