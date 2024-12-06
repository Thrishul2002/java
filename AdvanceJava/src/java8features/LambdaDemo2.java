package java8features;

//import java.util.Iterator;

/**
* Author :Jeedipalli.Reddy
* Date   :8 Nov 2024
* Time   :12:36:37 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class LambdaDemo2 {

	//block lambda expressions
	public static void main(String[] args) {
	
		//lambda expression
		MyString reversestr=(str)->{
			String result="";
			//int l=str.length();
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			System.out.println("length of given string is"+str.length());
			return result;
		
		};
		
		System.out.println(reversestr.myStringFunction("Lambda Expression"));
		System.out.println(reversestr.myStringFunction("madam"));
		
		MyString myname=(name)->{return "hello " +name;};
		System.out.println(myname.myStringFunction("james"));
		MyString len=(str)->{return Integer.toString(str.length());};
		System.out.println(len.myStringFunction("james"));
		
		
		
		
	}

}
