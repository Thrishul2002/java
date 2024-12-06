package controlflow;

import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :24 Oct 2024
 * Time   :12:38:59 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 * Program to perform Arithmetic Operations using Switch Case
 */

public class SwitchDemo2 {

	public static void main(String[] args) {
		float num1,num2,result;
		String operator;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 2 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
		operator=scanner.next();
		scanner.close();

		switch(operator) {

		case "+": result=num1+num2;
		System.out.println("addition of"+num1+","+num2+"is:"+result);
		break;

		case "-": result=num1-num2;
		System.out.println("substraction of"+num1+","+num2+"is:"+result);
		break;

		case "*": result=num1*num2;
		System.out.println("multiplication of"+num1+","+num2+"is:"+result);
		break;

		case "/": result=num1/num2;
		System.out.println("division of"+num1+","+num2+"is:"+result);
		break;

		default: System.out.println("Invalid operator");
		
		}
		scanner.close();

	}

}
