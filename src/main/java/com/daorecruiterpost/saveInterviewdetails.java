package com.daorecruiterpost;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.daolayerRecruiter.DBRecruiterConnection;

public class saveInterviewdetails {
	public static void  saveinterviewdetails(int jobid,String pd,String ont,String ind) throws ClassNotFoundException, SQLException
	{
		Connection con=DBRecruiterConnection.getDBRecruiterConnection();
		String sql="INSERT INTO placementsys.interviewdetails(jobid,presentation_d,onlinetest_d,interview_d) values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,jobid);
		ps.setString(2,pd);
		ps.setString(3,ont);
		ps.setString(4,ind);
		int x=ps.executeUpdate();	
	}
	public static void  updateinterviewdetails(int jobid,String pd,String ont,String ind) throws ClassNotFoundException, SQLException
	{
		Connection con=DBRecruiterConnection.getDBRecruiterConnection();
		String sql="UPDATE placementsys.interviewdetails Set jobid=?,presentation_d=?,onlinetest_d=?,interview_d=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,jobid);
		ps.setString(2,pd);
		ps.setString(3,ont);
		ps.setString(4,ind);
		int x=ps.executeUpdate();	
	}
	public static void deleteinterviewdetails(int jobid) throws ClassNotFoundException, SQLException
	{
		Connection con=DBRecruiterConnection.getDBRecruiterConnection();
		PreparedStatement ps=con.prepareStatement("Delete from placementsys.interviewdetails where jobid=?");
		ps.setInt(1,jobid);
		ps.executeUpdate();	
	}

}






































