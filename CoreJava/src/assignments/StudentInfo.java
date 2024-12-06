package assignments;

//import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :27 Oct 2024
* Time   :3:50:27 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class StudentInfo {
	private String name;
	private int year;
	//private float salary;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	public void Display() {
		//System.out.println("************* employee Details *************");
		System.out.println(this.getName()+"  "+this.getYear()+"  "+this.getAddress());
	}
	
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", year=" + year + ", address=" + address + "]";
	}
	
}
	
	
