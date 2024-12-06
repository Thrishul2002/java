package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :10:19:49 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class TriangleType {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter lenght of Three sides of Triangle:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if(a==b&&a==c&&b==c)
			System.out.println("It's a equilateral Triangle");
		else if(a==b||a==c||b==c)
			System.out.println("It's a Isosceles Triangle");
		else
			System.out.println("It's a Scalen Triangle");
		sc.close();
	}
	

}
