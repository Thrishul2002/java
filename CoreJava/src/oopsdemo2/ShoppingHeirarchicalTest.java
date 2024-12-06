package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :2:51:27 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ShoppingHeirarchicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  RegisteredCustomer regCust=new RegisteredCustomer("Mike Doe","doe@test.com",988910);
	        GuestCustomer gCust=new GuestCustomer("Jane Smith","jane@test.com");

	        System.out.println("******** StopShop Shopping Portal **********");
	        System.out.println(" --- Registered Customer Details ---");
	        regCust.displayCustomerInfo();
	        regCust.addToCart("Lenova Laptop");
	        regCust.addToCart("Samsung S24 CellPhone");
	        regCust.addToCart("Boat EarBuds");
	        regCust.addToCart("Logitech Mouse");
	        regCust.addToCart("HP PenDrive");
	        System.out.println("\n --- Cart Details of Registered Customer ---");
	        regCust.displayCart();

	        System.out.println("\n ---Guest Customer Details ---");
	        gCust.display();
	        gCust.addToCart("PocoF5 Cellphone");
	        gCust.addToCart("DELL LED Monitor");
	        System.out.println("\n --- Cart Details of Guest Customer ---");
	        gCust.displayCart();


	}

}
