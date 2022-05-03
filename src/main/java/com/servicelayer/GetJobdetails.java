package com.servicelayer;

import java.util.Date;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.daorecruiterpost.saveInterviewdetails;
import com.daorecruiterpost.saveJobdetails;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/getj")
public class GetJobdetails extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	int jobid=Integer.parseInt(req.getParameter("jobid"));
	String jobtitle=req.getParameter("jobtitle");
	String location=req.getParameter("location");
	String[] dept=req.getParameterValues("dept");
	String type=req.getParameter("type");
	HttpSession sess=req.getSession(false);
	int id=(int)sess.getAttribute("id");
	System.out.print(jobid);
	//int jobid=(int)sess.getAttribute("jobid");
	int lpa=Integer.parseInt(req.getParameter("lpa"));
	try {
		String pd=req.getParameter("presentation");
		String ont=req.getParameter("ot");
		String ind=req.getParameter("interview");
		saveJobdetails.savejob(id,jobid,jobtitle,location,dept,type,lpa);
		saveInterviewdetails.saveinterviewdetails(jobid,pd,ont,ind);
			res.sendRedirect("createjobredirection.jsp");}
		catch (Exception e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		
		}
}
}