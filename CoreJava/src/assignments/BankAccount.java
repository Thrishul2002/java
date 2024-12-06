package assignments;

/**
* Author :Jeedipalli.Reddy
* Date   :27 Oct 2024
* Time   :6:16:01 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class BankAccount {
	private String AccountHolder;
	private String AccountNumber;
	private float balance;
	
	public BankAccount(String accountHolder,String accountNumber,float balance) 
	{
		this.setAccountHolder(accountHolder);
		this.setAccountNumber(accountNumber);
		this.balance=balance;
	}
	public void deposit(float Amount) {
		this.balance+=Amount;
		System.out.println("Balance after deposit is: "+this.balance);
	}
	public void withdrawl(float Amount) {
		
		if(Amount>0&&balance>Amount) 
			this.balance-=Amount;
		System.out.println("Balance after withdrawl is: "+this.balance);
		
	}
	
	public void balance() {
		//this.balance+=Amount;
		System.out.println("current balance is: "+this.balance);
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
}
