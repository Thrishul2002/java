package assignments;

import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :24 Oct 2024
 * Time   :9:06:10 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 * SWapping of two numbers without 3rd variable
 */

public class Swap2Numbers {

	public static void main(String[] args) {

		int n1,n2;
		Scanner scan=new Scanner(System.in);

		System.out.println("enter two numbers:");
		n1=scan.nextInt();
		n2=scan.nextInt();
		scan.close();
		
		System.out.println("value of n1 before swapping: "+n1);
		System.out.println("value of n1 before swapping: "+n2);

		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;

		System.out.println("\nvalue of n1 after swapping: "+n1);
		System.out.println("value of n1 after swapping: "+n2);
	}

}

