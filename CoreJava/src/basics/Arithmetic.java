package basics;

import java.util.Scanner;

/*
 * Java program to perform Arithmetic operations using scanner Input
 */
public class Arithmetic {

	public static void main(String[] args) {
		
		//Declaration of variables
		int a,b,sum,sub,mul;
		float div;
		String name;
		Scanner scan=new Scanner(System.in);//after writing scan,select scan and ctrl+space
		
		System.out.println("Enter two numbers:");//sysout then ctrl+c
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Enter your name:");
		scan.nextLine();//pause for input multiple words
		name=scan.nextLine();
		
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(float)a/b;
		
		//output display
		
		System.out.println("***Arithmetic Operations***");
		System.out.println("Addition of two numbers is:"+sum);
		System.out.println("Substraction of two numbers is:"+sub);
		System.out.println("Multiplication of two numbers is:"+mul);
		System.out.println("division of two numbers is:"+div);
		System.out.println("project done by:"+name);
		
		scan.close();
		
	}

}
