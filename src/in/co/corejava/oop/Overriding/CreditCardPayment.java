package in.co.corejava.oop.Overriding;

public class CreditCardPayment extends PaymentSystem {

	private String cardNumber;
	

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
    @Override
    public void pay() {
        System.out.println("Payment ID   : " + paymentId);
        System.out.println("Amount       : " + amount);
        System.out.println("Status       : " + status);
        System.out.println("Card Number  : " + cardNumber);
        System.out.println("Payment done using Credit Card");
    }
	 

}
