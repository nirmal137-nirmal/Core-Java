package in.co.corejava.oop.Inheritance;

public class TestBank {

	// Bank class, HDFCBank, ICICIBank, AxisBank

	public static void main(String[] args) {

		System.out.println("----------------------------------------");

		AxisBank a = new AxisBank();

		a.setBankName("AxisBank");
		a.setBranchName("Vijay Nagar");
		a.setInterestRate(7.2);
		a.setAddress("Indore");
		a.setAccountType("Saving");
		a.setMinimumBalance(500.00);
		a.setCustomerCareNo("+91 8527419630");

		System.out.println("Bank Name : " + a.getBankName());
		System.out.println("Branch Name : " + a.getBankName());
		System.out.println("Interest rate Is : " + a.getInterestRate());
		System.out.println("Adress : " + a.getAddress());
		System.out.println("Account Type : " + a.getAccountType());
		System.out.println("Minimum Balance : " + a.getMinimumBalance());
		System.out.println("Customer Care No. : " + a.getCustomerCareNo());

		System.out.println();
		System.out.println("---------------------------------------");

		HDFCBank h = new HDFCBank();

		h.setBankName("HDFC Bank");
		h.setBranchName("Krisna Colony");
		h.setInterestRate(8.2);
		h.setAddress("Bhopal");
		h.setAccountType("Current");
		h.setMinimumBalance(500.00);
		h.setNetBanking("Available");

		System.out.println("Bank Name : " + h.getBankName());
		System.out.println("Branch Name : " + h.getBankName());
		System.out.println("Interest rate Is : " + h.getInterestRate());
		System.out.println("Adress : " + h.getAddress());
		System.out.println("Account Type : " + h.getAccountType());
		System.out.println("Minimum Balance : " + h.getMinimumBalance());
		System.out.println("Netbanking : " + h.getNetBanking());

		System.out.println();
		System.out.println("---------------------------------------");

		ICICIBank i = new ICICIBank();

		i.setBankName("ICICI Bank");
		i.setBranchName("Scheme No 54 Colony");
		i.setInterestRate(6.2);
		i.setAddress("Indore");
		i.setAccountType("Current");
		i.setMinimumBalance(500.00);
		i.setMobileBanking("Not Available");

		System.out.println("Bank Name : " + i.getBankName());
		System.out.println("Branch Name : " + i.getBankName());
		System.out.println("Interest rate Is : " + i.getInterestRate());
		System.out.println("Adress : " + i.getAddress());
		System.out.println("Account Type : " + i.getAccountType());
		System.out.println("Minimum Balance : " + i.getMinimumBalance());
		System.out.println("Mobile Banking  : " + i.getMobileBanking());

	}

}
