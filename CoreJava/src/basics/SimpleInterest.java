package basics;

import java.util.Scanner;

/*
 * java program on simple interest
 */
public class SimpleInterest {

	public static void main(String[] args) {
		
		String Name;
		double principal;
		float si;
		int term,rate;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("**** Sft Bank - Simple Intrest Calculation ****");
		System.out.println("Enter Name:");
		Name=sc.nextLine();
		System.out.println("Enter Loan Amount:");
		principal=sc.nextDouble();
		System.out.println("Enter Loan Term:");
		term=sc.nextInt();
		System.out.println("Enter Loan Rate:");
		rate=sc.nextInt();
		
		si=(float)(principal*term*rate)/100;
		
		System.out.println("*** Loan Details ***");
		System.out.println("Customer name:"+Name);
		System.out.println("Principal Amount:"+principal);
		System.out.println("Term:"+term);
		System.out.println("Rate of Interest:"+rate);
		System.out.println("Simple Interest:"+si);
		
		sc.close();

	}

}
