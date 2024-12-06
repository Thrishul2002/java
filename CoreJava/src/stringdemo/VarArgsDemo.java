package stringdemo;

/**
 * Author :Jeedipalli.Reddy
 * Date   :4 Nov 2024
 * Time   :2:30:39 pm
 * Email  :Jeedipalli.Reddy@gmail.com
 * Varargs is a short name for variable arguments. 
 * In Java, an argument of a method can accept arbitrary number of values. 
 * This argument that can accept variable number of values is called varargs.
 *  
 *  --------Syntax : -------
 *  
 * accessModifier methodName(datatype ...arg) {
    // method body
}

In order to define vararg, ... (three dots) is used in the formal parameter of a method.
 */

public class VarArgsDemo {
	//method accepts variable no.of arguments of same type
	public int SumNumber(int ...args) {
		System.out.println("arguments length: "+args.length);
		int sum=0;
		for(int x:args) {
			sum+=x;
		}
		return sum;
	}
	public static void main(String[] args) {
		VarArgsDemo ex=new VarArgsDemo();
		int sum2=ex.SumNumber(2,4);
		System.out.println("sum2: "+sum2);
		int sum3=ex.SumNumber(2,4,9);
		System.out.println("sum2: "+sum3);
		int sum4=ex.SumNumber(2,4,7,5);
		System.out.println("sum2: "+sum4);

	}

}
