package in.co.corejava.oop.Polymorphism;

public class HomeLoan {
	public static void main(String[] args) {
		
		Bank [] banks = new Bank[3];
		
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		loanEnquiry(banks);
	}
	
	 static void loanEnquiry(Bank[] bank) {
		 for (Bank b : bank) {
			 String name = b.getName();
			 double rate = b.interestRate();
			 System.out.println(name + " = " + rate);
			 
		}
	 }
}
