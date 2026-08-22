package in.co.corejava.oop.Overriding;

public class PaymentSystem {

	public int paymentId;
	public double amount;
	public String status;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void pay() {
		System.out.println("Payment processing........");
	}

}
