package in.co.collection.sorting.comparator;

public class Product {

	public String productName;
	public String category;
	public int price;

	public Product(String productName, String category, int price) {
		this.productName = productName;
		this.category = category;
		this.price = price;

	}

	@Override
	public String toString() {
		return "productName=" + productName + ", category=" + category + ", price=" + price + "";
	}
	
	

}
