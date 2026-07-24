package string;

public class PalindromString {
	public static void main(String[] args) {
		
		String s = "nirmal";
		String r = "";
		
		
            for (int i = s.length() - 1; i >= 0; i--) {
			
			r = r + s.charAt(i);
            }
            if(s.equals(r)) {
            	System.out.println("It's Palindrom");
            }else {
            	System.out.println("It's Not Palindrom");
            }

		}
            
	}


