package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :9:55:19 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to print grade
*/

public class Grade {

	public static void main(String[] args) {
		
		float Marks;
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("Enter your marks: ");
		Marks=scan.nextFloat();
		
		if(Marks>=90.00f && Marks<=100.00f)
			System.out.println("your grade is 'A'");
		else if(Marks>=80 && Marks<90)
			System.out.println("your grade is 'B'");
		else if(Marks>=70 && Marks<=80)
			System.out.println("your grade is 'C'");
		else if(Marks>=60 && Marks<=70)
			System.out.println("your grade is 'D'");
		else
			System.out.println("your grade is 'F'");
		scan.close();

	}

}
