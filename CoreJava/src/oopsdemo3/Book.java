package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :3:28:23 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Book extends Item{
	private String author;

	public Book(String name, int price,String author) {
		super(name, price);
		this.author=author;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Author       :"+author);
	}
	

}
