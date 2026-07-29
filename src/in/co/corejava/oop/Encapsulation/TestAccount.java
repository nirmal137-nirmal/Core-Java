package in.co.corejava.oop.Encapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a1 = new  Account();
		
		a1.setName("Nirmal Fayake");
		a1.setNumber("958610770001425");
		a1.setAccountType("Saving");
		a1.setBalance(10000);
		
		System.out.println("Account Holder Name :" + a1.getName());
		System.out.println("Account no :" + a1.getNumber());
		System.out.println("Account Type :" + a1.getAccountType());
		System.out.println("current balance :" + a1.getBalance());
		
		a1.deposit(20000.02);
		a1.withdrawal(1000.02);
		a1.withdrawal(500.00);
	}

}
