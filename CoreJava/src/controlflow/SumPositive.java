package controlflow;

import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :24 Oct 2024
 * Time   :4:26:44 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 * Program to find Sum of Positive numbers
 */

public class SumPositive {

	public static void main(String[] args) {
		int sum =0,number=0;
		Scanner scanner=new Scanner(System.in);

		do {
			System.out.println("Enter a Number : ");
			number=scanner.nextInt();

			if(number > 0) {
				sum+=number;
			}
		} while (number>0);

		System.out.println("The Sum Of Positive Numbers entered by User is : "+sum);
		scanner.close();

	}

}
