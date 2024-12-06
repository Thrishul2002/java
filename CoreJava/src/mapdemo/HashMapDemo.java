package mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
* Author :Jeedipalli.Reddy
* Date   :6 Nov 2024
* Time   :10:16:43 am
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Jhon");
		hm.put(2, "jim");
		hm.put(4, "null");
		hm.put(3, "mike");
		hm.put(null, "jimmy");
		
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			System.out.println(m.getKey()+"-- "+m.getValue());
		}

	}

}
