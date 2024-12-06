package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :11:39:29 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Book {
	String tittle,author;

	public Book(String tittle, String author) {
		this.tittle = tittle;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [tittle=" + tittle + ", author=" + author + "]";
	}
	
}
