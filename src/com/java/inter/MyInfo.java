package com.java.inter;

public class MyInfo implements Profile {
	String firstName;
	String lastName;
	int age;
	String hobbies;
	@Override
	public void myBasicInfo() {
	System.out.println(ProfileConstants.FIRST_NAME+"firstName = Divya");
	System.out.println(ProfileConstants.LAST_NAME+"lastName = Ravikumar");
	System.out.println(ProfileConstants.AGE+"age = 20");
	}
	@Override
	public void myHobbies() {
		System.out.println("Hobbies = Googling,Listening Music");

		
	}

	public static void main(String[] args) {
		Profile profileOne= new MyInfo();
		profileOne.myBasicInfo();
		profileOne.myHobbies();
	}
	
	

}
