package arraysdemo;

/**
* Author :Jeedipalli.Reddy
* Date   :25 Oct 2024
* Time   :12:10:33 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define array reference "marks" & Create array of int to hold 10 values
				
				int[] marks= {78,45,80,22,60,66,90,35,55,59};
				
				String[] name= {"Jack","Mike","Mary","James","Ron"}; //Declare fixed Array
				
				float[] scores;
				scores=new float[5]; //Array to store scores 
				
				//Initialize Array Elements -Input
				scores[0]=34.45f;
				scores[1]=80.50f;
				scores[2]=55.00f;
				scores[3]=89.00f;
				scores[4]=70.50f;
				
				System.out.println("float Array displaying using for each loop\n");
				for (float f : scores) {
					System.out.print(f+"\t");
				}
				
				System.out.println("\n");
				
				System.out.println("Int Array displaying using for each loop\n");
				for (int i : marks) {
					System.out.print(i+"\t");
				}
				
				System.out.println("\n");
				
				System.out.println("String Array displaying using for each loop\n");
				for (String s : name) {
					System.out.print(s+"\t");
				}

	}

}
