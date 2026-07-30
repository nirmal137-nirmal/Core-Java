package in.co.corejava.oop.Encapsulation;

public class TestBranch {
	public static void main(String[] args) {
		
		Branch ch = new Branch();
		
		ch.setBranchId(101);
		ch.setBranchName("Vijay Nagar");
		ch.setCity("Indore");
		ch.setManagerName("Rupesh Mahajan");
		ch.setContactNo("+91 9300171175 ");
		
		System.out.println("Branch Id : " + ch.getbranchId());
		System.out.println("Branch Name : " + ch.getBranchName());
		System.out.println("Branch City : " + ch.getCity());
		System.out.println("Branch Manager Name :" + ch.getManagerName());
		System.out.println("Contact No. : " + ch.getContactNo() );
	}

}
