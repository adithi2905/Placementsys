package com.entitylayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentsignup {
	@Column(name="name")
	private String name;
	@Id
	@Column(name="rollno")
	private int rollno;
	@Column(name="pass")
	private String pass;
	@Column(name="year")
	private int year;
	@Column(name="dept")
	private String dept;
	@Column(name="email")
	private String email;
	@Column(name="contactno")
	private int contactno;
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String toString()
	{
		return year+" "+dept+" "+contactno+" "+name+" "+Integer.toString(rollno);
	}
	
}


