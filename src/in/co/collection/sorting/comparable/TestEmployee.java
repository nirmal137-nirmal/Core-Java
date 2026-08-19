package in.co.collection.sorting.comparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Abhishek", 10000);
		Employee e2 = new Employee(102, "Nayan", 25000);
		Employee e3 = new Employee(103, "Ajay", 25200);
		Employee e4 = new Employee(104, "Vijay", 45000);

		List l = new ArrayList();

		l.add(e1);
		l.add(e2);
		l.add(e4);
		l.add(e4);

		System.out.println(l);

		System.out.println("---------------------------------------");

		for (Object object : l) {
			System.out.println(l);

		}
		System.out.println("-------------------------------------------");

		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);

		}

	}

}
