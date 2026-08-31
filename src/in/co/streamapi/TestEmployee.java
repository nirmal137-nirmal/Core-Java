package in.co.streamapi;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {	

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Nirmal", "Developer", 85000.202));
		list.add(new Employee("Rupesh", "Sales", 48500.24));
		list.add(new Employee("Abhishek", "Finance", 14500.778));

		System.out.println("---------largest Salary--------");

		list.stream().sorted().forEach(System.out::println);

	}

}
