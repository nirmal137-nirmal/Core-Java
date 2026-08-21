package in.co.collection.sorting.comparator;

import java.util.Comparator;

public class TestPaymentMethod implements  Comparator<Payment> {

	@Override
	public int compare(Payment o1, Payment o2) {
		
		return o1.paymentMethod.compareTo(o2.paymentMethod);
	}

}
