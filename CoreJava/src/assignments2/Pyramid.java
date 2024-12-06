package assignments2;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :10:09:55 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Pyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter limit: ");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{	//print spaces
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{	//increasing numbers
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--)
			{	// decreasing  number
				System.out.print(j);
			}
			System.out.println();
		}
		scan.close();
	}

}
