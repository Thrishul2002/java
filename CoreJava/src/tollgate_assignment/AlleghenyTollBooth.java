package tollgate_assignment;

/**
* Author :Jeedipalli.Reddy
* Date   :10 Nov 2024
* Time   :7:47:25 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class AlleghenyTollBooth implements TollBooth {
private int totalTrucks;
private int totalReceipts;
 
@Override
public void calculateToll(Truck truck) {
int toll = 5 * truck.getAxels() + 10 * (truck.getWeight() / 500);
totalReceipts += toll;
totalTrucks++;
System.out.println("Arrival of " + truck.getName() + " Truck");
System.out.println("Truck arrival - Axles: " + truck.getAxels() + " Total weight: " + truck.getWeight() + " Toll due: $" + toll);
}
 
@Override
public void displayData() {
System.out.println("Totals since last collection - Receipts: $" + totalReceipts + " Trucks: " + totalTrucks);
}
 
@Override
public void collectReceipts() {
System.out.println("*** Collecting receipts ***");
displayData();
totalReceipts = 0;
totalTrucks = 0;
System.out.println("***** Reset Receipts *****");
displayData();
}
}
 