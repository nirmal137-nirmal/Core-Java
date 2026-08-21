package in.co.streamapi;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStreamOddEven {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 100; i++) {
			list.add(i);

		}
		
		list.stream().filter(e  -> e % 2 != 0).forEach(System.out:: println);
		System.out.println("------------------------------------------------");
		list.stream().filter(e -> e % 2 == 0).forEach(System.out :: println);
	}

}
