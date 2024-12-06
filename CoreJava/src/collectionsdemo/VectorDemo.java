package collectionsdemo;

import java.util.Vector;

/**
* Author :Jeedipalli.Reddy
* Date   :5 Nov 2024
* Time   :3:12:29 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

class PreciousStones{
	Vector<String> preciousVector;
	
	PreciousStones(){
		preciousVector=new Vector<String>();
	}
	
	void add() {
        preciousVector.addElement("Jade");
        preciousVector.addElement("Topaz");
        preciousVector.addElement("Turquoise");
        preciousVector.add("Emerald");
    }
	void insert() {
        preciousVector.insertElementAt("Diamond" , 0);
        preciousVector.insertElementAt("Opal" , 4);
    }

	void search() {
        System.out.println("***************************");
        System.out.println("Searching Contents :");
        System.out.println("***************************");
        String searchStone = "Diamond";
        if (preciousVector.contains(searchStone)) {
             System.out.println("Found " + searchStone
             + " at index " + preciousVector.indexOf(searchStone));
        }
}
        void otherDetails() {
            System.out.println("\nFirst Element = "
            + preciousVector.firstElement());
            System.out.println("Default Capacity = "
            + preciousVector.capacity());
            System.out.println("Last Element = "
            + preciousVector.lastElement());
       }
        
        void display()
        {
        	System.out.println(preciousVector);
        }
}
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreciousStones p=new PreciousStones();
		
		p.add();
		p.display();
		p.insert();
		p.display();
		p.search();
		p.otherDetails();
		p.display();

	}

}
