package in.co.corejava.oop.Polymorphism;

public class ICICIBank extends Bank{
	
	@Override
	public String getName() {
		return "ICICI Bank";
	}
	
	@Override
	public double interestRate() {
		return 15.2;
	}

}
