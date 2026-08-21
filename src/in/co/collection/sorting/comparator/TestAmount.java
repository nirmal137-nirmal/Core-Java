package in.co.collection.sorting.comparator;

import java.util.Comparator;

public class TestAmount implements Comparator<Payment> {

	@Override
	public int compare(Payment o1, Payment o2) {
		return o1.amount.compareTo(o2.amount);
	}

}
