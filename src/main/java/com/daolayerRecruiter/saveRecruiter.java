package com.daolayerRecruiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class saveRecruiter {
	public static void saveRecru(int id,String company,String contact,String mail,String password) throws ClassNotFoundException, SQLException
	{
		
	//Recruitersignup rec=Recruitersignupfactory.recruitersignupfactory(company, job, location, contact, mail,s, lpa);
	Connection con=DBRecruiterConnection.getDBRecruiterConnection();
	PreparedStatement ps=con.prepareStatement("INSERT INTO placementsys.recruiterdetails(id,company,contact, mail,password) values(?,?,?,?,?)");
	ps.setInt(1,id);
	ps.setString(2,company);
	ps.setString(3,contact);
	ps.setString(4, mail);
	ps.setString(5,password);
	int x=ps.executeUpdate();
	con.close();
	//System.out.print(rec.toString());
	
	}
	}

