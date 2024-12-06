package jdbcdemo;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :7 Nov 2024
* Time   :4:44:01 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class CallableStatementDemo {

	public static void main(String[] args) {
		
		try {
			Skills s=new Skills();
			Scanner scan=new Scanner(System.in);
			System.out.println("enter candidate id: ");
			int id=scan.nextInt();
			s.getSkills(id);
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
