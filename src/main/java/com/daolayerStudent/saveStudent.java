package com.daolayerStudent;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entitylayer.Studentsignup;
import com.entitylayer.Studentsignupfactory;

public class saveStudent {
	public static void savestu(String name,String dept,int rollno,String pass,int year,String email,int contactno)
	{
	Studentsignup student=Studentsignupfactory.studentsignupfactory(name,dept,pass,year,rollno,email,contactno);
	Session sess=DBStudentConnection.getConn();
	Transaction  tx=sess.beginTransaction();
	sess.save(student);
	tx.commit();	
	sess.close();
	}
}