package com.practice;

public class Student {
	int rollno;
	String name;
	String address;
	public void getinfo()
	{
		rollno= 1;
		name="Pallavi";
		address= "Jinti";
		
	}
	public void displayinfo()
	{
		System.out.print("RollNumber==");
		System.out.println(rollno);
		System.out.print("Name==");
		System.out.println(name);
		System.out.print("Address==");
		System.out.println (address);
			
		
	}
	public static void main(String[]args)
	{
		Student s1= new Student();
		s1.getinfo();
		s1.displayinfo();
	}
	

}
