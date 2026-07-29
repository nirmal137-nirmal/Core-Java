package in.co.corejava.datetime;

import java.util.Date;

public class TestContinueDateTime {
	
	public static void main(String[] args) throws InterruptedException {
		
		Date d = new Date();
		
		while(true) {
			System.out.println(d);
			Thread.sleep(1000);
		}		
	}
}
