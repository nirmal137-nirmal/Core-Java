package in.co.corejava.oop.Overriding;

public class UpiPayment extends PaymentSystem{
	
	private String upiId;

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	
	@Override
    public void pay() {
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Amount     : " + amount);
        System.out.println("Status     : " + status);
        System.out.println("UPI ID     : " + upiId);
        System.out.println("Payment done using UPI");
    }
	
	
	

}
