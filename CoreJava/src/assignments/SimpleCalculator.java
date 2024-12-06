package assignments;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :9:19:43 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class SimpleCalculator {

	public static void main(String[] args) {
		int a,b,sum,sub,mul;
		float div;

		a=Integer.parseInt(args[1]);
		b=Integer.parseInt(args[2]);

		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(float)a/b;
		
		System.out.println("The sum of 2 numbers is :"+sum);
		System.out.println("The sub of 2 numbers is :"+sub);
		System.out.println("The sub of 2 numbers is :"+mul);
		System.out.println("The sub of 2 numbers is :"+div);

	}

}
