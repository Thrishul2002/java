package assignments;

import java.util.Scanner;

//import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :27 Oct 2024
* Time   :4:03:07 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class StudentInfoTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		StudentInfo s1=new StudentInfo();
		
		System.out.println("name,year of joining ,address: ");
		String name=scanner.nextLine();
		int year=scanner.nextInt();
		scanner.nextLine();
		String address=scanner.nextLine();
		
		s1.setName(name);
		s1.setYear(year);
		s1.setAddress(address);
		
		StudentInfo s2=new StudentInfo();
		
		System.out.println("name,year of joining ,address: ");
		String Name=scanner.nextLine();
		int Year=scanner.nextInt();
		scanner.nextLine();
		String Address=scanner.nextLine();
		
		s2.setName(Name);
		s2.setYear(Year);
		s2.setAddress(Address);
		
		StudentInfo s3=new StudentInfo();
		
		System.out.println("name,year of joining,address ");
		s3.setName(scanner.next());
		s3.setYear(scanner.nextInt());
		scanner.nextLine();
		s3.setAddress(scanner.nextLine());
		scanner.close();
		
		
		
		s1.Display();
		
		
		s2.Display();
		
		
		s3.Display();
		

	}

}
