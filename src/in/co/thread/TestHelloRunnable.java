package in.co.thread;

public class TestHelloRunnable {
	
	public static void main(String[] args) {
		
		Thread t1 = new HelloThread("Nirmal");
		Thread t2 = new HelloThread("Fayake");
		
		t1.start();
		t2.start();
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println(i + " = " + "Rupesh");
		}
	}

}
