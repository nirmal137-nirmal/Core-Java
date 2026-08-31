package in.co.streamapi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Abhishek");
		list.add("Rupesh");
		list.add("Nayan");
		list.add("Nirmal");
		list.add("Jay");
		list.add("Jay");
		list.add("Gourav");
		list.add("Kunal");
		list.add("zamun");

		list.forEach(System.out::println);

		System.out.println(" ---------------------------- ");

		list.stream(); // forEach(System.out::println); // Method
		System.out.println(list);

		System.out.println("------------------------------");

		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("------------------Distinct Duplicate remove--------------------------");

		list.stream().sorted().distinct().forEach(System.out::println);

		System.out.println("--------------Map Method lower case----------------");

		list.stream().map(e -> e.toLowerCase()).distinct().forEach(System.out::println);
		
		System.out.println("----------------Map Method Upper case ----------------------");
		
		list.stream().map(e -> e.toUpperCase()).distinct().forEach(System.out :: println);
		
		System.out.println("----------------filter---------------");
		list.stream().filter(e -> e.startsWith("N")).distinct().forEach(System.out :: println);

	}

}
