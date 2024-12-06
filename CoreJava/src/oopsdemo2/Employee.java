package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :10:16:11 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Employee {
	
	private int empId;
	private String name;
	private float basic;
	
	public Employee(int empId,String name,float basic) {
		this.empId=empId;
		this.name=name;
		this.basic=basic;
	}
	
	public void display() {
		
		System.out.println("**** Employee Info ****");
		System.out.println("Employee Id    :"+empId);
		System.out.println("Employee name  :"+name);
		System.out.println("Employee salary:"+basic);
		
	}

}
