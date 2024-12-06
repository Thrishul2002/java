package oopsdemo3;

import oopsDemo1.Complex;

/**
 * Author :Jeedipalli.Reddy
 * Date   :30 Oct 2024
 * Time   :9:54:30 am
 * Email  :Jeedipalli.Reddy@gmail.com
 */

class Test{
	int a; // default variable - accessible within the package
	private int b; //private variable - accessible within class only
	protected int c; // accessible in class & subclass
	public int d; //accessible from any part of the project


	public Test(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}


	void display(){ // default method
		System.out.println("Private Variable : "+b);
	}	
}
class Test2 extends Test{

	public Test2(int a, int b, int c, int d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}
	public void display(){ // default method
		System.out.println("Protected Variable : "+c);
	}
}
public class AccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(100,200,300,400);
		t1.display();
		System.out.println("default variable value is: "+t1.a);
		Test t2=new Test2(300,400,600,900);
		t2.display();
		//access public methods from diff package
		Complex complex=new Complex(10.3,67.4);
		Complex complex1=new Complex(0.7,3.6);
		complex.add(complex1);
		complex1.display();

	}
}



