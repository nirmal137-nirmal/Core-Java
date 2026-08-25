package in.co.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighestSalary {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1000);
		list.add(400000);
		list.add(500200);
		list.add(1000);
		list.add(700001);
		list.add(900000);
		
		System.out.println("-------First Largest salary-------");
		
		list.stream().distinct().sorted(Collections.reverseOrder()).limit(1).forEach(System.out :: println);
		
		System.out.println("-------Second Largest Salary -----------");
		
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out :: println );
	}

}
