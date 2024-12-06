package oopsDemo1;

/**
* Author :Jeedipalli.Reddy
* Date   :26 Oct 2024
* Time   :4:49:35 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/
class Test{
	int i;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("object destroyed");
	}
	
}
public class DestructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.i=10;
		t=null;
		System.gc();
	}

}
