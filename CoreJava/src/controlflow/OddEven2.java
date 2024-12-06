package controlflow;

//import java.util.Scanner;

/**
 * Author :Jeedipalli.Reddy
 * Date   :24 Oct 2024
 * Time   :3:27:40 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class OddEven2 {

	public static void main(String[] args) {
		int i=1;
		System.out.println("odd\teven");
		System.out.println("---\t---");
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				System.out.print(i+"\t");
			}
			i=i+1;
		}
		
	}

}
