package in.co.collection.sorting.Comparator;

import java.util.Comparator;

public class TestStudentEmail implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.email.compareTo(o2.email);
	}

}
