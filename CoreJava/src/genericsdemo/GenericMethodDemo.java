package genericsdemo;

/**
 * Author :Jeedipalli.Reddy
 * Date   :5 Nov 2024
 * Time   :11:53:38 am
 * Email  :Jeedipalli.Reddy@gmail.com
 */

public class GenericMethodDemo {

	public static<E> void printArray(E[] inputArray) {
		for(E element:inputArray) {
			System.out.print(element+" ");
		}
	}	

	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5,6};
		Double[] doubleArray= {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray);   // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);   // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray);   // pass a Character array

	}

}
