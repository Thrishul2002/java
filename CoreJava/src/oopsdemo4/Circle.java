package oopsdemo4;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :10:47:05 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Circle extends Shape{
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

}
