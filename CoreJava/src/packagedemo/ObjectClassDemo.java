package packagedemo;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :4:52:11 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		Person p1=new Person("Thrishul", 22);
		Person p2=new Person("Thrishul", 22);
		Person p3=new Person("chandu", 23);
		
		System.out.println("person1: "+p1.toString());
		System.out.println("person3: "+p3);
		
		System.out.println("person1 equals person2: "+p1.equals(p2));
		System.out.println("person2 equals person3: "+p2.equals(p3));
		
		System.out.println("person1 hashcode: "+p1.hashCode());
		System.out.println("person2 hashcode: "+p2.hashCode());
		System.out.println("person3 hashcode: "+p3.hashCode());
		
		System.out.println("class of person1 : "+p1.getClass().getName());

	}

}
