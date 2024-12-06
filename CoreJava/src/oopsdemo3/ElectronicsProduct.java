package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :2:52:00 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ElectronicsProduct extends Product {
	
	private String brand;
    private String model;

	public ElectronicsProduct(String name, double price,String brand,String model) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.model=model;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
	    System.out.println("Brand   : "+brand);
        System.out.println("Model   : "+model);
        System.out.println("Warranty: 1 Year");
		
	}
	

}
