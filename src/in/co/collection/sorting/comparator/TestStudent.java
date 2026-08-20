package in.co.collection.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Nirmal", "nirmal@gmail.com", "7418529630", "MCA");
		Student s2 = new Student(102, "Rahul", "rahul@gmail.com", "8529637410", "BCA");
		Student s3 = new Student(103, "Aman", "aman@gmail.com", "9638527410", "B.Tech");
		Student s4 = new Student(104, "Priya", "priya@gmail.com", "7894561230", "MCA");
		Student s5 = new Student(105, "Sneha", "sneha@gmail.com", "8965231470", "MBA");
		Student s6 = new Student(106, "Yogesh", "yogest@gmail.com", "8527419635", "Agriculture");
		
		
		ArrayList l = new ArrayList();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		
		l.forEach(System.out::println);
		
		System.out.println("----------Sort by Id----------");
		
		TestStudentId byId = new TestStudentId();
		Collections.sort(l, byId);
		l.forEach(System.out::println);
		
		System.out.println("----------Sort By Name---------");
		
		TestStudentName byName = new TestStudentName();
		Collections.sort(l, byName);
		l.forEach(System.out::println);
		
		System.out.println("--------Sort by Mobile No--------------");
		
		TestStudentMobileNo byMobileNo = new TestStudentMobileNo();
		Collections.sort(l, byMobileNo);
		l.forEach(System.out::println);
		
		System.out.println("--------Sort by Course --------------");
		
		TestStudentCourse byCourse = new TestStudentCourse();
		Collections.sort(l, byCourse);
		l.forEach(System.out::println);
		
	}

}
