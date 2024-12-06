package oopsdemo4;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :11:32:40 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public abstract class Training {
	private String name;
	private String address;
	private int number;
	public Training(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Training [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	public abstract double calculateMarks();
		
	
}
