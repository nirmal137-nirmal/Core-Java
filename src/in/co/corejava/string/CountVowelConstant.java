package in.co.corejava.string;

public class CountVowelConstant {
	public static void main(String[] args) {
		
		String s = "Programming";
		int  v = 0;
		int  c = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
				v++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				c++;
			}
		}
		
		System.out.println("Print Vowels : " + v);
		System.out.println("Print Constant: " + c);

	}

}
