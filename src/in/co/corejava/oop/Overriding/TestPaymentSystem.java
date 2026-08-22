package in.co.corejava.oop.Overriding;

public class TestPaymentSystem {

	    public static void main(String[] args) {

	        PaymentSystem payment;

	        System.out.println("Credit Card Payment");
	        
	        payment = new CreditCardPayment();

	        payment.setPaymentId(101);
	        payment.setAmount(5000);
	        payment.setStatus("Success");

	        CreditCardPayment card = (CreditCardPayment) payment;
	        card.setCardNumber("1234-5678-9012");

	        payment.pay();

	        System.out.println("----------------------");

	        System.out.println("UPI Payment");
	        
	        
	        payment = new UpiPayment();

	        payment.setPaymentId(102);
	        payment.setAmount(2500);
	        payment.setStatus("Success");

	        UpiPayment upi = (UpiPayment) payment;
	        upi.setUpiId("nirmal@upi");

	        payment.pay();

	        System.out.println("----------------------");

	        System.out.println("Cash Payment");
	        
	        
	        payment = new CashPayment();

	        payment.setPaymentId(103);
	        payment.setAmount(1000);
	        payment.setStatus("Success");

	        CashPayment cash = (CashPayment) payment;
	        cash.setReceivedBy("Nirmal");

	        payment.pay();
	    }

}
