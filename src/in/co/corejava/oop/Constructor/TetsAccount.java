package in.co.corejava.oop.Constructor;

public class TetsAccount {
	public static void main(String[] args) {
		
		
		Account a1 = new Account("958698740044", "Saving", 500152.2);
	
		System.out.println(a1.getAccNumber());
		System.out.println(a1.getAccType());
		System.out.println(a1.getBalance());
	}

}
