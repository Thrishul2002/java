package oopsdemo4;

/**
* Author :Jeedipalli.Reddy
* Date   :30 Oct 2024
* Time   :3:05:05 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/
//multiple Interface implementation - multiple inheritance
//StudentDetails class implements abstract methods of 2 Interfaces
public class StudentDetails implements CollegeData,HostelData {
 
	College c=new College("Mary", 121,"Delhi university" , "MCA");
	Hostel h=new Hostel("ram", "block A");
	@Override
	public void hostelDetail() {
		System.out.println("********** Hostel Details *********");
		System.out.println("Hostel Name :"+h.getName());
		System.out.println("Location    :"+h.getLocation());
		
	}

	@Override
	public void studentRecord() {
		// TODO Auto-generated method stub
		 System.out.println("Students Selected based on Percentage & Financial Condition");
	}

	@Override
	public void collegeDetail() {
		// TODO Auto-generated method stub
		 System.out.println("********** Colege Details *********");
			System.out.println("College Name : "+c.getName());
			System.out.println("College Id   : "+c.getId());
		//	System.out.println("Course       : "+c1.getCourse());
			System.out.println("University   : "+c.getUniversty());	
	}

	@Override
	public void studentData() {
		// TODO Auto-generated method stub
		System.out.println("students can join: MCA, MBA, BTech, Mtech");
	}

}
