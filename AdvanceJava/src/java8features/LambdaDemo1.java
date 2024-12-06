package java8features;

/**
* Author :Jeedipalli.Reddy
* Date   :8 Nov 2024
* Time   :12:24:25 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		NumericTest isEven=(n)->(n%2==0);
		NumericTest isNegative=(n)->(n<0);
		
		
		System.out.println("7 is even number?:"+isEven.computeTest(7));
		System.out.println("-7 is -ve number?:"+isNegative.computeTest(-7));
		//boolean a=(n)->(n%2==0);//err0r- lambda expression should be stored in interface of FI

	}

}
