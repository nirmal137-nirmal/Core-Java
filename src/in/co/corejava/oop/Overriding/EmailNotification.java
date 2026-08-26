package in.co.corejava.oop.Overriding;

public class EmailNotification extends Notification {

	@Override
	public void send() {
		System.out.println("Sending emial through Email");
	}
}
