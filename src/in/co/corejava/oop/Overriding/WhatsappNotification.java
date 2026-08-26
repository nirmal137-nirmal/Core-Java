package in.co.corejava.oop.Overriding;

public class WhatsappNotification extends Notification {
	
	@Override
	public void send() {
		System.out.println("Sending Notification Through Whatsapp ");
	}
	

}
