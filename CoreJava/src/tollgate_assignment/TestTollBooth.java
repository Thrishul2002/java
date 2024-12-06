package tollgate_assignment;

/**
* Author :Jeedipalli.Reddy
* Date   :10 Nov 2024
* Time   :8:08:10 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class TestTollBooth {

	public static void main(String[] args) {
		TollBooth booth = new AlleghenyTollBooth();
		 
		Truck ford = new Ford(5, 12500,"ford"); // 5 axles and 12500 kilograms
		Truck nissan = new Nesson(2, 5000,"nessan"); // 2 axles and 5000 kg
		
		 
		booth.calculateToll(ford);
		booth.calculateToll(nissan);
		
		 
		booth.collectReceipts();
		}	
		
	}


