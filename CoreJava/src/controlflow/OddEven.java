package controlflow;

import java.util.Scanner;

/*
 * program to check whether number is odd or even
 */
public class OddEven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("given numberis even");
		}
		else {
			System.out.println("given numberis odd");
		}
		
		sc.close();

	}

}
