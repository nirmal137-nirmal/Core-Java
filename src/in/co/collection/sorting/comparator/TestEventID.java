package in.co.collection.sorting.comparator;

import java.util.Comparator;

public class TestEventID implements Comparator<Event> {

	@Override
	public int compare(Event o1, Event o2) {
		
		return o1.getEventId() - o2.getEventId();
	}

}
