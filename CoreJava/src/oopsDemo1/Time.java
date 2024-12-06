package oopsDemo1;

/**
* Author :Jeedipalli.Reddy
* Date   :26 Oct 2024
* Time   :3:18:54 pm
* Email  :Jeedipalli.Reddy@gmail.com
* Java program to perform addition of 2 Times
 *  t1 --> 12 : 45 :55
 *  t2 --> 10 : 30 :30
 *         23   16 :25
 *  
 *     t1 + t2
 *     if sec> 60 .. mins should be incremented by 1 & sec -60 ,
 *     if min> 60  ... hrs should be incremented by 1 & min -60
*/

public class Time {
	private int hours;
	private int minute;
	private int seconds;
	public Time(int hours, int minute, int seconds) {
		this.hours = hours;
		this.minute = minute;
		this.seconds = seconds;
	}
	public void add(Time obj) {
		this.seconds+=obj.seconds;
		this.minute+=obj.minute;
		if(this.seconds>60) {
			this.seconds=this.seconds-60;
			this.minute+=1;
			}
		this.hours+=obj.hours;
		if(this.minute>60) {
			this.minute=this.minute-60;
			//this.minute-=this.extra;
			this.hours+=1;
			}
		
			
	}
	public void display() {
		System.out.println(this.hours+":"+this.minute+":"+this.seconds);
		//System.out.println("r"+this.real+" i"+this.imaginary);
	}
	
	
}
