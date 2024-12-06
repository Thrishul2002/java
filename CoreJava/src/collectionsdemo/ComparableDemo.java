package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;


/**
* Author :Jeedipalli.Reddy
* Date   :6 Nov 2024
* Time   :12:06:55 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(new Student(1, 23, "chandu"));
		s.add(new Student(2, 21, "charan"));
		s.add(new Student(3, 22, "teja"));
		s.add(new Student(4, 20, "Honey"));
		s.add(new Student(5, 22, "Honey"));
		
		Collections.sort(s);
		for(Student st:s) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
	}

}
