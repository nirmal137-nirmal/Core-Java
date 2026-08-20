package in.co.collection.sorting.comparator;

public class Event {

	public int eventId;
	public String eventName;
	public String venue;

	public Event(int eventID, String eventName, String venue) {
		this.eventId = eventID;
		this.eventName = eventName;
		this.venue = venue;
	}

	public int getEventId() {
		return eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public String getVenue() {
		return venue;
	}
	
	

	/*
	 * @Override public String toString() { return "eventId=" + eventId +
	 * ", eventName=" + eventName + ", venue=" + venue + ""; }
	 */

	
}
