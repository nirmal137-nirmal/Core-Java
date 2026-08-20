package in.co.collection.sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestProduct {

	public static void main(String[] args) {

		Product p1 = new Product("iPhone 15", "Electronics", 75000);
		Product p2 = new Product("Samsung Galaxy S24", "Electronics", 65000);
		Product p3 = new Product("OnePlus 12", "Electronics", 58000);		
		Product p4 = new Product("Nike Shoes", "Footwear", 4500);
		Product p5 = new Product("Adidas T-Shirt", "Clothing", 2200);
		Product p6 = new Product("Levi's Jeans", "Clothing", 3500);
		Product p7 = new Product("Mi Smart Watch", "Electronics", 5000);
		Product p8 = new Product("Philips Trimmer", "Personal Care", 1800);
		

		ArrayList l = new ArrayList();

		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);
		l.add(p6);
		l.add(p7);
		l.add(p8);
		
		l.forEach(System.out::println);
		System.out.println();

		System.out.println("----------Sort by Name------------");

		TestProductName byName = new TestProductName();

		Collections.sort(l, byName);

		l.forEach(System.out::println);

		System.out.println();
		System.out.println("----------Sort by category --------");
		

		TestCategory byCategory = new TestCategory();

		Collections.sort(l, byCategory);
		
		l.forEach(System.out::println);
		
		System.out.println();
		System.out.println("-------Sort By Price ----------------");
		
		
		TestPrice byprice = new TestPrice();
		
		Collections.sort(l, byprice);
		
		l.forEach(System.out::println);

	}

}
