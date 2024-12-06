package oopsdemo4;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :12:56:43 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class LibrarySystem {

	public static void main(String[] args) {
		Library l=new Library();
		l.displayItems();
		l.borrowItem("harrypotter");
		l.borrowItem("the great wall");
		l.returnItem("harrypotter");
		l.displayItems();

	}

}
