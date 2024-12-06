package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Java program to check if the user is eligible for a discount or not.
 * If the user's age is less than 18 or they are not a member, they are eligible for a discount.
 * Otherwise, they are not eligible for a discount.
 */
public class Discount {

	public static void main(String[] args) throws IOException {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		 String Name;
		 int age;
		 boolean isMember;
		 System.out.println("Enter Name:");
		 Name=br.readLine();
		 System.out.println("Enter age:");
		 age=Integer.parseInt(br.readLine());
		 System.out.println("are u a Member?:(yes/no)");
		 isMember=Boolean.parseBoolean(br.readLine());
		 
		 if(age<18 || !isMember) {
			 System.out.println(Name+" is eligible for discount");
		 }
		 else {
			 System.out.println(Name+" is not eligible for discount");
		 }

	}

}
