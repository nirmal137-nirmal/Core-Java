package in.co.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		int size = map.size(); // get Size of map
		System.out.println(size);
		
		String val =(String)map.get("2"); //Get Value 
		map.remove("1");
		System.out.println(val);
		
		boolean flag = map.containsKey("1");
		flag = map.containsValue("Two");
		
		Set keys = map.keySet();
		
		for(Object k : keys) {
			System.out.println(k);
		}
		 
		Collection values = map.values();
		
		Set keyValue = map.entrySet();		
	}

}
