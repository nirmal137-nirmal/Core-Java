package in.co.corejava.string;

public class FindSubString {
	public static void main(String[] args) {
		
		String s =  "RamRam";
		int count = 0;
		
		for(int i = 0; i < s.length() / 2; i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				count ++;
			}
		}
		System.out.println("Total Digit is : " + count);
		
	}

}
