package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :10:25:30 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Developer extends Employee {
	
	private String tech;

	public Developer(int empId, String name, float basic,String tech) {
		super(empId, name, basic);
		this.tech=tech;
	}
	public void displayDeveloperDetails() {
		
		System.out.println("technology:  "+tech);
	}

}
