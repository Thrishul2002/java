package oopsDemo1;

/**
* Author :Jeedipalli.Reddy
* Date   :26 Oct 2024
* Time   :4:24:50 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class LanguageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language l1=new Language();
		l1.display();
		Language l2=new Language("scala");
		l2.display();
		Language l3=new Language("Ruby");
		l3.display();
		Language l4=new Language(3.5f);
		l4.display();
		Language l5=new Language("C#",9.0f);
		l5.display();
		Language l6=new Language("swift",5.2f);
		l6.display();
	}

}
