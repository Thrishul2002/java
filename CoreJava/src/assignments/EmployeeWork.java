package assignments;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :27 Oct 2024
* Time   :8:46:04 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class EmployeeWork {
	private int workHours;
	private float salary;
	
	public void getInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter work hours:");
		this.workHours=sc.nextInt();
		System.out.println("enter salary:");
		this.salary=sc.nextFloat();
		System.out.println("salary for"+workHours+"hours of work is: "+salary);
		sc.close();
	}
	public void addSalary() {
		if(this.salary<500) 
		{
			this.salary+=10;
			System.out.println("incremented salary is: "+this.salary);
		}
	}
		public void addWork() {
			if(this.workHours>6) 
			{
				this.salary+=5;
				System.out.println("incremented salary after over time  is: "+this.salary);
			}
	}
}
