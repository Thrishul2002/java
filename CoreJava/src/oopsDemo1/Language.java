package oopsDemo1;

/**
* Author :Jeedipalli.Reddy
* Date   :26 Oct 2024
* Time   :4:12:17 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Language {
	private String name;
	private float version;
	public Language() {
		this.name="java";
		this.version=8.0f;
		System.out.println("the language is :"+this.name+"-v"+this.version);
	}
	public Language(String name) {
		this.name = name;
		this.version=5.0f;
		System.out.println("the language is :"+this.name+"-v"+this.version);
	}
	public Language(float version) {
		this.version = version;
		this.name="python";
		System.out.println("the language is :"+this.name+"-v"+this.version);
	}
	public Language(String name, float version) {
		this.name = name;
		this.version = version;
		System.out.println("the language is :"+this.name+"-v"+this.version);
	}
	public void display() {
		System.out.println("-----------------");
	}
	
	
	
	
}
