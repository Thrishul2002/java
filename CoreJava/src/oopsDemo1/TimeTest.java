package oopsDemo1;

/**
* Author :Jeedipalli.Reddy
* Date   :26 Oct 2024
* Time   :3:32:33 pm
* Email  :Jeedipalli.Reddy@gmail.com
* t1 --> 12 : 45 :55
 *  t2 --> 10 : 30 :30
 *         23   16 :25
*/

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1=new Time(12,45,55);
		Time t2=new Time(10,30,30);
		t1.add(t2);
		t1.display();
	}

}
