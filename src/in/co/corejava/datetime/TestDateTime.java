package in.co.corejava.datetime;

import java.time.LocalDate;

public class TestDateTime {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfWeek());
		
		System.out.println("--------------------------------------------");
		
		LocalDate dob = LocalDate.of(2005, 9, 9);
		
		System.out.println(dob.getDayOfMonth());
		
		
		
		
	}

}
