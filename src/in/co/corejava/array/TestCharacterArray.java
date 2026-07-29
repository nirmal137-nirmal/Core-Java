package in.co.corejava.array;

public class TestCharacterArray {
	public static void main(String[] args) {
		
		char[] ch = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i < ch.length; i++) {
			System.out.println(i +" = "+ ch[i]);
		}
		
		System.out.println("------------------");
		
		for(int i : ch) {
			System.out.println(i);
		}
	}
}
