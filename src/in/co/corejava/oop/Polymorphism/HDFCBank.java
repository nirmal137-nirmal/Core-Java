package in.co.corejava.oop.Polymorphism;

public class HDFCBank extends Bank{
	
	@Override
	public String getName() {
		return "HDFC Bank";
	}
	
	@Override
	public double interestRate() {
		return 14.0;
	}

}
