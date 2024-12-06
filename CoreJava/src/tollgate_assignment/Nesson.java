package tollgate_assignment;

/**
* Author :Jeedipalli.Reddy
* Date   :11 Nov 2024
* Time   :10:02:55 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class Nesson implements Truck {

	private int axels;
	private int weight;
	private String truckName;
	
	public Nesson(int axels, int weight, String truckName) {
		this.axels = axels;
		this.weight = weight;
		this.truckName = truckName;
	}
	@Override
	public int getAxels() {
		
		return axels;
	}

	@Override
	public int getWeight() {
		
		return weight;
	}

	@Override
	public String getName() {
		
		return truckName;
	}

}
