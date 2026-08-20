package in.co.collection.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEvent {

	public static void main(String[] args) {

		ArrayList<Event> list = new ArrayList();

		Event e1 = new Event(101, "BirthDay Party", "Indore");
		Event e2 = new Event(102, "Tech Conference", "Pune");
		Event e3 = new Event(103, "Music Festival", "Mumbai");
		Event e4 = new Event(104, "Java Workshop", "Delhi");
		Event e5 = new Event(105, "Sports Meet", "Bhopal");
		Event e6 = new Event(106, "Coding Competition", "Nagpur");

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		System.out.println(e1.getEventId() + " | " + e1.getEventName() + " | " + e1.getVenue());
		System.out.println(e2.getEventId() + " | " + e2.getEventName() + " | " + e2.getVenue());
		System.out.println(e3.getEventId() + " | " + e3.getEventName() + " | " + e3.getVenue());
		System.out.println(e4.getEventId() + " | " + e4.getEventName() + " | " + e4.getVenue());
		System.out.println(e5.getEventId() + " | " + e5.getEventName() + " | " + e5.getVenue());
		System.out.println(e6.getEventId() + " | " + e6.getEventName() + " | " + e6.getVenue());

		System.out.println("----------Sort by id -------------");

		TestEventID byId = new TestEventID();

		Collections.sort(list, byId);

		for (Event e : list) {
			System.out.println(e.getEventId() + " | " + e.getEventName() + " | " + e.getVenue());

		}
		
		System.out.println("----------Sort by Venue -------------");
		
		TestEventVenue byVenue = new TestEventVenue();

		Collections.sort(list, byVenue);
		
		for (Event e : list) {
			System.out.println(e.getEventId() + " | " + e.getEventName() + " | " + e.getVenue());

		}
		
		System.out.println("----------Sort by Name -------------");
		
		TestEventName byName = new TestEventName();
		
		Collections.sort(list, byName);
		for (Event e : list) {
			System.out.println(e.getEventId() + " | " + e.getEventName() + " | " + e.getVenue());

		}
		
		

	}

}
