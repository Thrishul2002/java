package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :12:28:07 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition(34,55);
		a.add();
		a.add(44);
		a.add(31.1, 41.9d);
		a.add(56, 40);
		a.add(88,90);
		a.add("45","45");
		a.add(22,40,60);

	}

}
