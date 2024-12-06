package assignments2;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :4 Nov 2024
* Time   :11:07:03 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class TelephoneBill {

	public static void main(String[] args) {
		int Arr[]=new int[3];int arr[]=new int[2];
		int sum=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter budget: ");
		int bug=scan.nextInt();
		
		System.out.println("enter local,STD,ISD calls made: ");
		for(int i=0;i<3;i++)
		{
			Arr[i]=scan.nextInt();
			//System.out.println("Arr ["+i+"]"+Arr[i]);
		}
		sum=(int) ((Arr[0]*10)+(Arr[1]*0.25)+(Arr[2]*1));
		if(sum<bug)
		{
			arr[0]=0;
			arr[1]=sum;
		}
		else
		{
			arr[0]=1;
			arr[1]=sum-bug;
		}
		
		for(int i=0;i<2;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
