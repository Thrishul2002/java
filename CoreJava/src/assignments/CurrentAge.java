package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :9:35:41 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to find current age from birth year
*/

public class CurrentAge {

	public static void main(String[] args) {
		
		int BirthYear,CurrentYear=2024,CurrentAge;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter Birth-Year:");
		BirthYear=scan.nextInt();
		
		CurrentAge=CurrentYear-BirthYear;
		
		System.out.println("Current age is: "+CurrentAge);
		scan.close();
	}

}
