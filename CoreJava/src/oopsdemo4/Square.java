package oopsdemo4;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :10:52:11 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Square extends Shape{
	private final double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	
}
