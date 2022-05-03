package com.servicelayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.daolayerRecruiter.DBRecruiterConnection;

public class checkRecruiterLoginDetails{
	public static boolean getdetails(int id,String pass) throws ClassNotFoundException, SQLException
	{
	Connection con=DBRecruiterConnection.getDBRecruiterConnection();
	PreparedStatement ps=con.prepareStatement("Select * from placementsys.recruiterdetails where id=? and password=?");
	ps.setInt(1,id);
	ps.setString(2, pass);
	ResultSet res=ps.executeQuery();
	if(res.next())
		return true;
	else
	return false;	
	}

}
