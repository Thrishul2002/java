package collectionsdemo;

/**
* Author :Jeedipalli.Reddy
* Date   :6 Nov 2024
* Time   :12:01:04 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Student implements Comparable<Student> {
	
	private int rollno,age;
	private String name;
	
	public Student(int rollno, int age, String name) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	
	

	public int getRollno() {
		return rollno;
	}



	public int getAge() {
		return age;
	}



	public String getName() {
		return name;
	}



	@Override
	public int compareTo(Student st) {
		if (age==st.age) {
			return 0;
		}
		else if (age>st.age) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	

}
