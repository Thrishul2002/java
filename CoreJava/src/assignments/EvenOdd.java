package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :9:53:30 pm
* Email  :Jeedipalli.Reddy@gmail.com
* Program to find odd or even
*/

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("given numberis even");
		}
		else {
			System.out.println("given numberis odd");
		}
		
		sc.close();

	}

}
