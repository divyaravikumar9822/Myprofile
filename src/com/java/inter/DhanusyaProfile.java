package com.java.inter;

public class DhanusyaProfile implements Profile {
	String firstName;
	String lastName;
	int age;
	String hobbies;

	@Override
	public void myBasicInfo() {
		System.out.println("firstName = Dhanusya");
		System.out.println("lastName = Shanmugam");
		System.out.println("age = 20");
		
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Hobbies = Googling,Listening Music");
		
		
	}
	

}
