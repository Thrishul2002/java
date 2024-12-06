package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :3:03:41 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class OverrideDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicsProduct ep=new ElectronicsProduct("laptop", 50000, "dell", "latitude");
		ClothingProduct cp=new ClothingProduct("T-shirt", 1500, "medium", "black");

		ep.displayDetails();
		System.out.println("\n");
		cp.displayDetails();

	}

}
