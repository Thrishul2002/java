package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :11:04:10 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		n=sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			if(n%i==0)
				c++;
		}
		if(c==1)
			System.out.println("given number is prime number");
		else
			System.out.println("given number is not prime number");
		sc.close();
	}

}
