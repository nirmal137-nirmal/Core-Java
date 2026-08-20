package in.co.collection.sorting.comparator;

import java.util.Comparator;

public class TestEventName implements Comparator<Event> {

	@Override
	public int compare(Event o1, Event o2) {
		
		return o1.getEventName().compareTo(o2.getEventName());
	}

}
