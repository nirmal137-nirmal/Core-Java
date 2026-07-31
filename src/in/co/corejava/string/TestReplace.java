package in.co.corejava.string;

public class TestReplace {
	
	    public static void main(String[] args) {
	        String s = "ababca";
	        char c = 'a';
	        
	        // Remove all occurrences of 'c' from 's'
	        s = s.replace(String.valueOf(c), "");

	        System.out.println(s);
	    }
	}
