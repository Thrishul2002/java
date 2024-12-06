package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :10:51:41 am
* Email  :Jeedipalli.Reddy@gmail.com
* ScienceFaculty class inherits from the Faculty class, 
* adding its own specific attributes and behaviors while 
* reusing and extending the functionality of the superclass.
*/

public class ScienceFaculty extends Faculty{
	
	private String department;
    private String researchArea;
    private double bonus;

	public ScienceFaculty(String name, String facultyId, float salary,String department,String researchArea,double bonus) {
		super(name, facultyId, salary);
		this.department=department;
		this.researchArea=researchArea;
		this.bonus=bonus;
		
	}
	
	 public void displayDetails() {
	        super.displayDetails(); // Call the displayDetails method of the superclass
	        System.out.println("Department: " + department);
	        System.out.println("Research Area: " + researchArea);
	        System.out.println("Bonus: $" + bonus);
	    }

}
