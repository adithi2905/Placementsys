package com.servicelayer;

import java.io.IOException;

import com.daolayerStudent.saveStudent;
import com.entitylayer.Studentsignup;
import com.entitylayer.Studentsignupfactory;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getss")
public class GetStudentSignup extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	String name=req.getParameter("name");
	int rollno=Integer.parseInt(req.getParameter("rollno"));
	int year=Integer.parseInt(req.getParameter("year"));
	String dept=req.getParameter("dept");
	String email=req.getParameter("email");
	int contactno=Integer.parseInt(req.getParameter("contactno"));
	String pass=req.getParameter("pass");
	saveStudent.savestu(name,dept,rollno,pass,year,email,contactno);
	res.sendRedirect("signupsigninlogin.jsp");
	}
}
