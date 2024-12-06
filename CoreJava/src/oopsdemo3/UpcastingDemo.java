package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :3:30:37 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class UpcastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item;
		item=new Book("java coding", 500, "JK Rowling");
		item.display();
		item=new Laptop("ideapad", 90000, "dell");
		item.display();
		item=new Book("python code", 450, "harry potter");
	}

}
