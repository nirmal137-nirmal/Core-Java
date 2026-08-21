package in.co.collection.sorting.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class TestPayment {

	public static void main(String[] args) {

		Payment p1 = new Payment(1111, "741582", "Online");
		Payment p2 = new Payment(0120, "852741", "Cash");
		Payment p3 = new Payment(1401, "200140", "UPI");
		Payment p4 = new Payment(2001, "100000", "Online");
		Payment p5 = new Payment(3001, "055552", "Cash");

		ArrayList list = new ArrayList();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		list.forEach(System.out::println);

		System.out.println("-----------sort by id-----------");

		TestPaymentId byId = new TestPaymentId();
		Collections.sort(list, byId);
		list.forEach(System.out::println);
		
		System.out.println("-----------Sort by Payment Method ---------------");
		
		TestPaymentMethod byPayment = new TestPaymentMethod();
		Collections.sort(list, byPayment);
		list.forEach(System.out:: println);
		
		System.out.println("----------Sort by amount---------------");
		
		TestAmount byAmount = new TestAmount();
		Collections.sort(list, byAmount);
		list.forEach(System.out::println);
		

	}

}
