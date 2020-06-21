package com.simplilearn.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class User{
	private String name;
	private String gender;
	User(){}
	User(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
}

public class UserList {
	
		public static void main(String[] args) {
			
			User user = new User("Sanjeev","male");
			
			List userList1 = new ArrayList();
			
			userList1.add("John Smith");
			userList1.add("Vijay Sing");
			userList1.add("Terrence Regis");
			userList1.add(2344);
			userList1.add(user);
			System.out.println(userList1);
			
			// whenever we want to use type safe collection that time use generic
			List<String> list1 = new ArrayList<String>();
			list1.add("John");
			list1.add("Vijay");
//			list1.add(1212);
//			list1.add(user);
			System.out.println(list1);
			
			
			
			List<Integer> list2 = new ArrayList<Integer>();
			
			list2.add(1212);
//			list2.add("Hi");
			
			ArrayList<String> list3 = new ArrayList<String>();
			
			
			list2 = new Vector<Integer>();
			list2 = new Stack<Integer>();
			list2 = new LinkedList<Integer>();
			
//			list3 = new Vector<Interger>();
			
		}
		
		
}
