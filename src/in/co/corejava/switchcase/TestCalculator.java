package in.co.corejava.switchcase;

public class TestCalculator {
	public static void main(String[] args) {
		
		String opr = "+";
		int a = 10;
		int b = 20;
		
		switch (opr) {
		case "/" :
			System.out.println("Result : "+ (a+b));
			break;
		case "*": 
			System.out.println("Result : "+ (a*b));
			break;
		case "-":
			System.out.println("Result : " + (a-b));
			break;
		case "+":
			System.out.println("Result : " + (a+b));
			break;
		case "%":
			System.out.println("Result : " + (a%b));

		}
			
	}

}
