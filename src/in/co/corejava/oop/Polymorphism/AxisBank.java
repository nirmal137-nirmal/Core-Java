package in.co.corejava.oop.Polymorphism;

public class AxisBank extends Bank{
	
	@Override
	public String getName() {
		return "Axis Bank";
	}
	
	@Override
	public double interestRate() {
		return 11.0;
	}

}
