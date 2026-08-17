package in.co.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.add("Nirmal");
		q.add("java");
		q.add("Bhushan");
		q.add("Nirmal");
		
		System.out.println(q);
		
		System.out.println("Head : " +q.peek());
		
		q.remove();
		
		System.out.println("After Remove : " + q);
	}

}
