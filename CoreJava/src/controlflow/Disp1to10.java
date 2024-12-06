package controlflow;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :2:41:22 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to display 1-10
*/

public class Disp1to10 {

	public static void main(String[] args) {
		
		int i=1,j=20;
		
		 System.out.println("****forward loop****");
		 while(i<=10) {
			 System.out.println(i+" - hello");
			 i++;
		 }
		 
		 System.out.println("****reverse loop****");
		 while(j>=0) {
			 System.out.print(j+"\t");
			 j--;
			 }
	}

}
