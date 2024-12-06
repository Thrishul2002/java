package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author :Jeedipalli.Reddy
 * Date   :24 Oct 2024
 * Time   :11:46:16 am
 * Email  :Jeedipalli.Reddy@gmail.com
 * max of 2 numbers using ternary operator
 */

public class TernaryDemo1 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1,n2,result;

		System.out.println("Enter 2 numbers:");
		n1=Integer.parseInt(br.readLine());
		n2=Integer.parseInt(br.readLine());
		br.close();
		String msg=(n1>n2)?n1+" is greater":n2+" is greater";
		System.out.println(msg);
		result=(n1>n2)?n1:n2;
		System.out.println("max of 2 nubers is:"+result);

	}

}
