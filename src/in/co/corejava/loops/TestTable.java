package in.co.corejava.loops;


public class TestTable {
	public static void main(String[] args) {
		int a = 2;
		
		for (int i = 2; i <= 10 ; i++) {
			System.out.println(i);
			
			for (int j = 1; j <= 10; j++) {
				System.out.println(i +" x " + j +  "=" + (i * j));	
			}	
		}
	}
}
