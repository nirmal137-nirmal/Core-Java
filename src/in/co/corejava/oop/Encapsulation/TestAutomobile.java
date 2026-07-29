package in.co.corejava.oop.Encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile a = new Automobile();
		
		a.setColor("Black");
		a.setSpeed(200);
		a.setMake("complete");
		
		System.out.println("Color is : " + a.getColor());
		System.out.println("Speed is : " + a.getSpeed());
		System.out.println("Make is : " + a.getMake());
		
		
		
		
	}

}
