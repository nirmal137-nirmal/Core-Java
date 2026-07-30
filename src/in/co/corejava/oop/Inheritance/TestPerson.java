package in.co.corejava.oop.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException  {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		
		System.out.println("-------BusinessMan--------");
		
		Businessman b = new Businessman();
		
		b.setName("Nirmal");
		b.setAddress("Indore");
		b.setDateOfBirth(sdf.parse("2005-07-01"));
		b.setIncome(1500000.20);
		
		System.out.println("Name : " + b.getName());
		System.out.println("Address : " + b.getAddress());
		System.out.println("Date of Birth : " + b.getDateOfBirth());
		System.out.println("Income : " + b.getIncome());
		
		System.out.println();
		System.out.println("---------Doctor----------");
		
		Doctor d = new Doctor();
		
		d.setRegistrationNo("1001");
		d.setName("Mukesh ");
		d.setAddress("Pune");
		d.setDateOfBirth(sdf.parse("2001-10-10"));
		
		System.out.println("Registration No : " + d.getRegistrationNo());
		System.out.println("Name : " + d.getName());
		System.out.println("Address : " + d.getAddress());
		System.out.println("Date of Birth : " + d.getDateOfBirth());
		
		System.out.println();
		System.out.println("-----------Student-------------");
		
		Student s = new Student();
		
		
		s.setRollNo("101");
		s.setMarks(459);
		s.setName("Nayan");
		s.setAddress("Indore");
		s.setDateOfBirth(sdf.parse("2001-01-20"));
		
		System.out.println("Roll No. : " + s.getRollNo());
		System.out.println("Marks : " + s.getMarks());
		System.out.println("Name : " + s.getName());
		System.out.println("Address : " + s.getName());
		System.out.println("Date of Birth : " + s.getDateOfBirth());
		
	}

}
