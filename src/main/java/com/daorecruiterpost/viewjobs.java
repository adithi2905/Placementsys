package com.daorecruiterpost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.daolayerRecruiter.DBRecruiterConnection;
import com.entitylayer.Post;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class viewjobs extends HttpServlet {
	public List<Post>  Service(int id) throws ClassNotFoundException, SQLException{
	Connection con=DBRecruiterConnection.getDBRecruiterConnection();
	String sql="Select * from placementsys.recruiterdetails natural join placementsys.jobdetails natural join placementsys.interviewdetails where id=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1,id);
	ResultSet res=ps.executeQuery();
	List<Post>postset=new ArrayList<>();
	while(res.next())
	{
		Post post=new Post();
		post.setJobid(res.getInt("jobid"));
		post.setCompany(res.getString("company"));
		post.setTitle(res.getString("title"));
		post.setType(res.getString("typej"));
		post.setDept(res.getString("dept"));
		post.setLocation(res.getString("location"));
		post.setPresd(res.getString("presentation_d"));
		post.setOnd(res.getString("onlinetest_d"));
		post.setInd(res.getString("interview_d"));
		postset.add(post);
		}
	return postset;
	}	
	}
	

