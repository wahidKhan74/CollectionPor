package com.simplilearn.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ExArrayDQueue {

	public static void main(String[] args) {
		// Dqeue : we can remove and add the elements from both the side.
		Queue<String> dq = new ArrayDeque<String>();
		dq.add("Hero");
		dq.add("Legend");
		dq.add("Twilight");
		dq.add("Blahblah");

		System.out.println(dq.peek());

		// iterate dq
		for (String mv : dq) {
			System.out.println(mv);
		}

		System.out.println("------");
		System.out.println("Head Befor" + dq.peek());
		System.out.println("------");
		// remove element
		//dq.remove();

		System.out.println("Head After" + dq.peek());

		// remove specific element
		dq.remove("Twilight");
		System.out.println("--------------------------");
		// iterate dq
		for (String mv : dq) {
			System.out.println(mv);
		}
	}
	
	// Storage String value for bookname; -> priority queue
	// Integer based qd -> array dq -> 

}
