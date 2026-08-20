package in.co.collection.sorting.comparator;

import java.util.Comparator;

public class TestCategory implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.category.compareTo(o2.category);
	}

}
