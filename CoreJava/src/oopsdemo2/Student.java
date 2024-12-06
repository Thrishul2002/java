package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :9:55:17 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Student {
	private int rollno;
	private String name;
	
	private Address ad; //Entity reference -Aggregation: has-a relation
	
	public Student(int rollno, String name, Address ad) {
		this.rollno= rollno;
		this.name=name;
		this.ad=ad;
	}
	void display() {
		System.out.println("------ Student Details ------");
		System.out.println("Student id  :"+rollno);
		System.out.println("Student name:"+name);
		System.out.println("Address     :"+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
	}
}
