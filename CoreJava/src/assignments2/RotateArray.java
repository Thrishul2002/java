package assignments2;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :11:46:40 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class RotateArray {

	public static void main(String[] args) {
		int Arr[]=new int[7];
		int arr[]=new int[7];
		Scanner scan=new Scanner(System.in);
		int k;
		System.out.println("enter index to modify: ");
		k=scan.nextInt();
		
		System.out.println("enter Array elements: ");
		
		for(int i=0;i<7;i++)
		{
			Arr[i]=scan.nextInt();
		}
		for(int j=0,i=7-k;i>k&&i<7;i++,j++)
		{
			arr[j]=Arr[i];
		}
		for(int i=0, j=k;j>=k&&j<7;i++,j++)
		{
			arr[j]=Arr[i];
		}
		for(int j=0;j<7;j++)
		{
			System.out.print(arr[j]+" ");
		}
		scan.close();	

	}

}
