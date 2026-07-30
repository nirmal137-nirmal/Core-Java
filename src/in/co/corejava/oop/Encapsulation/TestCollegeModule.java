package in.co.corejava.oop.Encapsulation;

public class TestCollegeModule {
	public static void main(String[] args) {
		
		CollegeModule clg = new CollegeModule();
		
		clg.setCollegeId(1001);
		clg.setCollegeName("Shri Vaishnav Vidyapeeth Vishwavidhyalaya, Indore");
		clg.setCollegeCity("Indore");
		clg.setUniversity("Autonomous University");
		clg.setContactNo("+91 9638527410");
		
		System.out.println("College Id Is : " + clg.getCollegeId());
		System.out.println("College Name is : " + clg.getCollegeName());
		System.out.println("College City Is : " + clg.getCollegeCity());
		System.out.println("University : " + clg.getUniversity());
		System.out.println("College Contact No :" +clg.getContactNo() );
		
		
	}

}
