package com.simplilearn.set;

import java.util.HashSet;
import java.util.Set;

class User{
	public String name;
	public String gender;
	User(){}
	User(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
}

public class ExUserHashset {

	public static void main(String[] args) {
		
		Set<User> users = new HashSet<User>();
		
		users.add( new User("John","male") );
		users.add( new User("Mike","male") );
		users.add( new User("Marry","female") );
		users.add( new User("Will","male") );
		
		//print user ser
		System.out.println(users);
		
		// iterate
		for(User u : users) {
			System.out.println(u.name +"  => " + u.gender);
		}
	}

}

// Ex :
// Set Collection of Dimond :
// Set Collection of back user: , name,gender and balance





