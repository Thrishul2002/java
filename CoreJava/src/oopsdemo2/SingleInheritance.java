package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :10:34:08 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class SingleInheritance {

	public static void main(String[] args) {
		
		Developer d1=new Developer(121, "harsha", 25000, "java");
		Developer d2=new Developer(123, "ajay", 20000, "tester");
		Developer d3=new Developer(123, "teja", 30000, "java FSD");
		 
		d1.display();
		d1.displayDeveloperDetails();
		d2.display();
		d2.displayDeveloperDetails();
		d3.display();
		d3.displayDeveloperDetails();
		//parent class object
		Employee e1=new Employee(1212, "chandu", 15000);
		Employee e2=new Employee(1213, "yeswanth", 18000);
		
		e1.display();
		e2.display();
		

	}

}
