package controlflow;

import java.util.Scanner;
/*
 * program to check whether number is single digit or not
 */
public class SingleDigit {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		num=sc.nextInt();
		//b=sc.nextInt();
		
		//System.out.println(a>b);
		if(num>-10 && num<10)
			System.out.println(num+" is single digit number");
		else
			System.out.println(num+" is not a single digit number");
		
		sc.close();

	}

}
