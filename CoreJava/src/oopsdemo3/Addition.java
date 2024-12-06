package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :12:14:55 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Addition {
	private int a,b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	//add() method is overloaded
	public void add() {
		System.out.println("***** methos overloading *****");
		System.out.println("the addition of two numbers is:"+(a+b));
	}
	public void add(int x) {
		System.out.println("addition of number to itself:"+(x+x));
	}
	public void add(int x,int y) {
		System.out.println("addition of 2 numbers is:"+(x+y));
	}
	public void add(int x,float y) {
		System.out.println("addition of integer and float values  is:"+(x+y));
	}
	public void add(String x,String y) {
		System.out.println("addition of 2 strings is:"+(x+y));
	}
	public void add(Double x,Double y) {
		System.out.println("addition of 2 doublenumbers is:"+(x+y));
	}
	public void add(int x,int y,int z) {
		System.out.println("addition of 3numbers is:"+(x+y));
	}
	
	
}
