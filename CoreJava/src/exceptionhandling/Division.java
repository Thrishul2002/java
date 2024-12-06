package exceptionhandling;

import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :6 Nov 2024
 * Time   :12:51:49 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class Division {

	public static void main(String[] args) {
		//Division of 2 Numbers without Exception Handling

		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();
		
		try {
			result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
			System.out.println("Result = " + result);
			} catch (Exception e) {
				System.out.println("Enter second number as non zero ");
				System.out.println("Exception name and description: "+e.toString());
				System.out.println("Exception description: "+e.getMessage());
				e.printStackTrace();
			}
		
		finally {
		input.close();
		System.out.println("finally block");
		}

	}

}
