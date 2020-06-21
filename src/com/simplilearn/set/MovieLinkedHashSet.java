package com.simplilearn.set;

import java.util.LinkedHashSet;
import java.util.Set;

class Movie {
	public String name;
	public int views;
	
	Movie(){}

	public Movie(String name, int views) {
		this.name = name;
		this.views = views;
	}
	
	
	
}

public class MovieLinkedHashSet {

	public static void main(String[] args) {
		
		Set<Movie> mvset = new LinkedHashSet<Movie>();
		
		mvset.add(new Movie("Legend",1213123));
		mvset.add(new Movie("Twilight",455123));
		mvset.add(new Movie("iRobot",9813123));
		mvset.add(new Movie("ABC",98213123));
		mvset.add(new Movie("Avenger",190213123));
		
		//print list
		
		System.out.println(mvset);
		
		// iteration
		for(Movie mv : mvset) {
			System.out.println("Movie Name : "+ mv.name +"  view are : "+ mv.views);
		}

	}

}


















