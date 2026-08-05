package in.co.corejava.oop.Polymorphism;

public class AxisBank extends Bank {

	@Override
	public String getName() {
		return "AxisBank";
	}

	@Override
	public double interestRate() {
		return 11.25;
	}

}