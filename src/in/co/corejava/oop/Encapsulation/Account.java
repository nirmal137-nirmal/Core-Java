package in.co.corejava.oop.Encapsulation;

public class Account {
		
		private String name;
		private String number;
		private String accountType;
		private double balance;
		
		
		//for set Name
		public void setName(String name) {
			this.name = name;
		}
		//for get name
				public String getName() {
					return name;		
				}
		
		// For get number
		public String  getNumber() {
			return number;
		}
		// for Set Number 
		public void setNumber(String number) {
			this.number = number;
		}
		
		
		// For Get Account Type
		public String getAccountType() {
			return accountType;
		}		
		//for set account type
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		
		
		// For Get Balance 
		public double getBalance() {
			return balance;
		}
		//for set Balance 
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		//for Deposit
		public void deposit(double amt) {
			balance = balance + amt;
			System.out.println("Total Balance after deposit: " + balance);
		}
		
		//for Withdrawal
		public void withdrawal(double amt) {
			if (amt > balance) {
				System.out.println("insuffient fund transfer");		
			}else {
				balance = balance - amt;
				System.out.println("total balance after withdrawal: " +balance);
			}
		}
}
