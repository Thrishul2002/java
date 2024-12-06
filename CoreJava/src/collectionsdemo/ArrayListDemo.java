package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author :Jeedipalli.Reddy
* Date   :5 Nov 2024
* Time   :12:40:13 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();//generic array list
		
		a1.add("Java");
		a1.add("Peral");
		a1.add("C++");
		a1.add("C# 5.0");
		a1.add("Java"); //duplicate value
		a1.add("Python");
		
		System.out.println(a1);
		
		System.out.println("Element at index 1: "+a1.get(1));
		System.out.println("does list contain element java?: "+a1.contains("Java"));
		
		a1.add(2,"Oracle");

		System.out.println(a1);
		
		System.out.println("is Arraylist Empty?: "+a1.isEmpty());
		System.out.println("index of pearl: "+a1.indexOf("Peral"));
		System.out.println("size of Array: "+a1.size());
		
		Collections.sort(a1);
		System.out.println("Array after sorting: "+a1);
		
		//a1.add(100); gives compile time error
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(12);
		a2.add(13);
		a2.add(16);
		a2.add(19);
		a2.add(13);
		
		System.out.println(a2);
		System.out.println("size of Integer  Array: "+a2.size());
	}

}
