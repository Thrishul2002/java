package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :4:59:33 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Student {
	private int rollno;
	private String name;
	private static String organization="VTU";
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public static void organizationChange() {
		organization="wipro";//can use only static variables in static method
	}
	public void display() {
		System.out.println(this.rollno+" "+this.name+" "+organization);
	}
}
