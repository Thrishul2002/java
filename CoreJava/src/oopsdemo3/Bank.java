package oopsdemo3;

/**
 * Author :Jeedipalli.Reddy
 * Date   :29 Oct 2024
 * Time   :2:31:47 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 * Overriding is a feature that allows a subclass or
   child class to provide a specific implementation of a method
   that is already provided by one of its super-classes or parent classes.
 */

public class Bank {
	private String name;

	public Bank(String name) {
		this.name = name;
	}
	int getRateofInterest() {
		return 0;
	}
	void display() {
		System.out.println("welcome to "+name+" bank");
	}
	
}
class SBI extends Bank{

	public SBI(String name) {
		super(name);
		// TODO Auto-generated constructor stub	
	}

	@Override
	int getRateofInterest() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}
class Axis extends SBI{

	public Axis(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getRateofInterest() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}
class ICICI extends Axis{

	public ICICI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getRateofInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}

