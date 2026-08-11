package in.co.collection.ListInterface;

import java.util.ArrayList;
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

		LinkedList<String> list2 = new LinkedList<>();
		list.add("Rupesh");
		list.add("Piyush");
		list.add("Dev");
		list.add("Nirmal");

		System.out.println(list);

		// System.out.println(list.get(3));

		// System.out.println(list.remove(3));
		// System.out.println(list);

		// System.out.println(list.indexOf("Dipesh"));

		// System.out.println(list.lastIndexOf("Dipesh"));

		// System.out.println(list.subList(2, 5));

		// Add a collection

		// list.add(list2);
		// System.out.println(list);

		// Remove all elements
		// list.clear();
		// System.out.println(list);

		// contains(0) ----> Membership checking ---> True or false

		//System.out.println(list.contains("Nirmal"));
		// System.out.println(list.contains("Java"));

		// ContainsAll ----> Inclusion checking ---> True & false

		// System.out.println(list.containsAll(list2));

		// is Empty()
		// System.out.println(list.isEmpty());
		// list.add("Java");
		// System.out.println(list.isEmpty());

		// iterator()
		/*
		 * Iterator<String> itr = list.iterator();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */

		// remove data

		
		  list.remove("Nirmal"); System.out.println(list);
		 

		// Remove All

		/*
		 * list.removeAll(list); System.out.println(list);
		 */

		// retain All

		/*
		 * list.retainAll(list2); System.out.println(list);
		 */

		// Size

		//System.out.println(list.size());

	}

}
