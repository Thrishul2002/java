package oopsdemo4;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :12:32:21 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class SamsungCalculator implements ICalculator{
	Scanner kb;
	@Override
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);	
		
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform substraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("difference of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("product of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void div() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform division");
        float a=kb.nextInt();
        float b=kb.nextInt();
        float s=a/b;
        System.out.println("division of "+a+" and "+b+" is "+s);
		
	}
	public void display() {
		System.out.println("Calculator designed by great person");
	}

}
