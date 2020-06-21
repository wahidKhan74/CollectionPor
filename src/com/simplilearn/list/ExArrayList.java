package com.simplilearn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExArrayList {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String> ();
		list1.add("John");
		list1.add("Will");
		list1.add("David");
		list1.add("Ravi");
		list1.add("Vijay");
		
		// print list
		System.out.println(list1);
		
		// read element
		System.out.println(list1.get(3));
		
		//add element
		System.out.println(list1.add("Mark"));
		System.out.println("--------------------------------");
		// iteration over list
		// old way to iterate list
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------");
		// iteration over list with for as count
		// old way to iterate list
		for(int i=0 ; i<list1.size() ; i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("--------------------------------");
		// new way
		// Enhanced for loop  : for each
		
		for(String elm : list1) {
			System.out.println(elm);			
		}
		
		
		
	}
		

}
