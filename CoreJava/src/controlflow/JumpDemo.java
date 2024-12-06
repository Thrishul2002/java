package controlflow;

/**
 * Author :Jeedipalli.Reddy
 * Date   :25 Oct 2024
 * Time   :9:47:53 am
 * Email  :Jeedipalli.Reddy@gmail.com
 * program to demonstrate break,continue statement
 */

public class JumpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**** Break Statement ****");

		for (int i = 1; i <=10; i++) {
			if(i==5)
				break;
			System.out.println(i);
		}

		System.out.println("**** Break Statement ****");

		for (int i = 1; i <=10; i++) {
			if(i>4 && i<9)
				continue;
			System.out.println(i);
		}

	}

}
