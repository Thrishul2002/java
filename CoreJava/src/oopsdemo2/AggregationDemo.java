package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :10:09:23 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad1=new Address("Bengaluru","Karnataka",566016,"India");
		Address ad2=new Address("Hyderabad","Telangana",500016,"India");
		
		Student s1=new Student(121, "Ramu", ad1);
		Student s2=new Student(201, "Raja", ad2);
		
		s1.display();
		s2.display();
		

	}

}
