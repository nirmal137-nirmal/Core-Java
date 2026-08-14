package in.co.collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {
	public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	
	list.add(0, "Nirmal");
	list.add(1, "Abhishek");
	list.add(2, "Bhushan");
	list.add(3, "Dipesh");
	list.add(4, "Gourav");
	list.add(5, "Nirmal");
	list.add(6, "Dipesh");
	
	 ArrayList<String> newList = new ArrayList<>();

     for (String  n : list) {
         if (!newList.contains(n)) {
             newList.add(n);
         }
     }

     for (String n : newList) {
         System.out.println(n);
     }
	
	}

}
