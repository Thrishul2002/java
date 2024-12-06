package java8features;

/**
 * Author :Jeedipalli.Reddy
 * Date   :8 Nov 2024
 * Time   :3:26:46 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

//Method Reference - Shorthand of Lambda expression to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod(int a);
}
class Test // instance class
{
	void display(int a) // instance method
	{
		System.out.println("Iam a Instance Method "+a);
	}
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {

		//traditional method
		//traditional approach
		Test t1=new Test();
		t1.display(100);

		//Java8 Method Reference approach
		MyInterface m1ref=t1::display; // method reference to instance method of Object

		//calling method of FI
		m1ref.myMethod(10);

		// Lambda ---> FI
		// MR--- shorthand of Lambda
		//MR -->FI

	}

}
