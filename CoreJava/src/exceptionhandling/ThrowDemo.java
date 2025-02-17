package exceptionhandling;

/**
* Author :Jeedipalli.Reddy
* Date   :6 Nov 2024
* Time   :3:27:01 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ThrowDemo {
	
	public static void test(int a) {
		if (a==0) {
			throw new ArithmeticException("pass non zero values");
		}	
		else {
			System.out.println("value passed to a is: "+a);
		}
	}

	public static void main(String[] args) {
		
		ThrowDemo.test(23);
		ThrowDemo.test(0);
	}

}
