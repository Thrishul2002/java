package exceptionhandling;

/**
* Author :Jeedipalli.Reddy
* Date   :6 Nov 2024
* Time   :4:36:00 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

//define custom exceptions class to handle insufficient funds in bank

public class InSufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InSufficientFundsException(String message) {
		super(message);
		
	}
	

}
