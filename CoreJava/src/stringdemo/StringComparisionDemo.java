package stringdemo;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :12:10:03 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class StringComparisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="James Gosling";
		//String s2="James Gosling";//refer to memory location of s1
		String s2="James gosling";//creates new memory
		
		String s3=new String("Hello World");
		String s4=new String("Hello World");
		
		if(s1==s2)//check strings points to same memory location or reference
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		if(s3.equals(s4))//chech string contents equal or not
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
			
		

	}

}
