package com.servicelayer;


import org.hibernate.Session;
import org.hibernate.query.Query;

import com.daolayerStudent.DBStudentConnection;


public class checkStudentLoginDetails{
	public static boolean verifyLogin(int rollno,String pass)
	{
		Object coll=null;
		Session sess=DBStudentConnection.getConn();
		Query query=sess.createNativeQuery("Select * from placementsys.studentsignup where rollno=? and pass=?");
		query.setParameter(1,rollno);
		query.setParameter(2,pass);
		coll=query.getSingleResult();
		if(coll!=null)
			return true;
		return false;
	}

}
