package in.co.corejava.oop.Overriding;

public class CashPayment extends PaymentSystem {
	
	private String receivedBy;

	public String getReceivedBy() {
		return receivedBy;
	}

	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}
	
	 @Override
	    public void pay() {
	        System.out.println("Payment ID : " + paymentId);
	        System.out.println("Amount     : " + amount);
	        System.out.println("Status     : " + status);
	        System.out.println("Received By: " + receivedBy);
	        System.out.println("Payment done using Cash");
	    }
	
	
	
	

}
