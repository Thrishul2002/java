package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :24 Oct 2024
* Time   :9:40:53 pm
* Email  :Jeedipalli.Reddy@gmail.com
* program to find BMI from given height and weight
*/

public class BMI {

	public static void main(String[] args) {
		
		float Height,Weight,BMI;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter Height in meters:");
		Height=scan.nextFloat();
		System.out.println("enter Weight in KG's :");
		Weight=scan.nextFloat();
		
		BMI=Weight/(Height*Height);
		
		System.out.println("BMI for given height"+Height+"and weight"+Weight+" is: "+BMI);
		scan.close();
	}

}
