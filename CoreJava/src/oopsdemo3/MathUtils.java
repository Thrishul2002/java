package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :4:51:56 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class MathUtils {
	public static int sqare(int num) {
		return num*num;
	}
	public static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		int result=MathUtils.sqare(6);
		System.out.println("square of given number is:"+result);
		System.out.println("addition of given numbers is:"+MathUtils.add(69,45));
		

	}

}
