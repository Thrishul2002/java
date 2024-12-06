package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :11:15:18 pm
* Email  :Jeedipalli.Reddy@gmail.com
* sum of digits of given number
*/

public class SumofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,div;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=scan.nextInt();
		
		while(num>0) {
			div=num%10;
			rev=rev+div;
			num=num/10;
		}
		System.out.println("reverse of given number is: "+rev);
		scan.close();
	}
	}


