package controlflow;

import java.util.Scanner;

/**
* Author :Jeedipalli.Reddy
* Date   :25 Oct 2024
* Time   :9:19:44 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class VowelsCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String Sentence;
		int c=0;
		
		System.out.println("enter a sentence: ");
		Sentence=sc.next().toLowerCase();
		System.out.println(Sentence);
		sc.close();
		
		for(int i=0;i<Sentence.length();i++) {
			if(Sentence.charAt(i)=='a'||Sentence.charAt(i)=='e'||Sentence.charAt(i)=='i'||Sentence.charAt(i)=='o'||Sentence.charAt(i)=='u')
				c++;
				
		}
		
		System.out.println("total vowels in given sentence is: "+c);
	

	}

}
