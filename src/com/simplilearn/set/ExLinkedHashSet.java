package com.simplilearn.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExLinkedHashSet {

	public static void main(String[] args) {
		
		TreeSet<String> mvlst = new TreeSet<String>();
		TreeSet<Double> mvlst2 = new TreeSet<Double>();
		
		mvlst.add("Legend");
		mvlst.add("Twilight");
		mvlst.add("Legend");
		mvlst.add("Avengers");
		mvlst.add("iRobot");
		
		//print movie set
		System.out.println(mvlst);
		
		// iterate 
		for(String mv :mvlst) {
			System.out.println(mv);
		}
		
		// replace elemt
		mvlst.remove("Twilight");
		mvlst.add("ABC");
		
		//print movie set
		System.out.println(mvlst.descendingSet());
		
	}

}

// Bakery Items : collection  :- LinkedHashSet
// Double  value based : tree set 
