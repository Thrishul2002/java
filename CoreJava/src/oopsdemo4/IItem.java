package oopsdemo4;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :12:42:59 pm
* Email  :Jeedipalli.Reddy@gmail.com
* Interface that defines the basic operations for any item in the library
*/

public interface IItem {
	// by default public abstract methods
		String getTitle();
	    String getAuthor();
	    String getCategory();
	    boolean isAvailable();
	    void borrowItem();
	    void returnItem();
}
