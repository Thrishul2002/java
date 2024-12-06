package oopsdemo2;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :11:47:48 am
* Email  :Jeedipalli.Reddy@gmail.com
* //Main class for testing Shopping Cart . Customer --> ShoppingCart
*/

public class ShoppingApplication {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter customer name and email:");
		String name=scan.next();
		String email=scan.next();
		ShoppingCart cart1 =new ShoppingCart(name,email);

        System.out.println("********** Online Shopping Portal ************");

        //Add items to Cart
        cart1.addItem("Boat Ear Buds");//Invoke method addItem() for Object cart1
        cart1.addItem("Logitech Mouse");
        cart1.addItem("Samsung HDD");
        cart1.addItem("HP Laser Printer");
        cart1.addItem("Pen Drive");
        cart1.addItem("KeyBoard");

       // System.out.println("Customer Details :");
        cart1.display(); //Base class method
        System.out.println("Cart Details :");
        cart1.displayCart();
        
        scan.close();

	}

}
