package in.co.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerQueue {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.offer("Customer 1 ");
		q.offer("Customer 2 ");
		q.offer("Customer 3 ");
		
		System.out.println(q);
	}

}
