package in.co.collection.ListInterface;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(0, "Nirmal");
		list.add(1, "Abhishek");
		list.add(2, "Nayan");
		list.add(7, "Nayan");
		list.add(3, "Bhushan");
		list.add(4, "Dipesh");
		list.add(5, "Vinay");
		list.add(6, "gourav");
		
		System.out.println(list);
		
		//System.out.println(list.get(3));
		
		//System.out.println(list.remove(3));
		//System.out.println(list);
		
		//System.out.println(list.indexOf("Dipesh"));
		
		//System.out.println(list.lastIndexOf("Dipesh"));
		
		//System.out.println(list.subList(2, 5));
		
		
	}

}
