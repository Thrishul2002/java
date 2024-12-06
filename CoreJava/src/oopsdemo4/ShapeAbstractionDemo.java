package oopsdemo4;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :10:53:53 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ShapeAbstractionDemo {

	public static void main(String[] args) {
		//Square s=new Square(4);
		Shape s;
		s=new Circle(9);
		System.out.println("area of circle is:"+s.calculateArea());
		s=new Square(4.22);
		System.out.println("area of square is:"+s.calculateArea());
		

	}

}
