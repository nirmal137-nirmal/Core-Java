package in.co.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("One", 1);
		m.put("Two", 2);
		m.put("Three", 3);
		m.put("Four", 4);
		m.put("Five", 5);
		
		System.out.println(m);
		
		System.out.println(m.get("Two"));
		
		System.out.println("Six Key " +m.containsKey("Six")); // containsKey check key members
		System.out.println("Five Key : " +m.containsKey("Five"));
		
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("Six Value : " + m.containsValue(6));// containsValue check value members
		System.out.println("Five Value : " +m.containsValue(4));
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(m.remove("Five"));
		System.out.println(m);
		m.clear();
		System.out.println(m);
	
	}

}
