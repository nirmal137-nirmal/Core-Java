package in.co.corejava.loops;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		boolean Number = true;
		
		int round = 0;
		
		while(Number) {
			System.out.println("While Loop");
			
			if(++round > 500)
				Number = false;
		}

	}

}
