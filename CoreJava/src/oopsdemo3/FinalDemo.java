package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :9:39:58 am
* Email  :Jeedipalli.Reddy@gmail.com
* final keyword example
*/
class MyDemo{
	public static final int max_age=65;
	protected int age=21;
	/*
	 * public void test() { max_age=60; }
	 */
	/*
	 * public final void test1() { System.out.println("age= "+age); } 
	 */
}
class MyTemp extends MyDemo{
	public void test1() {
		System.out.println("age= "+age);
	}
}
final class Hello{
	int a,b;

	public Hello(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", b=" + b + "]";
	}
	
}

/*
 * class World extends Hello{
 * 
 * }
 */
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

