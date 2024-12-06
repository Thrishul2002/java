package arraysdemo;

import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :25 Oct 2024
 * Time   :12:04:46 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 * Program to enter elements into Array & Display it
 */

public class ArrayInputOutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Array declaration
		int[] age =new int[10];
		Scanner scanner=new Scanner(System.in);

		//Array input
		System.out.println("Enter 10 Student's Age :");
		for (int i = 0; i < age.length; i++) {
			age[i]=scanner.nextInt();
		}

		//Process age to check they are eligible to vote or not
		for (int i = 0; i < age.length; i++) {
			if(age[i] >=18) {
				System.out.println(age[i]+" is Eligible");
			}
			else
				System.out.println(age[i]+" is not Eligible");
		}

		//Output
		System.out.println("Age Array Contents are : ");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i]+"\t");
		}
		scanner.close();

	}

}
