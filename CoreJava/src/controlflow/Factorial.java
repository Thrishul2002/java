package controlflow;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :5:07:22 pm
* Email  :Jeedipalli.Reddy@gmail.com
* Factorial Number
* Program to find Factorial of a Number 1 + 1 * 2 * 3 * .... * n
*/

public class Factorial {

	public static void main(String[] args) {
		
		int n,fact=1,i;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a Number : ");
			n=scan.nextInt();
			
			if(n > 0) {
				//Loop to find factorial
				for(i=1;i<=n;i++) {
					fact =fact *i;
				}
				
				System.out.println("The Factorial of "+n+" is : "+fact);
				
				}
			else {
				System.out.println("Please Enter Value greater Than Zero");
			}

			scan.close();
		}
	}

}
