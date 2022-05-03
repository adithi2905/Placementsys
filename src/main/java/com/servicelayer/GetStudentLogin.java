package com.servicelayer;

import java.io.IOException;

import javax.persistence.NoResultException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
@WebServlet("/gets")
public class GetStudentLogin extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int rollno=Integer.parseInt(req.getParameter("rollno"));
		String password=req.getParameter("pass");
		//boolean check=checkLoginDetails.checkLogDetails(email,password,"Student");
		try {
			boolean check=checkStudentLoginDetails.verifyLogin(rollno,password);
		if(check==true)
		{
			HttpSession sess=req.getSession();
			sess.setAttribute("rollno",rollno);
			res.sendRedirect("post.jsp");
		}
	
		}
		catch(Exception ex)
		{
			if(ex instanceof NoResultException)
				{
					res.sendRedirect("error.jsp");
				}
		}
		}
	}

