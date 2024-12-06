package oopsdemo3;

/**
 * Author :Jeedipalli.Reddy
 * Date   :29 Oct 2024
 * Time   :2:52:13 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class Product {
	private String name;
	private double price;
	
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	// Method to display product details
	public void displayDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Price: $" + price);
	}
}
