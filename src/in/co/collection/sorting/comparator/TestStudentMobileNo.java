package in.co.collection.sorting.comparator;

import java.util.Comparator;

public class TestStudentMobileNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.mobileNo.compareTo(o2.mobileNo);
	}

}
