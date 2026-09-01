
package in.co.thread.join;

public class TestJoinThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		JoinThread t1 = new JoinThread("Nirmal");
		JoinThread t2 = new JoinThread("Fayake");
		
		t1.start();
		
		t1.join();
		
		t2.start();
		
	}

}
