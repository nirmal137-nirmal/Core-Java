package in.co.collection.sorting.comparator;

public class Payment {

	public int paymentId;
	public String amount;
	public String paymentMethod;

	public Payment(int paymentId, String amount, String paymentMethod) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentMethod = paymentMethod;

	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentMethod=" + paymentMethod + "]";
	}
	
	

}
