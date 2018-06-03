package com.java.inter;

public class TestProfile {
	public static void  printProfile(Profile profile)
	{
		profile.myBasicInfo();
		profile.myHobbies();
	}
	public static void main(String[] args) {
		Profile profileOne= new MyInfo();
		TestProfile.printProfile(profileOne);
	}
	

}
