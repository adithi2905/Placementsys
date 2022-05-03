package com.servicelayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.daolayerRecruiter.DBRecruiterConnection;
import com.daolayerStudent.DBStudentConnection;
import com.entitylayer.Studentsignup;

public class Util {
	
	public static List util(int rollno)
	{
		Session ses=DBStudentConnection.getConn();
		Query q=ses.createQuery("from Studentsignup where rollno= :rollno");
		q.setParameter("rollno",rollno);
		List res1=q.list();
		System.out.print(res1);
		return res1;
		
	}
	

}

