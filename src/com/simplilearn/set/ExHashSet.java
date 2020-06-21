package com.simplilearn.set;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet {

	public static void main(String[] args) {
		
		Set<String> st1 = new HashSet<>();
		
		st1.add("Ravi");
		st1.add("John");
		st1.add("Mark");
		st1.add("John");
		st1.add("Wiliam");
		
		//print set
		System.out.println(st1);
		
		System.out.println("------------------------");
		// Iterate over set
		
		for(String name : st1) {
			System.out.println(name);
		}
		
		System.out.println(st1.contains("Mark"));  // true
		
		System.out.println(st1.isEmpty()); // false
		
		//st1.clear();
		System.out.println(st1);
		
		
		
	}

}
