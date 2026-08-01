package in.co.corejava.oop.Inheritance.Overriding;

public class TestBank {
	
	public static void main(String[] args) {
		
		System.out.println("------Axis Bank-----------");
		
		AxisBank ab = new AxisBank();
		
		System.out.println("Bank Name : " + ab.getName());
		System.out.println("Bank Interest Rate Is :" +ab.getinterestRate());
		
		
		System.out.println("--------HDFC Bank----------");
		
		HDFCBank hb = new HDFCBank();
		
		System.out.println("Bank Name : " +hb.getName());
		System.out.println("Bank Interest Rate : " +hb.getinterestRate());
		
		System.out.println("------ICICI Bank----------");
		
		ICICIBank ib = new ICICIBank();
		
		System.out.println("Bank Name : " +ib.getName());
		System.out.println("Bank Interest Rate : " +ib.getinterestRate());
	}

}
