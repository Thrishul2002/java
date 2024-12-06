package controlflow;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(a>b);
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
		
		sc.close();

	}

}
