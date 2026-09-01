package in.co.thread;

public class TestHelloThread {
	
	public static void main(String[] args) {
		
		// thread are born when create object using new keyword
		HelloThread t1 = new HelloThread("Nirmal");
		HelloThread t2 = new HelloThread("Fayake");
		
		// thread start when call start() method(start method call run method)
		t1.start();
		
		t2.start();
	}

}
