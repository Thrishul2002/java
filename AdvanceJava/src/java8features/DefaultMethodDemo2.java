package java8features;

/**
* Author :Jeedipalli.Reddy
* Date   :9 Nov 2024
* Time   :11:43:05 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile v=new car("BMW");
		
		System.out.println(v.getBrand());
		System.out.println(v.speedUp());
		System.out.println(v.slowDown());
		
		System.out.println(v.turnAlarmOn());
		System.out.println(v.turnAlarmOff());
		
		System.out.println(Vechile.getHorsePower(2500, 400));

	}

}


