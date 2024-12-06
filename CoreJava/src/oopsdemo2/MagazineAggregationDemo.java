package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :10:23:15 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class MagazineAggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1=new Author("chandu", 30, "India");
		Publisher p1=new Publisher("Honey Publications", "128-a34", "Vijaywada");
		Magazine m1=new Magazine("Coforge", 2000, a1, p1);
		m1.display();
	
		

	}

}
