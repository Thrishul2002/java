package assignments;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :10:37:13 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Book {
	private String name;
	protected String author;
	private double price;
	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
public void display() {
	System.out.println(name+" "+author+" "+price);
}
public String getAuthor() {
	return author;
}
public double getPrice() {
	return price;
}


}
