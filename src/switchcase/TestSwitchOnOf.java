package switchcase;

public class TestSwitchOnOf {
	public static void main(String[] args) {
		
		String s = "on";
		String b = "off";
		String a = "";
		
		switch (a) {
		case "off":
			System.out.println("Off krna hai " + b);
			break;
		case "on":
			System.out.println("On krna hai " + s);
			break;

		default:
			System.out.println("Na On Krna hai Na off Krna krna hai");
			
		}
	}

}
