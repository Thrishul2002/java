package basics;

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
		
		sum=a+b+c;
		avg=(float)sum/3;
		
		System.out.println("sum of "+a+","+b+","+c+" is:"+sum);
		System.out.println("avg of three numbers is:"+String.format("%.2f", avg));
		System.out.println("avg of three numbers is:"+avg);
		sc.close();
	}

}
