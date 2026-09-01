package in.co.thread.priority;

public class TestPriorityThread {
	
	public static void main(String[] args) {
		
		PriorityThread t1 = new PriorityThread("Nirmal");
		PriorityThread t2 = new PriorityThread("Fayake");
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
	}

}
