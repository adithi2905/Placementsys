package com.servicelayer;

import java.io.IOException;
import java.sql.SQLException;

import com.daolayerRecruiter.saveRecruiter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/getrs")
public class GetRecruiterSignup extends HttpServlet {
	static int count=0;
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String company=req.getParameter("company");
		String contact=req.getParameter("contact");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		try {
			saveRecruiter.saveRecru(id,company,contact,email,pass);
			res.sendRedirect("signupsignrecruiter.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count+=1;
			
	}

}
