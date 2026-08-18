package in.co.collection.iteratorAndEnumeration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("Nirmal");
		l.add("Piyush");
		l.add("Rupesh");
		l.add("Mayur");
		l.add("Gourav");

		System.out.println("List : " + l);

		System.out.println("-----------------------------------------------------------");

		for (Object o : l) {
			System.out.println(o);
		}

		System.out.println("-----------------------------------------------------------");

		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println("Elements :" + o);
			it.remove(); // Remove form Collection
		}
		System.out.println("------------------------------------------------------------");
		System.out.println(l);
	}

}
