package com.servicelayer;
import java.io.IOException;
import java.sql.SQLException;

import org.hibernate.Session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/getr")
public class GetRecruiterLogin extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{

	int id=Integer.parseInt(req.getParameter("id"));
	String pass=req.getParameter("password");
			try {
			if(checkRecruiterLoginDetails.getdetails(id,pass))
					{
				   HttpSession sess=req.getSession(true);
				   sess.setAttribute("id",id);
					res.sendRedirect("view.jsp");
					//System.out.print("Login success");
					}
			else
			{
				System.out.print("Login failed");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
