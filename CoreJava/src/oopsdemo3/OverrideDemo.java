package oopsdemo3;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :2:43:25 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi=new SBI("SBI");
		Axis axis=new Axis("Axis");
		ICICI icici=new ICICI("ICICI");
		sbi.display();
		System.out.println("interst rate of SBI is: "+sbi.getRateofInterest());
		axis.display();
		System.out.println("interst rate of Axis is: "+axis.getRateofInterest());
		icici.display();
		System.out.println("interst rate of ICICI is: "+icici.getRateofInterest());
	}

}
