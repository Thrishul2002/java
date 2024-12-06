package exceptionhandling;

/**
* Author :Jeedipalli.Reddy
* Date   :6 Nov 2024
* Time   :4:20:48 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Product {
	//Class for Throws demo for Product Discount


	private String name;
	    private double price;
	    

	public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
	


	public String getName() {
		return name;
	}



	public double getPrice() {
		return price;
	}

	// User-defined method to apply a discount
    //Whoever wants to call this method, they must handle IllegalArgumentException in catch Block
	
    public void applyDiscount(double discount) throws IllegalArgumentException {
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100.");
        }
        double discountAmount = price * (discount / 100);
        price -= discountAmount;
    }

	

}
