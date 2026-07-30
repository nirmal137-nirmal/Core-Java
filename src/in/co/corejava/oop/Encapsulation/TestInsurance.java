package in.co.corejava.oop.Encapsulation;

public class TestInsurance {
	public static void main(String[] args) {
		
		Insurance in = new Insurance();
		
		in.setPolicyID(1001);
		in.setPolicyHolderName("Nirmal Fayake");
		in.setPolicyType("Health Insurance");
		in.setPremimumAmount(25000);
		
		System.out.println("Policy Id is : " + in.getpolictId());
		System.out.println("Policy Holder Name : " + in.getPolicyHolderName());
		System.out.println("Policy Type : " + in.getPolicyType());
		System.out.println("Premimum Amount : " +in.getPremimumAmount());
		
		System.out.println("-------------------------------");
		
		Insurance s = new Insurance();
		
		in.setPolicyID(1002);
		in.setPolicyHolderName("Nayan Mahajan");
		in.setPolicyType("Life Insurance");
		in.setPremimumAmount(50000);
		
		System.out.println("Policy Id : " + in.getpolictId());
		System.out.println("Policy Holder Name : " +in.getPolicyHolderName());
		System.out.println("Policy Type : " +in.getPolicyType());
		System.out.println("Premimum Amount : " +in.getPremimumAmount());
		
		
		
	}

}
