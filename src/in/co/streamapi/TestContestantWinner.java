package in.co.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Nirmal", "7418529640"));
		list.add(new Contestant("Abhishek", "96385227410"));
		list.add(new Contestant("Nayan", "9753570572"));
		list.add(new Contestant("Dipesh", "85296374058"));
		list.add(new Contestant("Jay", "74859"));
		list.add(new Contestant("Kunal", "7415956757"));
		list.add(new Contestant("Amol", "9753570572"));
		list.add(new Contestant("Rupesh", "9617382689"));

		// get Phone

		list.stream().map(e -> e.phoneNo).forEach(System.out::println);

		System.out.println("--------------------------------------");

		// get Valid Phone No.

		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).forEach(System.out::println);

		System.out.println("--------------------------------------");

		// remove Duplicate Number

		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		// Shuffle phoneNo

		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

	}

}
