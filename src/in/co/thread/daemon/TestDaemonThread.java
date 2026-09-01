package in.co.thread.daemon;

public class TestDaemonThread {
	public static void main(String[] args) {
		
		BackGroundThread t1 = new BackGroundThread("Daemon Thread");
		
		t1.start();
		
		for(int i = 1; i <= 10; i++) {
			
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i + "main");
		}
	}

}
