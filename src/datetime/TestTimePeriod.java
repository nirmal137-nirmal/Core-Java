package datetime;

import java.time.LocalDate;
import java.time.Period;

public class TestTimePeriod {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();

		System.out.println("today's date:-" + todayDate);
		
		System.out.println("----------------------------------------");

		LocalDate birthDate = LocalDate.of(2001, 07, 13);
		System.out.println("your birthdate :-" + birthDate);

		Period period = Period.between(birthDate, todayDate);

		System.out.println(period.getYears() + " year " + period.getMonths() + " month " + period.getDays() + " days ");
	}
}