package in.co.corejava.string;

public class CountDigit {
	public static void main(String[] args) {
		
		String s = "abcd123efghi456jklm789";
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				count ++;
			}
		}
		System.out.println("Total Digit is : " + count);	
	}

}
