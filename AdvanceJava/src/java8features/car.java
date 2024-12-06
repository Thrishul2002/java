package java8features;

/**
* Author :Jeedipalli.Reddy
* Date   :9 Nov 2024
* Time   :11:40:43 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class car implements Vechile{
	
	private String brand;
	
	public car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "car is sppeding up!!";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "car is dslaowing dwon!";
	}

}
