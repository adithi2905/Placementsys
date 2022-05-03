package com.servicelayer;

import java.util.Date;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.daorecruiterpost.saveInterviewdetails;
import com.daorecruiterpost.saveJobdetails;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/getujd")
public class GetUpdateJobs extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession sess=req.getSession(false);
	int jobid=(int)(sess.getAttribute("jobid"));
	String jobtitle=req.getParameter("jobtitle");
	String location=req.getParameter("location");
	String[] dept=req.getParameterValues("dept");
	String type=req.getParameter("type");
	int id=(int)sess.getAttribute("id");
	int lpa=Integer.parseInt(req.getParameter("lpa"));
	try {
		String pd=req.getParameter("presentation");
		String ont=req.getParameter("ot");
		String ind=req.getParameter("interview");
		saveJobdetails.updateRecru(id,jobid,jobtitle,location,dept,type,lpa);
		saveInterviewdetails.updateinterviewdetails(jobid,pd,ont,ind);
		res.sendRedirect("updatejobredirection.jsp");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		res.sendRedirect("updatejobfail.jsp");
		
	}
	}
}
