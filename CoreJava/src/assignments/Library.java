package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Author :Jeedipalli.Reddy
 * Date   :29 Oct 2024
 * Time   :10:42:47 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */
public class Library extends assignments.Book {
	
	private List<Book>books;
	
	public Library(String name, String author, double price) {
		super(name, author, price);
		books = new ArrayList<>();
		
	}
	
	public void add(Book book) {
		books.add(book);
	}
	 public void getBooksByAuthor(String author) {
		for(Book book:books) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println(books);
		}
	}
		
	}
	public void getTotalValue() {
		for(Book book:books) {
			float totalValue=0;
			totalValue=(float) (totalValue+book.getPrice());
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of book:");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter book name,author name,price:");
			String name=scan.next();
			String author=scan.next();
			float price=scan.nextFloat();
			Library l=new Library(name, author, price);
			l.add(l);
		}
		//l.getBooksbyAuthor(author);
		
		scan.close();
	}
}

