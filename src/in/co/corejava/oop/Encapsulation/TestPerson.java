package in.co.corejava.oop.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p = new Person();
		
		p.setName("Nirmal Fayake");
		p.setDob(sdf.parse("2001-07-13"));
		p.setAddress("Indore");
		
		System.out.println("Person Name is : " + p.getName());
		System.out.println("Person DOB is : " + p.getDob());
		System.out.println("Person Address is :" + p.getAddress());
		System.out.println("Person Age is : " +p.getAge(p.getDob()));
		
		System.out.println("---------------------");
		
		Person p2 = new Person();
		
		p2.setName("Abhishek Patel");
		p2.setDob(sdf.parse("1998-04-12"));
		p2.setAddress("Indore");
		
		System.out.println("Person Name : " + p2.getName());
		System.out.println("Person DOB : " + p2.getDob());
		System.out.println("Person Address : " + p2.getAddress());
		System.out.println("Person Age : " +p.getAge(p.getDob()));
		
		
	}

}
