package in.co.collection.map;

import java.util.HashMap;
import java.util.Map;

//1. map does not contain duplicate key
//2. map contain only one null key
//3. value can be duplicate
//4. map can contain multiple null value

public class TestMap {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("One", 1);
		m.put("Two", 2);
		m.put("Three", 3);
		m.put("Four", 4);
		m.put(5, "five");
		m.put("Six", 6);
		
		System.out.println(m.get(5));
		System.out.println("-------------------------------------------------");
		
		System.out.println(m.entrySet());
		System.out.println("-------------------------------------------------");
		
		System.out.println(m.containsKey(5));  // True or false 
		System.out.println("-------------------------------------------------");
		
		System.out.println(m.containsValue(4)); // True or false
		System.out.println("-------------------------------------------------");
		
		System.out.println(m.keySet());
		System.out.println("-------------------------------------------------");
		
		System.out.println(m.values());
	
	}

}
