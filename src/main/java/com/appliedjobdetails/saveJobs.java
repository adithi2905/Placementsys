package com.appliedjobdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class saveJobs {
	public static void jobdetails(int jid,String title,String LPA,String applidept,String location,int rollno,String name,String dept,int year) throws ClassNotFoundException, SQLException
	{
		Connection con=dbconnection.getCon();
		String sql="Insert into placementsys.appliedjobs(jid,title,LPA,applidept,location,rollno,name,dept,year) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,jid);
		ps.setString(2,title);
		ps.setString(3,LPA);
		ps.setString(4,applidept);
		ps.setString(5,location);
		ps.setInt(6,rollno);
		ps.setString(7,name);
		ps.setString(8,dept);
		ps.setInt(9,year);
		ps.executeUpdate();
		
		
		
	}

}
