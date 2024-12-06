package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :12:56:02 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class OutletManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//Java Program to Manage Products in an Outlet using Method OverLoading


		Outlet outlet=new Outlet();

		        System.out.println("---------------------------------------------");
		        //Add Product with only Name & price
		        outlet.addProduct("T-Shirt",20.50);
		        outlet.addProduct("Full Sleeve Shirt",50.50);
		        outlet.addProduct("Full Sleeve Shirt",50.50);

		        System.out.println("---------------------------------------------");
		        //Add Product with only Name ,price, quantity
		        outlet.addProduct("Jeans",45.50,100);
		        outlet.addProduct("Shorts",25.50,50);

		        System.out.println("---------------------------------------------");
		        //Add Product with only Name , price, quantity, category
		        outlet.addProduct("Sneakers",75.50,30,"Footwear");
		        outlet.addProduct("Leather Shoes",175.50,30,"Footwear");
		        System.out.println("---------------------------------------------");
	}

}
