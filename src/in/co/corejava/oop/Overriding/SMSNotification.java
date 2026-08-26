package in.co.corejava.oop.Overriding;

public class SMSNotification extends Notification {
	
	@Override
	public void send() {
		System.out.println("Sending Notification through SMS ");
		
	}

}
