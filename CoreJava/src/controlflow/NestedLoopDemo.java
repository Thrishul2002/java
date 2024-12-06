package controlflow;

/**
* Author :Jeedipalli.Reddy
* Date   :25 Oct 2024
* Time   :10:04:40 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---------");
		
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------");
		
		

		
		
		
	}
		
			

	}


