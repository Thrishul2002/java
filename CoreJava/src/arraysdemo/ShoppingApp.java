package arraysdemo;

import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :24 Oct 2024
 * Time   :4:30:43 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 * Code to create Simple Online Shopping App .
   Use do-while loop to repeatedly prompt the user for actions until they choose to exit
 */

public class ShoppingApp {

	public static void main(String[] args) {
		String userInput=null;
		int cartIndex=0;
		Scanner scan= new Scanner(System.in);
		
		String[] products= {"Logitech Mouse","Boat Earbuds","Hp Gaming Laptop","Samsung HDD","Philips MagicLight","HP Printer"};
		String[] cart=new String[products.length];
		do {
			System.out.println("welcome to our online shopping");
			System.out.println("1. view products");
			System.out.println("2. Add products");
			System.out.println("3. checkout");
			System.out.println("4.Exit");

			System.out.println("Enter your choice:");
			int choice=scan.nextInt();

			switch(choice) {
			case 1:
				System.out.println("displaying products..");
				for (int i = 0; i < products.length; i++) {
					System.out.println((i+1)+"."+products[i]);
				}
				break;
			case 2:
				System.out.println("Adding Products..");
				System.out.println("Enter product Number to add to cart: ");
				int pno=scan.nextInt();
				if (pno>0&&pno<=products.length) {
					cart[cartIndex++]=products[pno-1];
					System.out.println("product addede to cart");
				} else {
					System.out.println("Invalid number");
				}
				break;
			case 3:
				System.out.println("checking out..");
				for (int i = 0; i < cartIndex; i++) {
					System.out.println((i+1)+"."+cart[i]);
				}
				break;
			case 4:
				System.out.println("Exiting Application..Bye!");return;
			default:
				System.out.println("invalid choice");

			}
			System.out.println("do you want to continue?(yes/no):");
			userInput=scan.next();
			
		}while(userInput.equalsIgnoreCase("yes"));
		
		System.out.println("thank you");
		scan.close();
	}

}
