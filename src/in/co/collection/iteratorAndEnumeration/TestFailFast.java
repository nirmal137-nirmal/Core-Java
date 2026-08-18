package in.co.collection.iteratorAndEnumeration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(0, "Arjun");
		l.add(1, "Nirmal");
		l.add(2, 'a');
		l.add(3, 2.2);
		l.add(4, true);
		l.add(5, "Ram");
		l.add(6, 'a');

		System.out.println(l);

		System.out.println("----------------Iterator--------------------");

		Iterator li = l.iterator();

		// l.add("Nayan"); // fail fast

		while (li.hasNext()) {
			
			// li.remove(); // java.lang.IllegalStateException

			Object o = li.next();
			System.out.println("Element : " + o);
			li.remove();

		}

		System.out.println("List : " + li);

		l.add("Ajay");
		System.out.println("List : " + l);

	}

}
