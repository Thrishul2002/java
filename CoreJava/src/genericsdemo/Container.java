package genericsdemo;

/**
* Author :Jeedipalli.Reddy
* Date   :5 Nov 2024
* Time   :11:47:15 am
* Email  :Jeedipalli.Reddy@gmail.com
*/
//generic class with single parameter

public class Container<T> {
	 
	private T t;
	
	public void add(T t) {
		this.t=t;
	}

	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		
		Container<String> strContainer=new Container<String>();
		Container<Integer> intContainer=new Container<Integer>();
		Container<Double> dblContainer=new Container<Double>();
		Container<Character> chrContainer=new Container<Character>();
		
		strContainer.add("James Gosling");
		intContainer.add(1000);
		dblContainer.add(50000.55);
		chrContainer.add('A');
		
		System.out.println("The String Value is :"+strContainer.getT());
		System.out.println("The Integer Value is :"+intContainer.getT());
		System.out.println("The Double Value is :"+dblContainer.getT());
		System.out.println("The Character Value is :"+chrContainer.getT());
	}
}
