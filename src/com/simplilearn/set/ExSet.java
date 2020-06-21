package com.simplilearn.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExSet {

	public static void main(String[] args) {
		// Set is sub interface in  collection
		// Set is used to store unique values
		// Set is implemented by HashSet, LinkedHashSet , and TreeSet.
		
		// This collection store data in Hash Table 
		// Hashing is used to store data in HashSet
		Set<String> st1 = new HashSet<>();
		
		// It extends HashSet and LinkedList 
		// insertion and deletion faster
		// Insertion order is preserved.
		Set<String> st2 = new LinkedHashSet<>();
		
		// Sorted Set
		// It allows ordering element in specific order.
		Set<String> st3 = new TreeSet<>();
		

	}

}
