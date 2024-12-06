package assignments2;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :10:51:09 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class CollatzSequence
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=scan.nextInt();
		
		System.out.println(n);
		while(n>0) 
		{
			if(n%2==0)
			{
				n=n/2;
				System.out.println(n);
			}
			else
			{
				n=3*n+1;
				System.out.println(n);
			}
			if(n==1)
			{
				break;
			}
				
		}
		scan.close();
	}

}
