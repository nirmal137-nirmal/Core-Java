package in.co.collection.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

import in.co.corejava.loops.WhileLoop;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		/*
		 * q.offer("Nirmal"); q.offer("Gourav"); q.offer("Ravi"); q.offer("Bhsuhan");
		 * 
		 * System.out.println(q);
		 */

		for (char c = 'a'; c <= 'z'; c++) {
			q.offer(c);
		}

		
		  System.out.println("q " + q);
		  
		  System.out.println("This is first Element : " +q.peek());
		  
		  System.out.println(" q " + q);
		  
		  System.out.println("First Element to be remove : " + q.poll());
		  
		  System.out.println(" q " + q);
		  
		  System.out.println("-------------------------------------------------------------");
		 

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

		System.out.print(" q " + q);

	}

}
