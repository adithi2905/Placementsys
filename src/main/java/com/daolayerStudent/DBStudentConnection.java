package com.daolayerStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entitylayer.Studentsignup;

public class DBStudentConnection{
	public static Session getConn(){
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure("student.cfg.xml");
		con.addAnnotatedClass(Studentsignup.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		return session;	
	}
}
