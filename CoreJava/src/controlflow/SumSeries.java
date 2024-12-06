package controlflow;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :3:07:44 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to find sum of series 1+2+--+n
*/

public class SumSeries {

	public static void main(String[] args) {
		
		int i=1,limit,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter limit:");
		limit=scan.nextInt();
		scan.close();
		while(i<=limit) {
			sum+=i;
			i++;
		}
		System.out.println(sum);

	}

}
