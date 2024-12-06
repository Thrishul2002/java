package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :10:08:59 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to find greatest of 3 numbers
*/

public class Maxof3Numbers {

	public static void main(String[] args) {
		
		int a,b,c,max;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		max=(a>b && a>c)?a:((b>c)?b:c);//condition?true:(condition?true:false)
		System.out.println("greatest of given three numbers is: "+max);
		sc.close();

	}

}
