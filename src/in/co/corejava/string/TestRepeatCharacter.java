package in.co.corejava.string;

public class TestRepeatCharacter {
	public static void main(String[] args) {
		
		String s = "Java Programming ";
		
		System.out.println("Repeated character");
		
		for(int i = 0 ; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(s.indexOf(ch) != s.lastIndexOf(ch) && s.indexOf(ch) == i) {
				System.out.println(ch);
				
			}	
		}
	}
	
}

