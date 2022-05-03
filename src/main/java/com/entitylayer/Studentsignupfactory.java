package com.entitylayer;

public class Studentsignupfactory {
	public static Studentsignup studentsignupfactory(String name,String dept,String pass,int year,int rollno,String email,int contactno)
	{
		Studentsignup ss=new Studentsignup();
		ss.setName(name);
		ss.setRollno(rollno);
		ss.setDept(dept);
		ss.setYear(year);
		ss.setEmail(email);
		ss.setContactno(contactno);
		ss.setPass(pass);
		//System.out.print(ss.toString());
		return ss;
	}
}
