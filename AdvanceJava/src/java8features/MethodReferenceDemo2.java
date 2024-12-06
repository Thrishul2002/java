package java8features;

/**
* Author :Jeedipalli.Reddy
* Date   :9 Nov 2024
* Time   :9:59:10 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

//Program to demonstrate Method reference to an instance method of a class

@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation
{
	void addition(int  a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
	
		Calculation c=new Calculation();
		
		IDemo d1=(a,b)->System.out.println("The addition of two numbers is: "+(a+b));//using lambda
		d1.sum(5,50);
		
		IDemo d2=c::addition;//using method reference
		d2.sum(43, 50);

	}

}
