package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :29 Oct 2024
* Time   :9:55:43 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Address {
	String city,state,country;
	int pincode;
	public Address(String city,String country,int pincode, String state) {
		this.city=city;
		this.state=state;
		this.country=country;
		this.pincode=pincode;
	}
}
