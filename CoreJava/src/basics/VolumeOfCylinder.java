package basics;

import java.util.Scanner;

/* 
 * Java Program to find volume of Cylinder
 */
public class VolumeOfCylinder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float v,r,h;   // variables declaration
		final float PI=3.14f; // constant declaration in Capitals

		System.out.println("Enter Radius of a Cylinder :");
		r=s.nextFloat();  // float input
		System.out.println("Enter height of a Cylinder :");
		h=s.nextFloat();

		v=PI*r*r*h;  // calculate area of circle

		System.out.println("The Volume of Circle is : "+v);
		System.out.format("%.2f", v);//to restrict decimal to 2 values

		s.close();

	}

}
