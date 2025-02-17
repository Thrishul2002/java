package java8features;

import java.time.LocalDate;

/**
* Author :Jeedipalli.Reddy
* Date   :9 Nov 2024
* Time   :11:20:58 am
* Email  :Jeedipalli.Reddy@gmail.com
*/
interface Parser{
	
	default void parse() {
		System.out.println("Default passing method");
	}
	static void displayDate() {
		System.out.println(LocalDate.now());
	}
}

class TextParser implements Parser{
	
	void display() {
		System.out.println("hello textparser");
	}
}

class XMLParser implements Parser{
	public void parse() {
		System.out.println("Parsing XML parser");
	}
}

public class DefaultMethodDemo1 {

	public static void main(String[] args) {
		
		Parser p=new TextParser();
		p.parse();
		
		TextParser tp=new TextParser();
		tp.display();
		
		p=new XMLParser();
		p.parse();
		
		System.out.println("program executed on:");
		Parser.displayDate();
	}

}
