package com.daorecruiterpost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.daolayerRecruiter.DBRecruiterConnection;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class saveJobdetails{
	public static void savejob(int id,int jobid,String title,String location,String[] dept,String typej,int lpa)throws ClassNotFoundException, SQLException
	{
		Connection con=DBRecruiterConnection.getDBRecruiterConnection();
		String depat="";
		for(int i=0;i<dept.length;i++)
			depat+=dept[i]+"\n";
		String sql="INSERT INTO placementsys.jobdetails(id,jobid,title,location,dept,typej,lpa) values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1,id);
		ps.setInt(2, jobid);
		ps.setString(3,title);
		ps.setString(4, location);
		ps.setString(5,depat);
		ps.setString(6,typej);
		ps.setInt(7, lpa);
		int x=ps.executeUpdate();
	}
	public static void updateRecru(int id,int jobid,String title,String location,String[] dept,String typej,int lpa) throws ClassNotFoundException, SQLException
	{
		Connection con=DBRecruiterConnection.getDBRecruiterConnection();
		String depat="";
		for(int i=0;i<dept.length;i++)
			depat+=dept[i]+"\n";
		PreparedStatement ps=con.prepareStatement("UPDATE placementsys.jobdetails SET title=?,location=?,dept=?,typej=?,lpa=? where jobid=?");
		ps.setString(1,title);
		ps.setString(2,location);
		ps.setString(3,depat);
		ps.setString(4,typej);
		ps.setInt(5, lpa);
		ps.setInt(6,jobid);
		
		int x=ps.executeUpdate();
	}
	public static void deleteRecru(int jobid) throws ClassNotFoundException, SQLException
	{
		Connection con=DBRecruiterConnection.getDBRecruiterConnection();
		PreparedStatement ps=con.prepareStatement("Delete from placementsys.jobdetails where jobid=?");
		ps.setInt(1, jobid);
		ps.executeUpdate();
	}
}
