package genericsdemo;

/**
* Author :Jeedipalli.Reddy
* Date   :5 Nov 2024
* Time   :11:24:27 am
* Email  :Jeedipalli.Reddy@gmail.com
*/
class Sample<T>{
	
	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<String>("Java Generics");
		System.out.println("Display from generic class by passing String Object : "+s1.getData());
		
		Sample<Integer> s2=new Sample<Integer>(200);
		System.out.println("Display from generic class by passing Integer Object : "+s2.getData());
		
		Sample<Double> s3=new Sample<Double>(200.601);
		System.out.println("Display from generic class by passing Float Object : "+s3.getData());
	}

}
