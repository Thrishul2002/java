package oopsdemo4;

/**
 * Author :Jeedipalli.Reddy
 * Date   :30 Oct 2024
 * Time   :12:43:54 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class Library {
	private IItem book1;
	private IItem book2;
	public Library() {
		book1 = new Book("the great wall","thrishul");
		book2 = new Book("harrypotter","jk rowling");
	}
	public void displayItems() {
		displayItemDetails(book1);
		displayItemDetails(book2);
	}

	private void displayItemDetails(IItem item) {
		System.out.println("Title: " + item.getTitle());
		System.out.println("Author: " + item.getAuthor());
		System.out.println("Category: " + item.getCategory());
		System.out.println("Available: " + (item.isAvailable() ? "Yes" : "No"));
		System.out.println();
	}

	public void borrowItem(String title) {
		if (book1.getTitle().equals(title)) {
			book1.borrowItem();
		} else if (book2.getTitle().equals(title)) {
			book2.borrowItem();
		} else {
			System.out.println("Item not found.");
		}
	}

	public void returnItem(String title) {
		if (book1.getTitle().equals(title)) {
			book1.returnItem();
		} else if (book2.getTitle().equals(title)) {
			book2.returnItem();
		} else {
			System.out.println("Item not found.");
		}
	}
}
