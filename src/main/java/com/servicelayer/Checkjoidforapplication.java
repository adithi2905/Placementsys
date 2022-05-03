package com.servicelayer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.servicelayer.Util;
import com.appliedjobdetails.saveJobs;
import com.daolayerRecruiter.DBRecruiterConnection;
import com.daolayerStudent.DBStudentConnection;
import com.entitylayer.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/checkjob")

public class Checkjoidforapplication extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		int jid=Integer.parseInt(req.getParameter("jobbid"));
		System.out.print("\n"+jid);
		 String dept="",name="";
		 String title="",applidept="",location="";
			String LPA="";
		try {
			Connection con=DBRecruiterConnection.getDBRecruiterConnection();
			PreparedStatement ps=con.prepareStatement("Select * from placementsys.jobdetails where jobid=?");
			ps.setInt(1, jid);
			ResultSet x=ps.executeQuery();
				
			while(x.next()) {
				title=x.getString("title");
				applidept=x.getString("dept");
				location=x.getString("location");
				LPA=x.getString("LPA");
				//System.out.print(title+" "+applidept+" "+location+" "+LPA+" ");}
					
			HttpSession sess=req.getSession(false);
			int contactno=0,year=0;
			int rollno=(int)sess.getAttribute("rollno");
			List s=Util.util(rollno);
			//System.out.print(s);
			String[]result=s.get(0).toString().split(" "); 
				year=Integer.parseInt(result[0]);
				dept=result[1];
				contactno=Integer.parseInt(result[2]);
				name=result[3];
				rollno=Integer.parseInt(result[4]);
				saveJobs.jobdetails(jid,title,LPA,applidept,location,rollno,name,dept,year);
				res.sendRedirect("appliedjobredirection.jsp");
				
		}} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			res.sendRedirect("applicationfailed.jsp");
		}
	} 
}


