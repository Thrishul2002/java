package tollgate_assignment;

/**
* Author :Jeedipalli.Reddy
* Date   :10 Nov 2024
* Time   :7:37:52 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Ford implements Truck{
	private int axels;
	private int weight;
	private String truckName;
	
	public Ford(int axels, int weight, String truckName) {
		this.axels = axels;
		this.weight = weight;
		this.truckName = truckName;
	}

	@Override
	public int getAxels() {
		// TODO Auto-generated method stub
		return axels;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return truckName;
	}

	

	

	
		
}
