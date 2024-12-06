package assignments;

/**
* Author :Jeedipalli.Reddy
* Date   :27 Oct 2024
* Time   :6:34:57 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba1=new BankAccount("Thrishul","127z313",1200.0f);
		BankAccount ba2=new BankAccount("chandu","1238A1",1500.0f);
		 
		 ba1.balance();
		 ba1.deposit(200);
		 ba1.withdrawl(500);
		 ba1.balance();
		 
		 ba2.deposit(1000);
		 ba2.balance();
		 ba2.withdrawl(700);
		 
		 
		
		

	}

}
