package com.servicelayer;

import java.io.IOException;
import java.sql.SQLException;

import com.daorecruiterpost.saveInterviewdetails;
import com.daorecruiterpost.saveJobdetails;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gjd")
public class GetDeleteJob extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int jobid=Integer.parseInt(req.getParameter("jobid"));
		try {
			saveJobdetails.deleteRecru(jobid);
		saveInterviewdetails.deleteinterviewdetails(jobid);
		res.sendRedirect("view.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			res.sendRedirect("deletejobfailure.jsp");
		}
		
	}

}
