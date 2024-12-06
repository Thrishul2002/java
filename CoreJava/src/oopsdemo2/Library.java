package oopsdemo2;
import java.util.List;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :11:41:28 am
* Email  :Jeedipalli.Reddy@gmail.com
*/
//composition example
public class Library {
	 private List<Book>books;

	public Library(List<Book> books) {
		this.books = books;
	}
	 //generate getter method

	public List<Book> getBooks() {
		return books;
	}

	
	
}
