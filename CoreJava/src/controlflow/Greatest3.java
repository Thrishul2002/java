package controlflow;
/*
 * program to find greatest of 3 numbers using if-else-if
 */

import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if(a>b && a>c) {
			System.out.println(a+" is greater");
		}
		else if(b>c) {
			System.out.println(b+" is grater");
		}
		else if(a==b && b==c){
			System.out.println("all numbers are equal");
		}
		else {
			System.out.println(b+" is grater");
		}
		sc.close();

	}


}
