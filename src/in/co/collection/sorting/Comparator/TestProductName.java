package in.co.collection.sorting.Comparator;

import java.util.Comparator;

public class TestProductName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.productName.compareTo(o2.productName);
	}

}
