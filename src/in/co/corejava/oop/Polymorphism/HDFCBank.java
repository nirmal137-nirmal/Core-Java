package in.co.corejava.oop.Polymorphism;

public class HDFCBank extends Bank {

	@Override
	public String getName() {
		return "HDFCBank";
	}

	@Override
	public double interestRate() {
		return 10.10;
	}

}
