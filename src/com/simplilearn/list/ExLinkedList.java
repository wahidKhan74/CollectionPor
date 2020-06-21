package com.simplilearn.list;

import java.util.LinkedList;
import java.util.List;

public class ExLinkedList {
	
	public static void main(String[] args) {
		
		// sub collection of collection interface 
		// It uses a doubly linked list internally to store the elements.
		// Insert and Delete : Manipulation is faster
		List<String> list = new LinkedList<String>();
		
		list.add("Ravi");
		list.add("Patel");
		list.add("Terrence");
		list.add("Sanjeev");
		list.add("Patel");
		
		// print list
		System.out.println(list.get(1));
		
		System.out.println("-----------------------------");
		// access / read element from linkedList
		for(String em : list) {
			System.out.println(em);
		}
		
		// update element in list
		list.set(2, "Terrence Regis");
		
		System.out.println(list);
		
		System.out.println("-----------------------------");
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).equals("Terrence Regis")) {
				list.set(i, "John Smith");
			}
		}
		
		System.out.println(list);
		
		
	}
	   	
     
}
