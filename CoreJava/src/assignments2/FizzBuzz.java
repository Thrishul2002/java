package assignments2;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :9:42:53 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter limit: ");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0)
				System.out.println("Fizz");
			else if(i%5==0)
				System.out.println("Buzz");
			else
				System.out.println(i);
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			
			
		}
		scan.close();

	}

}
