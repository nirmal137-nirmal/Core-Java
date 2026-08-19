package in.co.collection.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet("101", "Abhishek", 45);
		Marksheet m2 = new Marksheet("102", "Nayan", 82);
		Marksheet m3 = new Marksheet("103", "Bhushan", 60);
		Marksheet m4 = new Marksheet("104", "Nirmal", 70);
		Marksheet m5 = new Marksheet("105", "Karan", 40);
		
		List<Marksheet> l = new ArrayList<Marksheet>();
		
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
	}

}
