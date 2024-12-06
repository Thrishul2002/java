package oopsDemo1;

/**
* Author :Jeedipalli.Reddy
* Date   :26 Oct 2024
* Time   :2:36:11 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ConstructurDemo {
	
	int id;
	String Name; float salary;
	
	
	public ConstructurDemo() {
		System.out.println("No-Argument/Implicit constructor");
		this.id=121;
		this.Name="Smith";this.salary=20000.00f;
	}
	
	
	public ConstructurDemo(int id, String name, float salary) {
		this.id = id;
		Name = name;
		this.salary = salary;
	}


	public void name() {
		System.out.println("Method ");
		System.out.println(this.id+" "+this.Name+" "+this.salary);
		System.out.println(id+" "+Name+" "+salary);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructurDemo cd1=new ConstructurDemo();
		cd1.name();
		
		ConstructurDemo cd2=new ConstructurDemo(123,"will",20300.00f);
		cd2.name();
	}

}
