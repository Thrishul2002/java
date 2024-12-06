package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :2:58:59 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ClothingProduct extends Product {
	private String size;
    private String color;
	public ClothingProduct(String name, double price,String size,String color) {
		super(name, price);
		this.color=color;
		this.size=size;
	}
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Size   : "+size);
        System.out.println("Color  : "+color);
        System.out.println("Material: Cotton");
	}
	
	
}
