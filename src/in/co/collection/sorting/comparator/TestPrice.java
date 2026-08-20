package in.co.collection.sorting.comparator;

import java.util.Comparator;

public class TestPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.price - o2.price;
	}

}
