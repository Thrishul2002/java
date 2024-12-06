package oopsDemo1;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :26 Oct 2024
* Time   :10:47:37 am
* Email  :Jeedipalli.Reddy@gmail.com
* program to enter employee details,calculate net salary,display salary
*/

public class Employee {

		private int empId;
		private String firstName,lastName,Designation;
		private double basic,hra,da,grosssalary,netsalary;
		private static final double TAX=1000;
		Scanner sc=new Scanner(System.in);
		
		public void inputEMployeeDetails() {
			System.out.println("Enter employeeId,firstname,lastname,designation:");
			empId=sc.nextInt();
			firstName=sc.next();
			lastName=sc.next();
			sc.nextLine();
			Designation=sc.nextLine();
			System.out.println("enter basic salary:");
			basic=sc.nextDouble();
			
		}
		
		public void calculateNetSalary() {
			
			hra=basic*0.25;
			da=basic*0.15;
			grosssalary=basic+hra+da;
			netsalary=grosssalary-TAX;
		}
		
		public void diaplayEmployeeDetails() {
			System.out.println("**** Employee Salary Slip ****");
			System.out.println("Employee Id    :"+empId);			
			System.out.println("Employee Name  :"+firstName+" "+lastName);
			System.out.println("Designation    :"+Designation);
			System.out.println("Basic          :"+basic);
			System.out.println("HRA            :"+hra);
			System.out.println("Dearness Allow :"+da);
			System.out.println("Gross Salary   :"+grosssalary);
			System.out.println("Tax            :"+TAX);
			System.out.println("----------------------------------");
			System.out.println("Net Salary     :"+netsalary);
		}
		
		
			
	}

