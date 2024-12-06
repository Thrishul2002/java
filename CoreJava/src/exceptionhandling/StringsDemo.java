package exceptionhandling;

/**
* Author :Jeedipalli.Reddy
* Date   :6 Nov 2024
* Time   :2:51:35 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class StringsDemo {

	public static void main(String[] args) {
		//program to handle Null Pointer Exception

		String s1="Hello World";
		        //String s2 = null;
		        String s2="Java";
		        try{
		            System.out.println(s1.length());
		            System.out.println(s2.length());
		        }
		        catch (Exception exception){
		            System.err.println("Exception occurred:"+exception);
		        }

	}

}
