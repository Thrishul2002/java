package controlflow;
/*
 * java program to find sum and average of 3 numbers greater than 100
 */

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if(a>100 && b>100 && c>100) {
			sum=a+b+c;

			avg=(float)sum/3;

			System.out.println("sum of "+a+","+b+","+c+" is:"+sum);
			System.out.println("avg of three numbers is:"+String.format("%.2f", avg));
			System.out.println("avg of three numbers is:"+avg);
		}
		else {
			System.out.println("enter numbers greater than 100");
		}
		sc.close();
	}

}
