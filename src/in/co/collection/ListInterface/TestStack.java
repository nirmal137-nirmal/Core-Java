package in.co.collection.ListInterface;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for(char c = 'a'; c<= 'z'; c++) {
			s.push(s);
		}
		
		System.out.println(s);
		
		System.out.println("stack: " + s);
		System.out.println(s.peek());
		System.out.println("stack: " + s);
		System.out.println(s.pop());
		System.out.println("stack: " + s);
	}

}
