package in.co.corejava.oop.Overriding;

public class TestNotification { 
	
	public static void main(String[] args) {
		
		Notification n1 = new EmailNotification();
		n1.send();
		
		Notification n2 = new SMSNotification();
		n2.send();
		
		Notification n3 = new WhatsappNotification();
		n3.send();
	}

}
