package com.daolayerStudentPost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.appliedjobdetails.dbconnection;

public class Viewappliedjobs {
	public static ResultSet viewjobs(int rollno) throws ClassNotFoundException, SQLException
	{
		Connection con=dbconnection.getCon();
		PreparedStatement ps=con.prepareStatement("Select * from placementsys.appliedjobs where rollno=?");
		ps.setInt(1,rollno);
		ResultSet x=ps.executeQuery();
		return x;	
	}
	public static ResultSet viewapplications(int jobid) throws ClassNotFoundException, SQLException
	{
		Connection con=dbconnection.getCon();
		PreparedStatement ps=con.prepareStatement("Select * from placementsys.appliedjobs where jid=?");
		ps.setInt(1,jobid);
		ResultSet x=ps.executeQuery();
		return x;
	}
}
