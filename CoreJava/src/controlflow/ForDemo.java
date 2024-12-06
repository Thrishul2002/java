package controlflow;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :4:56:26 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to demonastrate for loop
*/

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Diapaly 1-10");
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\nDiapaly 10-1");
		
		for (int i=10; i>0; i--) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\nDispaly name 10 times");
		
		for (int i = 1; i <=10; i++) {
			System.out.print("HI!\t");
		}
		
	}

}
