package oopsdemo3;

/**
 * Author :Jeedipalli.Reddy
 * Date   :29 Oct 2024
 * Time   :3:37:45 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class Account {
	private String name;
	protected double balance;
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	//final methods cannot be overridden
	public final void deposit(double amt){
		balance+=amt;
		System.out.println("Depositing : "+amt);
	}

	//Overridden Method
	public void withdraw(double amt){
		balance-=amt;
		System.out.println("Withdrawing :"+amt);
	}


}
