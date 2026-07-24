package switchcase;

public class TestDayCheck {
	public static void main(String[] args) {
		
		String s = "Monday";
		
		switch(s) {
		case "Saturday": 
			System.out.println("Sixth Day of  Week");
			break;
		case "Friday":
			System.out.println("Fifth Day Of Week");
			break;
		case "Thursday":
			System.out.println("Fourth Day Of Week");
			break;
		case "Wednesday":
			System.out.println("Third Day Of Week");
			break;
		case "Tuesday":
			System.out.println("Second Day Of Week");
			break;
		case "Monday":
			System.out.println("First Day Of Week");
			break;
		default:
			System.out.println("To Day is Sunday");
			
		
		}
	}

}
