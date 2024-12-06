package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Author :Jeedipalli.Reddy
 * Date   :5 Nov 2024
 * Time   :2:15:23 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> names =new ArrayList<>();

		names.add("James"); //AutoBoxing
		names.add("Mary");
		names.add("Micheal");
		names.add("Jim");
		names.add("Robert");
		names.add("Mary");

		System.out.println("Display ArrayList as List Without Loop :"+names);

		System.out.println("********* Display Collection Objects using Classic For Loop ************");

		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}

		names.add(3, "Raj");
		names.remove(0);
		names.set(1, "Gosling");

		System.out.println("********* Display Collection Objects using Classic ForEach Loop ************");

		for(String i:names) {
			System.out.println(i);
		}

		ArrayList<Double> marks =new ArrayList<>();

		marks.add(99.55);
		marks.add(55.00);
		marks.add(35.60);
		marks.add(74.15);
		marks.add(82.45);
		
		Iterator<Double> itr=marks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(marks);
		System.out.println("marks after sorting: "+marks);
		
		Collections.reverse(marks);
		System.out.println("marks after reversing: "+marks);
		
		System.out.println("Maximum marks: "+Collections.max(marks));
		System.out.println("Minimum marks: "+Collections.min(marks));
	}

}
