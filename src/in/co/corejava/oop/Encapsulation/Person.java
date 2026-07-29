package in.co.corejava.oop.Encapsulation;

import java.util.Date;

public class Person {
	
	private String name;
	private Date dob;
	private String address;
	private final static int AVG_AGE = 18;
	
	
	
	//To set name Method
	public void  setName(String name) {
		this.name = name;	
	}
	
	// to Get Name Mehtod
		public String getName() {
			return this.name;
		}

	
	//to set Date Method
	public void setDob(Date dob) {
		this.dob = dob;
	}
	//to get Date Method
		public Date getDob() {
			return this.dob;
		}
	
	
	// To Set Address Method
	public void setAddress(String address) {
		this.address = address;
	}
	

	// To Get Address Method
	public String getAddress() {
		return this.address;
	}
	
	public int  getAge(Date dob) {
		  
		Date now = new Date();
		int age = now.getYear() - dob.getYear();
		return age;
		
	}
}
