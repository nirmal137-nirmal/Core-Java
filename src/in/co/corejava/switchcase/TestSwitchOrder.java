package in.co.corejava.switchcase;

public class TestSwitchOrder {
	public static void main(String[] args) {
		
		int choice = 1;
		
		//1 = coffee
		//2 = Tea
		
		switch(choice) {
		case 1:
			System.out.println("You Ordered Coffee");
			break;
			
		case 2:
			System.out.println("Your ordered Tea");
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
	}

}
