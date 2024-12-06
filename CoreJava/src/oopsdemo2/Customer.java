package oopsdemo2;

/**
* Author :Jeedipalli.Reddy
* Date   :28 Oct 2024
* Time   :11:35:30 am
* Email  :Jeedipalli.Reddy@gmail.com
* Single Inheritance demo for Online-Shopping
*/

public class Customer {
	private String name;
    private String email;
    
    public Customer(String name,String email) {
    	this.name=name;
    	this.email=email;
    }
    
    
    public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
}
