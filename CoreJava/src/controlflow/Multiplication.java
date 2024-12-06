package controlflow;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :3:15:46 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to display multiplication of table
*/

public class Multiplication {

	public static void main(String[] args) {
		
		int i=1,mul,num;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number:");
		num=scan.nextInt();
		while(i<=10) {
			mul=num*i;
			System.out.println(num+" * "+i+" = "+mul);
			i=i+1;
		}
		scan.close();
	}

}
