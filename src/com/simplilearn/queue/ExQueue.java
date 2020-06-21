package com.simplilearn.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		// Queue Interfce : It maintains First-In-First-Out Order.
		// It Can be used as Ordered List
		
		
		Queue<String> q2 = new ArrayDeque<String>();
		
		// Priority Queue  : It Holds the element or object which are need to be processed by
		// their priorities
		Queue<String> q1 = new PriorityQueue<String>();
		
		q1.add("John");
		q1.add("Mike");
		q1.add("Vijay");
		q1.add("Raj");
		
		// print queue
		System.out.println(q1);
		
		// head element
		System.out.println("Head "+q1.element());
		
		// head element
		System.out.println("Head "+q1.peek());
		
		System.out.println("----------------------------");
		// old way of iteration
		Iterator<String> itr = q1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------");
		// remove element
		q1.remove();
		// remove element
		q1.poll();
		
		System.out.println(q1.peek());
		// for
		for(String em :q1) {
			System.out.println(em);
		}
		
		
		
		

	}

}









