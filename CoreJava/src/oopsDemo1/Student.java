package oopsDemo1;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :25 Oct 2024
* Time   :4:12:25 pm
* Email  :Jeedipalli.Reddy@coforge.com
* program to create a instance class and define state and behavior
* Instance -encapsulation
*/

public class Student {

	private int rollnumber;
	private String firstName,lastName;
	private float[] marks=new float[5];
	private float total;
	
	Scanner sc= new Scanner(System.in);
	
	public void inputStudentDetails() {
		
		System.out.println("Enter RollNumber:");
		rollnumber=sc.nextInt();
		System.out.println("Enter firstname,Lastname:");
		firstName=sc.next();
		lastName=sc.next();
		System.out.println("Enter marks of 5 subjects:");
		for (int i = 0; i < marks.length; i++) {
			marks[i]=sc.nextFloat();
		}
	}
	
	public float calculationMarks() {
		for (int i = 0; i < marks.length; i++) {
			total+=marks[i];
		}
		return total;
	}
	public void Display() {
		System.out.println("**** Student Details ****");
		System.out.println("RollNumber  :"+rollnumber);
		System.out.println("student Name:"+firstName+" "+lastName);
		System.out.println("Total marks :"+total);
		
	}
	
	
		

	}


