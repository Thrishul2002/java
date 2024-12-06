package genericsdemo;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :5 Nov 2024
* Time   :11:37:55 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class TwoPairsDemo {

	public static void main(String[] args) {
		Pair<String,Integer> p1=new Pair<String, Integer>("The Car Guys",8);
	
		Scanner scan=new Scanner(System.in);
		System.out.println("our current rating for "+p1.getFirst()+"is: "+p1.getSecond());
		
		System.out.println("How would you rate them?:");
		int score=scan.nextInt();
		
		p1.setSecond(score);
		
		System.out.println("our new rating for "+p1.getFirst()+" is: "+p1.getSecond());
		
		Pair<String,Float> p2=new Pair<String, Float>("TROY",8.5f);
		
System.out.println("Our Current Rating for "+p2.getFirst() + " is : "+p2.getSecond());
		
		System.out.println("How would you rate them ?:");
		float score1 =scan.nextFloat();
		
		p2.setSecond(score1);
		
		System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());
		scan.close();
	}

}
