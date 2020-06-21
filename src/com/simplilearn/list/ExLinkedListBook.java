package com.simplilearn.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class Book{
	public String name;
	public String author;
	Book(){}
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
}


public class ExLinkedListBook {

	public static void main(String[] args) {
		
		List<Book> bookList = new Stack<Book>();
		
		bookList.add(new Book("Wings of Fire","APJ Kalam"));
		bookList.add(new Book("The Success Principles","Jack Canfield"));
		bookList.add(new Book("I do what I do from","Raguram rajan"));
		bookList.add(new Book("Alchemist","Paul"));
		
		
		// print list
		System.out.println(bookList);
		
		// print list
		System.out.println(bookList.get(0).name);
		System.out.println(bookList.get(0).author);
		System.out.println("-----------------------");
		// iteration 
		for(Book book : bookList) {
			
			System.out.println(book.name);
			System.out.println(book.author);
		}
		
		//Ex :
//		-> Employee -> list -> arraylist
//		-> User		-> list  -> linkedList
//		-> Number	-> list  -> Vector
//		-> String 	-> list -> Stack

	}

}
